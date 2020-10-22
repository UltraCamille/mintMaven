package TestCases;

import Object_Repository.Mint_homepage_Page;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//---


public class Mint_INTLRoamingRoates {
	public WebDriver driver;
	public WebDriverWait wait;
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//Users//camillemonzon//Documents//chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  
  }
  
  
  @Test(priority=1)
  public void CANADA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CANADA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Canada')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.06')][1]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.06')][2]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.02')]")));
  }
  @Test(priority=2)
  public void MEXICO() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MEXICO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mexico')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.06')][1]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.06')][2]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.02')]")));
  }
  @Test(priority=3)
  public void AFGHANISTAN() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("AFGHANISTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Afghanistan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=4)
  public void ALAND_ISLANDS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ALAND ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Aland Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=5)
  public void ALBANIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ALBANIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Albania')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=7)
  public void ALDERNEY() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ALDERNEY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Alderney')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=8)
  public void ALGERIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ALGERIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Algeria')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=9)
  public void AMERICAN_SAMOA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("AMERICAN SAMOA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'American Samoa')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=10)
  public void ANDORRA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ANDORRA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Andorra')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=11)
  public void ANGOLA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ANGOLA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Angola')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=12)
  public void ANGUILLA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ANGUILLA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Anguilla')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=13)
  public void ANTIGUA_AND_BARBUDA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ANTIGUA AND BARBUDA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Antigua And Barbuda')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=14)
  public void ARGENTINA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ARGENTINA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Argentina')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=15)
  public void ARMENIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ARMENIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Armenia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=16)
  public void ARUBA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ARUBA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Aruba')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=17)
  public void ASCENSION_ISLAND() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ASCENSION ISLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Ascension Island')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.25')]")));
  }
  @Test(priority=18)
  public void AUSTRALIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("AUSTRALIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Australia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=19)
  public void AUSTRIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("AUSTRIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Austria')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=20)
  public void AZERBAIJAN() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("AZERBAIJAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Azerbaijan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=21)
  public void AZORES() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("AZORES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Azores')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=22)
  public void BAHAMAS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BAHAMAS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bahamas')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=23)
  public void BAHRAIN() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BAHRAIN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bahrain')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=24)
  public void BANGLADESH() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BANGLADESH");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bangladesh')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=25)
  public void BARBADOS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BARBADOS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Barbados')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=26)
  public void BELARUS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BELARUS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Belarus')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=27)
  public void BELGIUM() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BELGIUM");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Belgium')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=28)
  public void BELIZE() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BELIZE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Belize')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=29)
  public void BENIN() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BENIN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Benin')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=30)
  public void BERMUDA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BERMUDA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bermuda')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=31)
  public void BHUTAN() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BHUTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bhutan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=32)
  public void BOLIVIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BOLIVIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bolivia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=33)
  public void BONAIRE() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BONAIRE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bonaire')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=34)
  public void BOSNIA_AND_HERZEGOVINA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BOSNIA AND HERZEGOVINA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bosnia And Herzegovina')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=35)
  public void BOTSWANA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BOTSWANA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Botswana')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$20.00')]")));
  }
  @Test(priority=36)
  public void BRAZIL() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BRAZIL");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Brazil')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=37)
  public void BRITISH_VIRGIN_ISLANDS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BRITISH VIRGIN ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'British Virgin Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=38)
  public void BRUNEI_DARUSSALAM() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BRUNEI DARUSSALAM");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Brunei Darussalam')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=39)
  public void BULGARIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BULGARIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Bulgaria')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=40)
  public void BURKINA_FASO() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BURKINA FASO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Burkina Faso')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=41)
  public void BURUNDI() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("BURUNDI");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Burundi')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=42)
  public void CAMBODIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CAMBODIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cambodia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=43)
  public void CAMEROON() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CAMEROON");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cameroon')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=44)
  public void CANARY_ISLANDS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CANARY ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Canary Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=45)
  public void CAPE_VERDE() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CAPE VERDE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cape Verde')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=46)
  public void CAYMAN_ISLANDS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CAYMAN ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cayman Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=47)
  public void CENTRAL_AFRICAN_REPUBLIC() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CENTRAL AFRICAN REPUBLIC");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Central African Republic')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.50')]")));
  }
  @Test(priority=48)
  public void CHAD() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CHAD");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Chad')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=49)
  public void CHILE() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CHILE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Chile')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=50)
  public void CHINA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CHINA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'China')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=51)
  public void CHRISTMAS_ISLAND() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CHRISTMAS ISLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Christmas Island')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=52)
  public void COLOMBIA() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("COLOMBIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Colombia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=53)
  public void CONGO() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CONGO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Congo')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=54)
  public void CONGO_DEMOCRATIC_REPUBLIC_KINSHASA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CONGO, DEMOCRATIC REPUBLIC/ KINSHASA ");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Congo, Democratic Republic/ Kinshasa')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=55)
  public void COOK_ISLANDS() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("COOK ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cook Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.25')]")));
  }
  @Test(priority=56)
  public void COSTA_RICA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("COSTA RICA ");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Costa Rica')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=57)
  public void COTE_DIVOIRE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("COTE D'IVOIRE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cote D'Ivoire')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=58)
  public void CROATIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CROATIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Croatia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=59)
  public void CUBA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CUBA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cuba')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$2.05')]")));
  }
  @Test(priority=60)
  public void CURACAO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CURACAO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Curacao')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=61)
  public void CYPRUS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CYPRUS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Cyprus')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=62)
  public void CZECH_REPUBLIC () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CZECH REPUBLIC");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Czech Republic')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=63)
  public void DENMARK () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("DENMARK");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Denmark')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=64)
  public void DJIBOUTI () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("DJIBOUTI");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Djibouti')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$35.00')]")));
  }
  @Test(priority=65)
  public void DOMINICA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("DOMINICA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Dominica')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=66)
  public void DOMINICAN_REPUBLIC () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("DOMINICAN REPUBLIC");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Dominican Republic')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=67)
  public void EASTER_ISLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("EASTER ISLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Easter Island')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=68)
  public void ECUADOR () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ECUADOR");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Ecuador')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=69)
  public void EGYPT () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("EGYPT");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Egypt')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=70)
  public void EL_SALVADOR () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("EL SALVADOR");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'El Salvador')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=71)
  public void EQUATORIAL_GUINEA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("EQUATORIAL GUINEA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Equatorial Guinea')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.25')]")));
  }
  @Test(priority=72)
  public void ESTONIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ESTONIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Estonia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=73)
  public void ETHIOPIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ETHIOPIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Ethiopia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$35.00')]")));
  }
  @Test(priority=74)
  public void FAROE_ISLANDS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FAROE ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Faroe Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=75)
  public void FEDERATED_STATES_OF_MICRONESIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FEDERATED STATES OF MICRONESIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Federated States Of Micronesia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.25')]")));
  }
  @Test(priority=76)
  public void FIJI () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FIJI");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Fiji')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=77)
  public void FINLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FINLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Finland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=78)
  public void FRANCE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FRANCE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'France')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=79)
  public void FRENCH_GUIANA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FRENCH GUIANA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'French Guiana')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=80)
  public void FRENCH_POLYNESIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("FRENCH POLYNESIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'French Polynesia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=81)
  public void GABON () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GABON");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Gabon')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=82)
  public void GAMBIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GAMBIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Gambia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=83)
  public void GEORGIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GEORGIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Georgia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=84)
  public void GERMANY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GERMANY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Germany')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=85)
  public void GHANA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GHANA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Ghana')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=86)
  public void GIBRALTAR () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GIBRALTAR");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Gibraltar')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=87)
  public void GREECE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GREECE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Greece')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=88)
  public void GREENLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GREENLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Greenland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=89)
  public void GRENADA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GRENADA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Grenada')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=90)
  public void GUADELOUPE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUADELOUPE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guadeloupe')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=91)
  public void GUAM () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUAM");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guam')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=92)
  public void GUATEMALA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUATEMALA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guatemala')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=93)
  public void GUERNSEY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUERNSEY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guernsey')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=94)
  public void GUINEA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUINEA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guinea')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=95)
  public void GUINEA_BISSAU () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUINEA-BISSAU");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guinea-Bissau')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=96)
  public void GUYANA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("GUYANA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Guyana')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=97)
  public void HAITI () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("HAITI");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Haiti')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=98)
  public void HERM () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("HERM");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Herm')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=99)
  public void HONDURAS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("HONDURAS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Honduras')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=100)
  public void HONG_KONG () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("HONG KONG");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Hong Kong')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=101)
  public void HUNGARY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("HUNGARY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Hungary')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=102)
  public void ICELAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ICELAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Iceland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=103)
  public void INDIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("INDIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'India')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=104)
  public void INDONESIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("INDONESIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Indonesia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=105)
  public void IRAQ () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("IRAQ");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Iraq')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=106)
  public void IRELAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("IRELAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Ireland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=107)
  public void ISLE_OF_MAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ISLE OF MAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Isle Of Man')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=108)
  public void ISRAEL () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ISRAEL");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Israel')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=109)
  public void ITALY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ITALY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Italy')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=110)
  public void JAMAICA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("JAMAICA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Jamaica')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=111)
  public void JAPAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("JAPAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Japan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=112)
  public void JERSEY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("JERSEY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Jersey')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=113)
  public void JORDAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("JORDAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Jordan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=114)
  public void KAZAKHSTAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("KAZAKHSTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Kazakhstan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=115)
  public void KENYA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("KENYA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Kenya')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=116)
  public void KOSOVO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("KOSOVO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Kosovo')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=117)
  public void KUWAIT () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("KUWAIT");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Kuwait')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=118)
  public void KYRGYZSTAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("KYRGYZSTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Kyrgyzstan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=119)
  public void LAOS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LAOS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Laos')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=120)
  public void LATVIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LATVIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Latvia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=121)
  public void LEBANON () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LEBANON");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Lebanon')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=122)
  public void LESOTHO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LESOTHO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Lesotho')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=123)
  public void LIBERIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LIBERIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Liberia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=124)
  public void LIBYA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LIBYA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Libya')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$15.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$2.50')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$60.00')]")));
  }
  @Test(priority=125)
  public void LIECHTENSTEIN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LIECHTENSTEIN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Liechtenstein')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=126)
  public void LITHUANIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LITHUANIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Lithuania')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=127)
  public void LUXEMBOURG () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("LUXEMBOURG");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Luxembourg')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  
  @Test(priority=128)
  public void MACAU () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MACAU");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Macau')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=129)
  public void MACEDONIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MACEDONIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Macedonia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=130)
  public void MADAGASCAR () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MADAGASCAR");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Madagascar')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=131)
  public void MADEIRA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MADEIRA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Madeira')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=132)
  public void MALAWI () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MALAWI");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Malawi')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=133)
  public void MALAYSIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MALAYSIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Malaysia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=134)
  public void MALDIVES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MALDIVES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Maldives')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$5.25')]")));
  }
  @Test(priority=135)
  public void MALI () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MALI");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mali')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=136)
  public void MALTA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MALTA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Malta')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=137)
  public void MARIE_GALANTE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MARIE GALANTE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Marie Galante')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=138)
  public void MARTINIQUE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MARTINIQUE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Martinique')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=139)
  public void MAURITANIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MAURITANIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mauritania')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  
  @Test(priority=140)
  public void MAURITIUS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MAURITIUS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mauritius')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=141)
  public void MAYOTTE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MAYOTTE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mayotte')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=142)
  public void MOLDOVA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MOLDOVA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Moldova')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=143)
  public void MONACO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MONACO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Monaco')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=144)
  public void MONGOLIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MONGOLIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mongolia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=145)
  public void MONTENEGRO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MONTENEGRO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Montenegro')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=146)
  public void MONTSERRAT () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MONTSERRAT");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Montserrat')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=147)
  public void MOROCCO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MOROCCO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Morocco')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=148)
  public void MOZAMBIQUE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MOZAMBIQUE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Mozambique')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=149)
  public void MYANMAR () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("MYANMAR");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Myanmar')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.75')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=150)
  public void NAMIBIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NAMIBIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Namibia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=151)
  public void NAURU () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NAURU");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Nauru')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=152)
  public void NEPAL () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NEPAL");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Nepal')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.75')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=153)
  public void NETHERLANDS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NETHERLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Netherlands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=154)
  public void NETHERLANDS_ANTILLES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NETHERLANDS ANTILLES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Netherlands Antilles')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=155)
  public void NEW_CALEDONIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NEW CALEDONIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'New Caledonia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=156)
  public void NEW_ZEALAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NEW ZEALAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'New Zealand')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=157)
  public void NICARAGUA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NICARAGUA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Nicaragua')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=158)
  public void NIGER () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NIGER");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Niger')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=159)
  public void NIGERIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NIGERIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Nigeria')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=160)
  public void NORTHERN_IRELAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NORTHERN IRELAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Northern Ireland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=161)
  public void NORTHERN_MARIANA_ISLANDS_SAIPAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NORTHERN MARIANA ISLANDS (SAIPAN)");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Northern Mariana Islands (Saipan)')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=162)
  public void NORWAY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("NORWAY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Norway')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=163)
  public void OMAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("OMAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Oman')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=164)
  public void PAKISTAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PAKISTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Pakistan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=165)
  public void PALESTINIAN_TERRITORIES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PALESTINIAN TERRITORIES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Palestinian Territories')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=166)
  public void PANAMA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PANAMA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Panama')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=167)
  public void PAPUA_NEW_GUINEA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PAPUA NEW GUINEA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Papua New Guinea')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=168)
  public void PARAGUAY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PARAGUAY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Paraguay')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=169)
  public void PERU () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PERU");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Peru')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=170)
  public void PHILIPPINES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PHILIPPINES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Philippines')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=171)
  public void POLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("POLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Poland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=172)
  public void PORTUGAL () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("PORTUGAL");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Portugal')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=173)
  public void QATAR () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("QATAR");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Qatar')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=174)
  public void REUNION () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("REUNION");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Reunion')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=175)
  public void ROMANIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ROMANIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Romania')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=176)
  public void RUSSIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("RUSSIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Russia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=177)
  public void RWANDA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("RWANDA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Rwanda')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=178)
  public void SAINT_BARTHELEMY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT BARTHELEMY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Barthelemy')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=179)
  public void SAINT_EUSTATIUS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT EUSTATIUS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Eustatius')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=180)
  public void SAINT_KITTS_AND_NEVIS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT KITTS AND NEVIS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Kitts And Nevis')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=181)
  public void SAINT_LUCIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT LUCIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Lucia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=182)
  public void SAINT_MARTIN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT MARTIN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Martin')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=183)
  public void SAINT_PIERRE_AND_MIQUELON () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT PIERRE AND MIQUELON");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Pierre And Miquelon')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.25')]")));
  }
  @Test(priority=184)
  public void SAINT_SABA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT SABA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Saba')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=185)
  public void SAINT_VINCENT_AND_THE_GRENADINES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAINT VINCENT AND THE GRENADINES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saint Vincent And The Grenadines')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=186)
  public void SAMOA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAMOA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Samoa')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=187)
  public void SAN_MARINO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAN MARINO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'San Marino')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=188)
  public void SAO_TOME_AND_PRINCIPE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAO TOME AND PRINCIPE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Sao Tome And Principe')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=189)
  public void SARK_ISLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SARK ISLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Sark Island')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=190)
  public void SAUDI_ARABIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SAUDI ARABIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Saudi Arabia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=191)
  public void SCOTLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SCOTLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Scotland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=192)
  public void SENEGAL () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SENEGAL");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Senegal')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=193)
  public void SERBIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SERBIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Serbia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=194)
  public void SEYCHELLES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SEYCHELLES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Seychelles')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=195)
  public void SIERRA_LEONE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SIERRA LEONE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Sierra Leone')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=196)
  public void SINGAPORE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SINGAPORE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Singapore')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=197)
  public void SINT_MAARTEN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SINT MAARTEN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Sint Maarten')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=198)
  public void SLOVAKIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SLOVAKIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Slovakia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=199)
  public void SLOVENIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SLOVENIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Slovenia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=200)
  public void SOUTH_AFRICA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SOUTH AFRICA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'South Africa')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=201)
  public void SOUTH_KOREA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SOUTH KOREA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'South Korea')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=202)
  public void SOUTH_SUDAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SOUTH SUDAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'South Sudan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$1.45')]")));
  }
  @Test(priority=203)
  public void SPAIN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SPAIN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Spain')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=204)
  public void SRI_LANKA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SRI LANKA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Sri Lanka')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=205)
  public void SURINAME () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SURINAME");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Suriname')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=206)
  public void SVALBARD () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SVALBARD");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Svalbard')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=207)
  public void SWEDEN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SWEDEN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Sweden')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=208)
  public void SWITZERLAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("SWITZERLAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Switzerland')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=209)
  public void TAIWAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TAIWAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Taiwan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=210)
  public void TAJIKISTAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TAJIKISTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Tajikistan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=211)
  public void TANZANIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TANZANIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Tanzania')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=212)
  public void THAILAND () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("THAILAND");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Thailand')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=213)
  public void TOGO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TOGO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Togo')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=214)
  public void TONGA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TONGA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Tonga')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=215)
  public void TRINIDAD_AND_TOBAGO () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TRINIDAD AND TOBAGO");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Trinidad And Tobago')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=216)
  public void TUNISIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TUNISIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Tunisia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
  @Test(priority=217)
  public void TURKEY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TURKEY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Turkey')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=218)
  public void TURKMENISTAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TURKMENISTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Turkmenistan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=219)
  public void TURKS_AND_CAICOS_ISLANDS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("TURKS AND CAICOS ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Turks And Caicos Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=220)
  public void UGANDA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("UGANDA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Uganda')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=221)
  public void UKRAINE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("UKRAINE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Ukraine')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=222)
  public void UNITED_ARAB_EMIRATES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("UNITED ARAB EMIRATES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'United Arab Emirates')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=223)
  public void UNITED_KINGDOM () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("UNITED KINGDOM");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'United Kingdom')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=224)
  public void URUGUAY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("URUGUAY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Uruguay')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=225)
  public void US_VIRGIN_ISLANDS () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("US VIRGIN ISLANDS");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Us Virgin Islands')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.75')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=226)
  public void UZBEKISTAN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("UZBEKISTAN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Uzbekistan')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=227)
  public void VANUATU () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("VANUATU");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Vanuatu')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=228)
  public void VATICAN_CITY () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("VATICAN CITY");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Vatican City')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=229)
  public void VENEZUELA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("VENEZUELA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Venezuela')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=230)
  public void VIETNAM () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("VIETNAM");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Vietnam')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=231)
  public void WALES () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("WALES");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Wales')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=232)
  public void WESTERN_SAHARA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("WESTERN SAHARA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Western Sahara')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.75')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=233)
  public void YEMEN () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("YEMEN");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Yemen')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$4.00')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.85')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$20.00')]")));
  }
  @Test(priority=234)
  public void ZAMBIA () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ZAMBIA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Zambia')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.20')]")));
  }
  @Test(priority=235)
  public void ZIMBABWE () throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("ZIMBABWE");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Zimbabwe')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.25')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.05')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.60')]")));
  }
 
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}

