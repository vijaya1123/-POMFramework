package com.test.utility;

import java.util.ArrayList;

public class TestUtility {
	
	static xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object []>arr= new ArrayList<Object[]>();
		try{
			reader= new Xls_Reader("path of xls reader");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rownum=2;rownum<=reader.getRowData("RegistrationTestData"); rownum++)
		{
			String firstnm= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String lastnm= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String addr1= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String addr2= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String city= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String state= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String zip= reader.getCellData("RegistrationTestData","firstnm", rownum);
			String email= reader.getCellData("RegistrationTestData","firstnm", rownum);
			
			Object obj[]= {firstnm,lastnm,addr1,addr2,city,state,email};
			mydata.add(obj);
		}
			return mydata;

	}

}