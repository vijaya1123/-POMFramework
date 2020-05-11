package com.fedphe.data;

import org.testng.annotations.Test;

public class TestNGGroup {
	
	
	@Test(groups="composemailtest")
	public void composeMailTest(){
		System.out.println("in the compose mail test");

		
	}
	
	@Test(groups="deletemail")
	public void deleteMailTest(){
		System.out.println("in the delete mail Test");

	}
	
	@Test(groups="searchmail")
	public void SearchMailTest(){
		System.out.println("in the search mail test");
		
	}

}
