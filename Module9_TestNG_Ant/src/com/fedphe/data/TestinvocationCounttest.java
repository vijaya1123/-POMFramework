package com.fedphe.data;

import org.testng.annotations.Test;

public class TestinvocationCounttest {

	@Test(invocationCount=20)
	public void add(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is "+c);
		
	}
}
