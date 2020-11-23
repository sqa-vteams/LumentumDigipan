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

public class ProspectsResearchTestClass {

	public WebDriver driver;
	private ProspectsResearch objPR;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objPR = new ProspectsResearch(driver);
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
	public void test_PMR_Page_Appear_Correct() {
		String actualTitle = objPR.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void downlaod_countyData() throws InterruptedException {
		objPR.openPR();
	} 
	
	@Test(priority = 3)
	public void Test_Adv_search() throws InterruptedException {
		objPR.advance_search();
	} 
	
	@Test(priority = 4)
	public void Test_static_actions() throws InterruptedException {
		objPR.static_actions();
	} 
	
	@AfterClass
	public void closeBrowser ()
	{
		driver.quit();
	}

}