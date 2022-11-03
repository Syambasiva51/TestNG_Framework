package com.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B_GoogleTest {
	
	  WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	}
	
	@Test(priority=1)
	public void GetTittle()
	{
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
	}
	
	@Test(priority=3)
	public void GoogleLogoTest()
	{
	 boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	 System.out.println("logo test"+b);
	}
	
	@Test(priority=2)
	public void linktest()
	{
		boolean b = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).isDisplayed();
		System.out.println("link test"+b);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
