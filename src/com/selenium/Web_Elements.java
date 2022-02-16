package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("mgbarath05@gmail.com");
		
		String attribute = emailId.getAttribute("name");
		System.out.println(attribute);
		
		String attribute2 = emailId.getAttribute("value");
		System.out.println(attribute2);
		
//		emailId.clear();
		
		boolean displayed = emailId.isDisplayed();
		System.out.println("Is displayed :"+displayed);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		boolean enabled = password.isEnabled();
		System.out.println("Is Enabled :"+enabled);
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		boolean Selected = Login.isSelected();
		System.out.println("Is Selected:"+Selected);
		
		
		

	}

}
