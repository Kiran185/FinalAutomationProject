package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDown_BlazeDemo  
{
	WebDriver driver;
	
  @BeforeTest
public void beforeTest() throws InterruptedException 
{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Documents\\Automation Setup\\Browser Extension\\chromedriver.exe");
	    driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
}

  @Test public void f() throws Exception 
  
  {
		
		Select s;  // GLOBAL DECLARATION
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://blazedemo.com");
		Thread.sleep(2000);
		
		//DROP DOWN ----> (DEPARTURE CITY) ; TAGNAME MUST BE <SELECT>
		//STEP 1 : CREATE AN OBJECT OF THE SELECT CLASS
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		//STEP 2 : SELECT THE OPTION
		s.selectByIndex(5);
		Thread.sleep(2000);
		

		//DROP DOWN ----> (DESTINATION CITY ; TAGNAME MUST BE <SELECT>
		//STEP 1 : CREATE AN OBJECT OF THE SELECT CLASS
		s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		//STEP 2 : SELECT THE OPTION
		s.selectByVisibleText("New York");
		Thread.sleep(2000);     
		
		// FIND FLIGHTS BUTTON
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		
		//Choose the Flights
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(1000);
		
		//Name
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Kiran");
		
		//Address
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Pune 33");
		
		//City
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("pcmc");
		
		//State
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("maharashtra");
		
		//ZipCode
		driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("123456");
		
		//CardType
		driver.findElement(By.xpath("//*[@id=\"cardType\"]")).sendKeys("1234 4321 5678");
		
		//Month
		driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("dec");
		
		//Year 
		driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2022");
		
		//NameOnCard
		driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("kvg");
		
		//RememberMe
		driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
		
		//Purchase tickets
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(1000);
 
  }
  
 
  

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }


}
