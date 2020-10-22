package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clov3rDugtrio_Page {
	
	WebDriver driver;
	
	public Clov3rDugtrio_Page(WebDriver driver){
		this.driver=driver;
	}
	By dugtrio_button_signIn = By.xpath("//a[contains(text(),'Sign In')]");public By dugtrio_button_signIn() {return dugtrio_button_signIn;}
	By dugtrio_textbox_inputEmail = By.xpath("//input[@type='email']");public By dugtrio_textbox_inputEmail() {return dugtrio_textbox_inputEmail;}
	By dugtrio_button_signInNext = By.xpath("//span[contains(text(),'Next')]");public By dugtrio_button_signInNext() {return dugtrio_button_signInNext;}
	By dugtrio_textbox_enterPassword = By.xpath("//div/input[@type='password']");public By dugtrio_textbox_enterPassword() {return dugtrio_textbox_enterPassword;}
	By dugtrio_button_continueWithGoogle = By.xpath("//div/button[@id='google-signin-button']");public By dugtrio_button_continueWithGoogle() {return dugtrio_button_continueWithGoogle;}
	By dugtrio_button_profile = By.xpath("//div/div[@id='profileIdentifier']");public By dugtrio_button_profile() {return dugtrio_button_profile;}
	By dugtrio_textbox_input = By.xpath("//div/input[@placeholder='MSISDN, ICCID, User ID, E-mail, Order #, Name']");public By dugtrio_textbox_input() {return dugtrio_textbox_input;}
	By dugtrio_button_submit = By.xpath("//button[@type='submit']");public By dugtrio_button_submit() {return dugtrio_button_submit;}
	By dugtrio_text_name = By.xpath("(//div[@class='infoBar--infoOverflow'])[3]");public By dugtrio_text_name() {return dugtrio_text_name;}
	By dugtrio_text_lang = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[4]");public By dugtrio_text_lang() {return dugtrio_text_lang;}
	By dugtrio_text_email = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[8]");public By dugtrio_text_email() {return dugtrio_text_email;}	
	By dugtrio_text_notifs = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[11]");public By dugtrio_text_notifs() {return dugtrio_text_notifs;}	
	By dugtrio_text_wfc = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[14]");public By dugtrio_text_wfc() {return dugtrio_text_wfc;}	
	By dugtrio_text_env = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[18]");public By dugtrio_text_env() {return dugtrio_text_env;}	
	By dugtrio_text_userState = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[20]");public By dugtrio_text_userState() {return dugtrio_text_userState;}		
	By dugtrio_text_currentMonth = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[26]");public By dugtrio_text_currentMonth() {return dugtrio_text_currentMonth;}		
	By dugtrio_text_nextMonth = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[27]");public By dugtrio_text_nextMonth() {return dugtrio_text_nextMonth;}		
	By dugtrio_text_CC = By.xpath("(//div[@class='whiteSpace noTopPadding valueField   false'])[22]");public By dugtrio_text_CC() {return dugtrio_text_CC;}	
	By dugtrio_button_toolBox = By.xpath("//i[@class='fas fa-toolbox']");public By dugtrio_button_toolBox() {return dugtrio_button_toolBox;}	
	By dugtrio_button_dispatchInfo = By.xpath("//div/a[contains(text(),'Dispatch Info')]");public By dugtrio_button_dispatchInfo() {return dugtrio_button_dispatchInfo;}	
	By dugtrio_button_dispatchInfo2 = By.xpath("(//div/a[contains(text(),'Dispatch Info')])[2]");public By dugtrio_button_dispatchInfo2() {return dugtrio_button_dispatchInfo2;}	
	By dugtrio_textbox_dispatchInfosearch = By.xpath("//div/input[@placeholder='Search...']");public By dugtrio_textbox_dispatchInfosearch() {return dugtrio_textbox_dispatchInfosearch;}
	By dugtrio_textbox_dispatchInfosearch2 = By.xpath("(//div/input[@placeholder='Search...'])[2]");public By dugtrio_textbox_dispatchInfosearch2() {return dugtrio_textbox_dispatchInfosearch2;}
	By dugtrio_button_rechargeOrderGet = By.xpath("//a[@role='button']");public By dugtrio_button_rechargeOrderGet() {return dugtrio_button_rechargeOrderGet;}	
	By dugtrio_textbox_dispatchInfoDetails = By.xpath("(//div/textarea[@class='textarea is-success'])[1]");public By dugtrio_textbox_dispatchInfoDetails() {return dugtrio_textbox_dispatchInfoDetails;} 
	By dugtrio_textbox_dispatchInfoDetails2 = By.xpath("(//div/textarea[@class='textarea is-success'])[2]");public By dugtrio_textbox_dispatchInfoDetails2() {return dugtrio_textbox_dispatchInfoDetails2;}  
	By dugtrio_button_dispatchInfoSend = By.xpath("//div/a[contains(text(),'Send')]");public By dugtrio_button_dispatchInfoSend() {return dugtrio_button_dispatchInfoSend;}
	By dugtrio_button_dispatchInfoSend2 = By.xpath("(//div/a[contains(text(),'Send')])[2]");public By dugtrio_button_dispatchInfoSend2() {return dugtrio_button_dispatchInfoSend2;}
	By dugtrio_button_networkSuspendGet = By.xpath("(//a[contains(text(),'https://stargate.ultramobile.com/service-apiSubscribersNetworkMaster-app/suspend')])[1]");public By dugtrio_button_networkSuspendGet() {return dugtrio_button_networkSuspendGet;}	
	By dugtrio_button_planINfoEdit = By.xpath("(//abbr[@title='Edit'])[2]"); public By dugtrio_button_planINfoEdit() {return dugtrio_button_planINfoEdit;}
	By dugtrio_button_planInfo_wallet = By.xpath("(//div[@class='commonDropDown--plusMinus'])[1]");public By dugtrio_button_planInfo_wallet() {return dugtrio_button_planInfo_wallet;}
	By dugtrio_button_planInfo_wallet_add = By.xpath("//a[contains(text(),'Add')]");public By dugtrio_button_planInfo_wallet_add() {return dugtrio_button_planInfo_wallet_add;}
	By dugtrio_button_planInfo_wallet_reason = By.xpath("(//div[@class='commonDropDown--plusMinus'])[2]");public By dugtrio_button_planInfo_wallet_reason() {return dugtrio_button_planInfo_wallet_reason;}
	By dugtrio_button_planInfo_wallet_reason_testing = By.xpath("//a[contains(text(),'Testing')]");public By dugtrio_button_planInfo_wallet_reason_testing() {return dugtrio_button_planInfo_wallet_reason_testing;}
	By dugtrio_textbox_wallet_amount = By.xpath("(//input[@id='amount'])[1]");public By dugtrio_textbox_wallet_amount() {return dugtrio_textbox_wallet_amount;}
	By dugtrio_button_editSave = By.xpath("//a[contains(text(),'Save')]");public By dugtrio_button_editSave() {return dugtrio_button_editSave;}
}