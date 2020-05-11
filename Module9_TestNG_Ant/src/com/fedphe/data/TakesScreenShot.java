package com.fedphe.data;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestCustomListener.class)
public class TakesScreenShot  extends TestNaveenBase{
	
	@BeforeMethod
	public void setUp(){
		initialisation();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
	@Test
	public void logintest(){
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void searchtest(){
		Assert.assertEquals(false,true);
	}
	@Test
	public void contactdealtest(){
		Assert.assertEquals(false,true);
	}
	@Test
	public void createcontacttest(){
		Assert.assertEquals(false,true);
	}
		@Test
	public void Homepagetest(){
		Assert.assertEquals(false,true);
	}
	

}
