package TestNgPackage;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class ParallelExecutionDiffBrowser {
	WebDriver driver;
	
	@Test
	  public void test1() {
		  System.out.println("this is from : ParallelExecutionDiffBrowser");
	  }
	
	@Parameters("browser")
	@BeforeTest
	  public void beforeTest(String value) {
		 if(value.equals("edge")) {
		    driver = new EdgeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		 }
		 else if(value.equals("chrome")) {
			    driver = new ChromeDriver();
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
			 }
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(10000);
		  driver.quit();
	  }	  
}
