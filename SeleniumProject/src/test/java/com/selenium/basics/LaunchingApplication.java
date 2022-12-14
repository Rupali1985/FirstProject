package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.name("email"));
		
		username.sendKeys("TestUserName");
		
		driver.findElement(By.name("pass")).sendKeys("TestPassword");
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
	}

}
