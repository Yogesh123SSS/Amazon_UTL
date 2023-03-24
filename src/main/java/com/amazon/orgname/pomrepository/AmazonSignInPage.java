package com.amazon.orgname.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage {
	WebDriver driver;
	public AmazonSignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement emailTextField;
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	public WebElement getContinueButton() {
		return continueButton;
	}
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement passwordTextField;
	public WebElement getPasswordTextfield() {
		return passwordTextField;
	}
	@FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signinSubmitButton;
	public WebElement getSigninSubmitButton() {
		return signinSubmitButton;//type='submit'
	}
	
}

