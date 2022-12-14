package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		String expectedmessage="I am an alert";
		Alert al=driver.switchTo().alert();
		String actualmessage=al.getText();
		al.accept();
		Thread.sleep(3000);
		if(expectedmessage.equals(actualmessage))
		{
			System.out.println("TC passed");
		}
		else
		{
			System.out.println("TC failed");
		}
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("Rupali");
		//Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}

}
