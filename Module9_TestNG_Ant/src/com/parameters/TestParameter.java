package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	
	WebDriver driver;
	
	@Test
	@Parameters({ "env","browser","url", "emailid"})
	public void yahoologinTest(String env,String browser, String url, String emailid)
	{
		
		if(browser.equals("chrome")){
		System.setProperty("","");
		driver=new ChromeDriver();
	} 
	else if(browser.equals("firefox")){
			System.setProperty("","");
			driver=new FirefoxDriver();
		
	}
		driver.get("url");
		//driver.get("http://www.yahoo.com");
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
	}
	

}
