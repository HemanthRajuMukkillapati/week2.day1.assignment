package week2.day1.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;



	public class EditLead {

			public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
					
			ChromeDriver driver =new ChromeDriver(); 	
			
			//Launch URL "http://leaftaps.com/opentaps/control/login"
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();		
			
			//Enter UserName and Password Using Id Locator
			
			driver.findElement(By.id("username")).sendKeys("DemoCSR");	
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			//Click on Login Button using Class Locator
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			//Click on CRM/SFA Link
			 	
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();			//Click on Leads Button
			
			driver.findElement(By.linkText("Create Lead")).click();   	//Click on Create Lead 
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hety's Org"); //Enter CompanyName Field Using id Locator
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemanth1");  //Enter FirstName Field Using id Locator
			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju1");			//Enter LastName Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("local");	//Enter FirstName(Local) Field Using id Locator																//createLeadForm_firstNameLocal			
			
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing"); //Enter Department Field Using any Locator of Your Choice
			
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Assignment");//Enter Description Field Using any Locator of your choice 
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemanthraju.m1991@gmail.com");//Enter your email in the E-mail address Field using the locator of your choice
			
			WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));//Select State/Province as NewYork Using Visible Text
			
			Select spDD = new Select(stateProvince);
			
			spDD.selectByVisibleText("New York");  					//Select State/Province as NewYork Using Visible Text
			driver.findElement(By.className("smallSubmit")).click(); 	//Click on Create Button
			
			driver.findElement(By.linkText("Edit")).click(); 	//Click on edit button
			driver.findElement(By.id("updateLeadForm_description")).clear();							//Clear the Description Field using .clear()
			
			driver.findElement(By.name("importantNote")).sendKeys("Important Note Details");//Fill ImportantNote Field with Any text
			
			driver.findElement(By.name("submitButton")).click();	//Click on update button 
			
			String title=driver.getTitle();  //Get the Title of Resulting Page
			System.out.println(title);
			if(driver.getTitle().equals("View Lead | opentaps CRM")) {
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			driver.close();
			
			
				

		}

	}
	
	
	
