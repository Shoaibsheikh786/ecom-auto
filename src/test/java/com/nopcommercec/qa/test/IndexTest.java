package com.nopcommercec.qa.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nopcommerce.qa.base.SetUp;
import com.nopcommerce.qa.pages.Index;

public class IndexTest  extends SetUp{
	
	//Page You want to deal with 
	Index ind;
	
	
	
	//Call @BeforeTest to initialize the page and make it available for every test
	@BeforeTest()
	public void beforTest()
	{
		ind=new Index();
	}
	
	
	//Write your Test Cases Related to that project 
	@Test
	public void test1()
	{
		ind.enterUsername();
		ind.enterPassword();
		ind.login();
	}
}
