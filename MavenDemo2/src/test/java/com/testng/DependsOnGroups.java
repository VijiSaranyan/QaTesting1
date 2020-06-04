package com.testng;

import org.testng.annotations.Test;

import junit.framework.Assert;
//since we have included whatever type of test we need in testng.xml and exclude whatever type of test
//but we include one test and exclude one test 	@Test(groups= {"smoketesting","sanitytesting"}) this test will not work

public class DependsOnGroups {
	@Test(groups= {"smoketesting","sanitytesting"})
	public void login()
	{
		System.out.println("login");
	}
	
	
	@SuppressWarnings("deprecation")
		@Test(groups= {"smoketesting","regressiontesting"})

	//search method depends on login
	public void search()
	{
		System.out.println("search");
		
		
	}
	@Test(groups= {"regressiontesting","retesting"})
	public void logout()
	{
		System.out.println("logout");
	}


}
