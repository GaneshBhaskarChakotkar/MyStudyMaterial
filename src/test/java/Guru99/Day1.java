package Guru99;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Day1 {
	WebDriver driver;
	
	@Test
	  public void f() {
	  }

	
	
  @Test
  public void TestCase1() throws InterruptedException {
	  driver.findElement(By.name("uid")).sendKeys("UserId");
	  driver.findElement(By.name("password")).sendKeys("Password");
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println(driver.getTitle());	  Thread.sleep(3000);
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alt = driver.switchTo().alert();
	  alt.dismiss();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	  driver.navigate().to("https://www.demo.guru99.com/V4/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 /* driver.findElement(By.name("uid")).sendKeys("UserId");
	  driver.findElement(By.id("password")).sendKeys("Password");
	  driver.findElement(By.name("btnLogin")).submit();
	  System.out.println(driver.getTitle());*/
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();

  }
}
