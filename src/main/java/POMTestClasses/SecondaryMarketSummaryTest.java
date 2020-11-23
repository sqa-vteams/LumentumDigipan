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

public class SecondaryMarketSummaryTest {

	public WebDriver driver;
	private SecondaryMarketSummary objSMS;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objSMS = new SecondaryMarketSummary(driver);
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
	public void test_PMS_Page_Appear_Correct() {
		String actualTitle = objSMS.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void open_Pools() throws InterruptedException{
		objSMS.openSecondaryMarket_Summary();
	}
	
	 @Test(priority = 3)
	public void Advance_Search_Test() throws InterruptedException{
		objSMS.advance_search();
	} 
	
	 @Test(priority = 4)
	public void Tags_Test() throws InterruptedException{
		objSMS.update_tags();
	} 
	
	@Test(priority = 5)
	public void pools_download_test() throws InterruptedException{
		objSMS.download_pool();
	}
	
	@Test(priority = 6)
	public void test_Contact_Us() throws InterruptedException{
		objSMS.contact_us();
	}
	
	@AfterClass
	public void closeBrowser ()
	{
		driver.quit();
	}
}