package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrainSearchPage extends Page {

   @FindBy(xpath = "//div[@class='col-md-1 col-xs-1 col-sm-1 replaceBox']//button[@type='button']")
    WebElement search ;
// @FindBy(xpath = "//button[@class="btn ng-binding"]")
 //WebElement search;

    public TrainSearchPage(WebDriver webDriver){
        super(webDriver);

        PageFactory.initElements(driver, this);
    }
    public void searchButton() throws InterruptedException {
       search.click();

    }
}
