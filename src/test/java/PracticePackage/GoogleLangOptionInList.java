package PracticePackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class GoogleLangOptionInList {
	WebDriver driver;
  @Test
  public void f4() {
  }
  
  @Test
  public void f3() {
  }
  
  
  @Test
  public void f2() {
  }
  
  @Test
  public void f1() {
	/*	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SIvCob']")));
		*/
		 List<WebElement> list = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		 for(WebElement i : list) {
			 System.out.println(i.getText());
			 }	
  }
  @BeforeTest
  public void beforeTest() {
		
	  driver = new EdgeDriver();
	 // driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.getTitle();
	  driver.get("https://google.com");
	 	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
