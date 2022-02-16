package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Try_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("mgbarath05@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("Your Current url is : "+currentUrl);
		
//		String title = driver.getTitle();
//		System.out.println("Your Current title is:"+title);
		
	}

}
