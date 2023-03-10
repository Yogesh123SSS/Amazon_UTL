package com.amazon.orgname.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePage {
	WebDriver driver;
	public CustomerServicePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Digital Services and Device Support")
	private WebElement digitalServiceLink;
	public WebElement getDigitalServiceLink() {
		return digitalServiceLink;
	}
}
