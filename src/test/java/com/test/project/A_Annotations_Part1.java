package com.test.project;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
/*
 * TestNg Annotations:
 * in any testng class we have 3 conditions.
 * 1.pre-conditions
 * 2.Test cases to execute
 * 3.post-condition testcase
 * 
 * 
 */
import org.testng.annotations.Test;

public class A_Annotations_Part1 {
//pre-conditions annotations --starting  with @Before
	
	@BeforeSuite //1
	public void setup()
	{
		System.out.println("@Before Suite---set propertry for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("@BeforeTest-----launch method");
	}
	
	@BeforeClass //3
	public void login(){
		System.out.println("@Beforeclass-----login");
	}
	
	/*
	 * @BeforeMethod
	 * @Test-1
	 * @AfterMethod
	 * @BeforeMethod
	 * @Test-2
	 * @AfterMethod
	 * 
	 */
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("@Beforemethod----enter url");
	}

//testcases --- starting with @Test
	
	@Test //5
	public void googleTitleTest(){
		System.out.println("@Test----Google title test");
	}
	
	@Test //5
	public void GooglelogoTest(){
		System.out.println("@Test----GooglelogoTest");
	}
	
	@Test //5
	public void SearchTest(){
		System.out.println("@Test----SearchTest");
	}
	
//post-conditions --starting with @After
	
	@AfterMethod //6
	public void logout()
	{
		System.out.println("@AfterMethod----logout test");
	}
	
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("@Afterclass----close Browser");	
	}
	
	@AfterTest//8
	public void deletecookies() {
		System.out.println("@AfterTest-----delete cookies");	
	}
	
	
}
