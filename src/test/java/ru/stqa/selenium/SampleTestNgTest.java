package ru.stqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.stqa.selenium.pages.HomePage;
import ru.stqa.selenium.pages.TrainSearchPage;

import java.util.concurrent.TimeUnit;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  private TrainSearchPage searchPage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    searchPage=PageFactory.initElements(driver,TrainSearchPage.class);
  }




  @Test
  public void testHomePageHasAHeader() throws InterruptedException {
    driver.get(baseUrl);
    homepage.putTextToFieldFrom("Ako");
    homepage.putTextToFieldToWhere("Ashkelon");
  //  homepage.revers();
    homepage.clickSearch();

  searchPage.searchButton();
//driver.findElement(By.xpath("//div[@class='col-md-1 col-xs-1 col-sm-1 replaceBox']//button[@type='button']")).click();
    Assert.assertTrue(true);
  }
}
