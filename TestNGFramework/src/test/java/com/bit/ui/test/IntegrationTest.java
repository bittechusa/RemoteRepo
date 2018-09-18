package com.bit.ui.test;

import org.testng.annotations.Test;

public class IntegrationTest
 extends BaseTest{
	@Test(groups= {"frontend","backend"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"frontend"})
	public void test2()
	{
		System.out.println("test2");
	}

}
