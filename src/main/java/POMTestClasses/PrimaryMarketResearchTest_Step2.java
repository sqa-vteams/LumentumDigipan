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

public class PrimaryMarketResearchTest_Step2 {

	public WebDriver driver;
	private PrimaryMarketResearch_Step2 objPMR;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objPMR = new PrimaryMarketResearch_Step2(driver);
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
	public void test_all_tags_Removal() throws InterruptedException {
		objPMR.remove_all_tags();
	}
	
	@AfterClass
	public void closeBrowser ()
	{
		driver.quit();
	}
	
}
	