package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLoginDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\shiv\\workspace\\DataDrivenFramework\\src\\com\\abc\\utilities\\DataDrivenFramework.properties");
		Properties p = new Properties();
		p.load(fis);
		String urldata = p.getProperty("url");
		String undata = p.getProperty("username");
		String pdata = p.getProperty("password");
		System.out.println(urldata);
		System.out.println(undata);
		System.out.println(pdata);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urldata);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(undata);
		driver.findElement(By.id("pass")).sendKeys(pdata);
		
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
