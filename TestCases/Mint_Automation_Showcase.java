package TestCases;

import Object_Repository.Mint_homepage_Page;
//import java.awt.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Mint_Automation_Showcase {
	public static WebDriver driver;
	public WebDriverWait wait;
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);
	


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  
  }

  @Test(priority=1)
  public void mintHeader_button_Plans() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPlansPage_text()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPlansPage_text())).getText();
	  Assert.assertEquals(MintPlansPageText, "CHOOSE YOUR PLAN");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  }
	  
  @Test(priority=2)
  public void mintHeader_dropdown_Phones_BYOP() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_dropdown_Phones())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_BringYour())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintBYOPPage_text()));
	  String MintBYOPPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintBYOPPage_text())).getText();
	  Assert.assertEquals(MintBYOPPageText, "BRING THE PHONE YOU LOVE TO MINT MOBILE");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/byop/" );
  }  
  @Test(priority=3)
  public void mintHeader_button_Coverage() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Coverage())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintCoveragePage_text()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintCoveragePage_text())).getText();
	  Assert.assertEquals(MintPlansPageText, "COMPATIBILITY");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/coverage/" );
  }  
  @Test(priority=4)
  public void mintHeader_button_HowItWorks() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_How())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_How()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_How())).getText();
	  Assert.assertEquals(MintPlansPageText, "SO EASY, IT FEELS LIKE CHEATING");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/how-it-works/" );
  }   
  @Test(priority=5)
  public void mintHeader_button_Reviews() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Reviews())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_Reviews()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_Reviews())).getText();
	  Assert.assertEquals(MintPlansPageText, "THE STARS ARE OUT TONIGHT");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/reviews/" );
  }   
 
  @Test(priority=6)
  public void mintHeader_dropdown_HelpReturnPolicy() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_dropdown_Help())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_ReturnPolicy())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/return-policy/" );
  }    

  @Test(priority=7)
  public void mintSignIn() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys("6572476263");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
	  Thread.sleep(5000);
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
  }


  @Test(priority=8)
  public void mintHome_textbox_Calculator() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_textbox_Calculator())).sendKeys("10");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_dropdown_Calculator())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_dropdown_03GBCalculator())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_button_Calculator())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPlansPage_text()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPlansPage_text())).getText();
	  Assert.assertEquals(MintPlansPageText, "CHOOSE YOUR PLAN");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  }

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}

