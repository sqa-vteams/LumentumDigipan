package POMTestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BasePackage.BaseClass;
import Utilities.ExcelUtils;
import objectRepository.*;

public class PrimaryMarketSummaryTestClass {

	public WebDriver driver;
	private PrimaryMarketSummary objPMS;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objPMS = new PrimaryMarketSummary(driver);
		objLogin = new Login(driver);
	}
	
	@DataProvider(name = "Login")

	public Object[][] Items() throws Exception{

	Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\zeeshan.mazhar\\eclipse-workspace\\Lumentum_Artifact\\src\\main\\java\\Utilities\\Login.xlsx","Sheet1");

	return testObjArray;

	}
	
	@Test(priority = 0,dataProvider = "Login")
	public void execloginDigipan(String userName,String password) throws InterruptedException {

		objLogin.validUserLogin(userName,password);
	}

	@Test(priority = 1)
	public void primaryMarketAppears() {
		String actualTitle = objPMS.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void openprimaryMarket() throws InterruptedException{
		objPMS.openprimaryMarket();
	}
	
	@Test(priority = 3)
	public void primaryMarketFilters() throws InterruptedException{
		objPMS.AuctionDataFilters();
	}
	
	 @Test(priority = 4)
	public void primarymarketcompressedCSVDownload() throws InterruptedException{
		objPMS.downloadcompressedCSV();
	} 
	 
	@Test(priority = 5)
	public void primarymarketsimpleCSVDownload() throws InterruptedException{
		objPMS.downloadsimpleCSV();
	} 
	
	@Test(priority = 6)
	public void primarymarketcompressedExcelDownload() throws InterruptedException{
		objPMS.downloadcompressedExcel();
	} 
	
	@Test(priority = 7)
	public void primarymarketsimpleExcelDownload() throws InterruptedException{
		objPMS.downloadsimpleExcel();
	} 
	
		
	/* @Test(priority = 3)
	public void Test_contactUs() throws InterruptedException{
		
		objPMS.Exec_ContactUs();
	} 
	
	 @Test(priority = 4)
	 public void Test_download_Excel() throws InterruptedException{
		 
		 objPMS.download_excel();
			
	}	
	  
	@Test(priority = 5)
	public void Test_movetoProspects() throws InterruptedException{
		
		objPMS.movetoProspects();
	} */
		
	@AfterClass
	public void closeBrowser ()
	{
		driver.quit();
	}
	
}
