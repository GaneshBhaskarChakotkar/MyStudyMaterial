package PracticePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.*;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PC {
  
	WebDriver driver;
	Robot r;
	Select s1;
	Alert a1;
	@Test
  public void f() {
	  
  }
  
	
  @Test (priority = 0)
  public void TC1() throws InterruptedException {
	  WebElement e1 = driver.findElement(By.xpath("//textarea[@name='message']"));
		System.out.println(e1.getText());
		e1.click();
		e1.clear();
		e1.sendKeys("Mr tester is preparing for his future");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//form[@action='https://www.automationtestinginsider.com/']//input[1]")).click();
  }
  
  @Test
  public void TC2() {
	driver.findElement(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[2]/input[1]")).sendKeys("Ganesh");
	driver.findElement(By.xpath("//form[@action='https://www.automationtestinginsider.com/']//input[2]")).sendKeys("Chakotkar");
	driver.findElement(By.xpath("//form[@action='https://www.automationtestinginsider.com/']//input[3]")).click();	
  }
  
  @Test
  public void TC3_RadioButtons() {
	  WebElement yes = driver.findElement(By.xpath("//input[@name='answer'][@value='Yes']"));
	  System.out.println("yes_isDisplayed "+yes.isDisplayed());
	  System.out.println("yes_isEnabled "+yes.isEnabled());
	  System.out.println("yes_isSelected "+yes.isSelected());
	 yes.click();
	  System.out.println("yes_isDisplayed "+yes.isDisplayed());
	  System.out.println("yes_isEnabled "+yes.isEnabled());
	  System.out.println("yes_isSelected "+yes.isSelected());
  }
  
  @Test
  public void TC4_CheckBox() {
	WebElement chk = driver.findElement(By.xpath("//input[@name='Checkbox3'][@value='Checkbox3']"));
    chk.click();
  }
  
  @Test
  public void TC5_robotClassUsingEnter() throws AWTException {
	  driver.findElement(By.cssSelector("input[value='Click Me!']")).click();
	  r = new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	 /* Alert a = driver.switchTo().alert();
	  a.getText();
	  a.accept();*/
  }
  
  @Test
  public void TC6_dropDown() {
	 // Select s1 = new Select(driver.findElement(By.cssSelector("select[name='cars']")));
	  //s1.selectByValue("audi");
	  //s1.selectByVisibleText("Fiat"); passed
	//s1.selectByVisibleText("fiat"); failed
	//  s1.selectByIndex(1);
	  
	 s1 = new Select(driver.findElement(By.cssSelector("select[name='cars']")));
	  List<WebElement> list = s1.getOptions();
	  for (WebElement s : list) {
		  System.out.println(s.getText());
		  s1.selectByIndex(1);
		  driver.findElement(By.xpath("//form[@Action='https://www.automationtestinginsider.com/'][3]//input[1]")).click();
	  }
  }
  
  @Test
  public void TC7_Webtable() {
	//  List<WebElement> tab1 = driver.findElement(By.xpath("//table[@border='1']//th"));
//	  for (WebElement i : tab1) {
	//	  System.out.println(i.getText());
	//  }
  
  
  }
  
  @Test
  public void TC8_Frames() {
	  driver.switchTo().frame("iframe_a");
	  driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
	  String s1 = driver.findElement(By.xpath("//a[@class='nav-link'][1]")).getText();
	  System.out.println(s1);
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("iframe_b");
	  driver.findElement(By.id("searchInput")).sendKeys("GaneshDon");
  }
  
  @Test
  public void TC9_DatePicker() {
	  driver.findElement(By.id("start")).sendKeys("12-05-2016");
  
  }
  
  @Test
  public void TC10_AutoComplete() throws InterruptedException, AWTException {
	  driver.findElement(By.id("email")).sendKeys("g");
	  Thread.sleep(5000);
	  r = new Robot();
	  r.keyPress(KeyEvent.VK_TAB);
	 String s2 = driver.findElement(By.id("email")).getText();
	 System.out.println(s2);
  }
  

  @Test
  public void TC11_ListBoxMultipleSelect( ) throws InterruptedException, AWTException {
	  s1 = new Select(driver.findElement(By.name("list_box_name[]")));
	  r = new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  s1.selectByValue("option2");
	  Thread.sleep(2000);
	  s1.selectByValue("Option3");
	  Thread.sleep(2000);
  }
  
  @Test
  public void TC12_ComboBox_OptionTag() {
	  
	  driver.findElement(By.xpath("//option[@value='Select']")).click();
	  driver.findElement(By.xpath("//option[@value='sap']")).click();
	  /* didnt work
	  s1 = new Select(driver.findElement(By.xpath("//option[@value='Select']")));
	  s1.selectByVisibleText("SAP");
	  
	  */
  }
  
  @Test
  public void TC13_Actions() {
	  Actions act = new Actions(driver);
	  act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
	  a1 = driver.switchTo().alert();
	  a1.accept();
	  act.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
  }
 
  @Test
  public void TC14_SendFile() {
	  driver.findElement(By.id("fileupload1")).sendKeys("C:\\Users\\LENOVO\\Downloads\\ExtraQA.pdf");
  }
  
  @Test
  public void TC15_() {
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
  }

  @BeforeTest
  public void beforeTest() {
	    driver = new EdgeDriver();
		driver.get("https://www.automationtestinginsider.com/p/blog-page.html");
		driver.findElement(By.xpath("//*[@id=\"post-body-1226154004841280249\"]/div[1]/ul[1]/li/span/span/a")).click();
		driver.manage().window().maximize();
		Set<String> wins = driver.getWindowHandles();
		LinkedList<String> ir = new LinkedList<>(wins);
		String win1 = ir.get(0);
		String win2 = ir.get(1);
		/*Iterator<String> ir = wins.iterator();
		String win1 = ir.next();
		String win2 = ir.next();*/
		driver.switchTo().window(win2);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.quit();
  
 }
}
