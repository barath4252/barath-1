package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		create.click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Barath");
		
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Raj");
		
		WebElement mobilenumber = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobilenumber.sendKeys("9952136335");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("Barath4252#");
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("7");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(4);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1992");
		
		Thread.sleep(2000);
		
		WebElement sex = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		sex.click();
		
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		
	}

}
