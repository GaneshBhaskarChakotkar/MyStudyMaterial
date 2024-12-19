package SauceDemoPackage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SauceDemoClass extends ExcelClass{
	WebDriver driver ;
	WebDriverWait wait ;
	 
	
	@Test
	public void demo() {
		
	}
	
	@Test(dataProvider = "DATA")
	public void SauceDemoDataDrivenLoginTest (String un , String ps) {
		  driver.navigate().to("https://www.saucedemo.com");
		  driver.findElement(By.id("user-name")).sendKeys(un);
		  driver.findElement(By.id("password")).sendKeys(ps);
		  driver.findElement(By.id("login-button")).submit();
		  System.out.println(un);
		  System.out.println(ps);
		  Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"fail re baba :-("+"for:"+un);
		  
		}
	
	@DataProvider(name = "DATA")
	public String[][] dp() throws IOException {
		return 	ExcelClass.getExcelClassData();
	}
	
	
	
	
	@Test
	public void AutomateCheckoutProcess() {
		  
		driver.findElement(By.xpath("//div[@class='inventory_list']//div[4]//button[1]")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		
		driver.findElement(By.id("checkout")).click();	
		driver.findElement(By.id("first-name")).sendKeys("Gana");
		driver.findElement(By.id("last-name")).sendKeys("Chakotkar");
		driver.findElement(By.id("postal-code")).sendKeys("431203");
		driver.findElement(By.id("continue")).click();	
		WebElement txt 	=	driver.findElement(By.id("finish"));	
		System.out.println(txt.getText());
		Assert.assertTrue(txt.isDisplayed(),"failed scenario :-(");
		System.out.println("yahoo 3rd also passed :-)");
	 }
	
	@Test
	public void automateLoginFun() {
		  
	      String productsTitle = driver.getTitle();

		Assert.assertEquals(productsTitle,"Swag Labs");
		  System.out.println("everything is fine 1st tc passed of automating login and validating");
	 }
	
	@Test
	public void SauceDemoAddToCartTest () throws InterruptedException {
		  driver.findElement(By.xpath("//div[@class='inventory_list']//div[4]//button[1]")).click();
		  driver.findElement(By.id("shopping_cart_container")).click();
		  WebElement txt = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
		  Assert.assertEquals(txt.getText(),"Sauce Labs Fleece Jacket","fail re baba :-( ");
		  
		//  WebElement productlabel = driver.findElement(By.xpath("//div[@class='product_label']"));
		 /* wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Products']")));
		*/
		  System.out.println("iteam added :-) 2nd tc passed  ");
		  Thread.sleep(3000);
	 }
	
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


    @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	 /* driver.navigate().to("https://www.saucedemo.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).submit();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println(driver.getTitle());*/
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();

  }

}
