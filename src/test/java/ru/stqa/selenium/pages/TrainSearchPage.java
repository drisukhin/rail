package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrainSearchPage extends Page {

    @FindBy(xpath = "//button[@type='button'][contains(text(),'New Search')]")
    WebElement search ;

    public TrainSearchPage(WebDriver webDriver){
        super(webDriver);

        PageFactory.initElements(driver, this);
    }
    public void searchButton(){
       search.click();
    }
}
