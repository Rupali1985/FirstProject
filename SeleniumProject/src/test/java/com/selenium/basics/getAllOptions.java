package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllOptions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select sc=new Select(dropdown);
		List<WebElement> options=sc.getOptions();
		System.out.println(options.size());
		
		for(WebElement abc : options)
		{
			System.out.println(abc.getText());
		}
		}

}
