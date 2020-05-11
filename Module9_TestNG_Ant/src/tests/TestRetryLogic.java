package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class TestRetryLogic {
	
	@Test//(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Test1(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3(){
		Assert.assertEquals(true, true);
	}



}
