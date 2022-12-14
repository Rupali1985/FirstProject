package com.selenium.basics;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {
	public static void main(String[] args) throws InterruptedException 
	{
		dragAndDrop();
		//keyboardEvents();
		//mouseHover();
		//scrollBy();
	}

	public static void dragAndDrop() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		WebElement Draggable=driver.findElement(By.xpath("/html/body/div[1]"));
		WebElement Droppable=driver.findElement(By.xpath("/html/body/div[2]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Draggable,Droppable).build().perform();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	public static void keyboardEvents() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		Actions act=new Actions(driver);
		act.click(username).keyDown(Keys.SHIFT).sendKeys("testusername").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void mouseHover() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement Bestseller=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(Bestseller).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void scrollBy() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ContactUs=driver.findElement(By.xpath("/html/body/div[1]/div/footer/div/div[3]/div[1]/div[1]/a[1]"));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.scrollToElement(ContactUs).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
