package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mint_homepage_Page {
	
	WebDriver driver;
	
	public Mint_homepage_Page(WebDriver driver){
		this.driver=driver;
	}
	By mintHeader_button_Plans = By.xpath("//a[@title='Shop Plans']");
	By mintHeader_dropdown_Phones = By.xpath("(//a[contains(text(),'Phones')])[1]");
	By mintHeader_button_NewOne = By.xpath("//a[contains(text(),'Buy A New One')]");
	By mintHeader_button_BringYour = By.xpath("//a[contains(text(),'Bring Your Own')]");
	By mintHeader_button_Coverage = By.xpath("//a[contains(text(),'Coverage')][1]");
	By mintHeader_button_How = By.xpath("(//a[contains(text(),'How it Works')])[1]");
	By mintHeader_text_How = By.xpath("//h1[contains(text(),'So easy')]");
	By mintHeader_button_Reviews = By.xpath("//a[contains(text(),'Reviews')][1]");
	By mintHeader_text_Reviews = By.xpath("//h2[contains(text(),'ARE OUT TONIGHT')]");
	By mintHeader_dropdown_Help = By.xpath("//a[contains(text(),'Help')]");
	By mintHeader_button_FAQ = By.xpath("//a[contains(text(),'FAQ')][1]");
	By mintHeader_button_ReturnPolicy = By.xpath("//a[contains(text(),'Return Policy')]");
	By mintPlansPage_text = By.xpath("(//h2[@class='heroHeader--coverage'])[1]");
	By mintHeader_button_Blog = By.xpath("//a[contains(text(),'Blog')][1]");
	By mintPhonesPage_text = By.xpath("//span[contains(text(),'Featured Products')]");
	By mintBYOPPage_text = By.xpath("//div[contains(text(),'Bring the phone you love to Mint Mobile')]");
	By mintCoveragePage_text = By.xpath("//a[@id='coverage-compatibility']");
	By mint_button_RyanAnnouncement = By.xpath("//a[contains(text(),'View Announcement')]");
	By mintFooter__button_Plans = By.xpath("//a[contains(text(),'Plans')])[2]");
	By mintFooter_button_Phones = By.xpath("//a[contains(text(),'Phones')])[3]");
	By mintFooter_button_Coverage = By.xpath("//a[contains(text(),'Coverage')])[1]");
	By mintFooter_button_BYOP = By.xpath("//a[contains(text(),'Bring Your Own Phone')]");
	By mintFooter_button_INTL = By.xpath("//a[contains(text(),'International Calling')]");
	By mintFooter_button_WFC = By.xpath("//a[contains(text(),'WiFi Calling & Text')]");
	By mintFooter_button_Who = By.xpath("//a[contains(text(),'Who We Are')]");
	By mintFooter_button_Reviews = By.xpath("//a[contains(text(),'Reviews')])[2]");
	By mintFooter_button_Ryan = By.xpath("//a[contains(text(),'Ryan Reynolds')]");
	By mintFooter_button_Press = By.xpath("//a[contains(text(),'Press')]");
	By mintFooter_button_RAF = By.xpath("//a[contains(text(),'Refer A Friend')]");
	By mintFooter_button_Partner = By.xpath("//a[contains(text(),'Become A Partner')]");
	By mintFooter_button_Blog = By.xpath("//a[contains(text(),'Blog')])[2]");
	By mintFooter_button_FAQ = By.xpath("//a[contains(text(),'FAQ')])[2]");
	By mintFooter_button_ReturnPolicy = By.xpath("//a[contains(text(),'Return Policy')])[2]");
	By mintFooter_button_Community = By.xpath("//a[contains(text(),'Community')]");
	By mintFooter_button_UnlockPolicy = By.xpath("//a[contains(text(),'Unlock Policy')])[1]");
	By mintBorder_button_TandC = By.xpath("//a[contains(text(),'Plan Terms & Conditions')]");
	By mintBorder_button_PrivacyPolicy = By.xpath("//a[contains(text(),'Privacy Policy')]");
	By mintBorder_button_ReturnPolicy = By.xpath("//a[contains(text(),'Return Policy')])[3]");
	By mintBorder_button_UsePolicy = By.xpath("//a[contains(text(),'Acceptable Use Policy')]");
	By mintBorder_button_TermsofUse = By.xpath("//a[contains(text(),'Site Terms of Use')]");
	By mintBorder_button_UnlockPolicy = By.xpath("//a[contains(text(),'Unlock Policy')])[2]");
	By mintBorder_button_911E911 = By.xpath("//a[contains(text(),'911 & E911 Disclosure')]");
	By mintBorder_button_Surcharge = By.xpath("//a[contains(text(),'Changes to California Prepaid MTS Surcharge')]");
	By mintBorder_button_SiteMap = By.xpath("//a[contains(text(),'Sitemap')]");
	By mintDismiss = By.xpath("//button[contains(text(),'Dismiss')]");
//	By gmailEmailInput = By.xpath("//*[@aria-label='Email or phone']");
//	By gmailEmailNext = By.xpath("//span[contains(text(),'Next')]");
//	By gmailPasswordInput = By.xpath("//*[@aria-label='Enter your password']");
//	By gmailEmailCompose = By.xpath("//div[contains(text(),'Compose')]");
//	By gmailEmailSubject = By.xpath("//input[@placeholder='Subject']");
//	By gmailEmailAttachFile = By.xpath("//div[contains(@class, 'a1 aaA aMZ')]");
//	By gmailEmailRecipient = By.xpath(".//textarea[contains(@aria-label, 'To')]");
	By mintHeader_button_SignIn = By.xpath("(//a[@title='Log In'])[1]");
	By signInPage_textbox_MSISDN = By.xpath("//input[@placeholder='Phone Number']");
	By signInPage_button_SignInViaSMS = By.xpath("//a[contains(text(),'SMS a Password to My Device')]");
	By signInPage_textbox_Password = By.xpath("//input[@id='InputTextPassword']");
	By signInPage_button_SignIn = By.xpath("//button[@id='btn-login-submit']");
	By accountManagement_text_MyPlan = By.xpath("//div[contains(text(),'My Plan')]");
	By mintHeader_image_ShoppingCart = By.xpath("//img[@id='qcLink']");
	By mintHeader_button_Activate = By.xpath("//a[contains(text(),'Activate')]");
	By mint_text_ActivateYourSimCard = By.xpath("//h1[contains(text(),'Activate Your SIM Card')]");
	By mintHome_button_3GBPlan_ViewDetails = By.xpath("(//a[contains(text(),'View details')])[1]");
	By mintHome_button_8GBPlan_ViewDetails = By.xpath("(//a[contains(text(),'View details')])[2]");
	By mintHome_button_12GBPlan_ViewDetails = By.xpath("(//a[contains(text(),'View details')])[3]");
	By mintHome_button_SeeMorePlans = By.xpath("//span[contains(text(),'See 6 & 12 Month plans +')]");
	By mintHome_dropdown_SeeMorePlans = By.xpath("(//h3[contains(text(),'6 Month plans')])[2]");
	By mintHome_button_ViewAllPhones = By.xpath("//a[contains(text(),'View All Phones')]");
	By mintHome_button_iPhone11ProMax = By.xpath("(//span[contains(text(),'VIEW DETAILS')])[1]");
	By mintHome_button_iPhone11Pro = By.xpath("(//span[contains(text(),'VIEW DETAILS')])[2]");
	By mintHome_button_iPhone11 = By.xpath("(//span[contains(text(),'VIEW DETAILS')])[3]");
	By mintHome_text_3GBPlan_ViewDetails = By.xpath("(//div[contains(text(),' 3 MONTH, 3GB PLAN – SIM KIT ')])[2]");
	By mintHome_text_8GBPlan_ViewDetails = By.xpath("(//div[contains(text(),' 3 MONTH, 8GB PLAN – SIM KIT ')])[2]");
	By mintHome_text_12GBPlan_ViewDetails = By.xpath("(//div[contains(text(),' 3 MONTH, 12GB PLAN – SIM KIT ')])[2]");
	By mintHome_text_iPhone11ProMax = By.xpath("//h1[contains(text(),'Apple iPhone 11 Pro Max')]");
	By mintHome_text_iPhone11Pro = By.xpath("//h1[contains(text(),'Apple iPhone 11 Pro')]");
	By mintHome_text_iPhone11 = By.xpath("//h1[contains(text(),'Apple iPhone 11')]");
	By mintVF_textbox_ZipCode = By.xpath("//input[@class='RVF-zip-entry initial-zip form-control']");
	By mintVF_button_LetsGo = By.xpath("(//button[@type='submit'])[1]");
	By mintHome_textbox_Calculator = By.xpath("(//input[@type='number'])[1]");
	By mintHome_dropdown_Calculator = By.xpath("(//button[@id='dropdownMenu1'])[1]");
	By mintHome_dropdown_03GBCalculator = By.xpath("//a[@data-value='3']");
	By mintHome_button_Calculator = By.xpath("//a[@title='Get Started!']");
	By mintFAQ_textbox_AskQuestion = By.xpath("//input[@placeholder='Ask a Question']");
	By mintAM_button_MakeAPayment = By.xpath("(//button[@type='submit'])[1]"); public By mintAM_button_MakeAPayment() {return mintAM_button_MakeAPayment;}
	By mintAM_button_DataCheck = By.xpath("//button[@id='CheckData']"); 	public By mintAM_button_DataCheck() {return mintAM_button_DataCheck;}
	By mintAM_button_INTLRoamingCreditCheck = By.xpath("//button[@id='CheckRoam']"); public By mintAM_button_INTLRoamingCreditCheck() {return mintAM_button_INTLRoamingCreditCheck;}
	By mintAM_text_roamBalance = By.xpath("//span[@id='roamBalance']"); public By mintAM_text_roamBalance() {return mintAM_text_roamBalance;}
	By mintAM_text_4GData = By.xpath("//span[@id='4GData']"); public By mintAM_text_4GData() {return mintAM_text_4GData;}
	By mintAM_button_ManagePlan = By.xpath("//a[@id='ManagePlan']"); public By mintAM_button_ManagePlan() {return mintAM_button_ManagePlan;}
	By mintAM_button_Home = By.xpath("//a[@id='Home']"); public By mintAM_button_Home() {return mintAM_button_Home;}
	By mintAM_button_UpData = By.xpath("//a[@id='UpData']"); public By mintAM_button_UpData() {return mintAM_button_UpData;}
	By mintAM_button_UpRoam = By.xpath("//a[@id='UpRoam']"); public By mintAM_button_UpRoam() {return mintAM_button_UpRoam;}
	By mintAM_button_AutoRenew = By.xpath("//a[@id='AutoRecharge']"); public By mintAM_button_AutoRenew() {return mintAM_button_AutoRenew;}
	By mintAM_button_LoadWallet = By.xpath("//a[@id='LoadWallet']"); public By mintAM_button_LoadWallet() {return mintAM_button_LoadWallet;}
	By mintAM_button_BillingInfo = By.xpath("//a[@id='Billing']"); public By mintAM_button_BillingInfo() {return mintAM_button_BillingInfo;}
	By mintAM_button_WFC = By.xpath("//a[@id='WifiCalling']"); public By mintAM_button_WFC() {return mintAM_button_WFC;}
	By mintAM_button_ReferAFriend = By.xpath("//a[@id='ReferAFriend']"); public By mintAM_button_ReferAFriend() {return mintAM_button_ReferAFriend;}
	By mintAM_button_TransactionHistory = By.xpath("//a[@id='TransactionHistory']"); public By mintAM_button_TransactionHistory() {return mintAM_button_TransactionHistory;}
	By mintAM_button_INTLCallHistory = By.xpath("//a[@id='INTLCallHistory']"); public By mintAM_button_INTLCallHistory() {return mintAM_button_INTLCallHistory;}
	By mintAM_button_Preferences = By.xpath("//a[@id='Preferences']"); public By mintAM_button_Preferences() {return mintAM_button_Preferences;}
	By mintAM_button_PersonalInfo = By.xpath("//a[@id='Info']"); public By mintAM_button_PersonalInfo() {return mintAM_button_PersonalInfo;}
	By mintAM_button_OrderReplacementSIM = By.xpath("//a[@id='OrderReplacementSIM']"); public By mintAM_button_OrderReplacementSIM() {return mintAM_button_OrderReplacementSIM;}
	By mintAM_button_ActivateReplacementSIM = By.xpath("//a[@id='ActivateReplacementSIM']"); public By mintAM_button_ActivateReplacementSIM() {return mintAM_button_ActivateReplacementSIM;}
	By mintAM_button_LogOut = By.xpath("//a[@id='LogOut']"); public By mintAM_button_LogOut() {return mintAM_button_LogOut;}
	By mintAM_button_RenewNow = By.xpath("(//p[contains(text(),'Renew Now')])[1]"); public By mintAM_button_RenewNow() {return mintAM_button_RenewNow;}
	By mintAM_button_Forum = By.xpath("(//p[contains(text(),'Forum')])[1]"); public By mintAM_button_Forum() {return mintAM_button_Forum;}
	By mintAM_plan_3mo3gb = By.xpath("(//span[contains(text(),'TOTAL $75')])[1]"); public By mintAM_plan_3mo3gb() {return mintAM_plan_3mo3gb;}
	By mintAM_plan_3mo8gb = By.xpath("(//span[contains(text(),'TOTAL $105')])[1]"); public By mintAM_plan_3mo8gb() {return mintAM_plan_3mo8gb;}
	By mintAM_plan_3mo12gb = By.xpath("(//span[contains(text(),'TOTAL $135')])[1]"); public By mintAM_plan_3mo12gb() {return mintAM_plan_3mo12gb;}
	By mintAM_plan_6mo3gb = By.xpath("(//span[contains(text(),'TOTAL $120')])[1]"); public By mintAM_plan_6mo3gb() {return mintAM_plan_6mo3gb;}
	By mintAM_plan_6mo8gb = By.xpath("(//span[contains(text(),'TOTAL $150')])[1]"); public By mintAM_plan_6mo8gb() {return mintAM_plan_6mo8gb;}
	By mintAM_plan_6mo12gb = By.xpath("(//span[contains(text(),'TOTAL $210')])[1]"); public By mintAM_plan_6mo12gb() {return mintAM_plan_6mo12gb;}
	By mintAM_plan_12mo3gb = By.xpath("(//span[contains(text(),'TOTAL $180')])[1]"); public By mintAM_plan_12mo3gb() {return mintAM_plan_12mo3gb;}
	By mintAM_plan_12mo8gb = By.xpath("(//span[contains(text(),'TOTAL $240')])[1]"); public By mintAM_plan_12mo8gb() {return mintAM_plan_12mo8gb;}
	By mintAM_plan_12mo12gb = By.xpath("(//span[contains(text(),'TOTAL $300')])[1]"); public By mintAM_plan_12mo12gb() {return mintAM_plan_12mo12gb;}
	By mintAM_checkbox_AR = By.xpath("(//div/label[@id='AutoRecharge_Enable Auto Renew'])"); public By mintAM_checkbox_AR() {return mintAM_checkbox_AR;}
	By mintAM_button_SetasNextPlan = By.xpath("(//div/button[@id='SetNextBtn'])"); public By mintAM_button_SetasNextPlan() {return mintAM_button_SetasNextPlan;}
	By mintAM_button_SwitchImmediately = By.xpath("(//div/button[@id='ImmediateBtn'])"); public By mintAM_button_SwitchImmediately() {return mintAM_button_SwitchImmediately;}
	By mintAM_button_Updata1gb = By.xpath("//button[@id='47']"); public By mintAM_button_Updata1gb() {return mintAM_button_Updata1gb;}
	By mintAM_button_Updata3gb = By.xpath("//button[@id='48']"); public By mintAM_button_Updata3gb() {return mintAM_button_Updata3gb;}
	By mintAM_button_INTL$5 = By.xpath("(//td/button[@id='74'])"); public By mintAM_button_INTL$5() {return mintAM_button_INTL$5;}
	By mintAM_button_INTL$10 = By.xpath("(//td/button[@id='75'])"); public By mintAM_button_INTL$10() {return mintAM_button_INTL$10;}
	By mintAM_button_INTL$20 = By.xpath("(//td/button[@id='76'])"); public By mintAM_button_INTL$20() {return mintAM_button_INTL$20;}
	By mintAM_switch_AROn = By.xpath("(//div/label[@id='autoRecharge_true'])"); public By mintAM_switch_AROn() {return mintAM_switch_AROn;}
	By mintAM_switch_AROff = By.xpath("(//div/label[@id='autoRecharge_false'])"); public By mintAM_switch_AROff() {return mintAM_switch_AROff;}
	By mintAM_button_wallet$5 = By.xpath("(//div/button[@id='5'])"); public By mintAM_button_wallet$5() {return mintAM_button_wallet$5;}
	By mintAM_button_wallet$10 = By.xpath("(//div/button[@id='10'])"); public By mintAM_button_wallet$10() {return mintAM_button_wallet$10;}
	By mintAM_button_wallet$20 = By.xpath("(//div/button[@id='20'])"); public By mintAM_button_wallet$20() {return mintAM_button_wallet$20;}
	By mintAM_button_ChangeCCInfo = By.xpath("(//div/button[@id='toggleButton'])"); public By mintAM_button_ChangeCCInfo() {return mintAM_button_ChangeCCInfo;}
	By mintAM_button_RemoveCCInfo = By.xpath("(//div/button[@id='RemoveButton'])"); public By mintAM_button_RemoveCCInfo() {return mintAM_button_RemoveCCInfo;}
	By mintAM_switch_WFCenable = By.xpath("(//div/label[@id='WifiCalling_true'])"); public By mintAM_switch_WFCenable() {return mintAM_switch_WFCenable;}
	By mintAM_switch_WFCdisable = By.xpath("(//div/label[@id='WifiCalling_false'])");  public By mintAM_switch_WFCdisable() {return mintAM_switch_WFCdisable;}
	By mintAM_text_suspendError = By.xpath("//div[@id='InputError']"); public By mintAM_text_suspendError() {return mintAM_text_suspendError;}
	By mintAM_button_Reactivate = By.xpath("//div/a[@id='Reactivate']"); public By mintAM_button_Reactivate() {return mintAM_button_Reactivate;}
	By mintAM_button_proceedToRenew = By.xpath("//div/button[@id='SetNextBtn']"); public By mintAM_button_proceedToRenew() {return mintAM_button_proceedToRenew;}
	By mintAM_button_paymentMethodCC = By.xpath("//div/label[@id='PaymentMethod_cc']"); public By mintAM_button_paymentMethodCC() {return mintAM_button_paymentMethodCC;}
	By mintAM_button_paymentMethodWallet = By.xpath("//div/label[@id='PaymentMethod_wallet']"); public By mintAM_button_paymentMethodWallet() {return mintAM_button_paymentMethodWallet;}
	By mintAM_button_purchaseNow = By.xpath("//button[contains(text(),'Purchase Now')]"); public By mintAM_button_purchaseNow() {return mintAM_button_purchaseNow;}
	By mintAM_amount_data = By.xpath("//div/span[@id='4GData']");	public By mintAM_amount_data() {return mintAM_amount_data;}
	By mintAM_amount_roam = By.xpath("//div/span[@id='roamBalance']");	public By mintAM_amount_roam() {return mintAM_amount_roam;}
	By mintAM_amount_wallet = By.xpath("//span[@id='walletNum']");	public By mintAM_amount_wallet() {return mintAM_amount_wallet;}
	By mintAM_checkbox_terms = By.xpath("//label[@id='terms_I agree to the Site Terms of Use']"); public By mintAM_checkbox_terms() {return mintAM_checkbox_terms;}
	By mintAM_button_submit = By.xpath("//button[@type='submit']"); public By mintAM_button_submit() {return mintAM_button_submit;}
	By mintAM_textbox_firstName = By.xpath("//input[@id='InputFirstName']"); public By mintAM_textbox_firstName() {return mintAM_textbox_firstName;}
	By mintAM_textbox_lastName = By.xpath("//input[@id='InputLastName']"); public By mintAM_textbox_lastName() {return mintAM_textbox_lastName;}	 
	By mintAM_textbox_email = By.xpath("//input[@id='InputTextEmail']"); public By mintAM_textbox_email() {return mintAM_textbox_email;}	 
	By mintAM_textbox_password = By.xpath("//input[@id='InputGroupPassword']"); public By mintAM_textbox_password() {return mintAM_textbox_password;}
	By mintAM_textbox_passwordConfirm = By.xpath("//input[@id='InputGroupPasswordConfirm']"); public By mintAM_textbox_passwordConfirm() {return mintAM_textbox_passwordConfirm;}
	By mintAM_promo_emails = By.xpath("//label[@id='promotional_Emails']"); public By mintAM_promo_emails() {return mintAM_promo_emails;}
	By mintAM_promo_SMS = By.xpath("//label[@id='promotional_SMS']"); public By mintAM_promo_SMS() {return mintAM_promo_SMS;}
	By mintAM_promo_phoneCalls = By.xpath("//label[@id='promotional_Phone Calls']"); public By mintAM_promo_phoneCalls() {return mintAM_promo_phoneCalls;}
	By mintAM_text_purchaseConfirmation = By.xpath("//a[contains(text(),'Return to Account Summary')]");  public By mintAM_text_purchaseConfirmation() {return mintAM_text_purchaseConfirmation;}


	
	public By mintFAQ_textbox_AskQuestion() {
		return mintFAQ_textbox_AskQuestion;
	}
	public By mintHeader_text_Reviews() {
		return mintHeader_text_Reviews;
	}
	public By mintHeader_text_How() {
		return mintHeader_text_How;
	}
	
	public By mintHome_button_Calculator() {
		return mintHome_button_Calculator;
	}
	public By mintHome_dropdown_03GBCalculator() {
		return mintHome_dropdown_03GBCalculator;
	}
	public By mintHome_dropdown_Calculator() {
		return mintHome_dropdown_Calculator;
	}
	public By mintHome_textbox_Calculator() {
		return mintHome_textbox_Calculator;
	}
	//---------
	By mint_textbox_INTL = By.xpath("//input[@placeholder='Enter Country']");
	public By mint_textbox_INTL() {
		return mint_textbox_INTL;
	}
	//--------
	public By mintVF_textbox_ZipCode() {
		return mintVF_textbox_ZipCode;
	}
	public By mintVF_button_LetsGo() {
		return mintVF_button_LetsGo;
	}
	public By mintHome_text_3GBPlan_ViewDetails() {
		return mintHome_text_3GBPlan_ViewDetails;
	}
	public By mintHome_text_8GBPlan_ViewDetails() {
		return mintHome_text_8GBPlan_ViewDetails;
	}
	public By mintHome_text_12GBPlan_ViewDetails() {
		return mintHome_text_12GBPlan_ViewDetails;
	}
	public By mintHome_text_iPhone11ProMax() {
		return mintHome_text_iPhone11ProMax;
	}
	public By mintHome_text_iPhone11Pro() {
		return mintHome_text_iPhone11Pro;
	}
	public By mintHome_text_iPhone11() {
		return mintHome_text_iPhone11;
	}
	public By mintHome_button_iPhone11() {
		return mintHome_button_iPhone11;
	}
	public By mintHome_button_iPhone11Pro() {
		return mintHome_button_iPhone11Pro;
	}
	public By mintHome_button_iPhone11ProMax() {
		return mintHome_button_iPhone11ProMax;
	}
	public By mintHome_button_ViewAllPhones() {
		return mintHome_button_ViewAllPhones;
	}
	public By mintHome_dropdown_SeeMorePlans() {
		return mintHome_dropdown_SeeMorePlans;
	}
	public By mintHome_button_SeeMorePlans() {
		return mintHome_button_SeeMorePlans;
	}
	public By mintHome_button_12GBPlan_ViewDetails() {
		return mintHome_button_12GBPlan_ViewDetails;
	}
	public By mintHome_button_8GBPlan_ViewDetails() {
		return mintHome_button_8GBPlan_ViewDetails;
	}
	public By mintHome_button_3GBPlan_ViewDetails() {
		return mintHome_button_3GBPlan_ViewDetails;
	}
	public By mint_text_ActivateYourSimCard() {
		return mint_text_ActivateYourSimCard;
	}
	public By mintHeader_button_Activate() {
		return mintHeader_button_Activate;
	}
	public By mintHeader_image_ShoppingCart() {
		return mintHeader_image_ShoppingCart;
	}
	public By accountManagement_text_MyPlan() {
		return accountManagement_text_MyPlan;
	}
	public By mintHeader_button_SignIn() {
		return mintHeader_button_SignIn;
	}
	public By signInPage_textbox_MSISDN() {
		return signInPage_textbox_MSISDN;
	}
	public By signInPage_button_SignInViaSMS() {
		return signInPage_button_SignInViaSMS;
	}
	public By signInPage_textbox_Password() {
		return signInPage_textbox_Password;
	}
	public By signInPage_button_SignIn() {
		return signInPage_button_SignIn;
	}
//	public By mintFooter_button_Reviews() {
//		return mintFooter_button_Reviews;
//	}
//	public By gmailEmailRecipient() {
//		return gmailEmailRecipient;
//	}
//	public By gmailEmailNext() {
//		return gmailEmailNext;
//	}
//	public By gmailPasswordInput() {
//		return gmailPasswordInput;
//	}
//	public By gmailEmailCompose() {
//		return gmailEmailCompose;
//	}
//	public By gmailEmailSubject() {
//		return gmailEmailSubject;
//	}
//	public By gmailEmailAttachFile() {
//		return gmailEmailAttachFile;
//	}
//	public By gmailEmailInput() {
//		return gmailEmailInput;
//	}
	public By mintDismiss() {
		return mintDismiss;
	}
	public By mintFooter_button_Ryan() {
		return mintFooter_button_Ryan;
	}
	public By mintFooter_button_Press() {
		return mintFooter_button_Press;
	}
	public By mintFooter_button_RAF() {
		return mintFooter_button_RAF;
	}
	public By mintFooter_button_Partner() {
		return mintFooter_button_Partner;
	}
	public By mintFooter_button_Blog() {
		return mintFooter_button_Blog;
	}
	public By mintFooter_button_FAQ() {
		return mintFooter_button_FAQ;
	}
	public By mintFooter_button_ReturnPolicy() {
		return mintFooter_button_ReturnPolicy;
	}
	public By mintFooter_button_Community() {
		return mintFooter_button_Community;
	}
	public By mintFooter_button_UnlockPolicy() {
		return mintFooter_button_UnlockPolicy;
	}
	public By mintBorder_button_TandC() {
		return mintBorder_button_TandC;
	}
	public By mintBorder_button_PrivacyPolicy() {
		return mintBorder_button_PrivacyPolicy;
	}
	public By mintBorder_button_ReturnPolicy() {
		return mintBorder_button_ReturnPolicy;
	}
	public By mintBorder_button_UsePolicy() {
		return mintBorder_button_UsePolicy;
	}
	public By mintBorder_button_TermsofUse() {
		return mintBorder_button_TermsofUse;
	}
	public By mintBorder_button_UnlockPolicy() {
		return mintBorder_button_UnlockPolicy;
	}
	public By mintBorder_button_911E911() {
		return mintBorder_button_911E911;
	}
	public By mintBorder_button_Surcharge() {
		return mintBorder_button_Surcharge;
	}
	public By mintBorder_button_SiteMap() {
		return mintBorder_button_SiteMap;
	}
	//---
	public By mintFooter_button_Who() {
		return mintFooter_button_Who;
	}
	public By mintFooter_button_INTL() {
		return mintFooter_button_INTL;
	}
	public By mintFooter_button_BYOP() {
		return mintFooter_button_BYOP;
	}
	public By mintFooter_button_Coverage() {
		return mintFooter_button_Coverage;
	}
	public By mintFooter_button_Phones() {
		return mintFooter_button_Phones;
	}
	public By mintFooter__button_Plans() {
		return mintFooter__button_Plans;
	}	
	public By mint_button_RyanAnnouncement() {
		return mint_button_RyanAnnouncement;
	}
	
	public By mintPlansPage_text() {
		return mintPlansPage_text;
	}
	public By mintCoveragePage_text() {
		return mintCoveragePage_text;
	}
	public By mintBYOPPage_text() {
		return mintBYOPPage_text;
	}
	public By mintPhonesPage_text() {
		return mintPhonesPage_text;
	}
	public By mintHeader_button_Blog() {
		return mintHeader_button_Blog;
	}
	public By mintHeader_button_ReturnPolicy() {
		return mintHeader_button_ReturnPolicy;
	}
	public By mintHeader_button_FAQ() {
		return mintHeader_button_FAQ;
	}
	public By mintHeader_dropdown_Help() {
		return mintHeader_dropdown_Help;
	}
	public By mintHeader_button_Reviews() {
		return mintHeader_button_Reviews;
	}
	public By mintHeader_button_How() {
		return mintHeader_button_How;
	}
	public By mintHeader_button_Coverage() {
		return mintHeader_button_Coverage;
	}
	public By mintHeader_button_BringYour() {
		return mintHeader_button_BringYour;
	}
	
	public By mintHeader_button_NewOne() {
		return mintHeader_button_NewOne;
	}
	
	public By mintHeader_button_Plans() {
		return mintHeader_button_Plans;
	}
	public By mintHeader_dropdown_Phones() {
		return mintHeader_dropdown_Phones;
	}
	
}
