package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement link=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();",link);
		js.executeScript("arguments[0].style.border='3px solid green'", link);
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		//js.executeScript("alert('Alert Generation')");
		driver.navigate().to("https://www.amazon.in");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement target=driver.findElement(By.xpath("//*[@id=\"58c901c2-5eec-4d92-bfe8-664f04c720d2\"]/div[1]/h2/span"));
		js.executeScript("arguments[0].scrollIntoView", target);
		
		
		
		
	}

}
