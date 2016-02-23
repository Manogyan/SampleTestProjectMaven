package com.org.LearningMaven.SampleTestProjectMaven;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class SellingBooks {
	
	@BeforeTest
	public void shouldWeSkip(){
		if (! isLoggedIn())
			throw new SkipException("Skipping because user is not logged in");
	}
	
	@Test
	public void testSellingBooks(){
		System.out.println("Testing The selling Books");
	}
	
	public boolean isLoggedIn(){
		//return true;
		return false;
	}
}
