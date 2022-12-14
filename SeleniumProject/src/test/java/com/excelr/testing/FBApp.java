package com.excelr.testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FBApp {
	@Test(groups="smoke")
	public void Open()
	{
		System.out.println("Opening Application");
	}
	
	@Test(groups="regression")
	public void sendRequest()
	{
		System.out.println("Sending Request");
	}

	
	@Test(groups="regression")
	public void notification()
	{
		System.out.println("Sendinf Notification");
	}

}
