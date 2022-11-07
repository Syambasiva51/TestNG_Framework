package com.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * 
 * 1.Priority --done
 * 2.Basic html report
 * 3.Group
 */
public class B_GoogleTest {
	
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
		
	}
	
	@Test(priority=3,groups="logo")
	public void GoogleLogoTest()
	{
	 boolean b = driver.findElement(By.xpath("/html/body/div/img")).isDisplayed();
	 System.out.println("logo test"+b);
	}
	
	@Test(priority=2,groups="Link")
	public void linktest()
	{
		boolean b = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).isDisplayed();
		System.out.println("link test"+b);
	}
	
	@Test(priority=4,groups="Test")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
