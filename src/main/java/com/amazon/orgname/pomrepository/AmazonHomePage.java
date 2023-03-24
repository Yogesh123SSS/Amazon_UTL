package com.amazon.orgname.pomrepository;

import java.util.List;

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
@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
private WebElement amazonSearchBox;
public WebElement getAmazonSearchBox() {
	return amazonSearchBox;
}
@FindBy(xpath = "//div[@class='autocomplete-results-container']//div[@class='s-suggestion-trending s-suggestion-ellipsis-direction']")
private List<WebElement> autosujjestionList;
public List<WebElement> getAutosujjestionList() {
	return autosujjestionList;
}
@FindBy(xpath = "//span[text()='Account & Lists']")
private WebElement accountsListIcon;
public WebElement getAccountsListsIcon() {
	return accountsListIcon;
}
@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']")
private WebElement signInButton;
public WebElement getSignInButton() {
	return signInButton;
}

}
