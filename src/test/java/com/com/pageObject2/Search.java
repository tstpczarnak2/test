package com.com.pageObject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
    private WebDriver driver;
    @FindBy(id = "edit-keys")
    private WebElement search;
    @FindBy( css= "i[class='fa fa-search']")
    private WebElement searchButton;

    public Search(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public searchResult doSearch(String what){

        searchButton.click();
        Wait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(search));
        search.sendKeys(what);
     search.submit();
     return new searchResult(driver, what);
    }

}
