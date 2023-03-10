package com.amazon.orgname.pomrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SellPage {
	WebDriver driver;
	public SellPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Sell on Amazon']")
	private WebElement sellOnAmazonText;
	public WebElement getSellOnAmazonText() {
		return sellOnAmazonText;
	}
}
