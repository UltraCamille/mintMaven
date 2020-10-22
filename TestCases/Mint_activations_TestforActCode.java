package TestCases;

import Object_Repository.Mint_activations_Page;
import Object_Repository.Mint_homepage_Page;

import java.io.IOException;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mint_activations_TestforActCode {
	public WebDriver driver;
	public WebDriverWait wait;
	Mint_activations_Page maa = new Mint_activations_Page(driver);
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);


	  @BeforeMethod
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		  driver = new ChromeDriver();
		  wait = new WebDriverWait(driver,10);
		  
	  }
	  public void mintActivate_3MoLargePROD()throws InterruptedException {
		  driver.get("https://www.slack.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_button_SignIn())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_workpace_URL())).sendKeys("ultramobile" + Keys.RETURN); 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_email_Address())).sendKeys("qatester@ultra.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_password())).sendKeys("UltraMobile#1" + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_textbox())).sendKeys("/geticcid" + Keys.RETURN + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_SelectSimStatus())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Available())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_OrangeSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Brand())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_PRODMint())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductType())).click();
		  Thread.sleep(5000);
		  Actions actions = new Actions(driver);
		   WebElement element2 = driver.findElement(By.xpath("(//span[contains(text(),'3 Month Large')])[1]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		   Thread.sleep(2000); 
		   WebElement element3 = driver.findElement(By.xpath("(//span[contains(text(),'3 Month Large')])[1]"));
		   actions.moveToElement(element3).click().perform();
		  Thread.sleep(7000);
		   WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Initial Product ID...']"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//input[@placeholder='Initial Product ID...']"));
		   actions.moveToElement(element).click().perform();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_3MoLarge_ID())).click();
		   Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_button_GetICCID())).click();
		  Thread.sleep(3000);
		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		 driver.manage().deleteAllCookies();
		  Thread.sleep(3000);
		  driver.get("https://www.mintmobile.com");	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_Activate())).click();
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mint_textbox_ActCode())).sendKeys(CopyActCode);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mint_button_StartActivation())).click();
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_InputZipCode())).sendKeys("92626");
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_ActivateaNewNumber())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_Checkbox())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.signActivation_button_ProceedActivation())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintBillingInto_Link_Skip())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_FirstName())).sendKeys("Mint");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_LastName())).sendKeys("Mobile");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_Email())).sendKeys("noemail@mint.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_Password())).sendKeys("Test123!");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_ConfirmPassword())).sendKeys("Test123!");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_SubmitInfo())).click();
		  Thread.sleep(60000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
		  Thread.sleep(120000);
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};

	}  

	 

	  public void mintActivate_3MoLargeQA()throws InterruptedException {
		  driver.get("https://www.slack.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_button_SignIn())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_workpace_URL())).sendKeys("ultramobile" + Keys.RETURN); 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_email_Address())).sendKeys("qatester@ultra.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_password())).sendKeys("UltraMobile#1" + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_textbox())).sendKeys("/geticcid" + Keys.RETURN + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_SelectSimStatus())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Available())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_OrangeSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Brand())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_QAMint())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductType())).click();
		  Thread.sleep(5000);
		  Actions actions = new Actions(driver);
		   WebElement element2 = driver.findElement(By.xpath("(//span[contains(text(),'3 Month Large')])[1]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		   Thread.sleep(2000); 
		   WebElement element3 = driver.findElement(By.xpath("(//span[contains(text(),'3 Month Large')])[1]"));
		   actions.moveToElement(element3).click().perform();
		  Thread.sleep(7000);
		   WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Initial Product ID...']"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//input[@placeholder='Initial Product ID...']"));
		   actions.moveToElement(element).click().perform();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_3MoLarge_ID())).click();
		   Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_button_GetICCID())).click();
		  Thread.sleep(3000);
		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		 driver.manage().deleteAllCookies();
		  Thread.sleep(3000);
		  driver.get("https://qa.mintmobile.com");	
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_Activate())).click();
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mint_textbox_ActCode())).sendKeys(CopyActCode);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mint_button_StartActivation())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_skipDeviceCheck())).click();
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_InputZipCode())).sendKeys("92626");
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_ActivateaNewNumber())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_Checkbox())).click();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.signActivation_button_ProceedActivation())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_CreditCard())).sendKeys("4111 1111 1111 1111");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_CVV())).sendKeys("123");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_ExpDate())).sendKeys("01/30");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_FirstName())).sendKeys("Mint");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_LastName())).sendKeys("Mobile");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_Address())).sendKeys("1550 Scenic Ave");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_Address2())).sendKeys("Suite 100");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_City())).sendKeys("Costa Mesa");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_State())).sendKeys("CA");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_ZipCode())).sendKeys("92626");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_FirstName())).sendKeys("Mint");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_LastName())).sendKeys("Mobile");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_Email())).sendKeys("noemail@mint.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_Password())).sendKeys("Test123!");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_textbox_ConfirmPassword())).sendKeys("Test123!");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_SubmitInfo())).click();
		  Thread.sleep(60000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
		  Thread.sleep(120000);
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		  if (wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText().equals("Activation in Progress")) {
			  Thread.sleep(60000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_button_submit())).click();
			  String ActivationCompleteText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_text_Complete())).getText();
			  Assert.assertEquals(ActivationCompleteText, "Activation Complete");
		  } else {};
		   

	}  
	  
	  public void mintActivate_CampuSIM()throws InterruptedException {
		  driver.get("https://www.slack.com");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_button_SignIn())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_workpace_URL())).sendKeys("ultramobile" + Keys.RETURN); 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_email_Address())).sendKeys("qatester@ultra.me");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_password())).sendKeys("UltraMobile#1" + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_textbox())).sendKeys("/geticcid" + Keys.RETURN + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_SelectSimStatus())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Available())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_OrangeSim())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Brand())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_QAMint())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductType())).click();
		  Thread.sleep(5000);
		  Actions actions = new Actions(driver);
		   WebElement element2 = driver.findElement(By.xpath("(//span[contains(text(),'3 Month Large')])[1]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		   Thread.sleep(2000); 
			  Thread.sleep(1000);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  Thread.sleep(1000);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  Thread.sleep(1000);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  Thread.sleep(1000);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  Thread.sleep(1000);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  actions.sendKeys(Keys.ARROW_DOWN);
			  Thread.sleep(1000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_plan_CampusTrial())).click();
		  Thread.sleep(7000);
		   WebElement element1 = driver.findElement(By.xpath("//input[@placeholder='Initial Product ID...']"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		   Thread.sleep(2000); 
		   WebElement element = driver.findElement(By.xpath("//input[@placeholder='Initial Product ID...']"));
		   actions.moveToElement(element).click().perform();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_productID_CampusSIM())).click();
		   Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_button_GetICCID())).click();
		  Thread.sleep(3000);

	  }
	  public void mintActivate_mintTrial()throws InterruptedException {

		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_textbox())).sendKeys("/geticcid" + Keys.RETURN + Keys.RETURN);
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_SelectSimStatus())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Available())).click();
		  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_MintTrial())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_Brand())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_QAMint())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_button_GetICCID())).click();
		  Thread.sleep(3000);

	  }
		 @Test (priority = 1)
		 public void User1() throws InterruptedException, IOException {
			  driver.get("https://www.slack.com/?test=123456");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_button_SignIn())).click();
//			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_manualsignin())).click();
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_workpace_URL())).sendKeys("ultramobile" + Keys.RETURN); 
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_email_Address())).sendKeys("qatester@ultra.me");
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.slack_password())).sendKeys("UltraMobile#1" + Keys.RETURN);
			  Thread.sleep(3000);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("1. " + CopyActCode);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode1 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("2. " + CopyActCode1);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("3. " + CopyActCode2);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode3 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("4. " + CopyActCode3);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode4 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("5. " + CopyActCode4);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode5 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("6. " + CopyActCode5);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode6 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("7. " + CopyActCode6);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode7 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("8. " + CopyActCode7);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode8 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("9. " + CopyActCode8);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode9 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("10. " + CopyActCode9);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode10 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("11. " + CopyActCode10);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode11 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("12. " + CopyActCode11);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode12 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("13. " + CopyActCode12);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode13 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("14. " + CopyActCode13);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode14 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("15. " + CopyActCode14);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode15 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("16. " + CopyActCode15);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode16 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("17. " + CopyActCode16);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode17 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("18. " + CopyActCode17);
			 mintActivate_mintTrial();
		  Thread.sleep(1000);
			 String CopyActCode18 =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
		  System.out.println("19. " + CopyActCode18);
	
		 }
		
//	 @Test (priority = 1)
//	 public void User1() throws InterruptedException, IOException {
//	 mintActivate_3MoLargePROD();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://www.mintmobile.com/");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large 1. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 2)
//	 public void User2() throws InterruptedException, IOException {
//	 mintActivate_3MoLargePROD();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://www.mintmobile.com/");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large 2. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 3)
//	 public void User3() throws InterruptedException, IOException {
//	 mintActivate_3MoLargePROD();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://www.mintmobile.com/");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large 3. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 4)
//	 public void User4() throws InterruptedException, IOException {
//	 mintActivate_3MoLargePROD();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://www.mintmobile.com/");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large 4. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 5)
//	 public void User5() throws InterruptedException, IOException {
//	 mintActivate_3MoLargePROD();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://www.mintmobile.com/");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large 5. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 6)
//	 public void User6() throws InterruptedException, IOException {
//	 mintActivate_3MoLargeQA();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large QA 1. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 7)
//	 public void User7() throws InterruptedException, IOException {
//	 mintActivate_3MoLargeQA();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large QA 2. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 8)
//	 public void User8() throws InterruptedException, IOException {
//	 mintActivate_3MoLargeQA();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large QA 3. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 9)
//	 public void User9() throws InterruptedException, IOException {
//	 mintActivate_3MoLargeQA();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large QA 4. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 10)
//	 public void User10() throws InterruptedException, IOException {
//	 mintActivate_3MoLargeQA();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large QA 10. " + activatedSubMSISDN);
//	 }
//	 @Test (priority = 11)
//	 public void User11() throws InterruptedException, IOException {
//	 mintActivate_3MoLargeQA();
//	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
//	  Thread.sleep(1000);
//	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
//	  Thread.sleep(1000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
//	  Thread.sleep(5000);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
//	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
//	  Assert.assertEquals(AccountManagementText, "My Plan");
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
//	  System.out.println("Mint 3 Month Large QA 11. " + activatedSubMSISDN);
//	 }
//		 @Test (priority = 1)
//		 public void Act1() throws InterruptedException, IOException {
//			 mintActivate_CampuSIM();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		  System.out.println("CampusSIMActCode 1 " + CopyActCode);
//		 }
//		 @Test (priority = 2)
//		 public void Act2() throws InterruptedException, IOException {
//			 mintActivate_CampuSIM();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		  System.out.println("CampusSIMActCode 2 " + CopyActCode);
//		 }
//		 @Test (priority = 3)
//		 public void Act3() throws InterruptedException, IOException {
//			 mintActivate_CampuSIM();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		  System.out.println("CampusSIMActCode 3 " + CopyActCode);
//		 }
//		 @Test (priority = 4)
//		 public void Act4() throws InterruptedException, IOException {
//			 mintActivate_CampuSIM();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		  System.out.println("CampusSIMActCode 4 " + CopyActCode);
//		 }
//		 @Test (priority = 5)
//		 public void Act5() throws InterruptedException, IOException {
//			 mintActivate_CampuSIM();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		  System.out.println("CampusSIMActCode 5 " + CopyActCode);
//		 }
	 
	 
	 
	

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
