package com.test.project;

import org.testng.annotations.Test;
/*
 * dependsOnMethods
 * 
 */
public class C_DependsonMethod {
		@Test
		public void loginTest(){
			System.out.println("Login Test");
			//int i = 9/0;
			
			}
		
		@Test(dependsOnMethods="loginTest")
		public void HomepageTest(){
			System.out.println("Home page Test");
			}
		
		@Test(dependsOnMethods="loginTest")
		public void SearchPage(){
			System.out.println("Search page Test");
			}
		
		@Test(dependsOnMethods="loginTest")
		public void Regpage(){
			System.out.println("Regestration page Test");
			}
		
}
