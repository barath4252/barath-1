package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		button1.click();
		
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		button2.click();
		
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement button3 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		button3.click();
		
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Selenium");
		String text = promptalert.getText();
		System.out.println(text);
		promptalert.accept();
		
		
		
	}

}
