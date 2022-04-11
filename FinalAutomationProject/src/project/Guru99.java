package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Guru99
{
	
	WebDriver driver;

 @BeforeTest
 public void beforeTest() throws InterruptedException
 {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ritesh\\Documents\\Automated Testing Prm\\Browser Extention\\chromedriver.exe");
   driver=new ChromeDriver();
   Thread.sleep(1200);
   driver.manage().window().maximize();
   Thread.sleep(1200);
   driver.get("http://links.giveawayoftheday.com/demo.guru99.com/");
   Thread.sleep(1200);
		  
  }


  @Test
  public void f() throws InterruptedException 
  {
	//URL
	 	 driver.get("https://demo.guru99.com/insurance/v1/index.php");
	 	 Thread.sleep(2000);
	 	 //Register
	 	 driver.findElement(By.xpath("/html/body/div[3]/a")).click();
	 	 //1 DropDown
	 	Select s = new Select(driver.findElement(By.xpath("//*[@id=\"user_title\"]")));
		//step 2:Select option
		s.selectByVisibleText("Ms");
		Thread.sleep(2000);
		 //ENTER FIRST NAME 
		  driver.findElement(By.xpath("//*[@id=\"user_firstname\"]")).sendKeys("Kiran");
		  Thread.sleep(1000);
		  //ENTER SURNAME 
		  driver.findElement(By.xpath("//*[@id=\"user_surname\"]")).sendKeys("Gaikwad");
		  Thread.sleep(1000);
		  //ENTER PHONE NUMBER
		  driver.findElement(By.xpath("//*[@id=\"user_phone\"]")).sendKeys("9552626529");
		  Thread.sleep(1000);
	 	s = new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_1i\"]")));
		//step 2:Select option
		s.selectByVisibleText("1993");
		Thread.sleep(2000);
		
		s = new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_2i\"]")));
		//step 2:Select option
		s.selectByVisibleText("October");
		Thread.sleep(2000);
		
		s = new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_3i\"]")));
		//step 2:Select option
		s.selectByVisibleText("17");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"licencetype_t\"]")).click();
		
		s = new Select(driver.findElement(By.xpath("//*[@id=\"user_licenceperiod\"]")));
		//step 2:Select option
		s.selectByVisibleText("2");
		Thread.sleep(2000);
		 s = new Select(driver.findElement(By.xpath("//*[@id=\"user_occupation_id\"]")));
		//step 2:Select option
		s.selectByVisibleText("Student");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"user_address_attributes_street\"]")).sendKeys("Kalewadi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_address_attributes_city\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_address_attributes_county\"]")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_address_attributes_postcode\"]")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_email\"]")).sendKeys("kiran18597@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_password\"]")).sendKeys("Kiran321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_password_confirmation\"]")).sendKeys("Kiran321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();
		Thread.sleep(2000);
		
		// Enter Email Id
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran18597@gmail.com");
		  Thread.sleep(2000);
		  
	  // Enter Password
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Kiran321");
		  Thread.sleep(2000);
		  
	 //	  Click on Login Button
		  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
		  Thread.sleep(2000);
		  //Agile project
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[4]/a")).click();
		  Thread.sleep(2000);
		  //username
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("kiran18597@gmail.com");
		  Thread.sleep(2000);
		  //password
		  driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Kiran321");
		  Thread.sleep(2000);
		  //login
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		  Thread.sleep(2000);
		  //Bank project
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).click();
		  Thread.sleep(2000);
		  //user
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("kiran18597@gmail.com");
		  Thread.sleep(2000);
		  //password
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Kiran321");
		  Thread.sleep(2000);
		  //login button
		  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		  Thread.sleep(2000);
	  }
  
  @Test
  public void mouse_hover() throws InterruptedException 
  {
 	 
 	//step 1 Create object of action class
 			Actions a=new Actions(driver);
 			
 			//step 2 create object of list with WebElement
 			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"navbar-brand-centered\"]/li"));// li is tagname
 			
 			//step 3 store list size
 			int size=ls.size();
 			System.out.println("Number of module:"+size);
 			
 			//step4:  For loop
 			for(int i=1;i<=size;i++)
 			{
 				//wait
 				Thread.sleep(600);
 				
 				//Display module name
 				System.out.println(driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/li["+i+"]")).getText());
 				
 				//Perform Mouse Hover
 				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/li["+i+"]"))).click().perform();
 			}
 			 
  }
  

  @AfterTest
  public void afterTest() 
  {
	  driver.close(); 
  }

}