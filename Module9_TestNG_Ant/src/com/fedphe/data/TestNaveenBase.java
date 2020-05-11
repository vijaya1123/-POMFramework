package com.fedphe.data;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNaveenBase {
	
	public static WebDriver driver;
	
	public static void initialisation(){
		System.setProperty("webdriver.gecko.driver" , "C:\\Program Files\\SeleniumGeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		//back and forward 
	}
		
              public void falied(String testMethodname)
              {
            	  try{
            		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            		
            		FileUtils.copyFile(srcFile, new File("/E:/Module 11 -  Testng/Module9_TestNG_Ant/ScreenShot")+ "testMethodName"+"_"+ ".jpg");
              }catch(Exception e)
            	  { System.out.println(e);
            	  
            	  }
              }
}


