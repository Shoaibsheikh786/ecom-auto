package com.nopcommerce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.qa.base.SetUp;
import com.nopcommerce.qa.utility.Asserts;
import com.nopcommerce.qa.utility.Dd;
import com.nopcommerce.qa.utility.EleInt;

public class Index extends SetUp{
	 
	//***********************************************************************
	/** Constructor to initialize the OBJECT REPOSITORY/WEBELEMENTS */
	 public  Index()
     {
    	 PageFactory.initElements(driver, this);
     }
	 
	 
	 
	//*************************************************************************
	 /** Find the web elements on the same Page*/
	
     @FindBy(xpath="//input[@id='Email']")
     WebElement email;
     
     @FindBy(xpath="//input[@id='Password']")
     WebElement password;
     
     @FindBy(xpath="//button[normalize-space()='Log in']")
     WebElement login;
     
     /** Drop-down which contains value currency value*/
     @FindBy(xpath="//select[@id='customerCurrency']")
     WebElement currency;
     
     
     /** Social Links  <<START*/
     @FindBy(xpath="//a[normalize-space()='Facebook']")
     WebElement fb;
     
     @FindBy(xpath="//a[normalize-space()='Twitter']")
     WebElement x;
     
     @FindBy(xpath="//a[normalize-space()='RSS']")
     WebElement newsLetter;
     
     @FindBy(xpath="//a[normalize-space()='YouTube']")
     WebElement youtube; 
     /** >>END*/
     
    //*************************************************************************
     /** Write the Methods which deals with the above web elements */
     public void enterUsername()
     {
    	   email.sendKeys(SetUp.email);
     }
     public void enterPassword()
     {
    	  password.sendKeys(SetUp.pass);
     }
     public void login()
     {
    	EleInt.clickIfPresent(driver, login); 
     }
     public void changeCurrency()
     {
    	Dd.selectByVisibleText(currency, "Euro"); 
     }
     
     /** Social Links  <<START*/
     public void clickonFb()
     {
    	 EleInt.clickIfPresent(driver, fb);
    	 Asserts.getTitleVerified(driver, "NopCommerce | Facebook");
     }
     
     public void clickonX()
     {
    	 EleInt.clickIfPresent(driver, x);
    	 Asserts.getTitleVerified(driver, "nopCommerce (@nopCommerce) / X");
     }
    	 
     
     public void clickonNewFeed()
     {
    	 EleInt.clickIfPresent(driver,newsLetter);
    	 Asserts.getTitleVerified(driver, "nopCommerce demo store: News");
     }
     
     public void clickOnYt()
     {
    	 EleInt.clickIfPresent(driver,youtube);
    	 Asserts.getTitleVerified(driver, "nopCommerce - YouTube");
     }
     /** >>END*/
	
}
