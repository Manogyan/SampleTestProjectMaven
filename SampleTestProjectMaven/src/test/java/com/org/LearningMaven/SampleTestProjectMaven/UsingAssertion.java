package com.org.LearningMaven.SampleTestProjectMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingAssertion {
	@Test
	public void testGoogleSearch(){
		String expected_title="Google1";
		String actual_title="Google";
		System.out.println("before assertion");
		try{
			Assert.assertEquals(expected_title, actual_title );
		}catch(Throwable t){
			//recovered
			//java code to report the failed test
			System.out.println("error");
		}
		System.out.println("after assertion");
	}

}
