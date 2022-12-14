package com.excelr.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@AfterSuite
	public void SendReport()
	{
		System.out.println("Sending Overall Summary Report");
	}
	
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeWebTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterWebTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am in Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I am in After Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	
	
	
	@Test
	public void ValidateLogin()
	{
		System.out.println("TC1: Validating Login");
	}
	
	@Test
	public void ValidateTitle()
	{
		System.out.println("TC2: Validating Title");
	}
	
	@Test
	public void ValidateLogo()
	{
		System.out.println("TC3: Validating Logo");
	}
	
    @Test
    public void ABCTest()
	{
		System.out.println("TC4: Validating ABC Test");
	}
    
    @Test
    public void ZebraTest()
	{
		System.out.println("TC5: Validating Zebra Test");
	}
}
