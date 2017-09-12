package com.com.pageObject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class homePage{

    private WebDriver driver;
    private static String title = "Commerce Solutions for Selling Online | eCommerce | Magentoo";

    public homePage(WebDriver driver){
        this.driver = driver;
    PageFactory.initElements(driver, this);
    }
    public Search returnSearch(){
        return new Search(driver);
    }

}
