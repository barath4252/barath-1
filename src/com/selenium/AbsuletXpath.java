package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsuletXpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Try_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		
		email.sendKeys("mgbarath");
		
		WebElement pass = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/div/input"));
		pass.sendKeys("12345");
	}
}
