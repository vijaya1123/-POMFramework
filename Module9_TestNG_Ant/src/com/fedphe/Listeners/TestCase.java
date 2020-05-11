package com.fedphe.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.fedphe.Listeners.TestListener.class)
public class TestCase {
	
	
	
	@Test
	public void GoogleTitleVerify(){
	System.setProperty("webdriver.gecko.driver" , "C:\\Program Files\\SeleniumGeckoDriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	//dynamic wait
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());

}
	
	@Test
	public void TitleMatch()
	{
		System.out.println("title match");
		Assert.assertTrue(false);
	}
}
