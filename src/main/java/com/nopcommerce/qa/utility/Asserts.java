package com.nopcommerce.qa.utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Asserts {

	public static void CheckButtonsTextOnWebpage(WebElement ele,String text)
	{
		Assert.assertEquals(ele.getText(),text);
	}
   
	
	/** @return 
	 * @return false if condition is getting failed*/
	
	public static boolean notEquals(String s1,String s2)
	{
		return (!s1.equals(s2));
	}
	
	public static boolean Equals(String s1,String s2)
	{
		return (s1.equals(s2));
	}
	
	/**Generic Method for social Links or any web Page which we want to verify on the basics of title
	 and Then close that page */
	
	
	/** @throws logical ERROR , need to modify it , */
	public static  void getTitleVerified(WebDriver driver,String title)
	{   
		String cWin=driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		
	
		for (String windowHandle : windowHandles) {
			   
			
			driver.switchTo().window(windowHandle);
		    if (windowHandle.equals(cWin)) { // Identify the new window based on your conditions
		    	 if(Equals(driver.getTitle(),title))
		    	 {   
		    		 System.out.println("Window Getting Closed--->"+windowHandle);
		    		 driver.switchTo().window(windowHandle);
		    	    driver.close();
		    	 }
		    	     
		    }
	    
		}
	}
	
}
