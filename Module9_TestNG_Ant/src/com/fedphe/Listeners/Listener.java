package com.fedphe.Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	
	public void onTestStart(ITestResult tr){
		System.out.println("Test Started");
	}

	
	public void onTestSucess(ITestResult tr){
		System.out.println("Test suceess");


	}
	public void onTestFailure(ITestResult tr){
		System.out.println("Test failure");


	}
	public void onTestSkip(ITestResult tr){
		System.out.println("Test skip");


	}
	}
