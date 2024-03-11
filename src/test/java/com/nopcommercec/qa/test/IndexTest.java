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
	@Test(priority=1)
	public void test1()
	{
		ind.enterUsername();
		ind.enterPassword();
		ind.login();
	}
	@Test(priority=2)
	public void changeCurrency()
	{
		ind.changeCurrency();
	}
	
	@Test(priority=3,groups="Follow us")
	public void clickOnFb()
	{
		ind.clickonFb();
	}
	
	@Test(priority=4,groups="Follow us")
	public void clickOnYt()
	{
		ind.clickOnYt();
	}
	
	@Test(priority=5,groups="Follow us")
	public void clickOnX()
	{
		ind.clickonX();
	}
	
	@Test(priority=6,groups="Follow us")
	public void clickOnNewsFeed()
	{
		ind.clickonNewFeed();
	}
}
