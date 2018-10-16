package com.bit.ui.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExecution 
{
	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("chrome");
		WebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		dr.get("http://www.facebook.com");
	}
	@Test
	public void test2() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("chrome");
		WebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		dr.get("http://www.amazon.com");
	}
	
	@Test
	public void test3() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("firefox");
		WebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		dr.get("http://www.google.com");
	}
	
	

}
