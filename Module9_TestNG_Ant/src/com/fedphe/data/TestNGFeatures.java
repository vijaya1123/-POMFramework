package com.fedphe.data;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@Test
	public void loginTest(){
		System.out.println("in login test");
		//int i =9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomepageTest(){
		System.out.println("in Home page test ");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchpageTest(){
		System.out.println("in Search page test ");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegistrationpageTest(){
		System.out.println("in Registration page test ");
	}
	

}
