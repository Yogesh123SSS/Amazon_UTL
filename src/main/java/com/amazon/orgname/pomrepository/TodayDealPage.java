package com.amazon.orgname.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodayDealPage {
		WebDriver driver;
		public  TodayDealPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//h1[@class='a-size-extra-large a-spacing-micro']")
		private WebElement todaysDealText;
		public WebElement getTodayDealText() {
			return todaysDealText;
		}
}
