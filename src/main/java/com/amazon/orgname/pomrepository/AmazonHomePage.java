package com.amazon.orgname.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
WebDriver driver;
public AmazonHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Today's Deals")
private WebElement todaysDealNavigMenu;
public WebElement getTodayDealNavigMenu() {
	return todaysDealNavigMenu;
}
@FindBy(xpath = " //span[@class='a-button-inner']/input[@data-action-type='DISMISS']")
private WebElement dontChangeButton;
public WebElement getDontChangeButton() {
	return dontChangeButton;
}
@FindBy(xpath = "//div/a[text()='Customer Service']")
private WebElement customerServiceNavigmenu;
public WebElement getCustomerServiceNavigMenu() {
	return customerServiceNavigmenu; 
}
@FindBy(xpath = "//a[text()='Registry']")
private WebElement registryNavigMenu;
public WebElement getRegistryNavigMenu() {
	return registryNavigMenu;
}
@FindBy(xpath = "//a[text()='Sell']")
private WebElement sellNavigMenu;
public WebElement getSellNavigMenu() {
	return sellNavigMenu;
}
}
