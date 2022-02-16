package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox1.sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		WebElement multibutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multibutton.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox2.sendKeys("selenium");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
	}

}
