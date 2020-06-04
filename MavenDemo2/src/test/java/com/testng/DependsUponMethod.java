package com.testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependsUponMethod {
	@Test()
	public void login()
	{
		System.out.println("login");
	}
	@SuppressWarnings("deprecation")
	@Test(dependsOnMethods="login")
	//search method depends on login
	public void search()
	{
		System.out.println("search");
		
		//the search method is passed once the parameters are same
		//Assert.assertEquals("abc", "abc");
		Assert.assertEquals("xyz", "abc");

	}
	@Test(dependsOnMethods="search",alwaysRun=true)
	public void logout()
	{
		System.out.println("logout");
	}

}

