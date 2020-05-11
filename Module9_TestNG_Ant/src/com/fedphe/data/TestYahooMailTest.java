package com.fedphe.data;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestYahooMailTest {
	//Test NG Data Driver Frame Work
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("launch FF");
	}
	
	@BeforeMethod
	public void loginin(){
		System.out.println("log in to the app");
	}
	
	@Test(priority=1)
	public void composeMailTest(){
		System.out.println("in the compose mail test");

		
	}
	
	@Test(priority=2 , enabled=false)
	public void deleteMailTest(){
		System.out.println("in the delete mail Test");

	}
	
	@Test(priority=3)
	public void SearchMailTest(){
		System.out.println("in the search mail test");
		int i=8/0;
		
	}
	
	@Test(priority=3)
	public void itemMailTest(){
		System.out.println("in the item mail test");
		
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("log out to the app");
	}
	
	
	@AfterClass
	public void quitBrowser(){
		System.out.println("quit browser");
	}


}
