package com.fedphe.data;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void test1(){
		System.out.println("open bowser");
		//Assert.assertEquals(true, false); //hard assertion
		softassert.assertEquals(true, false); //soft assertion
		System.out.println("enter user name ");
		System.out.println("enter pasword");
		System.out.println("log in ");
		System.out.println("open bowser");
		//Assert.assertEquals(true, false); //hard assertion
		softassert.assertEquals(true, false,"not able to deal page");// soft assertion
		System.out.println("go to the deals page ");
		//Assert.assertEquals(true, false); //hard assertion
		softassert.assertEquals(true, false,"not able to contact page");// soft assertion
		System.out.println("go to the contact page ");
		softassert.assertAll();
		
	}
	
	@Test
	public void test2(){
		System.out.println("in log out");
		Assert.assertEquals(true, false);
		softassert.assertAll();

	}
	@AfterClass
	public void teardDown(){
		softassert.assertAll();
		
	}

}
