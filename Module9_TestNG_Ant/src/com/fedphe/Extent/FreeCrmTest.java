package com.fedphe.Extent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUP(){
	System.setProperty("webdriver..driver","/E:/vijay/selenium/chromedriver");
	driver= new FirefoxDriver();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://www.google.com");
}

@Test(priority=1)
public void verifyPageTitleTest(){
	String title=driver.getTitle();
	System.out.println("title of the page"+title);
	Assert.assertEquals(title, "Google", "title is not matched");	
}


@Test
public void  googleLogoTest(){
	boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed();
	Assert.assertTrue(b);

}


@AfterMethod
public void tearDown(){
	driver.quit();
}




}