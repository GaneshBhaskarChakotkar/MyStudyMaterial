package PracticePackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.TakesScreenshot;
import org.apache.maven.surefire.shared.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleHomepage {
	WebDriver driver;
	
	@Test
	public void t14_() {
		//a[@class='gb_A'][@aria-label='Google apps']
	}
	@Test
	public void t13_() {
		//a[@class='gb_A'][@aria-label='Google apps']
	}
	@Test
	public void t12_() {
		//a[@class='gb_A'][@aria-label='Google apps']
	}
	@Test
	public void t11_() {
		
	}
	@Test
	public void t10_() {
		System.out.println("15. Selecting a Specific Date Range in Google Search");
		driver.findElement(By.xpath("//a[@class='gb_A'][@aria-label='Google apps']")).click();
        WebElement cal = driver.findElement(By.xpath("//li[@class='j1ei8c'][13]"));
		System.out.println(cal.getText());
		cal.click();
	}

	
	@Test
	public void t9_() throws InterruptedException {	//btnI
		System.out.println("interact with feeling lucky button");
		String currTitle = driver.getTitle();
		System.out.println(currTitle);
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[2]")).click();
		System.out.println(driver.getTitle());

		Assert.assertNotEquals(driver.getTitle(), currTitle);


		
	}

	@Test
	public void t8_() throws IOException {
		String logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).getAttribute("alt");
		System.out.println(logo);
		assertTrue(logo.equalsIgnoreCase("google"),"this is missmatches in logo");
		}

	
	@Test
	public void t7_() throws IOException {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		System.out.println("To take a screenshot of the search results page:");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("djalok");
		ele.submit();
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("C:\\Users\\LENOVO\\Desktop\\NotesMyInterveiw prep\\screenshotDjAlok"+timestamp+".jpeg"));
		
		
	}

	
	@Test
	public void t6_() throws InterruptedException {
		System.out.println("10. Verifying Footer Links");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		
		
	}
	
	@Test
	public void t5_() {//dummyCode

		        WebElement searchBox = driver.findElement(By.name("q"));
		        searchBox.sendKeys("Selenium WebDriver");
		        searchBox.submit();

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        for (int i = 1; i <= 3; i++) {
		            WebElement resultLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='/url?q=']:nth-of-type(" + i + ")")));
		            String url = resultLink.getAttribute("href");
		            System.out.println("URL " + i + ": " + url);
		        }
		     }
	
	
	
	

	  @Test
	public void t4_() {
		  System.out.println("4. Dealing with Dynamic Search Suggestions");
		 WebElement textbox = driver.findElement(By.name("q"));
		 textbox.sendKeys("mvn");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='sbct sbre']")));
		  System.out.println(ele.getText());
		 // ele.click();
		  // how to print alll options	
		  List<WebElement> result = driver.findElements(By.xpath("//div[@class='UUbT9 EyBRub']//li"));
		  for(WebElement i : result) {
			  System.out.println(i.getText());
			  
		  }
	  }
		  		  	  

	
	
	  @Test
	public void t2_() {
		  System.out.println("Question: After typing a query into the search "
		  		+ "box and pressing Enter, how would you wait for the search results to "
		  		+ " load and then extract the text of the first result?");
		 WebElement textbox = driver.findElement(By.name("q"));
		 textbox.sendKeys("ganesh");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wM6W7d']")));
		  System.out.println(ele.getText());
		  		  	  }

	
	
	
  @Test
public void t1_() {
	  System.out.println("Question: How can you locate and "
	  		+ "click the link to change the language to Hindi on the Google homepage, "
	  		+ "and verify that the language has changed?");
	  WebElement ele1 = driver.findElement(By.xpath("//a[text()='मराठी']"));
	 System.out.println(ele1.getText());
	 ele1.click();
	//  WebElement ele2 = driver.findElement(By.xpath("//input[@name='btnI'][1]"));
	//  assertTrue(ele1.isDisplayed(),"marathi langauge is not changed"); 
	 if (ele1.isDisplayed()) {
         System.out.println("Language successfully changed to maraaaaaaaaaaathi.");
     } else {
         System.out.println("Failed to change language.");
     }
	/* WebElement lang = driver.findElement(By.xpath("//div[@id='SIvCob']"));
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SIvCob']")));
	 lang.click();
	 List<WebElement> list = driver.findElements(By.xpath("//a[contains(@href, 'hl=')]"));
	 for(WebElement i : list) {
		 System.out.println(i.getText());
		 }	*/
	 WebElement languageButton = driver.findElement(By.id("SIvCob"));

     // Click the language menu button to reveal the options
     languageButton.click();

     // Wait for the options to be visible (implicit wait can be used)
     // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@href, 'hl=')]")));

     // Find all the language options
     List<WebElement> languageOptions = driver.findElements(By.xpath("//a[contains(@href, 'hl=')]"));

     // Print the text of each language option
     for (WebElement option : languageOptions) {
         System.out.println(option.getText());
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
	  Thread.sleep(7000);
	  driver.quit();
  }

}
