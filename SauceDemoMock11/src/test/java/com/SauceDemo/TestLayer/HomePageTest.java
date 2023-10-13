package com.SauceDemo.TestLayer;

import org.testng.annotations.Test;

import com.SauceDemo.PageLayer.HomePage;
import com.SauceDemo.PageLayer.LoginPage;
import com.SauceDemo.TestBase.TestBase;

public class HomePageTest extends TestBase {
	@Test
	public void verifyBuyFunctionality()
	{
	String expected_output = "Thank you for your order!";
	//----------------------------------
	LoginPage login_obj = new LoginPage(driver);
	HomePage home_obj = new HomePage(driver);
	//CheckOutPage checkout_obj = new CheckOutPage(driver);
	//----------------------------------
	login_obj.enterUsername("standard_user");
	login_obj.enterPassword("secret_sauce");
	login_obj.clickOnLoginButton();
	home_obj.clickOnProduct();
	home_obj.clickOnAddToCart();
	home_obj.clickOnCartLink();
	/*logger.info("Added to Cart");
	checkout_obj.clickOnCheckoutButton();
	checkout_obj.fillYourInfo("rajshri", "pawar", "431127");
	checkout_obj.clickOnContinueButton();
	checkout_obj.clickOnFinishButton();
	logger.info("information filled succesfully and continue");*/
	
	//Assert.assertEquals(checkout_obj.getStatus(), expected_output);
	}

	
}



