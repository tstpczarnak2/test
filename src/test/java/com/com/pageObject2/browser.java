package com.com.pageObject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.assertEquals;

public class browser {

   private static WebDriver driver ;
    static String URL = "https://magento.com/";

    public browser(){
        System.setProperty("webdriver.gecko.driver", "E:\\IntelliJ IDEA Community Edition 2017.2.2\\projects\\selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(URL);
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public homePage returnHomePage(){
        return new homePage(getDriver());
    }
    public static void verifyTitle(String title){
       System.out.println("tytuł "+driver.getTitle());
       assertEquals(title, driver.getTitle());
   }
   public static void quitBrowser(){
       driver.quit();
   }
}
