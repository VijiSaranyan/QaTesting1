package com.testcase;

public class callwrappers2 {

	public static void main(String[] args) throws Exception {
		orangeWrapper ow=new orangeWrapper();
		ow.insertapp("https://opensource-demo.orangehrmlive.com/");
		//enter the correct username and password
        ow.enterbyid("txtUsername", "Admin");
        ow.enterbyid("txtPassword", "admin123");
        

        //taking screenshot for login
        ow.takeScreenshot("C://CaptureScreenShot//orangehrm.jpg");

        ow.clickbyxpath("//*[@id='btnLogin']");
        
        //enter the incorrect username and passwword
        //ow.enterbyid("txtPassword", "admin12");
        //ow.clickbyxpath("//*[@id=\'forgotPasswordLink\']/a");
        
        //using xpath for PIM Module
        ow.clickbyxpath("//*[@id=\'menu_pim_viewPimModule\']");
        System.out.println("Before adding the add button ");
        
        //using xpath for ADD BUTTON
       // ow.clickbyxpath("//*[@id=\'btnAdd\']");
        ow.clickbyxpath("//input[@id='btnAdd']");
        Thread.sleep(1000);
        System.out.println("After clicking the add button ");
        
        //usingxpath for addemployee under PIM Module
       ow.clickbyxpath("//a[@id='menu_pim_addEmployee']");
        
        //using id for firstname under addemployee in PIM Module
        ow.enterbyxpath("//input[@id='firstName']", "thomas");
        
        //using id for lastname under addemployee in PIM Module
        ow.enterbyxpath("//input[@id='lastName']", "fleming");
        
        //using id for employeeId under addemployee in PIM Module
        ow.enterbyid("employeeId", "123");
        
        //upload file in Photograph under employee in PIM MOdule
		ow.enterbyxpath("//*[@id=\"photofile\"]", "C:\\Viji\\Interview questions.txt");
		
		//using xpath for create login details
		ow.clickbyxpath("//input[@id='chkLogin']");
		
		//using id for username under create login details
		ow.enterbyid("user_name", "thomas fleming");
		
		//using id for password under create login details
		ow.enterbyid("user_password", "Flemingthomas123####");
		
		//using id for confirm password under create login
		ow.enterbyid("re_password", "Flemingthomas123####");
		
		ow.selectbydropdown("//*[@id=\"status\"]", 0);
		ow.selectbydropdown("//*[@id=\"status\"]", 1);
		
		ow.clickbyxpath("//*[@id=\'btnSave\']");
		
		ow.closeapp();

		
		
        
	}

}
