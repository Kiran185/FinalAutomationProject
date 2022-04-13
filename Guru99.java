package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Documents\\Automation Setup\\Browser Extension\\chromedriver.exe");
   driver=new ChromeDriver();
   Thread.sleep(1200);
   driver.manage().window().maximize();
   Thread.sleep(1200);
   //URL
	 driver.get("https://demo.guru99.com/insurance/v1/index.php");
	 Thread.sleep(2000);
		  
  }

  @Test
  public void f() throws InterruptedException 
  {
	//*Register*********
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
		  
		//How to Scroll Down
	     	 JavascriptExecutor js=(JavascriptExecutor)driver;//Type cast
	    	 Thread.sleep(2000);
	     	 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     	 Thread.sleep(2000);
		  
         //*****MouseHover*******
		  
		    //step 1 Create object of action class
			Actions a=new Actions(driver);
			
			//step 2 create object of list with WebElement
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"menu\"]/li"));// li is tagname
			
			//step 3 store list size
			int size=ls.size();
			System.out.println("Number of module:"+size);
			
			//step4:  For loop
			for(int i=1;i<=size;i++)
			{
				//wait
				Thread.sleep(600);
				
				//Display module name
				System.out.println(driver.findElement(By.xpath("//*[@id=\"menu\"]/li["+i+"]")).getText());
				
				//Perform Mouse Hover
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/li["+i+"]"))).click().perform();
			}
		  
		  
		//HOME***********
		  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a")).click();
		  Thread.sleep(1200);
		  
		  //RETRIVE QUOTATION ********
		  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
		  Thread.sleep(1200);
		  
		  //identification number enter
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/form/input[1]")).sendKeys("1234");
		  Thread.sleep(1200);
		  //
		  
		  //Retrive button
		  //  driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/form/input[2]")).click();
		  //  Thread.sleep(1200);
		  
		  //profile**********
		  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		  Thread.sleep(1200);
		  
		  //edit profile**********
		  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
		  Thread.sleep(1200);
		  
		 //Inside Edit Profile>>>>>>>>>
			//ENTER SURNAME 
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[3]/input")).sendKeys("bangera");
				Thread.sleep(1000);
				
				//ENTER NAME 
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[4]/input")).sendKeys("ritesh");
				Thread.sleep(1000);
				
				//ENTER PHONE NUMBER
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[5]/input")).sendKeys("99999999");
				Thread.sleep(1000);
				
			 	s = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[6]/select[1]")));
				//step 2:Select option
				s.selectByVisibleText("1993");
				Thread.sleep(1200);
				
				s = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[6]/select[2]")));
				//step 2:Select option
				s.selectByVisibleText("October");
				Thread.sleep(1200);
				
				s = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[6]/select[3]")));
				//step 2:Select option
				s.selectByVisibleText("17");
				Thread.sleep(1200);
				
				//Licence type full
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[7]/input[1]")).click();
				
				//Occupation
				s = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[8]/select")));
				//step 2:Select option
				s.selectByVisibleText("2");
				Thread.sleep(1200);
				 s = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[9]/select")));
				//step 2:Select option
				s.selectByVisibleText("Student");
				Thread.sleep(2000);
				
				//adress
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[10]/input")).sendKeys("bhushan nagar");
				Thread.sleep(1000);
				
				//city
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[11]/input")).sendKeys("solapur");
				Thread.sleep(1000);
				
				//country
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[12]/input")).sendKeys("india");
				Thread.sleep(1000);
				
				//postal code
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[13]/input")).sendKeys("413004");
				Thread.sleep(1000);
				
				//user update
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[14]/input")).click();
				Thread.sleep(1000);
		  
		  
		//REQUEST QUOTATION *******
		  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		  Thread.sleep(1200);
		  
		  //Inside Request Quotation
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/select")).click();
		  Thread.sleep(1200);
		  
		  // windscreenerpair
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[4]/input[2]")).click();
		  Thread.sleep(1200);
		  
		  //Incidents
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[1]/input")).sendKeys("Damage");
		  Thread.sleep(1200);
		  
		  //Registration
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[2]/input")).sendKeys("1234");
		  Thread.sleep(1200);
		  
		  //anuual mileage
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[3]/input")).sendKeys("10000");
		  Thread.sleep(1200);
		  
		  // estimated value
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[4]/input")).sendKeys("50000");
		  Thread.sleep(1200);
		  
		  //parking location
		  s = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[5]/select")));
		  //step 2:Select option
		  s.selectByVisibleText("Public place");
		  Thread.sleep(2000);
		  
		  //start of policy year
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[6]/select[1]")).click();
		  Thread.sleep(1200);
		  
		  //start of policy month
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[6]/select[2]")).click();
		  Thread.sleep(1200);
		  
		 //start of policy date
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[6]/select[3]")).click();
		  Thread.sleep(1200);
		  
		  //Save quotation
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[8]/input[3]")).click();
		  Thread.sleep(1200);	
	  }
	  
  
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }
}