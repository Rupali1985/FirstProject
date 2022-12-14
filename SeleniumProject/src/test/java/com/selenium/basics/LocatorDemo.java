package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("TestAdmin");
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.cssSelector("#pass")).sendKeys("TestPassword");
		Thread.sleep(3000);
		driver.close();
	}

}
