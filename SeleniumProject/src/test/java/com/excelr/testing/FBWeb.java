package com.excelr.testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FBWeb {
	@Test(groups="smoke")
	public void Open()
	{
		System.out.println("Opening FB Web Page");
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
