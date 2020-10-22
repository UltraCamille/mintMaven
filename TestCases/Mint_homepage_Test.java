package TestCases;

import Object_Repository.Mint_homepage_Page;
//import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Mint_homepage_Test {
	public static WebDriver driver;
	public WebDriverWait wait;
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);
	


  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  driver.manage().window().maximize();
	  
  }         
//	 public void mintLinkCheck(By Page, By Text, String Assert, String Link)throws InterruptedException {
//		 driver.get("https://qa.mintmobile.com/?sc=v3");
//		 Thread.sleep(1000);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(Page)).click();
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(Text));
//		  String Assertion = wait.until(ExpectedConditions.visibilityOfElementLocated(Text)).getText();
//		  Assert.assertEquals(Assertion, Assert);
//		  String URL = driver.getCurrentUrl();
//		  Assert.assertEquals(URL, Link);
//	 }
//  
	  @Test(priority=2)
	  public void LinkCheck() throws InterruptedException {
	  
	  }
  @Test(priority=2)
  public void mintHeader_button_Plans() throws InterruptedException {
	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPlansPage_text()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPlansPage_text())).getText();
	  Assert.assertEquals(MintPlansPageText, "3 MONTH PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  }
  @Test(priority=2)
  public void mintHeader_dropdown_Phones_NewOne() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_dropdown_Phones())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_NewOne())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPhonesPage_text()));
	  String MintPhonesPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPhonesPage_text())).getText();
	  Assert.assertEquals(MintPhonesPageText, "Featured Products");
	//  String URL = driver.getCurrentUrl();
	//  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  } 
	  
  @Test(priority=3)
  public void mintHeader_dropdown_Phones_BYOP() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_dropdown_Phones())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_BringYour())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintBYOPPage_text()));
	  String MintBYOPPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintBYOPPage_text())).getText();
	  Assert.assertEquals(MintBYOPPageText, "BRING THE PHONE YOU LOVE TO MINT MOBILE");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/byop/" );
  }  
  @Test(priority=4)
  public void mintHeader_button_Coverage() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Coverage())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintCoveragePage_text()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintCoveragePage_text())).getText();
	  Assert.assertEquals(MintPlansPageText, "COMPATIBILITY");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/coverage/" );
  }  
  @Test(priority=5)
  public void mintHeader_button_HowItWorks() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_How())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_How()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_How())).getText();
	  Assert.assertEquals(MintPlansPageText, "SO EASY, IT FEELS LIKE CHEATING");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/how-it-works/" );
  }   
  @Test(priority=6)
  public void mintHeader_button_Reviews() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Reviews())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_Reviews()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_text_Reviews())).getText();
	  Assert.assertEquals(MintPlansPageText, "THE STARS ARE OUT TONIGHT");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/reviews/" );
  }   
  @Test(priority=7)
  public void mintHeader_dropdown_HelpFAQ() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_dropdown_Help())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_FAQ())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/faq/" );
  }  
  @Test(priority=8)
  public void mintHeader_dropdown_HelpReturnPolicy() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com/?sc=v3");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_dropdown_Help())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_ReturnPolicy())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/return-policy/" );
  }    
//  @Test(priority=9)
//  public void mint_button_RyanReynoldsAnnouncement() throws InterruptedException {
//	  driver.get("https://www.mintmobile.com");
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_button_RyanAnnouncement())).click();
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans()));
//	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
//	  Assert.assertEquals(MintPlansPageText, "SHOP PLANS");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/ryan-reynolds-announcement/" );
 // } 
  @Test(priority=10)
  public void mintFooter__button_Plans() throws InterruptedException{
//   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Plans')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Plans')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  } 
  @Test(priority=11)
  public void mintFooter_button_Phones() throws InterruptedException{
//   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Phones')])[3]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Phones')])[3]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPhonesPage_text())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "Phones");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.ultramobile.com/newsroom/" );
  } 
  @Test(priority=12)
  public void mintFooter_button_Coverage() throws InterruptedException{
//   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Coverage')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Coverage')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/coverage/" );
  }
  @Test(priority=13)
  public void mintFooter_button_BYOP() throws InterruptedException{
//   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Bring Your Own Phone')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Bring Your Own Phone')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/byop/" );
  }
  @Test(priority=14)
  public void mintFooter_button_INTL() throws InterruptedException{
//   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'International Calling')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'International Calling')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/international-rates/" );
  }
  @Test(priority=15)
  public void mintFooter_button_WFC() throws InterruptedException{
//   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'WiFi Calling & Text')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'WiFi Calling & Text')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/wifi-calling-text/" );
  }
  @Test(priority=16)
  public void mintFooter_button_WhoWeAre() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/about-mint-mobile/" );
  }
  @Test(priority=17)
  public void mintFooter_button_Reviews() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Reviews')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Reviews')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/reviews/" );
  }
  @Test(priority=18)
  public void mintFooter_button_RyanReynolds() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Ryan Reynolds')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Ryan Reynolds')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/ryan-reynolds-announcement/" );
  }
  @Test(priority=19)
  public void mintFooter_button_Press() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Press')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Press')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/press/" );
  }
  @Test(priority=20)
  public void mintFooter_button_RAF() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Refer A Friend')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Refer A Friend')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/refer-a-friend/" );
  }
  
  @Test(priority=21)
  public void mintFooter_button_BecomeAPartner() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Become A Partner')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Become A Partner')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/affiliate-program/" );
  }
  @Test(priority=21)
  public void mintFooter_button_Blog() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Blog')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Blog')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/blog/" );
  }
  
  @Test(priority=22)
  public void mintFooter_button_FAQ() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'FAQ')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'FAQ')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/faq/" );
  }
  
  @Test(priority=23)
  public void mintFooter_button_ReturnPolicy() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Return Policy')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Return Policy')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/return-policy/" );
  }
  
  @Test(priority=24)
  public void mintFooter_button_Community() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Community')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Community')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/community/" );
  }
  
  @Test(priority=25)
  public void mintFooter_button_UnlockPolicy() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Unlock Policy')])[1]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Unlock Policy')])[1]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/mint-mobile-device-unlock-policy/" );
  }
  @Test(priority=26)
  public void mintBorder_button_TandC() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Plan Terms & Conditions')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Plan Terms & Conditions')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/plan-terms-and-conditions/" );
  }
  
  @Test(priority=27)
  public void mintBorder_button_PrivacyPolicy() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/privacy-policy/" );
  }
  @Test(priority=28)
  public void mintBorder_button_ReturnPolicy() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Return Policy')])[3]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Return Policy')])[3]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/return-policy/" );
  }
  @Test(priority=29)
  public void mintBorder_button_UsePolicy() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Acceptable Use Policy')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Acceptable Use Policy')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/acceptable-use-policy/" );
  }
  
  @Test(priority=30)
  public void mintBorder_button_TermsofUse() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Site Terms of Use')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Site Terms of Use')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/site-terms-of-use/" );
  }
  
  @Test(priority=31)
  public void mintBorder_button_UnlockPolicy() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Unlock Policy')])[2]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Unlock Policy')])[2]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/mint-mobile-device-unlock-policy/" );
  }
  @Test(priority=32)
  public void mintBorder_button_911E911() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'911 & E911 Disclosure')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'911 & E911 Disclosure')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/911-and-e911-disclosure/" );
  }
  
  @Test(priority=33)
  public void mintBorder_button_Surcharge() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Changes to California Prepaid MTS Surcharge')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Changes to California Prepaid MTS Surcharge')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/ca-mts/" );
  }
  
  @Test(priority=34)
  public void mintBorder_button_SiteMap() throws InterruptedException{
   driver.get("https://mintmobile.com");
   Thread.sleep(5000);
//   wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintDismiss())).click(); 
//   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]"));
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
   Thread.sleep(2000); 
   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element).click().perform();
   Thread.sleep(5000);
	  String MintFooterPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintFooterPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/sitemap/" );
  }
  
  @Test(priority=35)
  public void mintSignIn() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys("6572671362");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Testing1!"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
	  Thread.sleep(5000);
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
  }
  
  @Test(priority=36)
  public void mintHeader_button_Activate() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Activate())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_text_ActivateYourSimCard()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_text_ActivateYourSimCard())).getText();
	  Assert.assertEquals(MintPlansPageText, "Activate Your SIM Card");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  }
  
  @Test(priority=37)
  public void mintHeader_image_ShoppingCart() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_image_ShoppingCart())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_Plans())).getText();
	  Assert.assertEquals(MintPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/cart/" );
  }
  
  @Test(priority=38)
  public void mintHome_button_3GBPlan_ViewDetails() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintHome_button_3GBPlan_ViewDetails())).click();
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_3GBPlan_ViewDetails())).getText();
	  Assert.assertEquals(MintPlansPageText, "3 MONTH, 3GB PLAN – SIM KIT");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/product/03-month-small-sim-card-plan/");
  }
  @Test(priority=38)
  public void mint_VF() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_ZipCode())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_ZipCode())).sendKeys("92626");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_ZipCode())).sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_button_LetsGo()));
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
	  Thread.sleep(1000);

  }
  @Test(priority=39)
  public void mintHome_button_8GBPlan_ViewDetails() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintHome_button_8GBPlan_ViewDetails())).click();
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_8GBPlan_ViewDetails())).getText();
	  Assert.assertEquals(MintPlansPageText, "3 MONTH, 8GB PLAN – SIM KIT");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/product/03-month-medium-sim-card-plan/");
  }
  @Test(priority=40)
  public void mintHome_button_12GBPlan_ViewDetails() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintHome_button_12GBPlan_ViewDetails())).click();
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_12GBPlan_ViewDetails())).getText();
	  Assert.assertEquals(MintPlansPageText, "3 MONTH, 12GB PLAN – SIM KIT");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/product/03-month-large-sim-card-plan/");
  }
  @Test(priority=41)
  public void mintHome_button_SeeMorePlans() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_button_SeeMorePlans()));
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintHome_button_SeeMorePlans())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_dropdown_SeeMorePlans()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_dropdown_SeeMorePlans())).getText();
	  Assert.assertEquals(MintPlansPageText, "6 MONTH PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/");
  }
  @Test(priority=43)
  public void mintHome_button_iPhone11ProMax() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_button_iPhone11ProMax())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_iPhone11ProMax()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_iPhone11ProMax())).getText();
	  Assert.assertEquals(MintPlansPageText, "Apple iPhone 11 Pro Max - $1099.00");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/");
  }
  @Test(priority=44)
  public void mintHome_button_iPhone11Pro() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_button_iPhone11Pro())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_iPhone11Pro()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_iPhone11Pro())).getText();
	  Assert.assertEquals(MintPlansPageText, "Apple iPhone 11 Pro - $999.00");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/");
  }
  @Test(priority=45)
  public void mintHome_button_iPhone11() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_button_iPhone11())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_iPhone11()));
	  String MintPlansPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_text_iPhone11())).getText();
	  Assert.assertEquals(MintPlansPageText, "Apple iPhone 11 - $699.00");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/");
  }
  @Test(priority=42)
  public void mintHome_button_ViewAllPhones() throws InterruptedException {
	  driver.get("https://www.mintmobile.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHome_button_ViewAllPhones())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPhonesPage_text()));
	  String MintPhonesPageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintPhonesPage_text())).getText();
	  Assert.assertEquals(MintPhonesPageText, "Phones");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://www.mintmobile.com/");
  }

  
//  @Test(priority=-1)
//  public void sendMintMobileTestReport() throws InterruptedException{
//  driver.get("http://www.gmail.com/");
//  Thread.sleep(1000);
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailInput())).sendKeys("UltraMobileQATest@gmail.com");
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailNext())).click(); 
//  Thread.sleep(1000);
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailPasswordInput())).click(); 
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailPasswordInput())).sendKeys("Testing1!");
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailNext())).click(); 
//  Thread.sleep(5000);
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailCompose())).click(); 
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailRecipient())).click(); 
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailRecipient())).sendKeys("camille@ultra.me");
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailSubject())).click(); 
//  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.gmailEmailSubject())).sendKeys("Mint Mobile Home Links Test" + sdf);
//  
//}

  @Test(priority=46)
  public void mintINTL() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/international-roaming/");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mint_textbox_INTL())).sendKeys("CANADA");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Canada')]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.06')][1]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.06')][2]")));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'$0.02')]")));
  }
  @Test(priority=47)
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
	  Assert.assertEquals(MintPlansPageText, "SHOP PLANS");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.mintmobile.com/plans/" );
  }
  


  @AfterClass
  public void tearDown() {
		driver.quit();
  }

}

