package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mint_Purchases_Page {
	
	WebDriver driver;
	
	public Mint_Purchases_Page(WebDriver driver){
		this.driver=driver;
	}
	By mintHeader_button_Plans = By.xpath("//a[@title='Shop Plans']");
	By mintHeader_dropdown_Phones = By.xpath("//a[contains(text(),'Phones')][1]");
	By mintHeader_button_NewOne = By.xpath("//a[contains(text(),'Buy A New One')]");
	By mintHeader_button_BringYour = By.xpath("//a[contains(text(),'Bring Your Own')]");
	By mintHeader_button_Coverage = By.xpath("//a[contains(text(),'Coverage')][1]");
	By mintHeader_button_How = By.xpath("//a[contains(text(),'How it Works')]");
	By mintHeader_button_Reviews = By.xpath("//a[contains(text(),'Reviews')][1]");
	By mintHeader_dropdown_Help = By.xpath("//a[contains(text(),'Help')]");
	By mintHeader_button_FAQ = By.xpath("//a[contains(text(),'FAQ')][1]");
	By mintHeader_button_ReturnPolicy = By.xpath("//a[contains(text(),'Return Policy')]");
	By mintPlansPage_text = By.xpath("//h2[contains(text(),'Choose your plan'')][1]");
	By mintHeader_button_Blog = By.xpath("//a[contains(text(),'Blog')][1]");
	By mintPhonesPage_text = By.xpath("//h1[contains(text(),'Phones')]");
	By mintBYOPPage_text = By.xpath("//div[contains(text(),'Bring the phone you love to Mint Mobile')]");
	By mintCoveragePage_text = By.xpath("//input[@id='pccSearchButton']");
	By mint_button_RyanAnnouncement = By.xpath("//a[contains(text(),'View Announcement')]");
	By mintFooter__button_Plans = By.xpath("//a[contains(text(),'Plans')])[2]");
	By mintFooter_button_Phones = By.xpath("//a[contains(text(),'Phones')])[3]");
	By mintFooter_button_Coverage = By.xpath("//a[contains(text(),'Coverage')])[2]");
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
	By mintHeader_button_SignIn = By.xpath("//a[contains(text(),'Sign in')]");
	By signInPage_textbox_MSISDN = By.xpath("//input[@id='InputText']");
	By signInPage_button_SignInViaSMS = By.xpath("//a[contains(text(),'SMS a Password to My Device')]");
	By signInPage_textbox_Password = By.xpath("//input[@id='InputTextPassword']");
	By signInPage_button_SignIn = By.xpath("//button[@id='btn-login-submit']");
	By accountManagement_text_MyPlan = By.xpath("//div[contains(text(),'My Plan')]");
	By mintHeader_image_ShoppingCart = By.xpath("//img[@id='qcLink']");
	By mintHeader_button_Activate = By.xpath("//a[contains(text(),'Activate')]");
	By mint_text_ActivateYourSimCard = By.xpath("//h1[contains(text(),'Activate Your SIM Card')]");
	By mintHome_button_3GBPlan_ViewDetails = By.xpath("//a[@data-ecomm='click|3 MONTH, 3GB PLAN – SIM KIT|MINT-SMALL-03|45|Mint Mobile|Plans|1|Plans']");
	By mintHome_button_8GBPlan_ViewDetails = By.xpath("//a[@data-ecomm='click|3 MONTH, 8GB PLAN – SIM KIT|MINT-MEDIUM-03|60|Mint Mobile|Plans|1|Plans']");
	By mintHome_button_12GBPlan_ViewDetails = By.xpath("//a[@data-ecomm='click|3 MONTH, 12GB PLAN – SIM KIT|MINT-LARGE-03|75|Mint Mobile|Plans|1|Plans']");
	By mintHome_button_SeeMorePlans = By.xpath("//span[contains(text(),'See 6 & 12 Month plans +')]");
	By mintHome_dropdown_SeeMorePlans = By.xpath("//h3[contains(text(),'6 Month plans')]");
	By mintHome_button_ViewAllPhones = By.xpath("//a[contains(text(),'View All Phones')]");
	By mintHome_button_iPhone11ProMax = By.xpath("//span[contains(text(),'VIEW DETAILS')])[1]");
	By mintHome_button_iPhone11Pro = By.xpath("//span[contains(text(),'VIEW DETAILS')])[2]");
	By mintHome_button_iPhoneXS = By.xpath("//span[contains(text(),'VIEW DETAILS')])[3]");
	By mintHome_text_3GBPlan_ViewDetails = By.xpath("//div[contains(text(),' 3 MONTH, 3GB PLAN – SIM KIT ')]");
	By mintHome_text_8GBPlan_ViewDetails = By.xpath("//div[contains(text(),' 3 MONTH, 8GB PLAN – SIM KIT ')]");
	By mintHome_text_12GBPlan_ViewDetails = By.xpath("//div[contains(text(),' 3 MONTH, 12GB PLAN – SIM KIT ')]");
	By mintHome_text_iPhone11ProMax = By.xpath("//h1[contains(text(),'Apple iPhone 11 Pro Max')]");
	By mintHome_text_iPhone11Pro = By.xpath("//h1[contains(text(),'Apple iPhone 11 Pro')]");
	By mintHome_text_iPhoneXS = By.xpath("//h1[contains(text(),'Apple iPhone XS')]");
	By mintVF_textbox_ZipCode = By.xpath("//input[@class='RVF-zip-entry initial-zip form-control']");
	By mintVF_button_LetsGo = By.xpath("//button[@data-vf='VFEntry|Homepage'][1]");
	By mint_button_seeAllPhones = By.xpath("//span[contains(text(),'SEE ALL PHONES')]"); public By mint_button_seeAllPhones() {return mint_button_seeAllPhones; }
	By mint_phones_appleIphone11Pro = By.xpath("//img[@alt='Apple iPhone 11 Pro']"); public By mint_phones_appleIphone11Pro() {return mint_phones_appleIphone11Pro; }
	By mint_phones_samsungGalaxyS20Ultra5G = By.xpath("//img[@alt='Samsung Galaxy S20 Ultra 5G']"); public By mint_phones_samsungGalaxyS20Ultra5G() {return mint_phones_samsungGalaxyS20Ultra5G; }
	By mint_phones_googlePixel4XL = By.xpath("//img[@alt='Google Pixel 4 XL']"); public By mint_phones_googlePixel4XL() {return mint_phones_googlePixel4XL; }
	By mint_phones_sonyXperia1 = By.xpath("//img[@alt='Sony Xperia 1']"); public By mint_phones_sonyXperia1() {return mint_phones_sonyXperia1; }
	By mint_phones_motorolaEdge5G = By.xpath("//img[@alt='Motorola Edge 5G']"); public By mint_phones_motorolaEdge5G() {return mint_phones_motorolaEdge5G; }
	By mint_phones_onePlus85G = By.xpath("//img[@alt='OnePlus 8 5G']"); public By mint_phones_onePlus85G() {return mint_phones_onePlus85G; }
	By mint_phones_lGG8ThinkQ = By.xpath("//img[@alt='LG G8 ThinkQ']"); public By mint_phones_lGG8ThinkQ() {return mint_phones_lGG8ThinkQ; }
	By mint_phones_nokia9pureview = By.xpath("//img[@alt='Nokia 9 Pureview']"); public By mint_phones_nokia9pureview() {return mint_phones_nokia9pureview; }
	By mint_phones_motorlaZ4 = By.xpath("//img[@alt='Motorola Z4']"); public By mint_phones_motorlaZ4() {return mint_phones_motorlaZ4; }
	By mint_phones_tcl10Pro = By.xpath("//img[@alt='TCL 10 Pro']"); public By mint_phones_tcl10Pro() {return mint_phones_tcl10Pro; }
	By mint_phones_lgStylo5 = By.xpath("//img[@alt='LG Stylo 5']"); public By mint_phones_lgStylo5() {return mint_phones_lgStylo5; }
	By mint_phones_alcatelJoyTab = By.xpath("//img[@alt='Alcatel Joy Tab']"); public By mint_phones_alcatelJoyTab() {return mint_phones_alcatelJoyTab; }
	By mint_phones_nuuF4lFlipPhone = By.xpath("//img[@alt='NUU F4L Flip Phone']"); public By mint_phones_nuuF4lFlipPhone() {return mint_phones_nuuF4lFlipPhone; }
	By mint_text_phoneDisplay = By.xpath("//h1"); public By mint_text_phoneDisplay() {return mint_text_phoneDisplay; }
	By mint_breadCrumb_phoneDisplay = By.xpath("//div[@id='location']"); public By mint_breadCrumb_phoneDisplay() {return mint_breadCrumb_phoneDisplay; }
	By mint_text_productPrice = By.xpath("//span[@id='product_price']"); public By mint_text_productPrice() {return mint_text_productPrice; }
	By mint_button_quantityUp = By.xpath("//div[contains(text(),'+')]");public By mint_button_quantityUp() {return mint_button_quantityUp; }
	By mint_button_quantityDown = By.xpath("//div[contains(text(),'-')]");public By mint_button_quantityDown() {return mint_button_quantityDown; }	
	By mint_text_quantityNum = By.xpath("(//input[@value='1'])[1]"); public By mint_text_quantityNum() {return mint_text_quantityNum; }	
	By mint_phones_addToCart = By.xpath("//span[contains(text(),'Add to cart')]"); public By mint_phones_addToCart() {return mint_phones_addToCart; }	
	By mint_text_cartProduct = By.xpath("//h4"); public By mint_text_cartProduct() {return mint_text_cartProduct; }
	By mint_text_cartAmount = By.xpath("//div[contains(text(),'You have 3 item(s) in cart.')]"); public By mint_text_cartAmount() {return mint_text_cartAmount; }
	By mint_button_overly = By.xpath("//img[@alt='Close form']"); public By mint_button_overly() {return mint_button_overly; }
	By mint_button_checkout = By.xpath("//span[contains(text(),'Checkout')]"); public By mint_button_checkout() {return mint_button_checkout; }
	By mint_phones_checkout_firstname = By.xpath("//input[@id='b_firstname']"); public By mint_phones_checkout_firstname() {return mint_phones_checkout_firstname; }
	By mint_phones_checkout_lastname = By.xpath("//input[@id='b_lastname']"); public By mint_phones_checkout_lastname() {return mint_phones_checkout_lastname; }
	By mint_phones_checkout_address = By.xpath("//input[@id='b_address']"); public By mint_phones_checkout_address() {return mint_phones_checkout_address; }
	By mint_phones_checkout_address2 = By.xpath("//input[@id='b_address_2']"); public By mint_phones_checkout_address2() {return mint_phones_checkout_address2; }
	By mint_phones_checkout_city = By.xpath("//input[@id='b_city']"); public By mint_phones_checkout_city() {return mint_phones_checkout_city; }
	By mint_phones_checkout_state = By.xpath("//select[@id='address_book_B_state']"); public By mint_phones_checkout_state() {return mint_phones_checkout_state; }
	By mint_phones_state_CA = By.xpath("(//option[@value='CA'])[1]"); public By mint_phones_state_CA() {return mint_phones_state_CA; }
	By mint_phones_checkout_zipcode = By.xpath("//input[@id='b_zipcode']"); public By mint_phones_checkout_zipcode() {return mint_phones_checkout_zipcode; }
	By mint_phones_checkout_phone = By.xpath("//input[@id='b_phone']"); public By mint_phones_checkout_phone() {return mint_phones_checkout_phone; }
	By mint_phones_checkout_email = By.xpath("//input[@id='email']"); public By mint_phones_checkout_email() {return mint_phones_checkout_email; }
	By mint_phones_checkout_pw1 = By.xpath("//input[@id='passwd1']"); public By mint_phones_checkout_pw1() {return mint_phones_checkout_pw1; }
	By mint_phones_checkout_pw2 = By.xpath("//input[@id='passwd2']"); public By mint_phones_checkout_pw2() {return mint_phones_checkout_pw2; }
	By mint_phones_checkout_continue = By.xpath("(//span[contains(text(),'Continue')])[1]"); public By mint_phones_checkout_continue() {return mint_phones_checkout_continue; }
	By mint_phones_checkout_freeShipping = By.xpath("//input[@id='shipping53']"); public By mint_phones_checkout_freeShipping() {return mint_phones_checkout_freeShipping; }
	By mint_phones_checkout_priorityShipping = By.xpath("//input[@id='shipping52']"); public By mint_phones_checkout_priorityShipping() {return mint_phones_checkout_priorityShipping; }
	By mint_phones_checkout_overnightShipping = By.xpath("//input[@id='shipping46']"); public By mint_phones_checkout_overnightShipping() {return mint_phones_checkout_overnightShipping; }
	By mint_phones_checkout_paymentCC = By.xpath("//input[@id='pm61']"); public By mint_phones_checkout_paymentCC() {return mint_phones_checkout_paymentCC; }
	By mint_phones_checkout_paymentPaypal = By.xpath("//input[@id='pm18']"); public By mint_phones_checkout_paymentPaypal() {return mint_phones_checkout_paymentPaypal; }
	By mint_phones_checkout_shippingCurrency = By.xpath("(//span[@class='currency'])[6]"); public By mint_phones_checkout_shippingCurrency() {return mint_phones_checkout_shippingCurrency; }
	By mint_phones_checkout_couponField = By.xpath("//input[@id='coupon']"); public By mint_phones_checkout_couponField() {return mint_phones_checkout_couponField; }
	By mint_phones_checkout_submit = By.xpath("//input[@type='submit']"); public By mint_phones_checkout_submit() {return mint_phones_checkout_submit; }
	By mint_phones_checkout_text_ccPage = By.xpath("//h2"); public By mint_phones_checkout_text_ccPage() {return mint_phones_checkout_text_ccPage; }
	By mint_phone_checkout_emailLogin = By.xpath("//a[contains(text(),'PLEASE CLICK HERE TO LOGIN')]"); public By mint_phone_checkout_emailLogin() {return mint_phone_checkout_emailLogin; }
	By mint_phone_cartIcon = By.xpath("//span[@id='o-primaryNav__cartItems']"); public By mint_phone_cartIcon() {return mint_phone_cartIcon; }
	By mint_phone_proceedToCheckout = By.xpath("//span[contains(text(),'Proceed To Checkout')]"); public By mint_phone_proceedToCheckout() {return mint_phone_proceedToCheckout; }
	By mint_phone_login_email = By.xpath("(//input[@class='input-email'])[1]"); public By mint_phone_login_email() {return mint_phone_login_email; }
	By mint_phone_login_pw = By.xpath("(//input[@id='password'])[1]"); public By mint_phone_login_pw() {return mint_phone_login_pw; }
	By mint_phone_login_button = By.xpath("//span[contains(text(),'Login')]"); public By mint_phone_login_button() {return mint_phone_login_button; }
	By mint_phone_payment_pp = By.xpath("//input[@id='pm18']"); public By mint_phone_payment_pp() {return mint_phone_payment_pp; }
	By mint_phone_paypal_text = By.xpath("//h1[@id='headerText']"); public By mint_phone_paypal_text() {return mint_phone_paypal_text; }
	By mint_plan_BN_3mo3gb = By.xpath("//a[contains(text(),'Buy Now | Total $45')]"); public By mint_plan_BN_3mo3gb() {return mint_plan_BN_3mo3gb; }
	By mint_plan_BN_3mo8gb = By.xpath("//a[contains(text(),'Buy Now | Total $60')]"); public By mint_plan_BN_3mo8gb() {return mint_plan_BN_3mo8gb; }
	By mint_plan_BN_3mo12gb = By.xpath("//a[contains(text(),'Buy Now | Total $75')]"); public By mint_plan_BN_3mo12gb() {return mint_plan_BN_3mo12gb; }
	By mint_plan_BN_3moUnli = By.xpath("//a[contains(text(),'Buy Now | Total $90')]");public By mint_plan_BN_3moUnli() {return mint_plan_BN_3moUnli; }
	By mint_plan_button_viewAllPlans = By.xpath("//p[@class='seeMoreTextPlans']");public By mint_plan_button_viewAllPlans() {return mint_plan_button_viewAllPlans; }
	By mint_plan_BN_6mo3gb = By.xpath("//a[contains(text(),'Buy Now | Total $120')]");public By mint_plan_BN_6mo3gb() {return mint_plan_BN_6mo3gb; }
	By mint_plan_BN_6mo8gb = By.xpath("//a[contains(text(),'Buy Now | Total $150')]");public By mint_plan_BN_6mo8gb() {return mint_plan_BN_6mo8gb; }
	By mint_plan_BN_6mo12gb = By.xpath("(//a[contains(text(),'Buy Now | Total $210')])[1]");public By mint_plan_BN_6mo12gb() {return mint_plan_BN_6mo12gb; }
	By mint_plan_BN_6moUnli = By.xpath("(//a[contains(text(),'Buy Now | Total $210')])[2]");public By mint_plan_BN_6moUnli() {return mint_plan_BN_6moUnli; }
	By mint_plan_BN_12mo3gb = By.xpath("//a[contains(text(),'Buy Now | Total $180')]");public By mint_plan_BN_12mo3gb() {return mint_plan_BN_12mo3gb; }
	By mint_plan_BN_12mo8gb = By.xpath("//a[contains(text(),'Buy Now | Total $240')]");public By mint_plan_BN_12mo8gb() {return mint_plan_BN_12mo8gb; }
	By mint_plan_BN_12mo12gb = By.xpath("//a[contains(text(),'Buy Now | Total $300')]");public By mint_plan_BN_12mo12gb() {return mint_plan_BN_12mo12gb; }
	By mint_plan_BN_12moUnli = By.xpath("//a[contains(text(),'Buy Now | Total $360')]");public By mint_plan_BN_12moUnli() {return mint_plan_BN_12moUnli; }
	
	By mint_plan_SK_3mo3gb = By.xpath("//a[contains(text(),'3 MONTH, 3GB PLAN – SIM KIT')]");public By mint_plan_SK_3mo3gb() {return mint_plan_SK_3mo3gb; }
	By mint_plan_SK_3mo8gb = By.xpath("//a[contains(text(),'3 MONTH, 8GB PLAN – SIM KIT')]");public By mint_plan_SK_3mo8gb() {return mint_plan_SK_3mo8gb; }
	By mint_plan_SK_3mo12gb = By.xpath("//a[contains(text(),'3 MONTH, 12GB PLAN – SIM KIT')]");public By mint_plan_SK_3mo12gb() {return mint_plan_SK_3mo12gb; }
	By mint_plan_SK_3moUnli = By.xpath("//a[contains(text(),'3 MONTH, UNLIMITED PLAN – SIM KIT')]");public By mint_plan_SK_3moUnli() {return mint_plan_SK_3moUnli; }
	By mint_plan_SK_6mo3gb = By.xpath("//a[contains(text(),'6 MONTH, 3GB PLAN – SIM KIT')]");public By mint_plan_SK_6mo3gb() {return mint_plan_SK_6mo3gb; }
	By mint_plan_SK_6mo8gb = By.xpath("//a[contains(text(),'6 MONTH, 8GB PLAN – SIM KIT')]");public By mint_plan_SK_6mo8gb() {return mint_plan_SK_6mo8gb; }
	By mint_plan_SK_6mo12gb = By.xpath("//a[contains(text(),'6 MONTH, 12GB PLAN – SIM KIT')]");public By mint_plan_SK_6mo12gb() {return mint_plan_SK_6mo12gb; }
	By mint_plan_SK_6moUnli = By.xpath("//a[contains(text(),'6 MONTH, UNLIMITED PLAN – SIM KIT')]");public By mint_plan_SK_6moUnli() {return mint_plan_SK_6moUnli; }
	By mint_plan_SK_12mo3gb = By.xpath("//a[contains(text(),'12 MONTH, 3GB PLAN – SIM KIT')]");public By mint_plan_SK_12mo3gb() {return mint_plan_SK_12mo3gb; }
	By mint_plan_SK_12mo8gb = By.xpath("//a[contains(text(),'12 MONTH, 8GB PLAN – SIM KIT')]");public By mint_plan_SK_12mo8gb() {return mint_plan_SK_12mo8gb; }
	By mint_plan_SK_12mo12gb = By.xpath("//a[contains(text(),'12 MONTH, 12GB PLAN – SIM KIT')]");public By mint_plan_SK_12mo12gb() {return mint_plan_SK_12mo12gb; }
	By mint_plan_SK_12moUnli = By.xpath("//a[contains(text(),'12 MONTH, UNLIMITED PLAN – SIM KIT')]");public By mint_plan_SK_12moUnli() {return mint_plan_SK_12moUnli; }
	By mint_plan_QTY_up = By.xpath("//span[@class='plus-button']");public By mint_plan_QTY_up() {return mint_plan_QTY_up; }
	By mint_plan_promoCode = By.xpath("//button[@id='cartPromo']");public By mint_plan_promoCode() {return mint_plan_promoCode; }
	By mint_plan_textField_promoCode = By.xpath("//input[@id='apply_coupon']");public By mint_plan_textField_promoCode() {return mint_plan_textField_promoCode; }
	By mint_plan_button_applyPromoCode = By.xpath("//button[@type='submit']");public By mint_plan_button_applyPromoCode() {return mint_plan_button_applyPromoCode; }
	By mint_plan_promoAmount = By.xpath("//span[contains(text(),'10.00')]");public By mint_plan_promoAmount() {return mint_plan_promoAmount; }
	By mint_plan_button_checkout = By.xpath("//a[@class='a-btn cartCheckoutBtn']");public By mint_plan_button_checkout() {return mint_plan_button_checkout; }
	By mint_plan_button_paypal = By.xpath("//div[@class='paypal-button-label-container']");	public By mint_plan_button_paypal() {return mint_plan_button_paypal; }
	By mint_plan_shipping_firstName = By.xpath("//input[@placeholder='shipping_first_name']"); public By mint_plan_shipping_firstName() {return mint_plan_shipping_firstName; }
	By mint_plan_shipping_lastName = By.xpath("//input[@placeholder='shipping_last_name']"); public By mint_plan_shipping_lastName() {return mint_plan_shipping_lastName; }
	By mint_plan_shipping_email = By.xpath("//input[@placeholder='billing_email']"); public By mint_plan_shipping_email() {return mint_plan_shipping_email; }
	By mint_plan_shipping_address1 = By.xpath("//input[@placeholder='shipping_address_1']"); public By mint_plan_shipping_address1() {return mint_plan_shipping_address1; }
//	By mint_plan_shipping_address2 = By.xpath("//input[@placeholder='shipping_address_2']");
	By mint_plan_shipping_zipcode = By.xpath("//input[@placeholder='shipping_postcode']"); public By mint_plan_shipping_zipcode() {return mint_plan_shipping_zipcode; }
	By mint_plan_shipping_city = By.xpath("//input[@placeholder='shipping_city']"); public By mint_plan_shipping_city() {return mint_plan_shipping_city; }
	By mint_plan_shipping_dropdown_state = By.xpath("(//span[@class='select2-selection__arrow'])[1]"); public By mint_plan_shipping_dropdown_state() {return mint_plan_shipping_dropdown_state; }
	By mint_plan_shipping_textfield_state = By.xpath("//input[@class='select2-search__field']"); public By mint_plan_shipping_textfield_state() {return mint_plan_shipping_textfield_state; }
	By mint_plan_shipping_state_CA = By.xpath("//li[@id='select2-shipping_state-result-vicb-CA'];"); public By mint_plan_shipping_state_CA() {return mint_plan_shipping_state_CA; }
	By mint_plan_shipping_SaveContinue = By.xpath("(//button[contains(text(),'Save & Continue')])[1]"); public By mint_plan_shipping_SaveContinue() {return mint_plan_shipping_SaveContinue; }
	By mint_plan_shipping_SaveContinue2 = By.xpath("(//button[contains(text(),'Save & Continue')])[2]"); public By mint_plan_shipping_SaveContinue2() {return mint_plan_shipping_SaveContinue2; }
	By mint_plan_payment_CC = By.xpath("//button[contains(text(),'Credit/Debit Card')]"); public By mint_plan_payment_CC() {return mint_plan_payment_CC; }
	By mint_plan_textField_CC = By.xpath("//input[@placeholder='Credit Card Number']"); public By mint_plan_textField_CC() {return mint_plan_textField_CC; }
	By mint_plan_CC_expiry_month = By.xpath("//select[@id='litle_expmonth']"); public By mint_plan_CC_expiry_month() {return mint_plan_CC_expiry_month; }
	By mint_plan_CC_expiry_year = By.xpath("//select[@id='litle_expyear']"); public By mint_plan_CC_expiry_year() {return mint_plan_CC_expiry_year; }
	By mint_plan_CC_cvv = By.xpath("//input[@id='litle_cvv']"); public By mint_plan_CC_cvv() {return mint_plan_CC_cvv; }
	By mint_plan_payment_placeOrder = By.xpath("(//button[@type='submit'])[1]"); public By mint_plan_payment_placeOrder() {return mint_plan_payment_placeOrder; }
	By mint_plan_product_purchase = By.xpath("//div[@class='product-name l-checkout__rowName']"); public By mint_plan_product_purchase() {return mint_plan_product_purchase; }
	By mint_plan_product_quantity = By.xpath("//span[@class='product-quantity']"); public By mint_plan_product_quantity() {return mint_plan_product_quantity; }
	By mint_plan_shippingCost = By.xpath("//div[@class='l-checkout__rowContent shipping-cost']"); public By mint_plan_shippingCost() {return mint_plan_shippingCost; }
	By mint_plan_taxesFees = By.xpath("//div[@id='tax_table']"); public By mint_plan_taxesFees() {return mint_plan_taxesFees; }
	By mint_plan_textField_payPal = By.xpath("//input[@id='wc-braintree-paypal-test-amount']"); public By mint_plan_textField_payPal() {return mint_plan_textField_payPal; }
	By mint_plan_button_payPal = By.xpath("//span[@class='paypal-button-text']"); public By mint_plan_button_payPal() {return mint_plan_button_payPal; }
	By mint_plan_textfield_payPal_email = By.xpath("//input[@name='login_email']"); public By mint_plan_textfield_payPal_email() {return mint_plan_textfield_payPal_email; }
	By mint_plan_button_payPal_next = By.xpath("//button[@id='btnNext']"); public By mint_plan_button_payPal_next() {return mint_plan_button_payPal_next; }
	By mint_plan_textfield_payPal_password = By.xpath("//input[@id='password']"); public By mint_plan_textfield_payPal_password() {return mint_plan_textfield_payPal_password; }
	By mint_plan_button_payPal_submit = By.xpath("//button[@type='submit']"); public By mint_plan_button_payPal_submit() {return mint_plan_button_payPal_submit; }
	//agreeandpay as well above
	By mint_plan_button_payPal_continue = By.xpath("//button[@id='fiSubmitButton']"); public By mint_plan_button_payPal_continue() {return mint_plan_button_payPal_continue; }
	
	
	
	
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
	public By mintHome_text_iPhoneXS() {
		return mintHome_text_iPhoneXS;
	}
	public By mintHome_button_iPhoneXS() {
		return mintHome_button_iPhoneXS;
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
