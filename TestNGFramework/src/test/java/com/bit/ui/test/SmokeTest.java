package com.bit.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest
{
	
	ChromeDriver dr;
	@Test(groups= {"smoke"})
	public void goYahoo()
	{
		 System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr=new ChromeDriver();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			dr.get("https://www.yahoo.com/");
	}
	
	
//	 @Test(dataProvider = "dp")
//	  public void test1(Integer n, String s)
//	 {
//		System.out.println("test1"); 
//	  }
	
	@Test(groups= {"frontend"})
	  public void test1()
	 {
		System.out.println("test1"); 
	  }
	 @Test
	  public void test2() 
	 {
		 System.out.println("test2");
	  }

}
