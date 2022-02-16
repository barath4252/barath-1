package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> Alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : Alldata) {
			String text = all.getText();
			System.out.println(text);
			
		}
		System.out.println();
		
		System.out.println("** ROW DATA**");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement row : rowdata) {
			String text = row.getText();
			System.out.println(text);
		}
		System.out.println();
		
		System.out.println("** colum data**");
		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		for (WebElement column : columndata) {
			String text = column.getText();
			System.out.println(text);
			
		}
		System.out.println();
		
		System.out.println("** Particular Data**");
		
		WebElement particularData = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
		String text = particularData.getText();
		System.out.println(text);
		
		System.out.println();
		
		System.out.println("** All Head");
		List<WebElement> headname = driver.findElements(By.tagName("th"));
		for (WebElement allhead : headname) {
			String text2 = allhead.getText();
			System.out.println(text2);
			
		}
	}

}
