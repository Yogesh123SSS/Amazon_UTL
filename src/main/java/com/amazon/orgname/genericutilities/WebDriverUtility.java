package com.amazon.orgname.genericutilities;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebDriverUtility {
	/**
	 * @author Yogesh K U
	 * This method is exclusively for suppling implicit wait for find the element in DOM
	 * @param driver
	 */
public void implictWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	/**
	 * This method is for suppling the time for capturing title and validating title and returns boolean 
	 * value
	 * @author Yogesh K U
	 * @param driver
	 * @param expectedTitle
	 * @return Boolean
	 */
public Boolean titleVerification(WebDriver driver, String expectedTitle) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	Boolean titlevalidation = wait.until(ExpectedConditions.titleIs(expectedTitle));
	return titlevalidation;
}
/**
 * This method is for suppling time for capturing Spec of url and verifying and returns Boolean value
 * @author Yogesh K U
 * @param driver
 * @param urlFraction
 * @return Boolean
 */
public Boolean urlVerification(WebDriver driver,String urlFraction) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	Boolean urlvalidation = wait.until(ExpectedConditions.urlContains(urlFraction));
	return urlvalidation; 
}
/**
 * This method is for check the visibility of element in the DOM and returns visible element
 * @author Yogesh K U
 * @param driver
 * @param element
 * @return WebElement
 */
public WebElement visibilityOfElement(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
	return visibleElement; 
}
}
