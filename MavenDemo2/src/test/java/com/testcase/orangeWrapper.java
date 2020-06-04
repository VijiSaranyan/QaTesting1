package com.testcase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeWrapper {
	WebDriver driver;

		public void insertapp(String url)	
		{
			//System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		}
		public void enterbyid(String val,String name)
		{
			driver.findElement(By.id(val)).sendKeys(name);
		}
		
		public void enterbyxpath(String val,String name)
		{
			driver.findElement(By.xpath(val)).sendKeys(name);
		}
		
		public void clickbyxpath(String val1)
		{
			driver.findElement(By.xpath(val1)).click();
		}
		public void selectbydropdown(String val2,int n)
		
		{
			driver.findElement(By.xpath(val2));
			Select dropdownlist=new Select(driver.findElement(By.xpath(val2)));
			dropdownlist.selectByIndex(n);
		}
		public void takeScreenshot(String path)throws Exception
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File(path));
			
		}
		public void closeapp()
		{
			driver.close();
		}
	}


