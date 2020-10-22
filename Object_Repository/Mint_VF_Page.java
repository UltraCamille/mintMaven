package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;


public class Mint_VF_Page {
	
	WebDriver driver;
	
	public Mint_VF_Page(WebDriver driver){
		this.driver=driver;
	}
	

	
	By mintVF_test_zipCode = By.xpath("(//input[@placeholder='required'])[1]"); public By mintVF_test_zipCode() { return mintVF_test_zipCode;}
	By mintVF_button_LetsGo = By.xpath("(//button[@class='a-btn buttonText RVF-button'])[1]"); public By mintVF_button_LetsGo() { return mintVF_button_LetsGo;}
	By mintVF_textbox_StreetAddress = By.xpath("//input[@placeholder='Home # and Street Address']"); public By mintVF_textbox_StreetAddress() { return mintVF_textbox_StreetAddress;}
	By mintVF_button_Continue = By.xpath("//button[contains(text(),'Continue')]"); public By mintVF_button_Continue() { return mintVF_button_Continue;}
	By mintVF_button_ContinueIMEI = By.xpath("//button[contains(text(),'Continue')]"); public By mintVF_button_ContinueIMEI() { return mintVF_button_ContinueIMEI;}
	By mintVF_dropdown_Brand = By.xpath("(//div[@class='react-select__value-container css-1hwfws3'])[1]"); public By mintVF_dropdown_Brand() { return mintVF_dropdown_Brand;}
	By mintVF_dropdown_Model = By.xpath("//div[@class='react-select__placeholder css-ogcd26-placeholder']"); public By mintVF_dropdown_Model() { return mintVF_dropdown_Model;}
	By mintVF_textbox_IMEI = By.xpath("//input[@class='RVF-numberInput RVF-form-control']"); public By mintVF_textbox_IMEI() { return mintVF_textbox_IMEI;}
	By mintVF_button_ViewPlans = By.xpath("//button[contains(text(),'View Plans')]"); public By mintVF_button_ViewPlans() { return mintVF_button_ViewPlans;}
	By mintVF_text_CheckCoverage = By.xpath("//h1[contains(text(),'Check your Coverage')]"); public By mintVF_text_CheckCoverage() { return mintVF_text_CheckCoverage;}
	By mintVF_header_CheckCoverage = By.xpath("//h2[contains(text(),'Mint Mobile runs on the nation’s most advanced 4G LTE high-speed network')]"); public By mintVF_header_CheckCoverage() { return mintVF_header_CheckCoverage;}
	By mintVF_directions_CheckCoverage = By.xpath("//p[contains(text(),'Enter a street address and ZIP code to check')]"); public By mintVF_directions_CheckCoverage() { return mintVF_directions_CheckCoverage;}
	By mintVF_results_Coverage1 = By.xpath("//h4[contains(text(),'4G LTE Coverage: ')]"); public By mintVF_results_Coverage1() { return mintVF_results_Coverage1;}
	By mintVF_results_Coverage2 = By.xpath("(//h4/span)[1]"); public By mintVF_results_Coverage2() { return mintVF_results_Coverage2;}
	By mintVF_results_Device = By.xpath("(//h4/span)[2]"); public By mintVF_results_Device() { return mintVF_results_Device;}
	By mintVF_text_ErrorMessage = By.xpath("//div[contains(text(),'Please input a valid zipcode')]"); public By mintVF_text_ErrorMessage() { return mintVF_text_ErrorMessage;}
	By mintVF_results_Coverage3G = By.xpath("//h4[contains(text(),'3G Coverage: ')]"); public By mintVF_results_Coverage3G() { return mintVF_results_Coverage3G;}
	By mintVF_button_IMEIskip = By.xpath("//span[@class='RVF-imei-skip']"); public By mintVF_button_IMEIskip() { return mintVF_button_IMEIskip;}
	By mintVF_dropdown_Brand_Apple = By.xpath("//div[contains(text(),'Apple')]"); public By mintVF_dropdown_Brand_Apple() { return mintVF_dropdown_Brand_Apple;}
	By mintVF_dropdown_Brand_Samsung = By.xpath("//div[contains(text(),'Samsung')]"); public By mintVF_dropdown_Brand_Samsung() { return mintVF_dropdown_Brand_Samsung;}
	By mintVF_dropdown_Brand_Google = By.xpath("//div[contains(text(),'Google')]"); public By mintVF_dropdown_Brand_Google() { return mintVF_dropdown_Brand_Google;}
	By mintVF_dropdown_Model_iPhone8 = By.xpath("//div[contains(text(),'iPhone 8')]"); public By mintVF_dropdown_Model_iPhone8() { return mintVF_dropdown_Model_iPhone8;}
	By mintVF_dropdown_Model_GalaxyS8 = By.xpath("//div[contains(text(),'Galaxy S8')]"); public By mintVF_dropdown_Model_GalaxyS8() { return mintVF_dropdown_Model_GalaxyS8;}
	By mintVF_dropdown_Model_Pixel3a = By.xpath("//div[contains(text(),'Pixel 3a')]"); public By mintVF_dropdown_Model_Pixel3a() { return mintVF_dropdown_Model_Pixel3a;}
	By mintVF_dropdown_Model_GalaxyS4mini = By.xpath("//div[contains(text(),'Galaxy S4 Mini')]"); public By mintVF_dropdown_Model_GalaxyS4mini() { return mintVF_dropdown_Model_GalaxyS4mini;}
	By mintVF_textbox_Model = By.xpath("//div[@class='react-select__placeholder css-ogcd26-placeholder']");	public By mintVF_textbox_Model() { return mintVF_textbox_Model;}
	By mintVF_result_header = By.xpath("//div/h1[@class='RVF-header RVF-Header-Bold RVF-pt-0']"); public By mintVF_result_header() { return mintVF_result_header;}
	By mintVF_result_header2 = By.xpath("//div/h1[@class='RVF-header pt-0 RVF-Header-Bold']"); public By mintVF_result_header2() { return mintVF_result_header2;}
	By mintVF_result_header3 = By.xpath("//div/h1[@class='RVF-header RVF-pt-0 RVF-Header-Bold']"); public By mintVF_result_header3() { return mintVF_result_header3;}
	By mintVF_text_subtitle = By.xpath("//p[@class='RVF-subtitle']"); public By mintVF_text_subtitle() { return mintVF_text_subtitle;}
	By mintVF_result_address = By.xpath("(//div/p/b)[1]"); public By mintVF_result_address() { return mintVF_result_address;}
	By mintVF_result_device = By.xpath("(//div/p/b)[2]"); public By mintVF_result_device() { return mintVF_result_device;}	
	//-- BYOP - BYOP
	By mintBYOP_text_sectionHeader = By.xpath("//div[contains(text(),'Bring the phone you love to Mint Mobile')]");
	By mintBYOP_text_subHead1 = By.xpath("//div/h5[contains(text(),'Check your')]");
	By mintBYOP_text_subHead = By.xpath("//div[@class='check-phone-cmp']");
	By mintBYOP_text_directions = By.xpath("//div[contains(text(),'Dial *#06# on your phone to access IMEI.')]");
	By mintBYOP_link_needHelp = By.xpath("//a[contains(text(),'Need Help?')]");
	By mintBYOP_textbox_IMEI = By.xpath("//input[@class='RVF-imei-entry form-control phone-in']");
	By mintBYOP_button_checkPhone = By.xpath("//button[@class='RVF-button btn btn-primary cphone']");
	By mintBYOP_text_IMEIerror = By.xpath("//div[contains(text(),'Please Enter Valid IMEI Information.')]");
	By mintBYOP_button_viewPlans = By.xpath("(//a/button[contains(text(),'View Plans')])[2]");
	
	
	
	

	
}


// -----------
//IMEI and Address
//--------------------------- Excellent and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "FOXTASTIC");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Nice! The coverage at 445 Persia Ave & Mission St. is better than nacho fries with extra cheese and your Apple iPhone 8 is 100% compatible with our network.");
//
//------------------------------- Good and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "OH FOX YEAH");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Your coverage at 3175 Iowa Avenue is super and your Apple iPhone 8 is a match made in wireless heaven. Let’s get you a plan.");
//
//--------------------------------- Fair and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "PRETTY SWEET");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at 2656 290th Street area is pretty decent, and your Apple iPhone 8 is definitely compatible with our service. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//
//-------------------------------- Poor and Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "AWW FOX");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
//
//---------------------------- Excellent and Non-Compatible
//
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "HMMM..");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at {{entered address}} is excellent. However, it looks like your [device] isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");

// ---------------------------Good and Non-Compatible
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "HMMM......");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at ((address entered}} is very good. However, it looks like your [device] isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");

//---------------------------Fair and Non-Compatible

//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "HMMM......");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at {{address entered}} is pretty decent. However, it looks like your [device] isn’t compatible with us. No biggie, upgrade your phone to one that is 4G LTE, and VoLTE friendly before you join Mint. We've got options.");

// -------------------------- Poor and Non-Compatible

//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "NOT MINT TO BE");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Looks like your [MODEL] isn’t compatible with our service, the coverage at {{address entered}}] isn’t as mind-blowingly awesome as we’d like to see. Unfortunately, we are not a match in Mint heaven.");





// ---ADDRESS ONLY

// ------ EXCELLENT
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "FOXTASTIC");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, Persia Ave & Mission St. is excellent. Let’s find you a plan.");
//

//------ GOOD
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "OH FOX YEAH");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, 3175 Iowa Avenue is good. Let’s find you a plan.");
//

//------ FAIR
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "PRETTY SWEET");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "The coverage at the given location, 2656 290th Street is pretty decent. We suggest you give us a try first to see how we compare to your current service. We have a 7-day money back guarantee, so even though you’re probably a risk taker, there is absolutely no risk to you.");
//
//------ POOR
//String HeaderText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_result_header())).getText();
//Assert.assertEquals(HeaderText, "AWW FOX");
//String ResultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(hpp.mintVF_text_subtitle())).getText();
//Assert.assertEquals(ResultsText, "Although your Apple iPhone 8 is perfectly compatible with our service, the coverage at 2418 Quincy Rd is poorer than we’d like to see. It doesn’t look like Mint is right for you…this is us crying now.");
//