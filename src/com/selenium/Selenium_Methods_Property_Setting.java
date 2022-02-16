package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Methods_Property_Setting {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Selenium_Project\\Driver\\chromedriver.exe");

		//browser lanch
		
		WebDriver driver = new ChromeDriver();
		
		//get
		driver.get("https://www.amazon.in/");
		
		//Maximize
		driver.manage().window().maximize();
		
		//getTitle
		String title = driver.getTitle();
		System.out.println("Title is ; "+title);
		
		//navigation methods
		driver.navigate().to("https://www.flipkart.com/");
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is :"+currentUrl);
		
		//back
		driver.navigate().back();
		
		//thread sleep
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		
		//close
		driver.close();
		
		
		
		
	}

}
