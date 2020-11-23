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

public class TaxLiensTestClass {

	public WebDriver driver;
	private TaxLiens objTaxLiens;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objTaxLiens = new TaxLiens(driver);
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
	public void TaxLiens_Page_Title_Appear_Correct() {
		String actualTitle = objTaxLiens.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void open_TaxLiens_screen() throws InterruptedException {
		objTaxLiens.openTaxLiens();
	}
	
	@Test(priority = 3)
	public void explore_properties() throws InterruptedException {
		objTaxLiens.explore_property_details();
	}
	
	 @Test(priority = 4)
	public void update_bidRates() throws InterruptedException {
		 objTaxLiens.update_Bid_OverBid();
	}
	
	 @Test(priority = 5)
	public void test_Search() throws InterruptedException {
		 objTaxLiens.search();
	}
	
	 @Test(priority = 6)
	public void test_changeCounty() throws InterruptedException {
		 objTaxLiens.chnage_County(); 
	} 
	 
	 @Test(priority = 7)
	public void test_Download() throws InterruptedException {
		 objTaxLiens.download_excel_csv();
	}
	 
	
	@AfterClass
	public void closeBrowser()
	{
		// driver.quit();
	}
}
