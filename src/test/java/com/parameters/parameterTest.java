package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	WebDriver driver;
	
	@Test
	@Parameters({"url","email"})
	public void yahooLoginTest(String url,String Email) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		  driver=new ChromeDriver();	
		
		  driver.get(url);
		  driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		  driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(Email);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		  
		  
		
	}
}
