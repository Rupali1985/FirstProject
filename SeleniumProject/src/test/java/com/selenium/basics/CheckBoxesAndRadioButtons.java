package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesAndRadioButtons {
	public static void main(String[] args) throws InterruptedException
	{
	   CheckBoxes();
	   //radiobutton();
		
	}

	
    private static void CheckBoxes() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println("Checking is Displayed:"+ 
	driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isDisplayed());
	System.out.println("Checking is Enabled:"+ 
	driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isEnabled());
	System.out.println("Checking is Selected:"+ 
	driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());
					
	driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
	driver.close();
	}
    
    private static void radiobutton() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://html.com/input-type-radio/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='PHP']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='JS']")).click();
    driver.close();
		
	}
	

}
