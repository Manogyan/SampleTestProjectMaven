package com.org.LearningMaven.SampleTestProjectMaven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void openConnection(){
		System.out.println("Connected to DataBase");
	}
	
	@AfterTest
	public void closeConnection(){
		System.out.println("Closing the Database connection");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("Opening the Browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing the Browser");
	}
	
	@Test
	public void testLogin(){
		System.out.println("Executing login test");
	}

	@Test
	public void testRegister(){
		System.out.println("Testing Registration");
	}

}
