package TestCases;

import Object_Repository.Mint_PlansCalcuV3_Page;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mint_PlansCalcuV3 {
//	private static final String URL = null;
	public WebDriver driver;
	public WebDriverWait wait;
	Mint_PlansCalcuV3_Page mpc = new Mint_PlansCalcuV3_Page(driver);


  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,10);
//	  driver.manage().window().maximize();

	  
  }
  
  @Test(priority=1)
  public void PC37() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_music())).click();
	  Thread.sleep(2000);
	   WebElement element2 = driver.findElement(By.xpath("//label[contains(text(),'Web Surfing')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "3GB");
  }
  @Test(priority=2)
  public void PC38() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(2000);
	   WebElement element2 = driver.findElement(By.xpath("//label[contains(text(),'Web Surfing')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "8GB");
  }
  @Test(priority=3)
  public void PC39() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_videoChat())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(2000);
	   WebElement element2 = driver.findElement(By.xpath("//label[contains(text(),'Web Surfing')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "12GB");
  }
  @Test(priority=4)
  public void PC40() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_2())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_music())).click();
	  Thread.sleep(5000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "3GB");
  }
  @Test(priority=5)
  public void PC41() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_2())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "8GB");
  }
  @Test(priority=6)
  public void PC42() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_2())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(1000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_videoChat())).click();
	  Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "12GB");
  }
  @Test(priority=7)
  public void PC43() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_3())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_music())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "3GB");
  }
  @Test(priority=8)
  public void PC44() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_3())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "8GB");
  }
  @Test(priority=9)
  public void PC45() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_3())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(1000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_videoChat())).click();
	  Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "12GB");
  }
  @Test(priority=10)
  public void PC46() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_4())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_music())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "3GB");
  }
  @Test(priority=11)
  public void PC47() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_4())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "8GB");
  }
  @Test(priority=12)
  public void PC48() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_4())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_webSurfing())).click();
	  Thread.sleep(1000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_videoChat())).click();
	  Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "12GB");
  }
  @Test(priority=13)
  public void PC73() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_maps())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "UNLIMITED");
  }

  @Test(priority=14)
  public void PC74() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_2())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_maps())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "UNLIMITED");
  }
  @Test(priority=15)
  public void PC75() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_3())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_maps())).click();
	  Thread.sleep(2000);
	   WebElement element4 = driver.findElement(By.xpath("//label[contains(text(),'Gaming')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element4);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "UNLIMITED");
  }
  @Test(priority=16)
  public void PC76() throws InterruptedException {
	  driver.get("https://qa.mintmobile.com/?bc=MM-57");
	  Thread.sleep(1000);
	   WebElement element1 = driver.findElement(By.xpath("//h2[contains(text(),'Keep your current phone or start fresh, it’s up to you.')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	   Thread.sleep(5000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_4())).click();
	  Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCaluc_button_notSure())).click();
	   WebElement element2 = driver.findElement(By.xpath("//input[@id='1']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_gaming())).click();
	  Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansCalcu_maps())).click();
	  Thread.sleep(2000);
	   WebElement element3 = driver.findElement(By.xpath("//label[contains(text(),'Web Surfing')]"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
		  Thread.sleep(1000);
	   WebElement element = driver.findElement(By.xpath("//button[contains(text(),'See My Recommended Plan')]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().perform();
	  String PlanCardText = wait.until(ExpectedConditions.visibilityOfElementLocated(mpc.mint_plansResults_planCard())).getText();
	  Assert.assertEquals(PlanCardText, "UNLIMITED");
  }
  
  
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
