package com.bit.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegresionTest 
{
	ChromeDriver dr;
	@Test(groups= {"backend"},description="opened chrome driver")
	public void goGoogle()
	{
		 System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr=new ChromeDriver();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			dr.get("https://www.google.com/");
	}
	
	
	@Test(dataProviderClass=BaseTest.class,dataProvider="login")
	public void getData(Object u,Object p)
	{
		Reporter.log("browser initializing");
		 System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr=new ChromeDriver();
			Reporter.log("browser opened");
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			dr.get("https://www.facebook.com/");
			Reporter.log("nevigate to url");
			dr.findElement(By.id("email")).sendKeys(u.toString());
			Reporter.log("type userid");
			dr.findElement(By.id("pass")).sendKeys(p.toString());
	}
	
	
	
	@Test(groups= {"frontend","backend"},enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}

}
