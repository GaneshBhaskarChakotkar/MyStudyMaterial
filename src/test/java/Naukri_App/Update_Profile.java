package Naukri_App;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
public class Update_Profile {
	WebDriver driver;
  @Test
  public void updateMyProfile() throws AWTException, InterruptedException {
	  System.out.println(driver.getTitle());
	 //  WebElement crbtn = driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']"));
	  /*if(crbtn.isDisplayed()) {
		  crbtn.click();
		  System.out.println("clicked on left margin closed button");
	  }else {
		  System.out.println("not clicked on left margin closed button");
	  }*/

	  
	 // WebElement ResumeHeadline = driver.findElement(By.xpath("//div[@class='input-field s12'][1]"));
	//  ResumeHeadline.click();
	  //driver.findElement(By.xpath("//button[text()='Save']")).click();
      // Step 7: Locate the Profile Summary text area or field
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
      WebElement profileSummaryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileSummaryTextArea")));

      // Step 8: Clear the existing profile summary and enter the new one
      profileSummaryField.clear();  // Clear the existing profile summary
      profileSummaryField.sendKeys("Myprofilesummery");

      // Step 9: Save the updated profile summary
      WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
      saveButton.click();



	  
	  
	/*  Alert alt = driver.switchTo().alert();
	  Thread.sleep(5000);
	  alt.dismiss();	*/
	 
	  
	 //  driver.findElement(By.xpath("/html/body/div[6]/div[8]/div[2]/form/div[2]/div/textarea")).clear();
	  
	  
	  //int day = LocalDate.now().getDayOfMonth();
	
		  //Alert alt = driver.findElement(By.xpath("//form[@name='resumeHeadlineForm']//button[1]"));
	 /* WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div[6]/div[8]/div[2]")));
	  driver.findElement(By.xpath("//form[@name='resumeHeadlineForm']//button[1]"));
	  System.out.println("headlineUpdated");*/
		 
	  
	  System.out.println("yahoooooooooooooooooooooooooooooooooooooooooooooooooooooo");
	  
	  
  }
  @BeforeTest
  public void launchApp() {
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");
	  driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("ganeshchakotkar1999@gmail.com");
	  driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Ganesh@7234");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  driver.findElement(By.xpath("//span[@class='edit icon'][1]")).click();
	  
  
  }
  @AfterTest
  public void quitApp() {
	  
  }
  
}
