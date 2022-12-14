package com.excelr.testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test
	public void validateLogin()
	{
		System.out.println("Validating Login TC");
		AssertJUnit.assertTrue(true);
	}
	
	@Test(dependsOnMethods="validateLogin")
	public void applyLeave()
	{
		System.out.println("Validating Apply Leave TC");
		//Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods={"validateLogin","applyLeave"})
	public void editLeave()
	{
		System.out.println("Validating Edit Leave TC");
	}
	
	@Test(dependsOnMethods={"validateLogin","applyLeave"})
	public void deleteLeave()
	{
		System.out.println("Validating Delete Leave TC");
	}

}
