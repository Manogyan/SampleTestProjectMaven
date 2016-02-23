package com.org.LearningMaven.SampleTestProjectMaven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendMailTest {
	//to
	//subject
	//mail body
	
	@Test(dataProvider="getData")
	public void testSendingMail(String to,String subject,String body){
		System.out.println(to + "---" + subject + "---" + body);
		//
	}

	@DataProvider
	public Object[][] getData(){
		//rows - no of time the test has to be repeated
		//column - no of parameters in the test data
		Object [][] data = new Object[2][3];
		//first row
		data[0][0]="xyz@gmail.com";
		data[0][1]="Hello";
		data[0][2]="How is life";
		
		//second row
		data[1][0]="abc@gmail.com";
		data[1][1]="Hi";
		data[1][2]="Life is good";
		
		return data;
	}
}
