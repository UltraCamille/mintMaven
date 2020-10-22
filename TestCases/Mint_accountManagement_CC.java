package TestCases;

import Object_Repository.Clov3rDugtrio_Page;
import Object_Repository.Mint_activations_Page;
import Object_Repository.Mint_homepage_Page;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import java.awt.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mint_accountManagement_CC {
	public static WebDriver driver;
	public WebDriverWait wait;
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);
	Clov3rDugtrio_Page cd = new Clov3rDugtrio_Page(driver);
	Mint_activations_Page maa = new Mint_activations_Page(driver);


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  
  }


  
  public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/camillemonzon/eclipse-workspace/MintMobile/src/TestCases/MintAMAutomation/"+fileName+".jpg"));
  }
  
  public void cloverLogIn() throws InterruptedException {
  driver.get("https://dugtrio.ultramobile.com/");
  Thread.sleep(3000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_signIn())).click();
  Thread.sleep(2000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_inputEmail())).sendKeys("camille@ultra.me");
  Thread.sleep(1000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_signInNext())).click();
  Thread.sleep(1000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_enterPassword())).sendKeys("Camille1!!"); 
  Thread.sleep(1000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_signInNext())).click();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_continueWithGoogle()));
  Thread.sleep(1000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_continueWithGoogle())).click();
  Thread.sleep(2000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_profile())).click();
  Thread.sleep(10000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input()));
  String URL = driver.getCurrentUrl();
  Assert.assertEquals(URL, "https://dugtrio.ultramobile.com/" );
  Thread.sleep(2000);
}
  
  public void mintSignIn(String MSISDN) throws InterruptedException {
	  driver.get("https://qa.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys(MSISDN);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
	  Thread.sleep(5000);
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
}

  public void mintActivate_3MoSmall()throws InterruptedException {
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
	  Thread.sleep(5000);
	  Actions action = new Actions(driver);
	  WebElement we = driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"));
	  action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'12 Month Medium')]"))).build().perform();
	  Thread.sleep(2000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  action.sendKeys(Keys.ARROW_DOWN);
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.elementToBeClickable(maa.getICCID_3MoSmall_Type())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_InitialProductID())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(maa.getICCID_3MoSmall_ID())).click();
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
public void UpData()  throws InterruptedException, IOException {
	mintActivate_3MoSmall();
	  String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	  Thread.sleep(1000);
	  System.out.println("Updata" + activatedSubMSISDN);
	  driver.get("https://qa.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://web-mint-qa.mintmobile.com/account/summary" );
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_DataCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_4GData()));
	  Thread.sleep(1000);
	  takeScreenshot("preUpData");
	  Thread.sleep(1000);
	  String preUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_4GData())).getText();
	  int preUpDataAmountInt = Integer.parseInt(preUpDataAmount);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_UpData())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Updata1gb())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_paymentMethodCC())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_purchaseNow())).click();
	  Thread.sleep(10000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Home())).click();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_DataCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_4GData()));
	  Thread.sleep(1000);
	  takeScreenshot("postUpData");
	  String postUpDataAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_4GData())).getText();
	  int postUpDataAmountInt = Integer.parseInt(postUpDataAmount);
	  Assert.assertEquals(postUpDataAmountInt, preUpDataAmountInt + 1);
}

@Test (priority = 2)
public void UpRoam()  throws InterruptedException, IOException {
	mintSignIn("6572476263");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_INTLRoamingCreditCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_roamBalance()));
	  Thread.sleep(1000);
	  takeScreenshot("preUpRoam");
	  Thread.sleep(1000);
	  String preUpRoamAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_roamBalance())).getText();
	  int preUpRoamAmountInt = Integer.parseInt(preUpRoamAmount);
	  Thread.sleep(1000);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_UpRoam())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_INTL$5())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_paymentMethodCC())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_purchaseNow())).click();
	  Thread.sleep(10000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Home())).click();
	  Thread.sleep(10000);
	  driver.navigate().refresh();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_INTLRoamingCreditCheck())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_roamBalance()));
	  Thread.sleep(1000);
	  takeScreenshot("postUpRoam");
	  String postUpRoamAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_roamBalance())).getText();
	  int postUpRoamAmountInt = Integer.parseInt(postUpRoamAmount);
	  Assert.assertEquals(postUpRoamAmountInt, preUpRoamAmountInt + 5);
	  
}

@Test (priority = 3)
public void UpWallet()  throws InterruptedException, IOException {
		 mintSignIn("6572476263");
	  Thread.sleep(1000);
	  takeScreenshot("preUpWallet");
	  Thread.sleep(1000);
	  String preUpWalletAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_amount_wallet())).getText();
	  int preUpWalletAmountInt = Integer.parseInt(preUpWalletAmount);
	  Thread.sleep(1000);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_LoadWallet())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_wallet$5())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_purchaseNow())).click();
	  Thread.sleep(10000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Home())).click();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  Thread.sleep(1000);
	  takeScreenshot("postUpRoam");
	  String postUpWalletAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_amount_wallet())).getText();
	  int postUpWalletAmountInt = Integer.parseInt(postUpWalletAmount);
	  Assert.assertEquals(postUpWalletAmountInt, preUpWalletAmountInt + 5);
	  
}

@Test (priority = 4)
public void updateAccountInfo()  throws InterruptedException, IOException {
	mintActivate_3MoSmall();
	 String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
	cloverLogIn();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  takeScreenshot("preAccountChanges");
	  Thread.sleep(2000);
	  driver.get("https://qa.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_checkbox_terms())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
	  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_PersonalInfo())).click();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_textbox_firstName())).sendKeys("Test");
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_textbox_lastName())).sendKeys("Test"); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_textbox_email())).click();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_textbox_email())).sendKeys("Test"); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_textbox_password())).sendKeys("Success123!"); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_textbox_passwordConfirm())).sendKeys("Success123!"); 
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Preferences())).click();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_promo_emails())).click();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_promo_phoneCalls())).click();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_submit())).click();
		  Thread.sleep(5000);
		  driver.get("https://dugtrio.ultramobile.com/");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
		  Thread.sleep(3000);
		  String Name = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_name())).getText();
		  Assert.assertEquals(Name, "MintTest MobileTest");
		  String Email = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_email())).getText();
		  Assert.assertEquals(Email, "noemail@mint.meTest");
		  String Notifs = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_notifs())).getText();
		  Assert.assertEquals(Notifs, "Promo:\n" + 
		  		"SMS");
		  takeScreenshot("postAccountChanges");
}

	  

  
@Test (priority = 5)
public void prePlanChange() throws InterruptedException, IOException {
	cloverLogIn();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("6572476263"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_currentMonth()));
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_nextMonth()));
	  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[26]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  takeScreenshot("prePlanChange");
}

@Test (priority = 6)
public void postPlanChange() throws InterruptedException, IOException {
	mintSignIn("6572476263");
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_ManagePlan())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_plan_12mo8gb())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_SetasNextPlan())).click();
	  Thread.sleep(5000);
		cloverLogIn();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("6572476263"); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_currentMonth()));
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_nextMonth()));
		  Thread.sleep(1000);
		   WebElement element = driver.findElement(By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[26]"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		  takeScreenshot("postPlanChange");
		  Thread.sleep(3000);
		  driver.get("https://qa.mintmobile.com");
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
			  Thread.sleep(3000);
			  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_ManagePlan())).click();
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_plan_3mo3gb())).click();
			  Thread.sleep(2000);
			  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_SetasNextPlan())).click();
			  Thread.sleep(5000);
}

//------------------------ Suspended --------------
@Test (priority = 7)
public void suspendAndRestoreUser() throws InterruptedException, IOException {
mintActivate_3MoSmall();
String activatedSubMSISDN = driver.findElement(By.xpath("(//p/span)[1]")).getText();
Thread.sleep(1000);
System.out.println("SuspendTestMSISDN" + activatedSubMSISDN);
//	driver.get("https://dugtrio.ultramobile.com/");
	cloverLogIn();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(5000);
	  takeScreenshot("preSuspend");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_toolBox())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfo())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_dispatchInfosearch())).sendKeys("api/subscribers/recharge/order/get");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_rechargeOrderGet())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).clear();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).sendKeys("{\n" + 
	  		"  \"createOrder\": true\n" + 
	  		"}");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfoSend())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_toolBox())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfo())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_dispatchInfosearch())).sendKeys("api/subscribers/networksuspend");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_networkSuspendGet())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).clear();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_dispatchInfoDetails())).sendKeys("{\n" + 
	  		"  \"suspendReason\": \"TEST\",\n" + 
	  		"  \"suspendType\": \"SUSPENDED\"\n" + 
	  		"}");
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_dispatchInfoSend())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
	  Thread.sleep(3000);
	  takeScreenshot("postSuspend");
	  Thread.sleep(5000);
	  driver.get("https://qa.mintmobile.com");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintHeader_button_SignIn())).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_MSISDN())).sendKeys(activatedSubMSISDN);
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_textbox_Password())).sendKeys("Test123!"); 
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.signInPage_button_SignIn())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_text_suspendError()));
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_button_Reactivate())).click();
	  Thread.sleep(7000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_button_proceedToRenew())).click();
	  Thread.sleep(5000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_button_paymentMethodCC())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_button_purchaseNow())).click();
	  Thread.sleep(5000);
		cloverLogIn();
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys(activatedSubMSISDN); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
		  Thread.sleep(5000);
		  takeScreenshot("accountRestore");
		  Thread.sleep(1000);
}

	 
	 
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}

