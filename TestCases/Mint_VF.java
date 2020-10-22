package TestCases;

import Object_Repository.Mint_VF_Page;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
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
// import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;




public class Mint_VF {
	public static WebDriver driver;
	public WebDriverWait wait;
	Mint_VF_Page hpp = new Mint_VF_Page(driver);


 @BeforeMethod
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	 driver = new ChromeDriver();
	 wait = new WebDriverWait(driver,10);
	 
 }
 

	 public void mintVF_IMEIandAddress_4G(String zipcode , String address, String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
//		 String CoverageResults2 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage2())).getText();
//		 Assert.assertEquals(CoverageResults2, Coverage2);
//		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ViewPlans())).click();
//		 Thread.sleep(2000);
//		 String URL = driver.getCurrentUrl();
//		 Assert.assertEquals(URL, "https://qa.mintmobile.com//plans/" );
//		 Thread.sleep(2000);
	 }
	 public void mintVF_IMEIandAddress_3G(String zipcode , String address, String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	 }
	 public void mintVF_ZipcodeOnly_4G(String zipcode , String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void mintVF_ZipcodeOnly_3G(String zipcode , String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void mintVF_AddressOnly_4G(String zipcode , String address, String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void mintVF_AddressOnly_3G(String zipcode , String address, String Coverage1 )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_StreetAddress())).sendKeys(address);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_IMEIskip())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
	 }
	 public void mintVF_IMEIandZipcode_4G(String zipcode , String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage1())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	 }
	 public void mintVF_IMEIandZipcode_3G(String zipcode , String IMEI, String Coverage1, String Device )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_IMEI())).sendKeys(IMEI);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	 }
	 public void mintVFincompatibleZipCode (String zipcode) throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_ErrorMessage()));
		 
	 }
	 
	 
	 public void mintVFBrandModelAddressPart1(String zipcode , String address )throws InterruptedException {
	 driver.get("https://qa.mintmobile.com/");
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
	 Thread.sleep(1000);
	 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
	 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_textbox_StreetAddress())).sendKeys(address);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
	 Thread.sleep(5000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand())).click();
	  Thread.sleep(5000);
	 }
	  
	  
	 public void mintVFBrandModelAddressZipcodePart2_4G(String Coverage1 , String Device )throws InterruptedException {
	 Thread.sleep(1000);
	 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ContinueIMEI())).click();
	 Thread.sleep(5000);
	 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage1())).getText();
	 Assert.assertEquals(CoverageResults1, Coverage1);
	 Thread.sleep(2000);
	 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Device())).getText();
	 Assert.assertEquals(DeviceResults, Device);
	 Thread.sleep(2000);
}
	 public void mintVFBrandModelAddressZipcodePart2_3G(String Coverage1 , String Device )throws InterruptedException {
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_ContinueIMEI())).click();
		 Thread.sleep(5000);
		 String CoverageResults1 = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Coverage3G())).getText();
		 Assert.assertEquals(CoverageResults1, Coverage1);
		 Thread.sleep(2000);
		 String DeviceResults = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_results_Device())).getText();
		 Assert.assertEquals(DeviceResults, Device);
		 Thread.sleep(2000);
	}
	 public void mintVFBrandModelZipcodePart1(String zipcode )throws InterruptedException {
		 driver.get("https://qa.mintmobile.com/");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_test_zipCode())).sendKeys(zipcode);
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_LetsGo())).click();
		 Thread.sleep(1000);
		 String CheckCoverageText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_CheckCoverage())).getText();
		 Assert.assertEquals(CheckCoverageText, "CHECK YOUR COVERAGE");
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_button_Continue())).click();
		 Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand())).click();
		  Thread.sleep(5000);
		 }


	public static void takeScreenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/camillemonzon/eclipse-workspace/MintMobile/src/TestCases/MintVFScreenshots06082020/"+fileName+".jpg"));
	}
		  
		  
	 
	 
//	 @Test (priority = 1)
//	 public void IMEIandAddress2() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("94112", "445 Persia Ave & Mission St.", "353001091708306","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress2");
//	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	 Assert.assertEquals(HeaderText, "FOXTASTIC");
//	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	 Assert.assertEquals(ResultsText, "Nice. The coverage at 445 Persia Ave & Mission St. is better than nacho fries with extra cheese and your Apple iPhone 8 is 100% compatible with our network.");
//	 }
//	 @Test (priority = 2)
//	 public void IMEIandAddress3() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("50423", "3175 Iowa Avenue", "353001091708306","4G LTE Coverage: GOOD", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress3");
//	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	 Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	 Assert.assertEquals(ResultsText, "Your coverage at 3175 Iowa Avenue is super and your Apple iPhone 8 is a match made in wireless heaven. Let’s get you a plan.");
//	 }
//	 @Test (priority = 3)
//	 public void IMEIandAddress4() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("50636", "2656 290th Street", "353001091708306","4G LTE Coverage: FAIR", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress4");
//	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	 Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	 Assert.assertEquals(ResultsText, "The coverage at 2656 290th Street is pretty decent, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	 }
	 @Test (priority = 4)
	 public void IMEIandAddress5() throws InterruptedException, IOException {
	 mintVF_IMEIandAddress_4G("52333", "2418 Quincy Rd", "353001091708306","4G LTE Coverage: POOR", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress5");
	 String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
	 Assert.assertEquals(HeaderText, "AWW, FOX");
	 String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	 Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
	 }
	 @Test (priority = 5)
	 public void IMEIandAddress6() throws InterruptedException, IOException {
	 mintVF_IMEIandAddress_4G("95843", "5610 Great Valley Drive", "357498082396511","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress6");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "FOXTASTIC");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "Nice. The coverage at 5610 Great Valley Drive is better than nacho fries with extra cheese and your Samsung Galaxy S8 Plus is 100% compatible with our network.");
	 }
//	 @Test (priority = 6)
//	 public void IMEIandAddress7() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("20176", "44008 Indian Fields Court", "357498082396511","4G LTE Coverage: GOOD", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress7");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Your coverage at 44008 Indian Fields Court is super and your Samsung Galaxy S8 Plus is a match made in wireless heaven. Let’s get you a plan.");
//	 }
//	 @Test (priority = 7)
//	 public void IMEIandAddress8() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("95620", "6300 Weber Rd", "357498082396511","4G LTE Coverage: FAIR", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress8");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 6300 Weber Rd is pretty decent, and your Samsung Galaxy S8 Plus is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	 }
	 @Test (priority = 8)
	 public void IMEIandAddress9() throws InterruptedException, IOException {
		 mintVF_IMEIandAddress_4G("52333", "2418 Quincy Rd", "357498082396511","4G LTE Coverage: POOR", "COMPATIBLE");
		 takeScreenshot("IMEIandAddress9");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "AWW, FOX");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Although your Samsung Galaxy S8 Plus is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
	 }
//	 @Test (priority = 9)
//	 public void IMEIandAddress10() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("03842", "8 Highland Avenue", "359677098824941","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress10");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "FOXTASTIC");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Nice. The coverage at 8 Highland Avenue is better than nacho fries with extra cheese and your Google Pixel 3a is 100% compatible with our network.");
//	 }
	 @Test (priority = 10)
	 public void IMEIandAddress11() throws InterruptedException, IOException {
	 mintVF_IMEIandAddress_4G("04732", "32 Blackwater Rd", "359677098824941","4G LTE Coverage: EXCELLENT", "COMPATIBLE");
	 takeScreenshot("IMEIandAddress11");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "FOXTASTIC");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "Nice. The coverage at 32 Blackwater Rd is better than nacho fries with extra cheese and your Google Pixel 3a is 100% compatible with our network.");
	 }
//	 @Test (priority = 11)
//	 public void IMEIandAddress12() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("04732", "58 Heidi Circle", "359677098824941","4G LTE Coverage: FAIR", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress12");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 58 Heidi Circle is pretty decent, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }

//	 @Test (priority = 13)
//	 public void IMEIandAddress14() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("86401", "310 North 4th Street", "3515330612345678","4G LTE Coverage: EXCELLENT", "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandAddress14");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 310 North 4th Street is excellent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 14)
//	 public void IMEIandAddress15() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("95536", "6 Centerville Rd", "3515330612345678","4G LTE Coverage: GOOD", "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandAddress15");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 6 Centerville Rd is very good. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = -1)
//	 public void IMEIandAddress16() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("67643", "2497 J Lane", "3515330612345678","4G LTE Coverage: FAIR", "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandAddress16");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 2497 J Lane is pretty decent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }

//	 @Test (priority = 17)
//	 public void IMEIandAddress18() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("58564", "8564 49th Avenue Southwest", "3515330612345678","4G LTE Coverage: EXCELLENT", "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandAddress18");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 8564 49th Avenue Southwest is excellent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 
//	 }
//	 @Test (priority = 18)
//	 public void IMEIandAddress19() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("20176", "44008 Indian Fields Court", "3515330612345678","4G LTE Coverage: GOOD", "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandAddress19");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 44008 Indian Fields Court is very good. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 19)
//	 public void IMEIandAddress20() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("59336", "300 Road 357", "3515330612345678","4G LTE Coverage: POOR", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress20");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "NOT MINT TO BE");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Looks like your Samsung Galaxy S4 Mini isn’t compatible with our service, the coverage at 300 Road 357 isn’t as mind-blowingly awesome as we’d like to see. Unfortunately, we are not a match in Mint heaven.");
//
//	 }
//	 @Test (priority = 20)
//	 public void IMEIandAddress21() throws InterruptedException, IOException {
//	 mintVF_IMEIandAddress_4G("52333", "2418 Quincy Rd", "3515330612345678","4G LTE Coverage: POOR", "COMPATIBLE");
//	 takeScreenshot("IMEIandAddress21");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 2418 Quincy Rd is pretty decent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 20)
//	 public void AddressOnly36() throws InterruptedException, IOException {
//	mintVF_AddressOnly_4G("94112", "Persia Ave & Mission St.", "4G LTE Coverage: EXCELLENT");
//	 takeScreenshot("AddressOnly36");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "FOXTASTIC.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, Persia Ave & Mission St. is excellent. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 21)
//	 public void AddressOnly37() throws InterruptedException, IOException {
//	mintVF_AddressOnly_4G("50423", "3175 Iowa Avenue", "4G LTE Coverage: GOOD");
//	 takeScreenshot("AddressOnly37");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 3175 Iowa Avenue is good. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 22)
//	 public void AddressOnly38() throws InterruptedException, IOException {
//	mintVF_AddressOnly_4G("50636", "2656 290th Street", "4G LTE Coverage: FAIR");
//	 takeScreenshot("AddressOnly38");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 2656 290th Street is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
	 @Test (priority = 23)
	 public void AddressOnly39() throws InterruptedException, IOException {
	mintVF_AddressOnly_4G("52333", "2418 Quincy Rd", "4G LTE Coverage: POOR");
	 takeScreenshot("AddressOnly39");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
	Assert.assertEquals(HeaderText, "AWW, FOX");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you...this is us crying now.");
	
	 }
	 @Test (priority = 24)
	 public void AddressOnly40() throws InterruptedException, IOException {
	mintVF_AddressOnly_4G("50658", "1112 300th Street", "4G LTE Coverage: EXCELLENT");
	 takeScreenshot("AddressOnly40");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
	Assert.assertEquals(HeaderText, "FOXTASTIC.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 1112 300th Street is excellent. Let’s find you a plan.");
	
	 }
//	 @Test (priority = 25)
//	 	 public void AddressOnly43() throws InterruptedException, IOException {
//	 	mintVF_AddressOnly_4G("79040", "8580 County Road M.", "4G LTE Coverage: POOR");
//	 	 takeScreenshot("AddressOnly43");
//	 	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	 	Assert.assertEquals(HeaderText, "AWW, FOX");
//	 	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	 	Assert.assertEquals(ResultsText, "The coverage at the given location, 8580 County Road M. is poorer than we’d like to see. It doesn’t look like Mint is right for you...this is us crying now.");
//	 	
//	 	 }
//	 @Test (priority = 26)
//	 public void IMEIandZipcode44() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("94112", "353001091708306", "4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode44");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "FOXTASTIC");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Nice. The coverage at 94112 is better than nacho fries with extra cheese and your Apple iPhone 8 is 100% compatible with our network.");
//	
//	 }
//	 @Test (priority = 27)
//	 public void IMEIandZipcode45() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("79059", "353001091708306", "4G LTE Coverage: GOOD" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode45");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Your coverage at 79059 is super and your Apple iPhone 8 is a match made in wireless heaven. Let’s get you a plan.");
//	
//	 }
//	 @Test (priority = 28)
//	 public void IMEIandZipcode46() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("86036", "353001091708306", "4G LTE Coverage: FAIR" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode46");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
//	 @Test (priority = 29)
//	 public void IMEIandZipcode48() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("95843", "357498082396511", "4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode48");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "FOXTASTIC");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Nice. The coverage at 95843 is better than nacho fries with extra cheese and your Samsung Galaxy S8 Plus is 100% compatible with our network.");
//	
//	 }
//	 @Test (priority = 30)
//	 public void IMEIandZipcode49() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("95227", "357498082396511", "4G LTE Coverage: GOOD" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode49");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Your coverage at 95227 is super and your Samsung Galaxy S8 Plus is a match made in wireless heaven. Let’s get you a plan.");
//	
//	 }
//	 @Test (priority = 31)
//	 public void IMEIandZipcode50() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("86036", "357498082396511", "4G LTE Coverage: FAIR" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode50");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Samsung Galaxy S8 Plus is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
	 @Test (priority = 32)
	 public void IMEIandZipcode52() throws InterruptedException, IOException {
	mintVF_IMEIandZipcode_4G("03842", "359677098824941", "4G LTE Coverage: GOOD" , "COMPATIBLE");
	 takeScreenshot("IMEIandZipcode52");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "Your coverage at 03842 is super and your Google Pixel 3a is a match made in wireless heaven. Let’s get you a plan.");
	
	 }
//	 @Test (priority = 33)
//	 public void IMEIandZipcode53() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("96044", "359677098824941", "4G LTE Coverage: GOOD" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode53");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Your coverage at 96044 is super and your Google Pixel 3a is a match made in wireless heaven. Let’s get you a plan.");
//	
//	 }
//	 @Test (priority = 34)
//	 public void IMEIandZipcode54() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("86036", "359677098824941", "4G LTE Coverage: FAIR" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode54");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
//	 @Test (priority = 35)
//	 public void IMEIandZipcode56() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("86401", "3515330612345678", "4G LTE Coverage: EXCELLENT" , "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode56");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 86401 is excellent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 36)
//	 public void IMEIandZipcode57() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("96044", "3515330612345678", "4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode57");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 96044 is very good. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 37)
//	 public void IMEIandZipcode58() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("86036", "3515330612345678", "4G LTE Coverage: FAIR" , "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode58");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 38)
//	 public void IMEIandZipcode60() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("03842", "3515330612345678", "4G LTE Coverage: GOOD" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode60");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 03842 is very good. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 39)
//	 public void IMEIandZipcode61() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("79059", "3515330612345678", "4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode61");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 79059 is very good. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 40)
//	 public void IMEIandZipcode62() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("86036", "3515330612345678", "4G LTE Coverage: FAIR" , "NOT COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode62");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//	Assert.assertEquals(HeaderText, "HMMM..");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 40)
//	 public void IMEIandZipcode64() throws InterruptedException, IOException {
//	mintVF_IMEIandZipcode_4G("52772", "3515330612345680", "4G LTE Coverage: POOR" , "COMPATIBLE");
//	 takeScreenshot("IMEIandZipcode64");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "NOT MINT TO BE");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "Looks like your Samsung Galaxy S4 Mini isn’t compatible with our service, the coverage at 52772 isn’t as mind-blowingly awesome as we’d like to see. Unfortunately, we are not a match in Mint heaven.");
//
//
//	 }
//	 @Test (priority = 40)
//	 public void ZipcodeOnly77() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("94112", "4G LTE Coverage: EXCELLENT" );
//	 takeScreenshot("ZipcodeOnly77");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "FOXTASTIC.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 94112 is excellent. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 41)
//	 public void ZipcodeOnly78() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("79059", "4G LTE Coverage: GOOD" );
//	 takeScreenshot("ZipcodeOnly78");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is good. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 42)
//	 public void ZipcodeOnly79() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
//	 takeScreenshot("ZipcodeOnly79");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
//	 @Test (priority = 43)
//	 public void ZipcodeOnly81() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("95227", "4G LTE Coverage: GOOD" );
//	 takeScreenshot("ZipcodeOnly81");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 95227 is good. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 44)
//	 public void ZipcodeOnly82() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
//	 takeScreenshot("ZipcodeOnly82");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }

//	 @Test (priority = 46)
//	 public void ZipcodeOnly84() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("96044", "4G LTE Coverage: GOOD" );
//	 takeScreenshot("ZipcodeOnly84");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is good. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 47)
//	 public void ZipcodeOnly85() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
//	 takeScreenshot("ZipcodeOnly85");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
//	 @Test (priority = 48)
//	 public void ZipcodeOnly86() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("86401", "4G LTE Coverage: EXCELLENT" );
//	 takeScreenshot("ZipcodeOnly86");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "FOXTASTIC.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 86401 is excellent. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 49)
//	 public void ZipcodeOnly87() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("96044", "4G LTE Coverage: GOOD" );
//	 takeScreenshot("ZipcodeOnly87");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 96044 is good. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 50)
//	 public void ZipcodeOnly88() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
//	 takeScreenshot("ZipcodeOnly88");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
	 @Test (priority = 51)
	 public void ZipcodeOnly89() throws InterruptedException, IOException {
	mintVF_ZipcodeOnly_4G("03842", "4G LTE Coverage: GOOD" );
	 takeScreenshot("ZipcodeOnly89");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 03842 is good. Let’s find you a plan.");
	
	 }
//	 @Test (priority = 52)
//	 public void ZipcodeOnly90() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("79059", "4G LTE Coverage: GOOD" );
//	 takeScreenshot("ZipcodeOnly90");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 79059 is good. Let’s find you a plan.");
//	
//	 }
//	 @Test (priority = 53)
//	 public void ZipcodeOnly91() throws InterruptedException, IOException {
//	mintVF_ZipcodeOnly_4G("86036", "4G LTE Coverage: FAIR" );
//	 takeScreenshot("ZipcodeOnly91");
//	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
//	Assert.assertEquals(HeaderText, "PRETTY SWEET");
//	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//	Assert.assertEquals(ResultsText, "The coverage at the given location, 86036 is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//	
//	 }
	 @Test (priority = 54)
	 public void ZipcodeOnly92() throws InterruptedException, IOException {
	mintVF_ZipcodeOnly_4G("61272", "4G LTE Coverage: POOR" );
	 takeScreenshot("ZipcodeOnly92");
	String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header3())).getText();
	Assert.assertEquals(HeaderText, "AWW, FOX");
	String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
	Assert.assertEquals(ResultsText, "The coverage at the given location, 61272 is poorer than we’d like to see. It doesn’t look like Mint is right for you...this is us crying now.");
	
	 }
//	 @Test (priority = 55)
//	 public void InvalidZipcode93() throws InterruptedException, IOException {
//	mintVFincompatibleZipCode("79376");
//	 takeScreenshot("InvalidZipcode93");
//	 }
//	 @Test (priority = 56)
//	 public void InvalidZipCode94() throws InterruptedException, IOException {
//	mintVFincompatibleZipCode("66518");
//	 takeScreenshot("InvalidZipCode94");
//	 }
//	 @Test (priority = 56)
//	 public void InvalidZipCode000() throws InterruptedException, IOException {
//	mintVFincompatibleZipCode("00000");
//	 takeScreenshot("InvalidZipCode000");
//	 }
	 @Test (priority = 57)
	 public void mintVFBrandModelAddress109() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("94112" , "445 Persia Ave & Mission St.");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress109");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "FOXTASTIC");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Nice. The coverage at 445 Persia Ave & Mission St. is better than nacho fries with extra cheese and your Apple iPhone 8 is 100% compatible with our network.");
		
	 }
	 @Test (priority = 58)
	 public void mintVFBrandModelAddress110() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("50423" , "3175 Iowa Avenue");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress110");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Your coverage at 3175 Iowa Avenue is super and your Apple iPhone 8 is a match made in wireless heaven. Let’s get you a plan.");
		
	 }
	 @Test (priority = 59)
	 public void mintVFBrandModelAddress111() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("50636" , "2656 290th Street");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress111");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "PRETTY SWEET");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at 2656 290th Street is pretty decent, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		
	 }
	 @Test (priority = 60)
	 public void mintVFBrandModelAddress112() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress112");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "AWW, FOX");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
		
	 }
	 @Test (priority = 61)
	 public void mintVFBrandModelAddress113() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("95843" , "5610 Great Valley Drive");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress113");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "FOXTASTIC");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Nice. The coverage at 5610 Great Valley Drive is better than nacho fries with extra cheese and your Samsung Galaxy S8 is 100% compatible with our network.");
		
	 }
//	 @Test (priority = 62)
//	 public void mintVFBrandModelAddress114() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("20176" , "44008 Indian Fields Court");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress114");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Your coverage at 44008 Indian Fields Court is super and your Samsung Galaxy S8 is a match made in wireless heaven. Let’s get you a plan.");
//		
//	 }
	 @Test (priority = 63)
	 public void mintVFBrandModelAddress115() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("95620" , "6300 Weber Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress115");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Your coverage at 6300 Weber Rd is super and your Samsung Galaxy S8 is a match made in wireless heaven. Let’s get you a plan.");
		
	 }
	 @Test (priority = 64)
	 public void mintVFBrandModelAddress116() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress116");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "AWW, FOX");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Although your Samsung Galaxy S8 is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
		
	 }
//	 @Test (priority = 65)
//	 public void mintVFBrandModelAddress117() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("03842" , "8 Highland Avenue");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress117");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "FOXTASTIC");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Nice. The coverage at 8 Highland Avenue is better than nacho fries with extra cheese and your Google Pixel 3a is 100% compatible with our network.");
//		
//	 }
	 @Test (priority = 66)
	 public void mintVFBrandModelAddress118() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("04732" , "32 Blackwater Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress118");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "FOXTASTIC");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Nice. The coverage at 32 Blackwater Rd is better than nacho fries with extra cheese and your Google Pixel 3a is 100% compatible with our network.");
		
	 }
//	 @Test (priority = 67)
//	 public void mintVFBrandModelAddress119() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("04732" , "58 Heidi Circle");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress119");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "PRETTY SWEET");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 58 Heidi Circle is pretty decent, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//		
//	 }
	 @Test (priority = 68)
	 public void mintVFBrandModelAddress120() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("52333" , "2418 Quincy Rd NE");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress120");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "AWW, FOX");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Although your Google Pixel 3a is perfectly compatible with our service, the coverage at 2418 Quincy Rd NE is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
		
	 }
//	 @Test (priority = 69)
//	 public void mintVFBrandModelAddress121() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("86401" , "310 North 4th Street");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress121");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "FOXTASTIC");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Nice. The coverage at 310 North 4th Street is better than nacho fries with extra cheese and your Google Pixel 3a is 100% compatible with our network.");
//		
//	 }
//	 @Test (priority = 70)
//	 public void mintVFBrandModelAddress122() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("95536" , "6 Centerville Rd");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress122");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Your coverage at 6 Centerville Rd is super and your Google Pixel 3a is a match made in wireless heaven. Let’s get you a plan.");
//		
//	 }
//	 @Test (priority = 71)
//	 public void mintVFBrandModelAddress123() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("67643" , "2497 J Lane");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress123");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "PRETTY SWEET");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 2497 J Lane is pretty decent, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//		
//	 }
	 @Test (priority = 72)
	 public void mintVFBrandModelAddress124() throws InterruptedException, IOException {
		 mintVFBrandModelAddressPart1("52333" , "2418 Quincy Rd");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: POOR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelAddress124");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "AWW, FOX");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Although your Google Pixel 3a is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
		
	 }
//	 @Test (priority = 88)
//	 public void mintVFBrandModelAddress125() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("58564" , "8564 49th Avenue Southwest");
//		 Actions action2 = new Actions(driver);	
//		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
//		 Thread.sleep(2000);
//		 Actions action = new Actions(driver);	 
//	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
// wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
// Thread.sleep(2000);
// WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//Actions action1 = new Actions(driver);
//action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
//Thread.sleep(2000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "NOT COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress125");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//		Assert.assertEquals(HeaderText, "HMMM..");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 8564 49th Avenue Southwest is excellent. However, it looks like your HTC myTouch 3G isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
//	 @Test (priority = 89)
//	 public void mintVFBrandModelAddress126() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("20176" , "44008 Indian Fields Court");
//		 Actions action2 = new Actions(driver);	
//		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
//		 Thread.sleep(2000);
//		 Actions action = new Actions(driver);	 
//	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
// wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
// Thread.sleep(2000);
// WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//Actions action1 = new Actions(driver);
//action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
//Thread.sleep(2000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "NOT COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress126");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//		Assert.assertEquals(HeaderText, "HMMM..");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 44008 Indian Fields Court is very good. However, it looks like your HTC myTouch 3G isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
	 
//	 @Test (priority = 72)
//	 public void mintVFBrandModelAddress132() throws InterruptedException, IOException {
//		 mintVFBrandModelAddressPart1("79040" , "8580 County Road M");
//		 Actions action2 = new Actions(driver);	
//		 WebElement Textbox2 = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//		 action2.moveToElement(Textbox2).click().sendKeys("HTC" + Keys.RETURN).build().perform();
//		 Thread.sleep(2000);
//		 Actions action = new Actions(driver);	 
//	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
// wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
// Thread.sleep(2000);
// WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//Actions action1 = new Actions(driver);
//action1.moveToElement(Textbox).click().sendKeys("Touch 3G" + Keys.RETURN).build().perform();
//Thread.sleep(2000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: POOR" , "NOT COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelAddress132");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//		Assert.assertEquals(HeaderText, "NOT MINT TO BE");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Looks like your HTC myTouch 3G isn’t compatible with our service, the coverage at 8580 County Road M isn’t as mind-blowingly awesome as we’d like to see. Unfortunately, we are not a match in Mint heaven.");
//
//	 }
//
	 @Test (priority = 73)
	 public void mintVFBrandModelZipcode135() throws InterruptedException, IOException {
		 mintVFBrandModelZipcodePart1("94112");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelZipcode135");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "FOXTASTIC");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Nice. The coverage at 94112 is better than nacho fries with extra cheese and your Apple iPhone 8 is 100% compatible with our network.");
		
	 }
	 @Test (priority = 74)
	 public void mintVFBrandModelZipcode136() throws InterruptedException, IOException {
		 mintVFBrandModelZipcodePart1("79059");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelZipcode136");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Your coverage at 79059 is super and your Apple iPhone 8 is a match made in wireless heaven. Let’s get you a plan.");
		
	 }
	 @Test (priority = 75)
	 public void mintVFBrandModelZipcode137() throws InterruptedException, IOException {
		 mintVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Apple())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"));
		 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'iPhone SE')]"))).build().perform();
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 action.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_iPhone8())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelZipcode137");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "PRETTY SWEET");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		
	 }
//	 @Test (priority = 76)
//	 public void mintVFBrandModelZipcode139() throws InterruptedException, IOException {
//		 mintVFBrandModelZipcodePart1("95843");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: EXCELLENT" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelZipcode139");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "FOXTASTIC");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Nice. The coverage at 95843 is better than nacho fries with extra cheese and your Samsung Galaxy S8 is 100% compatible with our network.");
//		
//	 }
//	 @Test (priority = 77)
//	 public void mintVFBrandModelZipcode140() throws InterruptedException, IOException {
//		 mintVFBrandModelZipcodePart1("95227");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelZipcode140");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Your coverage at 95227 is super and your Samsung Galaxy S8 is a match made in wireless heaven. Let’s get you a plan.");
//		
//	 }
//	 @Test (priority = 78)
//	 public void mintVFBrandModelZipcode141() throws InterruptedException, IOException {
//		 mintVFBrandModelZipcodePart1("86036");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS8())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelZipcode141");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "PRETTY SWEET");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Samsung Galaxy S8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//		
//	 }
	 @Test (priority = 79)
	 public void mintVFBrandModelZipcode143() throws InterruptedException, IOException {
		 mintVFBrandModelZipcodePart1("03842");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelZipcode143");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Your coverage at 03842 is super and your Google Pixel 3a is a match made in wireless heaven. Let’s get you a plan.");
		
	 }
//	 @Test (priority = 80)
//	 public void mintVFBrandModelZipcode144() throws InterruptedException, IOException {
//		 mintVFBrandModelZipcodePart1("96044");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
//		 Thread.sleep(5000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
//		  Thread.sleep(2000);
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
//		 Thread.sleep(3000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		 takeScreenshot("mintVFBrandModelZipcode144");
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "Your coverage at 96044 is super and your Google Pixel 3a is a match made in wireless heaven. Let’s get you a plan.");
//		
//	 }
	 @Test (priority = 81)
	 public void mintVFBrandModelZipcode145() throws InterruptedException, IOException {
		 mintVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Google())).click();
		 Thread.sleep(5000);
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model())).click();
		  Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_Pixel3a())).click();
		 Thread.sleep(3000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		 takeScreenshot("mintVFBrandModelZipcode145");
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "PRETTY SWEET");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Google Pixel 3a is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		
	 }
	 @Test (priority = 82)
	 public void mintVFBrandModelZipcode147() throws InterruptedException {
		 mintVFBrandModelZipcodePart1("86401");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
			 Actions action = new Actions(driver);
			 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
			 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
		  Thread.sleep(2000);
		  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
		Thread.sleep(2000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Your coverage at 86401 is super and your Samsung Galaxy S4 Mini is a match made in wireless heaven. Let’s get you a plan.");
		
	 }
	 @Test (priority = 83)
	 public void mintVFBrandModelZipcode148() throws InterruptedException {
		 mintVFBrandModelZipcodePart1("96044");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "PRETTY SWEET");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at 96044 is pretty decent, and your Samsung Galaxy S4 Mini is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		
	 }
//	 @Test (priority = 84)
//	 public void mintVFBrandModelZipcode149() throws InterruptedException {
//		 mintVFBrandModelZipcodePart1("86036");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
//		 Thread.sleep(5000);
//		 Actions action = new Actions(driver);	 
//	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
// wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
// Thread.sleep(2000);
//  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//Actions action1 = new Actions(driver);
//action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
//Thread.sleep(2000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).sendKeys("Galaxy S4 Mini");
//		  Thread.sleep(2000);
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS4mini())).click();
//	  Thread.sleep(2000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "NOT COMPATIBLE");
//		 Thread.sleep(3000);
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//		Assert.assertEquals(HeaderText, "PRETTY SWEET");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Samsung Galaxy S4 Mini is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//		
//	 }
//	 @Test (priority = 85)
//	 public void mintVFBrandModelZipcode151() throws InterruptedException {
//		 mintVFBrandModelZipcodePart1("03842");
//		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
//		 Thread.sleep(5000);
//		 Actions action = new Actions(driver);	 
//	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
// wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
// Thread.sleep(2000);
//  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
//Actions action1 = new Actions(driver);
//action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
//Thread.sleep(2000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
//		  Thread.sleep(1000);
//		  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).sendKeys("Galaxy S4 Mini");
//		  Thread.sleep(2000);
//	  wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Model_GalaxyS4mini())).click();
//	  Thread.sleep(2000);
//		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
//		 Thread.sleep(3000);
//		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header2())).getText();
//		Assert.assertEquals(HeaderText, "HMMM..");
//		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//		Assert.assertEquals(ResultsText, "The coverage at 03842 is very good. However, it looks like your Samsung Galaxy S4 Mini isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");
//
//	 }
	 @Test (priority = 86)
	 public void mintVFBrandModelZipcode152() throws InterruptedException {
		 mintVFBrandModelZipcodePart1("79059");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: GOOD" , "COMPATIBLE");
		 Thread.sleep(3000);
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "OH FOX YEAH.");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "Your coverage at 79059 is super and your Samsung Galaxy S4 Mini is a match made in wireless heaven. Let’s get you a plan.");
		
	 }
	 @Test (priority = 87)
	 public void mintVFBrandModelZipcode153() throws InterruptedException {
		 mintVFBrandModelZipcodePart1("86036");
		 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_dropdown_Brand_Samsung())).click();
		 Actions action = new Actions(driver);	 
	 WebElement we = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
	 action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"))).build().perform();
 wait.until(ExpectedConditions.elementToBeClickable(hpp.mintVF_textbox_Model())).click();
 Thread.sleep(2000);
  WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Type or Select')]"));
Actions action1 = new Actions(driver);
action1.moveToElement(Textbox).click().sendKeys("Galaxy S4 Mini" + Keys.RETURN).build().perform();
Thread.sleep(2000);
		 mintVFBrandModelAddressZipcodePart2_4G("4G LTE Coverage: FAIR" , "COMPATIBLE");
		 Thread.sleep(3000);
		String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
		Assert.assertEquals(HeaderText, "PRETTY SWEET");
		String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
		Assert.assertEquals(ResultsText, "The coverage at 86036 is pretty decent, and your Samsung Galaxy S4 Mini is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
		
	 }
	 
	 @AfterMethod
 public void tearDown() {
		driver.quit();
 }

}
