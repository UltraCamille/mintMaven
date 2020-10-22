package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mint_PlansCalcuV3_Page {
	
	WebDriver driver;
	
	public Mint_PlansCalcuV3_Page(WebDriver driver){
		this.driver=driver;
	}
	
	By mint_plansCalcu_1 = By.xpath("//input[@id='1']"); public By mint_plansCalcu_1() {return mint_plansCalcu_1;}
	By mint_plansCalcu_2 = By.xpath("//label[@class='PC-Label PC-ToggleButton'][2]"); public By mint_plansCalcu_2() {return mint_plansCalcu_2;}
	By mint_plansCalcu_3 = By.xpath("//label[@class='PC-Label PC-ToggleButton'][3]"); public By mint_plansCalcu_3() {return mint_plansCalcu_3;}
	By mint_plansCalcu_4 = By.xpath("//label[@class='PC-Label PC-ToggleButton'][4]"); public By mint_plansCalcu_4() {return mint_plansCalcu_4;}
	By mint_plansCalcu_4080 = By.xpath("//input[@id='$40-$80']"); public By mint_plansCalcu_4080() {return mint_plansCalcu_4080;}
	By mint_plansCalcu_80120 = By.xpath("//input[@id='$80-$120']"); public By mint_plansCalcu_80120() {return mint_plansCalcu_80120;}
	By mint_plansCalcu_120 = By.xpath("//input[@id='$120+']"); public By mint_plansCalcu_120() {return mint_plansCalcu_120;}
	By mint_plansCalcu_button_seePlan = By.xpath("//button[contains(text(),'See My Recommended Plan')]"); public By mint_plansCalcu_button_seePlan() {return mint_plansCalcu_button_seePlan;}
	By mint_plansCaluc_button_notSure = By.xpath("//p[@class='PC-Bold PC-NotSure PC-Arrow']"); public By mint_plansCaluc_button_notSure() {return mint_plansCaluc_button_notSure;}
	By mint_plansCalcu_webSurfing = By.xpath("//label[contains(text(),'Web Surfing')]"); public By mint_plansCalcu_webSurfing() {return mint_plansCalcu_webSurfing;}
	By mint_plansCalcu_music = By.xpath("//label[contains(text(),'Music')]"); public By mint_plansCalcu_music() {return mint_plansCalcu_music;}
	By mint_plansCalcu_socialMedia = By.xpath("//label[contains(text(),'Social Media')]"); public By mint_plansCalcu_socialMedia() {return mint_plansCalcu_socialMedia;}
	By mint_plansCalcu_youTube = By.xpath("//label[contains(text(),'Youtube')]"); public By mint_plansCalcu_youTube() {return mint_plansCalcu_youTube;}
	By mint_plansCalcu_maps = By.xpath("//label[contains(text(),'Maps')]"); public By mint_plansCalcu_maps() {return mint_plansCalcu_maps;}
	By mint_plansCalcu_gaming = By.xpath("//label[contains(text(),'Gaming')]"); public By mint_plansCalcu_gaming() {return mint_plansCalcu_gaming;}
	By mint_plansCalcu_videoChat = By.xpath("//label[contains(text(),'Video Chat')]"); public By mint_plansCalcu_videoChat() {return mint_plansCalcu_videoChat;}
	By mint_plansCalcu_moviesTv = By.xpath("//label[contains(text(),'Movies/TV')]"); public By mint_plansCalcu_moviesTv() {return mint_plansCalcu_moviesTv;}
	By mint_plansResults_text = By.xpath("//h1[@class='heroHeader--coverage']"); public By mint_plansResults_text() {return mint_plansResults_text;}
	By mint_plansResults_subhead = By.xpath("//p[@class='PC-subHeader subHeader']"); public By mint_plansResults_subhead() {return mint_plansResults_subhead;}
	By mint_plansResults_planCard = By.xpath("//span[@class='priceGB PC-priceGB']"); public By mint_plansResults_planCard() {return mint_plansResults_planCard;}
	

	
}
