package com.fedphe.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics3 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUP(){
		System.setProperty("webdriver.chrome.driver","/E:/vijay/selenium/chromedriver");
		driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://www.freecrm.com");
	}
	
	@Test
	public void verifyPageTitleTest(){
		String title=driver.getTitle();
		System.out.println("title of the page"+title);
		//Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");	
	}
	
	
	@Test
	public void googleLogoTest(){
	  boolean isdis= driver.findElement(By.xpath("")).isDisplayed();
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
