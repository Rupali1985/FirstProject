package com.excelr.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelperAnnotations {
	@Test(alwaysRun=true,dependsOnMethods="TC2")
	public void TC1()
	{
		System.out.println("TC1");
	}
	
	@Test()
	public void TC2()
	{
		Assert.assertTrue(false);
		System.out.println("TC2");
	}
	
	@Test(invocationCount=3)
	public void TC3()
	{
		System.out.println("TC3");
	}
	
	@Test(enabled=true,description="This is to check the title of the company")
	public void TC4()
	{
		System.out.println("TC4");
	}

}
