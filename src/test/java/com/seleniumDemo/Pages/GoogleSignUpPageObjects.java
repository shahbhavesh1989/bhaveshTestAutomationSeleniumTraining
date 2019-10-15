package com.seleniumDemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSignUpPageObjects {
	
	public GoogleSignUpPageObjects (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="firstName")
	public WebElement FirstName;
	
	@FindBy(how = How.ID, using="lastName")
	public WebElement LastName;
}
