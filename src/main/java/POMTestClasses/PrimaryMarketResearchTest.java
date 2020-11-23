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

public class PrimaryMarketResearchTest {

	public WebDriver driver;
	private PrimaryMarketResearch objPMR;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objPMR = new PrimaryMarketResearch(driver);
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
		String actualTitle = objPMR.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void openprimarymarketresearchForm() throws InterruptedException {
		objPMR.openprimaryMarketResearch();
	}
	
	@Test(priority = 3)
	public void runsaveFilter() throws InterruptedException {
		objPMR.saveFilter();
	}
	
	@Test(priority = 4)
	public void runclearappliedFilter() throws InterruptedException {
		objPMR.clearappliedFilter();
	}
	
	@Test(priority = 5)
	public void runcapplysavedFilter() throws InterruptedException {
		objPMR.applysavedFilter();
	}
	
	@AfterClass
	public void closeBrowser ()
	{
		driver.quit();
	}
	
}