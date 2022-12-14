package com.selenium.basics;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowndemo {
public static void main(String[] args) {
	
}

public static void multiSelectDropDown(){
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://jsbin.com/osebed/2/edit?output");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	WebElement parentFrame=driver.findElement(By.xpath("//iframe[@class='stretch']"));
	driver.switchTo().frame(parentFrame);
	WebElement childFrame=driver.findElement(By.xpath("//iframe[@name='JS Bin Output']"));
	driver.switchTo().frame(childFrame);
	WebElement fruits=driver.findElement(By.id("fruits"));
	Select sc=new Select(fruits);
	sc.selectByVisibleText("Apple");
	//sc.deselectByVisibleText("Banana");
	
}

//public static void singleSelect() {
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/dropdown");
	//WebElement dropdown=driver.findElement(By.id("dropdown"));
	//Select sc=new Select(dropdown);
	//sc.selectByIndex(2);
	//sc.selectByValue("1");
	//sc.selectByVisibleText("Option 2");
	
//}
}

