package amazontest;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.amazon.orgname.genericutilities.BaseClass;
import com.amazon.orgname.pomrepository.AmazonHomePage;
import com.amazon.orgname.pomrepository.CustomerServicePage;
import com.amazon.orgname.pomrepository.RegistryPage;
import com.amazon.orgname.pomrepository.SellPage;
import com.amazon.orgname.pomrepository.TodayDealPage;
public class NavigationMenuTestCases extends BaseClass {
	@Test(priority = 01)
	public void verifyHomePage() throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		if(webDriverUtils.titleVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata", 0, 1))&&webDriverUtils.urlVerification(driver, excelUtils.readStringDataFromExcel("amazontestdata",1, 1))) {
			Reporter.log("PASS ::  Amazon home page is displayed");
		}else
		{
			Reporter.log("FAIL :: Amazon home page is not displayed");
		}
	}
	@Test(priority = 02)
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
	@Test(priority = 03)
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
	@Test(priority = 04)
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
	@Test(priority = 05)
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
	}

