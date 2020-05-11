package com.fedphe.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginCRM {
	
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
	login("vijay" ,"test@123");
	driver.switchTo().frame("mainpanel");
	}
	
	@Test(priority=1)
	public void clickonContactsLinkTest(){
		String title=driver.getTitle();
		WebElement contacts= driver.findElement(By.xpath(""));
		contacts.click();
   	}
	
	
	@Test(priority=2)
	public void clickonDealLinkTest(){
		String title=driver.getTitle();
		WebElement deals= driver.findElement(By.xpath(""));
		deals.click();
   	}
	
	public void login(String userernm, String password)
	{
		
		driver.findElement(By.name("usernm")).sendKeys(usernm);
		driver.findElement(By.name("password")).sendKeys(password);
		
		//login button 
		WebElement loginbutt= driver.findElement(By.xpath(""));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("");
	}

		
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
