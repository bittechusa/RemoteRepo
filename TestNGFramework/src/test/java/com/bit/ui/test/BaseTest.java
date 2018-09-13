package com.bit.ui.test;

import org.testng.annotations.Test;

import com.bit.utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	WebDriver dr;
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("bm");
	  System.out.println("before method executed");
  }

  @AfterMethod
  public void afterMethod(ITestResult r) 
  {
	  if(r.getStatus()==ITestResult.FAILURE)
	  {
		  System.out.println("took screen shot");
	  }
	  System.out.println("am");
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("bc");
	  String b=prop.getProperty("browser");
	  if(b.equals("chrome"))
	  {
		  System.out.println("opened chrome browser");
		  System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr=new ChromeDriver();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			dr.get("https://www.amazon.com/");
	  }
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("ac");
	  dr.quit();
  }

  Properties prop;
  @BeforeTest
  public void beforeTest() throws IOException 
  {
	  System.out.println("bt");
	 prop= Utility.readPropertyFile("config.properties");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("as");
  }

}
