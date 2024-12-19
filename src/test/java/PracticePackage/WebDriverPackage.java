package PracticePackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverPackage {
	WebDriver driver;
	Robot r;
	Select s1;
	Alert a1;
	Actions act;
	File f1;
	
	@Test
	public void Waits() throws InterruptedException {
	
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	   driver.findElement(By.id("btn1")).click();
		// Thread.sleep(5000);		//static wait 
	  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//implicit wait with timeout 
	 /*  WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));	//explicit wait with timeout  + condtition
	   wt.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
	   WebElement textbox1 = driver.findElement(By.id("txt1"));
	   textbox1.sendKeys("this is because of explicitWait");*/
	   
	   /* fluieWait
	   Wait<WebDriver> wt = new FluentWait<WebDriver>(driver)	// timeout + condition + hitting after each time
	   .withTimeout(Duration.ofSeconds(10))
	   .pollingEvery(Duration.ofSeconds(5))
	   .withMessage("yahoooooooooooooooooooooooooooooooooooooooooooooooooo")
	   .ignoring(NoSuchElementException.class);
	   wt.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1"))).sendKeys("dghsagdhgashd");	*/
	   Wait wait = new FluentWait(driver)
			   .withTimeout(Duration.ofSeconds(10))
			   .pollingEvery(Duration.ofSeconds(1))
			   .withMessage("yahoooooooooooooooooooooooooooooooooooooooooooooooooo")
			   .ignoring(NoSuchElementException.class);
	   WebElement textbox1 = driver.findElement(By.id("txt1"));	
	   textbox1.sendKeys("fjdsjfadsadjhsdagfsdhgfhsdghfghdshgf");
	   
	   
		
		
	 	}
	
	@Test
	public void GamilLinkClick() throws Throwable {
		String t1 = driver.getTitle();
		System.out.println(t1);
		
	driver.findElement(By.tagName("textarea")).sendKeys("duck");
		driver.findElement(By.tagName("//span[1]")).click();
		String t2 = driver.getTitle();
		System.out.println(t2);
	 	}
		@Test
		public void AlertInDiffferentTabs() throws InterruptedException {
		driver.get("https://www.selenium.dev/selenium/web/alerts.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.selenium.dev/selenium/web/alerts.html');");
		js.executeScript("window.open('https://www.selenium.dev/selenium/web/alerts.html');");
		js.executeScript("window.open('https://www.selenium.dev/selenium/web/alerts.html');");
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> ir = tabs.iterator();
		String tab1 = ir.next();
		String tab2 = ir.next();
		String tab3 = ir.next();
		
		
		driver.switchTo().window(tab2);
		driver.findElement(By.id("empty-alert")).click();
	
		for(String tab : driver.getWindowHandles()) {
			driver.switchTo().window(tab);
			Alert a2=driver.switchTo().alert();
			 System.out.println("Alert in " + tab + ": " + a2.getText());
			 a2.accept();
				break;
			} {
				System.out.println("Alert was present on this page and handled correctly");
												}
													}
		
		
		@Test
		public void DynamicElementTesing() throws InterruptedException {
		 	WebElement textarea = driver.findElement(By.id("APjFqb"));
		 	textarea.sendKeys("twitter");
		 	textarea.sendKeys(Keys.ENTER);
		 	driver.findElement(By.cssSelector("[class^='LC20l']")).click();
		 	WebElement wtr = driver.findElement(By.cssSelector("[dir='ltr'][class$='r-1777fci'][style*='unset; color: rgb(29, 155, 240)']"));
		 	/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[dir='ltr'][class$='r-1777fci'][style*='unset; color: rgb(29, 155, 240)']")));
		 	wtr.click();*/
		 	JavascriptExecutor js = ((JavascriptExecutor)driver);
		 	js.executeScript("arguments[0].click();", wtr);
		 	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Jaadu");
		 	
		
		}	
		
		
	
	@Test
	public void HeadlessTesting() throws InterruptedException {
	 	EdgeOptions o1 = new EdgeOptions();
		o1.addArguments("--headless");
		WebDriver Hdriver = new EdgeDriver(o1);
		Hdriver.get("http://www.google.com/");
		String t1 = Hdriver.getTitle();
		System.out.println(t1);
	
	}
	
	@Test
	public void checkDownloadedFile() throws InterruptedException {
		  System.out.println("2. How to Check if You Have Downloaded a File Successfully Using Automation");
		 f1 = new File("C:\\Users\\LENOVO\\Downloads\\पोलीस-शिपाई-व-पोलीस-शिपाई-बँड्समन-तात्पुरती-निवड-व-तात्पुरती-प्रतिक्षा-यादी1723287056-2.pdf");
		if(f1.exists()) {
			System.out.println("yahoooo");
		}else {
			System.out.println("badluck");
		}
	}
	
	@Test
	public void assertEqualAssertTrue() throws InterruptedException {
		String t1 = driver.getTitle();
		System.out.println(t1);
	 assertEquals(t1,"Google");
	 //Asserttrue to conditions
    assertTrue(t1.contains("oo"),"shityarr");
	 	}
	
	
	
  @Test
public void zoomInAndZoomOut() throws InterruptedException {
	  System.out.println("1. Zoom in and Zoom out in selenium using javascriptExecutor");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("document.body.style.zoom='200%'"); 
	  System.out.println("ganesh it is zoomed in ");
	  js.executeScript("document.body.style.zoom='100%'");
	  System.out.println("ganesh it is zoomed out ");
	  
	  System.out.println("1. Zoom in and Zoom out in selenium using Actions");
	  act = new Actions(driver);
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.ADD).keyUp(Keys.CONTROL).perform();
	  	/*  int j = 6;
		  for(j=0; j<6; j++) {
		  act.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();
	  }	*/
	   new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD)).perform();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeTest
public void beforeTest() throws InterruptedException {
	    driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);		
}
  
  
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  
 }

}
