package TestCases;

import Object_Repository.Mint_homepage_Page;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor; 
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

public class Mint_FAQLinks {
//	private static final String URL = null;
	public WebDriver driver;
	public WebDriverWait wait;
	Mint_homepage_Page hpp = new Mint_homepage_Page(driver);


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
	  
  }
  
  @Test(priority=1)
  public void FAQ1() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-transfer-my-number/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=2)
  public void FAQ2() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-access-my-voicemail/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=3)
  public void FAQ3() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-activate-my-sim-card/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=4)
  public void FAQ4() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/cancel-auto-renewal-payments/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=5)
  public void FAQ5() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-set-up-visual-voicemail/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=6)
  public void FAQ6() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/where-can-i-find-out-about-my-account-balance-and-usage/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=7)
  public void FAQ7() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-enable-mobile-hotspot/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=8)
  public void FAQ8() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-bring-device/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=9)
  public void FAQ9() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/who-is-eligible-for-5g/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=10)
  public void FAQ10() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/who-do-i-contact-if-there-is-an-error-on-my-bill/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=11)
  public void FAQ11() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/get-mint-sim-account-number/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=12)
  public void FAQ12() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-get-new-phone-number-mint/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=13)
  public void FAQ13() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-set-my-mmsdata-configuration-settings/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=14)
  public void FAQ14() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-recharge-my-account/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=15)
  public void FAQ15() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-happens-if-i-forget-to-make-a-payment/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=16)
  public void FAQ16() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/get-replacement-sim/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=17)
  public void FAQ17() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/set-mint-sim-account/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=18)
  public void FAQ18() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/fees-taxes-associated-mint-mobile-plan/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=19)
  public void FAQ19() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/ive-finished-data-end-month-can-buy/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=20)
  public void FAQ20() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-reset-my-password/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=21)
  public void FAQ21() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-switch-my-plan/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=22)
  public void FAQ22() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/trouble-calling-internationally/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=23)
  public void FAQ23() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/need-data-month-can-change-data-plan/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=24)
  public void FAQ24() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/cancel-existing-service-transfer-port-number/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=25)
  public void FAQ25() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/ive-ordered-will-sim-delivered/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=26)
  public void FAQ26() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-renew-my-plan/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=27)
  public void FAQ27() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/do-you-have-stores/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=28)
  public void FAQ28() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/purchased-3-month-plan-introductory-price-will-cost-plan-renew/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=29)
  public void FAQ29() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-payment-types-are-accepted-for-phone-purchases/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=30)
  public void FAQ30() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-find-out-more-information-about-my-phone-order/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=31)
  public void FAQ31() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/know-phone-unlocked/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=32)
  public void FAQ32() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-insert-a-sim-card/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=33)
  public void FAQ33() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-will-i-know-if-ive-got-mint-coverage-in-my-area/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=34) 
  public void FAQ34() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-i-use-my-mint-service-in-wearables-or-as-an-esim/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=35)
  public void FAQ35() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/much-data-get-plan/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=36)
  public void FAQ36() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-i-return-the-unused-device-and-request-a-full-refund/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=37)
  public void FAQ37() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-set-up-voice-over-lte-volte/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=38)
  public void FAQ38() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-know-if-i-have-coverage-in-my-area/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=39)
  public void FAQ39() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/will-plan-auto-renew/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=40)
  public void FAQ40() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/prepaid-wireless-service/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=41)
  public void FAQ41() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/when-will-i-receive-my-renewal-credit/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=42)
  public void FAQ42() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-check-what-version-of-ios-i-am-on/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=43)
  public void FAQ43() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/setup-data-iphone/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=44)
  public void FAQ44() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/when-i-buy-a-multi-month-plan-do-i-get-all-my-data-at-once/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=45)
  public void FAQ45() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-is-the-return-policy-for-devices-purchased-from-mintmobile-com/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=46)
  public void FAQ46() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/mint-service-start/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=47)
  public void FAQ47() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/is-my-website-eligible-for-the-affiliate-program/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=48)
  public void FAQ48() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-change-length-plan/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=49)
  public void FAQ49() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/im-a-current-customer-can-i-have-the-3-month-5gb-plan-credited-to-my-account-if-i-purchase-a-phone/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=50)
  public void FAQ50() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-happens-if-im-not-100-stoked-on-mint-can-i-return-it/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=51)
  public void FAQ51() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/in-the-mint-mobile-app-why-does-my-recharge-cost-show-105/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=52)
  public void FAQ52() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/i-referred-my-friends-but-they-didnt-use-my-unique-sharing-link-can-i-still-get-the-renewal-credit-2/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=53)
  public void FAQ53() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-i-keep-my-number/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=54)
  public void FAQ54() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-i-bring-my-current-phone-number-over-to-mint-mobile-on-the-starter-kit/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=55)
  public void FAQ55() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-i-temporarily-pause-my-account/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=56)
  public void FAQ56() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/im-currently-locked-in-a-contract-with-my-current-provider-can-i-buy-it-now-and-activate-it-later/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=57)
  public void FAQ57() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-earn-renewal-credits/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=58)
  public void FAQ58() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-set-up-volte/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=59)
  public void FAQ59() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-is-5g/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=60)
  public void FAQ60() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/sign-auto-renewal/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=61)
  public void FAQ61() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-long-is-this-offer-available/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=62)
  public void FAQ62() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/i-received-a-sim-deactivation-email-what-does-this-mean-for-me-2/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=63)
  public void FAQ63() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-use-my-mint-wallet/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=64)
  public void FAQ64() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/mint-service-start");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=65) 
  public void FAQ65() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/do-you-offer-insurance-on-your-phones/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=66)
  public void FAQ66() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/unlimited/FAQ");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=67)
  public void FAQ67() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/how-do-i-transfer-my-number");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=68)
  public void FAQ68() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/hprcc");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=69)
  public void FAQ69() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/know-data-resets/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=70)
  public void FAQ70() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-is-mint-sim/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=71)
  public void FAQ71() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/account/faq");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=72)
  public void FAQ72() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/enable-wifi-talk-text/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=73)
  public void FAQ73() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/what-is-an-unlocked-phone-2/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=74)
  public void FAQ74() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/watch%20help%20video");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }
  @Test(priority=75)
  public void FAQ75() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/devices-can-support-ios-11-3/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/");
  }
  @Test(priority=76)
  public void FAQ76() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/ufaq/can-current-mint-customers-also-purchase-an-unlocked-iphone-for-0-financing/");
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintFAQ_textbox_AskQuestion()));
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://qa.mintmobile.com/ufaq/" );
  }

  
  
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
