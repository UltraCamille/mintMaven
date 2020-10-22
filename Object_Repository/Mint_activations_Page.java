package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mint_activations_Page {
	
	WebDriver driver;
	
	public Mint_activations_Page(WebDriver driver){
		this.driver=driver;
	}
	
	By mintHeader_button_SignIn = By.xpath("(//a[contains(text(),'Log In')])[1]");
	By signInPage_textbox_MSISDN = By.xpath("//input[@placeholder='Phone Number']");
	By signInPage_button_SignInViaSMS = By.xpath("//a[contains(text(),'SMS a Password to My Device')]");
	By mintHeader_dropdown_Lang_English = By.xpath("(//span[contains(text(),'English')])[1]");
	By mintHeader_dropdown_Lang_Spanish = By.xpath("(//span[contains(text(),'Español')])[1]");
	By mintHeader_dropdown_Lang_Chinese = By.xpath("(//span[contains(text(),'简体中文')])[1]");
	By mintMobile_Logo = By.className("d-none dark_theme Logo--image");
	By signInPage_textbox_Password = By.xpath("//input[@id='InputTextPassword']");
	By signInPage_button_SignIn = By.xpath("//button[@id='btn-login-submit']");
	By accountManagement_text_MyPlan = By.xpath("//div[contains(text(),'My Plan')]");
	By mintMenu_button_Plans = By.xpath("//a[contains(text(),'Plans')][1]");
	By mintMenu_button_Phones = By.xpath("//a[contains(text(),'Phones')][1]");
	By mintMenu_button_INTL = By.xpath("//a[contains(text(),'International')][1]");	
	By mintMenu_button_Coverage = By.xpath("//a[contains(text(),'Coverage')][1]");
	By mintMenu_button_StoreLocator = By.xpath("//a[contains(text(),'Store Locator')][1]");
	By mintMenu_dropdown_Help = By.xpath("//a[contains(text(),'Help')][1]");
	By mintMenu_image_FAQ = By.xpath(("//img[contains(@src,'https://www.mintmobile.com/wp-content/themes/mintmobile/images/icon-faq.png')]"));
	By mintMenu_image_Logo = By.xpath(("//img[contains(@src,'https://www.mintmobile.com/wp-content/themes/mintmobile/images/logo-mint-dark-theme.png')]"));
	By mintMenu_image_Support = By.xpath(("//img[contains(@src,'https://www.mintmobile.com/wp-content/themes/mintmobile/images/icon-support.png')]"));
	By homePage_textbox_IntlRates = By.cssSelector("input.IntlRates-field");
	By homePage_text_Korea = By.xpath("//div[contains(text(),'South Korea')]");
	By homePage_text_India = By.xpath("//div[contains(text(),'India')]");
	By homePage_text_Philippines = By.xpath("//div[contains(text(),'Philippines')]");
	By homePage_button_1GBPlan_ViewDetails = By.xpath("//a[@href='https://www.mintmobile.com/product/1gb-plan-sim-kit/']");
	By homePage_button_3GBPlan_ViewDetails = By.xpath("//a[@href='https://www.mintmobile.com/product/3gb-plan-sim-kit/']");
	By homePage_button_6GBPlan_ViewDetails = By.xpath("//a[@href='https://www.mintmobile.com/product/6gb-plan-sim-kit/']");
	By homePage_button_UnliPlan_ViewDetails = By.xpath("//a[@href='https://www.mintmobile.com/product/unlimited-data-plan-sim-kit/']");
	By mintHeader_button_Activate = By.xpath("//a[contains(text(),'Activate')]");
	By slack_button_SignIn = By.xpath("//a[contains(text(),'Sign in')]");
	By slack_workpace_URL = By.xpath("//input[@id='domain']");
	By slack_email_Address = By.xpath("//input[@placeholder='name@work-email.com']");
	By slack_password = By.xpath("//input[@id='password']");
	By slack_textbox = By.tagName("p");
	By slack_manualsignin = By.xpath("(//a[@class='c-link bold'])[1]");  public By slack_manualsignin() { return slack_manualsignin; } 
	By getICCID_SelectSimStatus = By.xpath("//input[@placeholder='Select Sim Status...']");
	By getICCID_InitialProductType = By.xpath("//input[@placeholder='Initial Product Type...']");
	By getICCID_InitialProductID = By.xpath("//input[@placeholder='Initial Product ID...']");
	By getICCID_Available = By.xpath("//span[contains(text(),'AVAILABLE')]");
	By getICCID_Type = By.xpath("//input[@placeholder='Type...']");
	By getICCID_PurpleSim = By.xpath("//span[contains(text(),'Purple')]");
	By getICCID_OrangeSim = By.xpath("//span[contains(text(),'Orange')]");
	By getICCID_Brand = By.xpath("//input[@placeholder='Brand...']");
	By getICCID_AUTOMATIONMint = By.xpath("//span[contains(text(),'AUTOMATION Mint')]");
	By getICCID_QAMint = By.xpath("//span[contains(text(),'QA Mint')]");
	By getICCID_MintTrial = By.xpath("//span[contains(text(),'Mint Trial')]"); public By getICCID_MintTrial() { return getICCID_MintTrial; } 
	By getICCID_PRODMint = By.xpath("//span[contains(text(),'PROD Mint')]");
	By getICCID_button_GetICCID = By.xpath("//span[contains(text(),'Get ICCID')]");
	By mint_image_PurpleSim = By.xpath("//img[@id='Purple']");
	By mint_image_OrangeSim = By.xpath("//img[@id='Orange']");
	By mint_textbox_ICCID = By.xpath("//input[@placeholder='ICCID']");
	By mint_textbox_ActCode = By.xpath("//input[@placeholder='Your 11-digit activation code']");
	By mint_button_StartActivation = By.xpath("//button[@id='Button']");
	By chrome_button_ClearCache = By.cssSelector("* /deep/ #clearBrowsingDataConfirm");
	By mint_Activations_GettingStarted = By.xpath("//h1[contains(text(),'Getting Started')]");
	By getICCID_DispatchEnv = By.xpath("//input[@placeholder='Dispatch Env...']");
	By getICCID_PIPNEW = By.xpath("//span[contains(text(),'PIPNEW')]");
	By mintActivation_textbox_InputZipCode = By.xpath("//input[@id='InputTextZipCode']");
	By mintActivation_plan_3Mo1Gb = By.xpath("//div[@id='7000022']");
	By mintActivation_plan_CampusTrial = By.xpath("//span[contains(text(),'Campus Trial')]");
	By mintActivation_plan_3Mo3Gb = By.xpath("//div[@id='7000023']");
	By mintActivation_plan_3Mo6Gb = By.xpath("//div[@id='7000024']");
	By mintActivation_plan_3MoUnli = By.xpath("//div[@id='7000055']");
	By mintActivation_plan_6Mo1Gb = By.xpath("//div[@id='7000026']");
	By mintActivation_plan_6Mo3Gb = By.xpath("//div[@id='7000027']");
	By mintActivation_plan_6Mo6Gb = By.xpath("//div[@id='7000028']");
	By mintActivation_plan_6MoUnli = By.xpath("//div[@id='7000047']");
	By mintActivation_plan_12Mo1Gb = By.xpath("//div[@id='7000030']");
	By mintActivation_plan_12Mo3Gb = By.xpath("//div[@id='7000031']");
	By mintActivation_plan_12Mo6Gb = By.xpath("//div[@id='7000032']");
	By mintActivation_plan_12MoUnli = By.xpath("//div[@id='7000054']");
	By mintActivation_plan_19 = By.xpath("//div[@id='1000023']");
	By mintActivation_plan_23 = By.xpath("//div[@id='105']");
	By mintActivation_plan_29 = By.xpath("//div[@id='79']");
	By mintActivation_plan_49 = By.xpath("//div[@id='7000048']");
	By mintActivation_plan_39 = By.xpath("//div[@id='106']");
	By mintActivation_button_ActivateaNewNumber = By.xpath("//button[@id='NewNumberButton']");
	By mintActivation_button_Checkbox = By.xpath("//label[@id='Agreement_Agree']");
	By signActivation_button_ProceedActivation = By.xpath("//button[@id='Button']");
	By mintActivation_textbox_FirstName = By.xpath("//input[@id='InputFirstName']");
	By mintActivation_textbox_LastName = By.xpath("//input[@id='InputLastName']");
	By mintActivation_textbox_Email = By.xpath("//input[@id='InputTextEmail']");
	By mintActivation_textbox_UserName = By.xpath("//input[@id='InputUsername']");
	By mintActivation_textbox_Password = By.xpath("//input[@id='InputGroupPassword']");
	By mintActivation_textbox_ConfirmPassword = By.xpath("//input[@id='InputGroupPasswordConfirm']");
	By mintActivation_button_SubmitInfo = By.xpath("//button[@id='Button']");
	By phonesPage_image_Logo = By.xpath(("//img[contains(@src,'skin/electronics_black/images/logo-mint.png')][1]"));
	By coveragePage_image_Logo = By.xpath(("//img[contains(@src,'https://www.mintmobile.com/wp-content/themes/mintmobile/images/logo-mint.png')]"));
	By mintActivation_button_CreditCard = By.xpath("//button[@id='ccPath']");
	By mintActivation_button_PinCard = By.xpath("//button[@id='pinsPath']");
	By mintActivation_textbox_CreditCard = By.xpath("//input[@id='CardNumber']");
	By mintActivation_textbox_CVV = By.xpath("//input[@id='CVV']");
	By mintActivation_textbox_ExpDate = By.xpath("//input[@id='ExpirationDate']");
	By mintActivation_textbox_State = By.xpath("//input[@id='InputState']");
	By mintActivation_textbox_Address = By.xpath("//input[@id='InputAddress1']");
	By mintActivation_textbox_Address2 = By.xpath("//input[@id='InputAddress2']");
	By mintActivation_textbox_City = By.xpath("//input[@id='InputCity']");
	By mintActivation_textbox_ZipCode = By.xpath("//input[@id='InputTextZipCode']");
	By mintActivation_button_CCContinue = By.xpath("//button[@id='ccNext']");
	By mintActivation_button_ChargeCC = By.xpath("//button[@id='ccPathSubmit']");
	By mintActivation_text_InProgress = By.xpath("//h1[contains(text(),'Activation In Progress')]");
	By mintActivation_text_Complete = By.xpath("//h1[contains(text(),'Activation Complete')]");
	By mintBillingInfo_textbox_FirstName = By.xpath("//input[@id='InputFirstName']");
	By mintBillingInfo_textbox_LastName = By.xpath("//input[@id='InputLastName']");
	By mintActivation_text_AccountInfo = By.xpath("//h1[contains(text(),'My Account Info')]");
	By mintActivation_button_AddCC = By.xpath("//button[@id='Button']");
	By mintBillingInto_Link_Skip = By.xpath("//a[@id='Link']");
	By mintActivation_button_Refresh = By.xpath("//button[@id='Button']");
	By getICCID_textbox_GetICCID = By.xpath("(//span/code)[1]");
	By getICCID_textbox_GetACTCODE = By.xpath("(//span/code)[2]");
	By getICCID_3MoSmall_ID = By.xpath("//span[contains(text(),'3 Month 3GB (7000058')]");
	By getICCID_3MoSmall_Type = By.xpath("(//span[contains(text(),‘3 Month Small’)])[1]");
	By getICCID_3MoMedium_ID = By.xpath("//span[contains(text(),'3 Month 8GB (7000040')]");
	By getICCID_3MoMedium_Type = By.xpath("//span[contains(text(),'3 Month Medium')]");
	By getICCID_3MoLarge_ID = By.xpath("//span[contains(text(),'3 Month 12GB (7000041')]");
	By getICCID_3MoLarge_Type = By.xpath("(//span[contains(text(),'3 Month Large')])[1]");
	By getICCID_6MoSmall_ID = By.xpath("//span[contains(text(),'6 Month 3GB (7000015')]");
	By getICCID_6MoSmall_Type = By.xpath("//span[contains(text(),'6 Month Small')]");
	By getICCID_6MoLarge_ID = By.xpath("//span[contains(text(),'6 Month 12GB (7000017')]");
	By getICCID_6MoLarge_Type = By.xpath("//span[contains(text(),'6 Month Large')]");
	By getICCID_6MoMedium_ID = By.xpath("//span[contains(text(),'6 Month 8GB (7000016')]");
	By getICCID_6MoMedium_Type = By.xpath("//span[contains(text(),'6 Month Medium')]");
	By getICCID_12MoLarge_ID = By.xpath("//span[contains(text(),'12 Month 12GB (7000020')]");
	By getICCID_12MoLarge_Type = By.xpath("//span[contains(text(),'12 Month Large')]");
	By getICCID_12MoMedium_Type = By.xpath("//span[contains(text(),'12 Month Medium')]");
	By getICCID_12MoMedium_ID = By.xpath("//span[contains(text(),'12 Month 8GB (7000019')]");
	By getICCID_12MoSmall_Type = By.xpath("//span[contains(text(),'12 Month Small')]");
	By getICCID_12MoSmall_ID = By.xpath("//span[contains(text(),'12 Month 3GB (7000018')]");
	By mintActivation_button_submit = By.xpath("//button[@type='submit']");
	By mintActivation_newMSISDN = By.xpath("(//p/span)[1]");	public By mintActivation_newMSISDN() { return mintActivation_newMSISDN; } 
	By mintActivation_skipDeviceCheck = By.xpath("//p[contains(text(),'SKIP')]");	public By mintActivation_skipDeviceCheck() { return mintActivation_skipDeviceCheck; } 
	By mintActivation_productID_CampusSIM = By.xpath("//span[contains(text(),'Campus Trial (145)')]");	public By mintActivation_productID_CampusSIM() { return mintActivation_productID_CampusSIM; } 

	
	public By mintActivation_plan_CampusTrial() { return mintActivation_plan_CampusTrial; } 
	public By mintActivation_text_Complete() { return mintActivation_text_Complete; } 
	public By mintActivation_button_submit() { return mintActivation_button_submit; } 
	public By getICCID_12MoSmall_ID() { return getICCID_12MoSmall_ID; } 
	public By getICCID_12MoMedium_ID() { return getICCID_12MoMedium_ID; } 
	public By getICCID_12MoLarge_ID() { return getICCID_12MoLarge_ID; } 
	public By getICCID_6MoLarge_ID() { return getICCID_6MoLarge_ID; } 
	public By getICCID_6MoMedium_ID() { return getICCID_6MoMedium_ID; } 
	public By getICCID_6MoSmall_ID() { return getICCID_6MoSmall_ID; } 
	public By getICCID_3MoLarge_ID() { return getICCID_3MoLarge_ID; } 
	public By getICCID_3MoMedium_ID() { return getICCID_3MoMedium_ID; } 
	public By getICCID_3MoMedium_Type() { return getICCID_3MoMedium_Type; } 
	public By getICCID_3MoLarge_Type() { return getICCID_3MoLarge_Type; } 
	public By getICCID_6MoSmall_Type() { return getICCID_6MoSmall_Type; } 
	public By getICCID_6MoMedium_Type() { return getICCID_6MoMedium_Type; } 
	public By getICCID_6MoLarge_Type() { return getICCID_6MoLarge_Type; } 
	public By getICCID_12MoSmall_Type() { return getICCID_12MoSmall_Type; } 
	public By getICCID_12MoMedium_Type() {return getICCID_12MoMedium_Type;}
	public By getICCID_12MoLarge_Type() {return getICCID_12MoLarge_Type;}
	public By getICCID_3MoSmall_Type() {return getICCID_3MoSmall_Type;}
	public By getICCID_3MoSmall_ID() {return getICCID_3MoSmall_ID;}
	public By mintActivation_button_PinCard() {return mintActivation_button_PinCard;}
	public By getICCID_textbox_GetACTCODE() {return getICCID_textbox_GetACTCODE;}
	public By mintActivation_button_Refresh() {return mintActivation_button_Refresh;}
	public By mintActivation_button_AddCC() {return mintActivation_button_AddCC;}
    public By mintActivation_text_AccountInfo() {return mintActivation_text_AccountInfo;}
    public By mintBillingInto_Link_Skip() {return mintBillingInto_Link_Skip;}
    public By mint_textbox_ActCode() {return mint_textbox_ActCode;}
    public By mintActivation_plan_39() {return mintActivation_plan_39;}
    public By mintBillingInfo_textbox_LastName() {return mintBillingInfo_textbox_LastName;}
    public By mintBillingInfo_textbox_FirstName() {return mintBillingInfo_textbox_FirstName;}
    public By mintActivation_text_InProgress() {return mintActivation_text_InProgress;}
	public By mintActivation_button_ChargeCC() {return mintActivation_button_ChargeCC;}
	public By mintActivation_textbox_State() {return mintActivation_textbox_State;}
	public By mintActivation_textbox_ExpDate() { return mintActivation_textbox_ExpDate; }
	public By mintActivation_textbox_FirstName() { return mintActivation_textbox_FirstName; }
	public By mintActivation_textbox_LastName() { return mintActivation_textbox_LastName; }
	public By mintActivation_textbox_Email() { return mintActivation_textbox_Email; }
	public By mintActivation_textbox_UserName() { return mintActivation_textbox_UserName; }
	public By mintActivation_textbox_Password() { return mintActivation_textbox_Password; }
	public By mintActivation_textbox_ConfirmPassword() { return mintActivation_textbox_ConfirmPassword; }
	public By mintActivation_button_SubmitInfo() { return mintActivation_button_SubmitInfo; }
	public By mintActivation_button_CreditCard() { return mintActivation_button_CreditCard; }
	public By mintActivation_textbox_CreditCard() { return mintActivation_textbox_CreditCard; }
	public By mintActivation_textbox_CVV() { return mintActivation_textbox_CVV; }
	public By mintActivation_textbox_Address() { return mintActivation_textbox_Address; }
	public By mintActivation_textbox_Address2() { return mintActivation_textbox_Address2; }
	public By mintActivation_textbox_City() { return mintActivation_textbox_City; }
	public By mintActivation_textbox_ZipCode() { return mintActivation_textbox_ZipCode; }
	public By mintActivation_button_CCContinue() {return mintActivation_button_CCContinue;}
	public By mintActivation_button_Checkbox() {return mintActivation_button_Checkbox;}	
	public By signActivation_button_ProceedActivation() {return signActivation_button_ProceedActivation;}	
	public By mintActivation_plan_3Mo1Gb() {return mintActivation_plan_3Mo1Gb;}	
	public By mintActivation_plan_3Mo3Gb() {return mintActivation_plan_3Mo3Gb;}	
	public By mintActivation_plan_3Mo6Gb() {return mintActivation_plan_3Mo6Gb;}
	public By mintActivation_plan_3MoUnli() {return mintActivation_plan_3MoUnli;}
	public By mintActivation_plan_6Mo1Gb() {return mintActivation_plan_6Mo1Gb;}
	public By mintActivation_plan_6Mo3Gb() {return mintActivation_plan_6Mo3Gb;}
	public By mintActivation_plan_6Mo6Gb() {return mintActivation_plan_6Mo6Gb;}
	public By mintActivation_plan_6MoUnli() {return mintActivation_plan_6MoUnli;}
	public By mintActivation_plan_12Mo1Gb() {return mintActivation_plan_12Mo1Gb;}
	public By mintActivation_plan_12Mo3Gb() {return mintActivation_plan_12Mo3Gb;}
	public By mintActivation_plan_12Mo6Gb() {return mintActivation_plan_12Mo6Gb;}
	public By mintActivation_plan_12MoUnli() {return mintActivation_plan_12MoUnli;}
	public By mintActivation_plan_19() {return mintActivation_plan_19;}
	public By mintActivation_plan_23() {return mintActivation_plan_23;}
	public By mintActivation_plan_29() {return mintActivation_plan_29;}
	public By mintActivation_plan_49() {return mintActivation_plan_49;}
	public By mintActivation_button_ActivateaNewNumber() {return mintActivation_button_ActivateaNewNumber;}
	public By mintActivation_textbox_InputZipCode() {return mintActivation_textbox_InputZipCode;}
	public By getICCID_InitialProductType() {return getICCID_InitialProductType;}
	public By getICCID_InitialProductID() {return getICCID_InitialProductID;}
	public By getICCID_PIPNEW() {return getICCID_PIPNEW;}
	public By getICCID_DispatchEnv() {return getICCID_DispatchEnv;}
	public By mint_Activations_GettingStarted() {return mint_Activations_GettingStarted;}
	public By chrome_button_ClearCache() {return chrome_button_ClearCache;}
//	public By mint_GettingStarted_ICCID() {return mint_GettingStarted_ICCID;}
	public By mint_button_StartActivation() {return mint_button_StartActivation;}
	public By getICCID_Brand() {return getICCID_Brand;}
	public By mint_textbox_ICCID() {return mint_textbox_ICCID;}
	public By mint_image_PurpleSim() {return mint_image_PurpleSim;}
	public By mint_image_OrangeSim() {return mint_image_OrangeSim;}
	public By getICCID_button_GetICCID() {return getICCID_button_GetICCID;}
	public By getICCID_textbox_GetICCID() {return getICCID_textbox_GetICCID;}
	public By getICCID_AUTOMATIONMint() {return getICCID_AUTOMATIONMint;}
	public By getICCID_PRODMint() {return getICCID_PRODMint;}
	public By getICCID_QAMint() {return getICCID_QAMint;}
	public By slack_textbox() {return slack_textbox;}
	public By getICCID_Type() {return getICCID_Type;}
	public By getICCID_OrangeSim() {return getICCID_OrangeSim;}
	public By getICCID_PurpleSim() {return getICCID_PurpleSim;}
	public By getICCID_Available() {return getICCID_Available;}
	public By getICCID_SelectSimStatus() {return getICCID_SelectSimStatus;}
	public By slack_email_Address() {return slack_email_Address;}
	public By slack_password() {return slack_password;}
	public By slack_workpace_URL() {return slack_workpace_URL;}
	public By mintHeader_button_SignIn() {return mintHeader_button_SignIn;}
	public By mintHeader_button_Activate() {return mintHeader_button_Activate;}
	public By signInPage_textbox_MSISDN() {return signInPage_textbox_MSISDN;}
	public By signInPage_button_SignInViaSMS() {return signInPage_button_SignInViaSMS;}
	public By mintHeader_dropdown_Lang_English() {return mintHeader_dropdown_Lang_English;}
	public By mintHeader_dropdown_Lang_Spanish() {return mintHeader_dropdown_Lang_Spanish;}
	public By mintHeader_dropdown_Lang_Chinese() {return mintHeader_dropdown_Lang_Chinese;}
	public By mintMobile_Logo() {return mintMobile_Logo;}
	public By signInPage_textbox_Password() {return signInPage_textbox_Password;}
	public By signInPage_button_SignIn() {return signInPage_button_SignIn;}
	public By accountManagement_text_MyPlan() {return accountManagement_text_MyPlan;}
	public By mintMenu_button_Plans() {return mintMenu_button_Plans;}
	public By mintMenu_button_Phones() {return mintMenu_button_Phones;}	
	public By mintMenu_button_INTL() {return mintMenu_button_INTL;}	
	public By mintMenu_button_Coverage() {return mintMenu_button_Coverage;}	
	public By mintMenu_button_StoreLocator() {return mintMenu_button_StoreLocator;}
	public By mintMenu_dropdown_Help() {return mintMenu_dropdown_Help;}
	public By mintMenu_image_FAQ() {return mintMenu_image_FAQ;}
	public By mintMenu_image_Logo() {return mintMenu_image_Logo;}
	public By phonesPage_image_Logo() {return phonesPage_image_Logo;}
	public By coveragePage_image_Logo() {return coveragePage_image_Logo;}
	public By mintMenu_image_Support() {return mintMenu_image_Support;}
	public By homePage_textbox_IntlRates() {return homePage_textbox_IntlRates;}
	public By homePage_text_Korea() {return homePage_text_Korea;}
	public By homePage_text_India() {return homePage_text_India;}
	public By homePage_text_Philippines() {return homePage_text_Philippines;}
	public By homePage_button_1GBPlan_ViewDetails() {return homePage_button_1GBPlan_ViewDetails;}
	public By homePage_button_3GBPlan_ViewDetails() {return homePage_button_3GBPlan_ViewDetails;}
	public By homePage_button_6GBPlan_ViewDetails() {return homePage_button_6GBPlan_ViewDetails;}
	public By homePage_button_UnliPlan_ViewDetails() {return homePage_button_UnliPlan_ViewDetails;}
	public By slack_button_SignIn() {return slack_button_SignIn;}
	
	
}
