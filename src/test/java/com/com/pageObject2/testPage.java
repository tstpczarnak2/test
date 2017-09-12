package com.com.pageObject2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testPage {
    WebDriver driver;
    @Test
    public void run(){
       browser browser = new browser();
       searchResult sR =  browser.returnHomePage().returnSearch().doSearch("phone");
        sR.getProducts();
    }
}
