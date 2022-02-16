package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		Explicit wait
		driver.manage().window().maximize();
		WebElement password = driver.findElement(By.id("pass"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement until = wait.until(ExpectedConditions.visibilityOf(password));
		
		password.sendKeys("12345");
	}
}
