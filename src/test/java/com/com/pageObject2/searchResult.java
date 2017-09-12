package com.com.pageObject2;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class searchResult {
    WebDriver driver;
    String query;


    public searchResult(WebDriver driver, String query){
       this.driver = driver;
        PageFactory.initElements(driver, this);
        System.out.println(this.query);
    }
    public void getProducts(){
        List<WebElement> result = driver.findElements(By.xpath("//a"));
        for (WebElement product:result){
            System.out.println(product.getText());
        }
    }
}
