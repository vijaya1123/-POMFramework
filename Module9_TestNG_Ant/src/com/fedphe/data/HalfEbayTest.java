package com.fedphe.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtility;

public class HalfEbayTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUP(){
		System.setProperty("webdriver.chrome.driver","/E:/vijay/selenium/chromedriver");
		driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://scgi.half.ebay.com");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
	   ArrayList<Object []>testdata=TestUtility.getDataFromExcel()
	   return testdata.iterator();
		
	}
	
     @Test
     public void halfebayRegistrationpage(String firstnm,String lnm,String addr1,String addr2,String city, String state,String zip1,String email)
     {
    	 
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");
    	 
    	 driver.findElement(By.xpath("")).clear();
    	 driver.findElement(By.xpath("")).sendKeys("");

     
     }
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
