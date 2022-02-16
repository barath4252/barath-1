package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_single_dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BARATH\\eclipse-workspace1\\Try_Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*d0pxdt*_ga*NjIyOTA2NjkyLjE2MzgwOTE5ODc.*_ga_SKB78GHTFV*MTYzOTkzMjkzMS4yLjAuMTYzOTkzMjkzMi41OQ..");
		driver.manage().window().maximize();
		
				
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		username.sendKeys("BA9952136335");
		
		Thread.sleep(3000);
		
		WebElement logbutton = driver.findElement(By.xpath("(//img[@title='arrow'])[1]"));
		logbutton.click();
		
		WebElement userid = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		userid.sendKeys("BA9952136335");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		pass.sendKeys("Barath4252#");
		
		Thread.sleep(2000);
		
		WebElement submitbutton = driver.findElement(By.xpath("//input[@type='Submit']"));
		submitbutton.click();
		
		WebElement overview = driver.findElement(By.id("navbarDropdown"));
		overview.click();
		
		Thread.sleep(2000);
		
//		WebElement logout = driver.findElement(By.id("HREF_Logout"));
//		logout.click();
		
		
		
		

		
		
	}

}
