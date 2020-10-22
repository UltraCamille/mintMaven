package TestCases;

import Object_Repository.Mint_activations_Page;
import Object_Repository.Mint_homepage_Page;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
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

public class Mint_activations_TestforSubs {
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
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_QAMint())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductType())).click();
		  Thread.sleep(5000);
		  Actions action = new Actions(driver);
		  WebElement we = driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"));
		  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"))).build().perform();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_3MoLarge_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductID())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_3MoLarge_ID())).click();
		   Thread.sleep(5000);
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
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_skipDeviceCheck())).click();
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

	 

	  public void mintActivate_12MoLargeQA()throws InterruptedException {
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
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_QAMint())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductType())).click();
		  Thread.sleep(3000);
		  Actions action = new Actions(driver);
		  WebElement we = driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"));
		  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"))).build().perform();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_12MoLarge_Type())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductID())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_12MoLarge_ID())).click();
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
			  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintActivation_skipDeviceCheck())).click();
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

		  
	 @Test (priority = 1)
	 public void User1() throws InterruptedException, IOException {
	 mintActivate_3MoLargePROD();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.mintmobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
	  System.out.println("Mint 3 Month Large 1. " + activatedSubMSISDN);
	 }
	 @Test (priority = 2)
	 public void User2() throws InterruptedException, IOException {
		 mintActivate_12MoLargeQA();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.mintmobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
	  System.out.println("Mint 12 Month Large 1. " + activatedSubMSISDN);
	 }
	 @Test (priority = 3)
	 public void User3() throws InterruptedException, IOException {
	 mintActivate_3MoLargePROD();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.mintmobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
	  System.out.println("Mint 3 Month Large 3. " + activatedSubMSISDN);
	 }
	 @Test (priority = 4)
	 public void User4() throws InterruptedException, IOException {
		 mintActivate_12MoLargeQA();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.mintmobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
	  System.out.println("Mint 12 Month Large 2. " + activatedSubMSISDN);
	 }
	 @Test (priority = 5)
	 public void User5() throws InterruptedException, IOException {
	 mintActivate_3MoLargePROD();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  driver.get("https://www.mintmobile.com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.mintHeader_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(maa.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
	  System.out.println("Mint 3 Month Large 5. " + activatedSubMSISDN);
	 }
//	 @Test (priority = 1)
//	 public void User1() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub1 = " + CopyActCode); 
//	 }
//	 @Test (priority = 2)
//	 public void User2() throws InterruptedException, IOException {
//		 mintActivate_12MoLargeQA();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		 System.out.println("Sub2 = " + CopyActCode); 
//		 }
//	 @Test (priority = 3)
//	 public void User3() throws InterruptedException, IOException {
//		 mintActivate_12MoLargeQA();
//		 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//		 System.out.println("Sub3 = " + CopyActCode); 
//		 }
//	 @Test (priority = 4)
//	 public void User4() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub4 = " + CopyActCode); 
//	 }
//	 @Test (priority = 5)
//	 public void User5() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub5 = " + CopyActCode); 
//	 }
//	 @Test (priority = 6)
//	 public void User6() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub6 = " + CopyActCode); 
//	 }
//	 @Test (priority = 7)
//	 public void User7() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub7 = " + CopyActCode); 
//	 }
//	 @Test (priority = 8)
//	 public void User8() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub8 = " + CopyActCode); 
//	 }
//	 
//	 @Test (priority = 9)
//	 public void User9() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub9 = " + CopyActCode); 
//	 }
//	 @Test (priority = 10)
//	 public void User10() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub10 = " + CopyActCode); 
//	 }
//	 @Test (priority = 11)
//	 public void User11() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub11 = " + CopyActCode); 
//	 }
//	 @Test (priority = 12)
//	 public void User12() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub12 = " + CopyActCode); 
//	 }
//	 @Test (priority = 13)
//	 public void User13() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub13 = " + CopyActCode); 
//	 }
//	 @Test (priority = 14)
//	 public void User14() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub14 = " + CopyActCode); 
//	 }
//	 @Test (priority = 15)
//	 public void User15() throws InterruptedException, IOException {
//	 mintActivate_12MoLargeQA();
//	 String CopyActCode =  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_textbox_GetACTCODE())).getText();
//	 System.out.println("Sub15 = " + CopyActCode); 
//	 }
//	

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
