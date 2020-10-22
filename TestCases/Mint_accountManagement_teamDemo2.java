package TestCases;

import Object_Repository.Clov3rDugtrio_Page;
import Object_Repository.Mint_activations_Page;
import Object_Repository.Mint_homepage_Page;

//import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class Mint_accountManagement_teamDemo2 {
	public static WebDriver driver;
	public WebDriverWait wait;
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);
	Clov3rDugtrio_Page cd = new Clov3rDugtrio_Page(driver);
	Mint_activations_Page maa = new Mint_activations_Page(driver);


  @BeforeClass
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  driver.manage().window().maximize();

	  
  }

  public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/camillemonzon/eclipse-workspace/MintMobile/src/TestCases/MintAMAutomation/"+fileName+".jpg"));
  }
  
  public void cloverLogIn() throws InterruptedException {
  driver.get("https://dugtrio.ultramobile.com/");
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_signIn())).click();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_inputEmail())).sendKeys("camille@ultra.me");
  Thread.sleep(5000);
  WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
  Thread.sleep(2000); 
  WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  Actions actions = new Actions(driver);
  actions.moveToElement(element).click().perform();
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_textbox_enterPassword())).sendKeys("Camille1!!"); 
  Thread.sleep(5000);
  WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
  Thread.sleep(2000); 
  WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
  actions.moveToElement(element3).click().perform();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_button_continueWithGoogle()));
  Thread.sleep(5000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_continueWithGoogle())).click();
  Thread.sleep(5000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_profile())).click();
  Thread.sleep(10000);
  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input()));
  String URL = driver.getCurrentUrl();
  Assert.assertEquals(URL, "https://dugtrio.ultramobile.com/" );
  Thread.sleep(2000);
}

  public void mintSignInWPROD(String MSISDN) throws InterruptedException {
	  driver.get("https://www.mintmobile.com/?optimizely_disable=true");
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
//	  String URL = driver.getCurrentUrl();
//	  Assert.assertEquals(URL, "https://my.mintmobile.com/account/summary" );
}
  
  public void mintSignInCCQA(String MSISDN) throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?optimizely_disable=true");
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
public void UpData3gb_Wallet()  throws InterruptedException, IOException {
	  driver.get("https://www.mintmobile.com/");
	  Thread.sleep(1000);
	  mintSignInWPROD("7144748458"); 
	  String AccountManagementText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.accountManagement_text_MyPlan())).getText();
	  Assert.assertEquals(AccountManagementText, "My Plan");
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
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Home())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_UpData())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Updata3gb())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_paymentMethodWallet())).click();
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
	  Assert.assertEquals(postUpDataAmountInt, preUpDataAmountInt + 3);
}
@Test (priority = 2)
public void UpWallet()  throws InterruptedException, IOException {
	  Thread.sleep(5000);
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
	  Thread.sleep(30000);
	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Home())).click();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  Thread.sleep(1000);
	  takeScreenshot("postUpRoam");
	  String postUpWalletAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintAM_amount_wallet())).getText();
	  int postUpWalletAmountInt = Integer.parseInt(postUpWalletAmount);
	  Assert.assertEquals(postUpWalletAmountInt, preUpWalletAmountInt + 5);  
}

@Test (priority = 3)
public void UpRoam5_CC()  throws InterruptedException, IOException {
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
	  Thread.sleep(30000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintAM_button_Home())).click();
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



@Test (priority = 4)
public void updateAccountInfo()  throws InterruptedException, IOException {
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
		  cloverLogIn();
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_textbox_input())).sendKeys("7144748458"); 
		  Thread.sleep(1000);
		  wait.until(ExpectedConditions.elementToBeClickable(cd.dugtrio_button_submit())).click();
		  Thread.sleep(3000);
		  String Name = wait.until(ExpectedConditions.visibilityOfElementLocated(cd.dugtrio_text_name())).getText();
		  Assert.assertEquals(Name, "MintTest MobileTest");
		  takeScreenshot("postAccountChanges");
}
	 
  @AfterClass
  public void tearDown() {
		driver.quit();
  }

}

