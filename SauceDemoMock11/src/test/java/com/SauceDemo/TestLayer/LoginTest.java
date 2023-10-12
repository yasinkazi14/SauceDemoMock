package com.SauceDemo.TestLayer;

import com.SauceDemo.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PageLayer.LoginPage;


public class LoginTest extends TestBase {
	@Test
	public void loginWithCorrectCredientials()
	{
		String expectedOutput="https://www.saucedemo.com/inventory.html";
		LoginPage login_obj= new LoginPage(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauce");
		login_obj.clickOnLoginButton();
		//logger.info("Logged in");
		

		Assert.assertEquals(login_obj.getCurl(), expectedOutput);
		
	}
	@Test
	public void loginWithIncorrectCredientials()
	{
		String expectedOutput="https://www.saucedemo.com/";
		LoginPage login_obj= new LoginPage(driver);
		login_obj.enterUsername("stand");
		login_obj.enterPassword("sec");
		login_obj.clickOnLoginButton();
		//logger.info("Logged in failed ");
		

		Assert.assertEquals(login_obj.getCurl(), expectedOutput);
		
		
	}

}





