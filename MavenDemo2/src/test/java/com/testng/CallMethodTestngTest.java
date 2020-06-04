package com.testng;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CallMethodTestngTest {
	WebDriver driver;
	OrangeWrapper ow=new OrangeWrapper();

	@BeforeTest
	  public void insertapp()
		{
			ow.insertapp("https://opensource-demo.orangehrmlive.com/");

		}
	
	@Test(priority=1)
	public void login()
	{
		ow.enterbyid("txtUsername", "Admin");
		ow.enterbyid("txtPassword", "admin123");
        ow.clickbyxpath("//*[@id='btnLogin']");

	}
	
	
	@Test(priority=2)
	public void admin()
	{
		//using xpath  with contains for ADMIN 
		ow.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']");

		//using xpath for UserMangament under admin
		ow.clickbyxpath("//*[@id=\'menu_admin_UserManagement\']");

		//using xpath for username under Usermanagement in ADMIN
		ow.enterbyid("searchSystemUser_userName", "thomas fleming");

		//click on the search button to search a record
		ow.clickbyxpath("//input[@id='searchBtn']");

	}
	
	
	@AfterTest
	public void quit()
	{
		ow.closeapp();
	}

	
 
}
