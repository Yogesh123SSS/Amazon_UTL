package amazontest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.amazon.orgname.genericutilities.BaseClass;
import com.amazon.orgname.pomrepository.AmazonHomePage;
import com.amazon.orgname.pomrepository.AmazonSignInPage;
import com.amazon.orgname.pomrepository.CustomerServicePage;
import com.amazon.orgname.pomrepository.RegistryPage;
import com.amazon.orgname.pomrepository.SellPage;
import com.amazon.orgname.pomrepository.TodayDealPage;
public class NavigationMenuTestCases extends BaseClass {
	@Test(groups={"SmokeTesting"})
	public void verifyHomePage() throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1))&&webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata",1, 1))) {
			Reporter.log("PASS ::  Amazon home page is displayed");
		}else
		{
			Reporter.log("FAIL :: Amazon home page is not displayed");
		}
	}
	@Test(groups={"SmokeTesting"})
	public	void verifyTodaysDealNavigationMenuPage() throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1))&&webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata",1, 1))) {
			Reporter.log("PASS ::  Amazon home page is displayed");
		}else
		{
			Reporter.log("FAIL :: Amazon home page is not displayed");
		}
		
	AmazonHomePage home=new AmazonHomePage(driver);
	webDriverUtils.visibilityOfElement(driver, home.getDontChangeButton());//Explicit Wait
	home.getDontChangeButton().click();
	home.getTodayDealNavigMenu().click();
	TodayDealPage todayDeal=new TodayDealPage(driver);
	
	if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 2, 1))&&webDriverUtils.visibilityOfElement(driver, todayDeal.getTodayDealText()).isDisplayed()){
		Reporter.log("PASS ::  Todays deal page is displayed");
	}else
	{
		Reporter.log("FAIL :: Todays deal page is not displayed");
	}
	}	
	@Test(groups={"SmokeTesting"})
	public void verifyCustomerServiceNavigationMenupage() throws EncryptedDocumentException, FileNotFoundException, IOException {
	
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1))&&webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata",1, 1))) {
			Reporter.log("PASS ::  Amazon home page is displayed");
		}else
		{
			Reporter.log("FAIL :: Amazon home page is not displayed");
		}
		AmazonHomePage home=new AmazonHomePage(driver);
		webDriverUtils.visibilityOfElement(driver, home.getDontChangeButton());//Explicit Wait
		home.getDontChangeButton().click();
		home.getCustomerServiceNavigMenu().click();
		CustomerServicePage customer=new CustomerServicePage(driver);
		
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 4, 1))&&webDriverUtils.visibilityOfElement(driver, customer.getDigitalServiceLink()).isDisplayed()){
			Reporter.log("PASS ::  Customer Service  page is displayed");
		}else
		{
			Reporter.log("FAIL :: Customer Service page is not displayed");
		}
	}
	@Test(groups={"SmokeTesting"})
	public void verifyRegistryNavigationMenu() throws EncryptedDocumentException, FileNotFoundException, IOException {
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1))&&webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata",1, 1))) {
			Reporter.log("PASS ::  Amazon home page is displayed");
		}else
		{
			Reporter.log("FAIL :: Amazon home page is not displayed");
		}
		AmazonHomePage home=new AmazonHomePage(driver);
		webDriverUtils.visibilityOfElement(driver, home.getDontChangeButton());//Explicit Wait
		home.getDontChangeButton().click();
		home.getRegistryNavigMenu().click();
		RegistryPage rigestry=new RegistryPage(driver);
		
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 6, 1))&&webDriverUtils.visibilityOfElement(driver, rigestry.getFindARegistryLink()).isDisplayed()){
			Reporter.log("PASS ::  Registry page is displayed");
		}else
		{
			Reporter.log("FAIL :: Registry page is not displayed");
		}
	}
	@Test(groups={"SmokeTesting"})
	public void verifySellNavigationMenuPage() throws EncryptedDocumentException, FileNotFoundException, IOException {
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1))&&webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata",1, 1))) {
			Reporter.log("PASS ::  Amazon home page is displayed");
		}else
		{
			Reporter.log("FAIL :: Amazon home page is not displayed");
		}
		AmazonHomePage home=new AmazonHomePage(driver);
		webDriverUtils.visibilityOfElement(driver, home.getDontChangeButton());//Explicit Wait
		home.getDontChangeButton().click();
		home.getSellNavigMenu().click();
		SellPage sell=new SellPage(driver);
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 8, 1))&&webDriverUtils.visibilityOfElement(driver, sell.getSellOnAmazonText()).isDisplayed()){
			Reporter.log("PASS ::  Registry page is displayed");
		}else
		{
			Reporter.log("FAIL :: Registry page is not displayed");
		}
	}
	@Test
	public void verifyListOfAutosujjestinInSearchTest() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
	webDriverUtils.implictWait(driver);
	Assert.assertEquals(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1)), true, "Expected title is");
	Reporter.log("PASS ::  Amazon home page is displayed");
	AmazonHomePage home=new AmazonHomePage(driver);
	webDriverUtils.visibilityOfElement(driver, home.getDontChangeButton());//Explicit Wait
	home.getDontChangeButton().click();
	home.getAmazonSearchBox().click();
	//Thread.sleep(10000);
	List<WebElement> list = home.getAutosujjestionList();
	System.out.println(list.size());
	Assert.assertEquals(list.size(), excelUtils.readIntDataFromExcl("amazontestdata", 10, 1), "Autosujjestion count is");
	Reporter.log("PASS: Count Of AutoSujjestions found correct and varified");
	for (WebElement singleSujjestion : list) {
		Reporter.log( "AutoSuggestions list  ------"+singleSujjestion.getText());
	}
	Reporter.log("List of autosujjestions are printed  ");
	}
	@Test
	public void signInToAmazonTest() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		Assert.assertEquals(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1)), true, "Expected title is");
		Reporter.log("PASS ::  Amazon home page is displayed");
		AmazonHomePage home=new AmazonHomePage(driver);
		webDriverUtils.visibilityOfElement(driver, home.getDontChangeButton());//Explicit Wait
		home.getDontChangeButton().click();
		Actions act=new Actions(driver);
		act.moveToElement(home.getAccountsListsIcon()).pause(10).perform();
		webDriverUtils.visibilityOfElement(driver, home.getSignInButton());
		home.getSignInButton().click();
		boolean case1 = webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 11, 1));
		boolean case2 = webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 12, 1));
		boolean[] actualCondition = {case1,case2};
		boolean[] expectedCondition = {true,true};
		Assert.assertEquals(actualCondition,expectedCondition);
		Reporter.log("PASS: Successfully logged in Amazon sign in page is displayed");
		AmazonSignInPage signIn=new AmazonSignInPage(driver);
		signIn.getEmailTextField().sendKeys(fileUtils.readDataFromPropertyFile("PhoneNumber"));
		signIn.getContinueButton().click();
		webDriverUtils.visibilityOfElement(driver, signIn.getPasswordTextfield());//Explicit wait
		signIn.getPasswordTextfield().sendKeys(fileUtils.readDataFromPropertyFile("Password"));
		signIn.getSigninSubmitButton().submit();
		Assert.assertEquals(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1)), true, "Expected title is");
		Reporter.log("PASS ::  Amazon home page is displayed");
	}
	}

