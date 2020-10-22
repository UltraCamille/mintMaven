package TestCases;

import Object_Repository.Mint_Purchases_Page;
//import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
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

import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.*;
//import com.google.common.base.Function;
//import com.google.common.base.Predicate;
//import Selenium.utils.*;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
////import java.util.Iterator;
//import java.util.List; 
//---


public class Mint_Purchases_Test {
	public static WebDriver driver;
	public WebDriverWait wait;
	Mint_Purchases_Page mpp = new Mint_Purchases_Page(driver);
	
	


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  driver.manage().window().maximize();
	  
  }         

	 public void mintPhonePurchase(By Phone, String PhoneName, String PhoneNameCaps, String Price)throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/?sc=v3");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mintHeader_dropdown_Phones())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mintHeader_button_NewOne())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_button_seeAllPhones())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Phone)).click();
		 Thread.sleep(1000);
		 String Text = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_text_phoneDisplay())).getText();
		 Assert.assertEquals(Text, PhoneName + " - $" + Price);
		 Thread.sleep(1000);
		 String Text1 = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_breadCrumb_phoneDisplay())).getText();
		 Assert.assertEquals(Text1, "SHOP :: Phones :: " + PhoneNameCaps);
		 Thread.sleep(1000);
		 String Text2 = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_text_productPrice())).getText();
		 Assert.assertEquals(Text2, Price);
		 Thread.sleep(1000);
//		 System.out.println("test1");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_button_quantityUp())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_button_quantityUp())).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_addToCart())).click();
			 Thread.sleep(1000);
			 String Text3 = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_text_cartProduct())).getText();
			 Assert.assertEquals(Text3, PhoneName + " was added to cart.");
			 Thread.sleep(1000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_text_cartAmount()));
			  Assert.assertEquals(Text3, PhoneName + " was added to cart.");
				 Thread.sleep(1000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_button_checkout())).click();
	 }
	 public void mintPhoneCheckoutCC()throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_firstname())).sendKeys("Ryan");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_lastname())).sendKeys("Reynolds");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_address())).sendKeys("1550 Scenic Ave");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_address2())).sendKeys("100");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_city())).sendKeys("Costa Mesa");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_state())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_state_CA())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_zipcode())).sendKeys("92626");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_phone())).sendKeys("5622414472");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_email())).sendKeys("qatester1@ultra.me");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_pw1())).sendKeys("Test123!");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_pw2())).sendKeys("Test123!");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_continue())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_checkout_emailLogin())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_login_email())).sendKeys("qatester1@ultra.me");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_login_pw())).sendKeys("Test123!");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_login_button())).click();
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_cartIcon())).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_proceedToCheckout())).click();
		 Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency()));
		  String freeShipping = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency())).getText();
		  System.out.println("test1");
		  Assert.assertEquals(freeShipping,"$0.00");
		  Thread.sleep(1000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_priorityShipping())).click();
			 Thread.sleep(3000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency()));
			  String priorityShipping = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency())).getText();
			  System.out.println("test2");
			  Assert.assertEquals(priorityShipping,"$9.99");
			  Thread.sleep(1000);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_overnightShipping())).click();
				 Thread.sleep(3000);
				  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency()));
				  String overnightShipping = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency())).getText();
				  Assert.assertEquals(overnightShipping,"$19.99");
					 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_freeShipping())).click();
					 Thread.sleep(3000);
				  Assert.assertEquals(freeShipping,"$0.00");				  
		wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_continue())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_text_ccPage()));
		  String ccText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_text_ccPage())).getText();
		  Assert.assertEquals(ccText,"Secure credit or debit card payment");	
	 }
	 
	 public void mintPhoneCheckoutPP()throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_firstname())).sendKeys("Ryan");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_lastname())).sendKeys("Reynolds");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_address())).sendKeys("1550 Scenic Ave");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_address2())).sendKeys("100");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_city())).sendKeys("Costa Mesa");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_state())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_state_CA())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_zipcode())).sendKeys("92626");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_phone())).sendKeys("5622414472");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_email())).sendKeys("qatester1@ultra.me");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_pw1())).sendKeys("Test123!");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_pw2())).sendKeys("Test123!");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_continue())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_checkout_emailLogin())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_login_email())).sendKeys("qatester1@ultra.me");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_login_pw())).sendKeys("Test123!");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_login_button())).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_cartIcon())).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_proceedToCheckout())).click();
		 Thread.sleep(1000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency()));
		  String freeShipping = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency())).getText();
		  Assert.assertEquals(freeShipping,"$0.00");
		  Thread.sleep(1000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_priorityShipping())).click();
			 Thread.sleep(3000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency()));
			  String priorityShipping = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency())).getText();
			  Assert.assertEquals(priorityShipping,"$9.99");
			  Thread.sleep(1000);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_overnightShipping())).click();
				 Thread.sleep(3000);
				  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency()));
				  String overnightShipping = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_shippingCurrency())).getText();
				  Assert.assertEquals(overnightShipping,"$19.99");
					 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_freeShipping())).click();
					 Thread.sleep(3000);
				  Assert.assertEquals(freeShipping,"$0.00");				  
		wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_payment_pp())).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_continue())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_paypal_text()));
		  String ppText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phone_paypal_text())).getText();
		  Assert.assertEquals(ppText,"Pay with PayPal");
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_phones_checkout_continue())).click();


	 }
	 
	 public void mintPlanPurchaseCC(By Plan, By PlanName)throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/?sc=v3");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mintHeader_button_Plans())).click();
		 Thread.sleep(2000);
		   WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Buy Now | Total $45')]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
			  Thread.sleep(1000);
		   WebElement element = driver.findElement(By.xpath("//p[@class='seeMoreTextPlans']"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element).click().perform();
		 Thread.sleep(1000);
		   WebElement element1 = driver.findElement(By.xpath("(//h2[@class='heroHeader--coverage'])[1]"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
			  Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Plan)).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(PlanName));
		 Thread.sleep(1000);
		   WebElement upQTY = driver.findElement(By.xpath("//span[@class='plus-button']"));
		   actions.moveToElement(upQTY).click().perform();
			 Thread.sleep(1000);
		   actions.moveToElement(upQTY).click().perform();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_promoCode())).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_textField_promoCode())).sendKeys("CAMILLETEST");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_button_applyPromoCode())).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_promoAmount()));
		  String promoAmt = wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_promoAmount())).getText();
		  Assert.assertEquals(promoAmt,"$10.00");
//		  System.out.println("test1");
		   WebElement element0 = driver.findElement(By.xpath("//input[@id='apply_coupon']"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element0);
			  Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_button_checkout())).click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_firstName())).sendKeys("Ryan");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_lastName())).sendKeys("Reynolds");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_email())).sendKeys("qatester1@ultra.me");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_address1())).sendKeys("1550 Scenic Ave");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_zipcode())).sendKeys("92626");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_city())).sendKeys("Costa Mesa");
		 Thread.sleep(1000);
		 System.out.println("test0");
		   WebElement state = driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]"));
		   actions.moveToElement(state).click().perform();
		   Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_textfield_state())).sendKeys("California" + Keys.RETURN);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_shipping_state_CA())).click();
		 System.out.println("test1");
		  Thread.sleep(1000);
		   WebElement zip = driver.findElement(By.xpath("//input[@placeholder='shipping_postcode']"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", zip);
//		   actions.moveToElement(submit).click().perform();
		   System.out.println("test2");
		   Thread.sleep(5000);
//		   WebElement submit = driver.findElement(By.xpath("(//button[contains(text(),'Save & Continue')])[1]"));
			 wait.until(ExpectedConditions.presenceOfElementLocated(mpp.mint_plan_shipping_SaveContinue())).click();
		   System.out.println("test3");
//		   actions.moveToElement(submit).click().perform();
//		 wait.until(ExpectedConditions.presenceOfElementLocated(mpp.mint_plan_shipping_SaveContinue())).click();
//		 System.out.println("test4");
//		 wait.until(ExpectedConditions.presenceOfElementLocated(mpp.mint_plan_shipping_SaveContinue())).click();
		 System.out.println("test5");
		  Thread.sleep(2000);
//		  actions.moveToElement(submit).click().perform();
//		  WebElement plans = driver.findElement(By.xpath("//p[@class='l-checkout__title']"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", plans);
//		   Thread.sleep(2000);
		   
		  ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//		   WebElement save = driver.findElement(By.xpath("(//button[contains(text(),'Save & Continue')])[2]"));
//		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save);
//		   actions.moveToElement(save).click().perform();
		   System.out.println("test6");
		 wait.until(ExpectedConditions.presenceOfElementLocated(mpp.mint_plan_shipping_SaveContinue2())).click();
		 Thread.sleep(2000);
		 System.out.println("test7");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_textField_CC())).sendKeys("4111 1111 1111 1111");
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_CC_expiry_month())).sendKeys("01");
		 System.out.println("test8");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_CC_expiry_year())).sendKeys("25");
		 System.out.println("test9");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_CC_cvv())).sendKeys("123");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(mpp.mint_plan_payment_placeOrder())).click();
		 
	 }
		 
//	 @Test (priority = 1)	 
//	 public void TestCase1() throws InterruptedException, IOException {
//		 mintPhonePurchase(mpp.mint_phones_samsungGalaxyS20Ultra5G(), "Samsung Galaxy S20 Ultra 5G","SAMSUNG GALAXY S20 ULTRA 5G", "1349.00");
//		 mintPhoneCheckoutCC();
//	 }
		 
		 
	 @Test (priority = 2)	 
	 public void TestCase2() throws InterruptedException, IOException {
		 mintPlanPurchaseCC(mpp.mint_plan_BN_3mo3gb(), mpp.mint_plan_SK_3mo3gb());
		
	 }
	 
		 
		 
		 
		 
		 
		 
	

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}

