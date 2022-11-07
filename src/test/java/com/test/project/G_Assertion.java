package com.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class G_Assertion {
	  WebDriver driver;
		@BeforeMethod
		public void setup() 
		{
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  
		}
		
		@Test(priority=1,groups="Tittle")
		public void GetTittle()
		{
			String tittle = driver.getTitle();
			System.out.println(tittle);
			Assert.assertEquals(tittle, "Google123","tittle not mached");
			
		}
		
		@Test
		public void GoogleLogoTest()
		{
		 boolean b = driver.findElement(By.xpath("/html/body/div/img")).isDisplayed();
		 Assert.assertEquals(b, true);
		}
		
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}

}
