package com.amazon.orgname.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistryPage {
	WebDriver driver;
	public RegistryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/registries/search']")
	private WebElement findARegistryLink;
	public WebElement getFindARegistryLink() {
		return findARegistryLink;
	}
}
