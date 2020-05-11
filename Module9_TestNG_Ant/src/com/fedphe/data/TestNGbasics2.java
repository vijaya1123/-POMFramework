package com.fedphe.data;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics2 {
	
	@BeforeSuite
	public void setup(){
		System.out.println("set up system property for chrome browser");
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("launch browser");
	}
	
	@BeforeClass
	public void login(){
		System.out.println("login in the app");
	}
	
	@BeforeMethod
	public void enterurl(){
		System.out.println("enter url");
	}
	
	@Test(priority=1, groups="Title page")
	public void googleTitleTest(){
		System.out.println("in google test prority 1");
	}
	
	@Test(priority=2, groups="Search Page")
	public void searchTest(){
		System.out.println("in search test for priorty 2 ");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("log out from the app");
	}
	
	@AfterTest
	public void deleteAllCookies(){
		System.out.println("delete all cookies");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("close browser");
	}

	
	@AfterSuite
	public void generateTestReport(){
		System.out.println("generate reports");
	}


}
