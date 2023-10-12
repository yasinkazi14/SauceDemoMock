package com.SauceDemo.PageLayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	 }
	 //obj repository
	 @FindBy(xpath="//input[@id='user-name']")
	 private WebElement username_txtbox;
	 @FindBy(xpath="//input[@id='password']")
	 private WebElement password_txtbox;
	 @FindBy(xpath="//input[@id='login-button']")
	 private WebElement login_button;
	 
	 //Actions Methods
	 public void enterUsername(String username)
	 {
		 username_txtbox.sendKeys(username);
	 }
	 public void enterPassword(String password)
	 {
	 password_txtbox.sendKeys(password);
	}
	 public void clickOnLoginButton()
	 {
		 login_button.click(); 
	 }
	 public String getCurl()
	 {
		String ActualOutput= driver.getCurrentUrl();
		return ActualOutput;
	}


}


