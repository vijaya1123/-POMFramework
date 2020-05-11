package com.fedphe.Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListener2 {
	
	@Test
	public void loginbyemail()
	{
		System.out.println("title match");
		Assert.assertEquals("vijay","vijay");
	}
	
	@Test
	public void loginbyfacebook()
	{
		System.out.println("title match");
		Assert.assertEquals("vijay","kumar");

	}



}
