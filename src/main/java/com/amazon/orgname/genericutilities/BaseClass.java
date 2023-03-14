package com.amazon.orgname.genericutilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
	public WebDriverUtility webDriverUtils = new WebDriverUtility();
	public ExcelUtility excelUtils = new ExcelUtility();
	
	@BeforeMethod
	@Parameters("browserName")
	public void beforeConfiguration(String browserName) throws IOException, InterruptedException {
		//Here data is reading and supplying from TestNG suite file parameterization
		//String browserName = fileUtils.readDataFromPropertyFile("Browser");
		if(browserName.equals("Chrome")) {
		ChromeOptions	options=new ChromeOptions();
		options.addArguments("--profile-directory=Default");
		options.addArguments("--disable-blink-features=AutomationControlled");
			driver = new ChromeDriver(options);
		} else if( browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if(browserName.equals("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		//Thread.sleep(30000);
		driver.get(fileUtils.readDataFromPropertyFile("URL"));
		
	}
	
	@AfterMethod
	public void afterConfiguration() {
		
		driver.manage().window().minimize();
		driver.quit();
		
	}
	
}
