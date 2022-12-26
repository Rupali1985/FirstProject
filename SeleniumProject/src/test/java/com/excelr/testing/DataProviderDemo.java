package com.excelr.testing;

import org.openqa.selenium.By
;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	@Test(dataProvider = "loginData",dataProviderClass=Excel_Reader.class)
	public void validateLogin(String uname, String pwd) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.quit();
	}
	
    
    
    
}
