package com.SauceDemo.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
	this.driver = driver;
	}
	//-------Obj repo ----------
	private By product1_link = By.xpath("(//div[@class='inventory_item_name'])[1]");
	private By add_to_cart_btn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By cart_link = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");
	private By menu_link = By.xpath("//button[@id='react-burger-menu-btn']");
	private By logout_link = By.xpath("//a[@id='logout_sidebar_link']");
	
	private By dropdown1 = By.xpath("//select[@class='product_sort_container']");
	//------ Action method-----------
	public void clickOnProduct()
	{
	driver.findElement(product1_link).click();
	}
	public void clickOnAddToCart()
	{
	driver.findElement(add_to_cart_btn).click();
	}
	public void clickOnCartLink()
	{
	driver.findElement(cart_link).click();
	}
	public void clickOnMenuLink()
	{
	driver.findElement(menu_link).click();
	}
	public void clickOnLogoutLink()
	{
	driver.findElement(logout_link).click();

	}
	/*public void selectOptionFromDropdown(String value)
	{
		
		WebElement element = driver.findElement(dropdown1);
		UtilClass.selectOption(element, value);*/
	}



