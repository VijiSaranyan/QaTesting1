package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLogin {

	public static void main(String[] args) {
		
		//using webdrivermanager for launching the browser
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.google.com/	");


	}
	public void gitdemo()
	{
		
	}

}
