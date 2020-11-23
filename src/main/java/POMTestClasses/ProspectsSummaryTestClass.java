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

public class ProspectsSummaryTestClass {

	public WebDriver driver;
	private ProspectsSummary objPS;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objPS = new ProspectsSummary(driver);
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
		String actualTitle = objPS.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void Test_calendar() throws InterruptedException{
		objPS.openProspects_Summary();
	}
	
	@Test(priority = 3)
	public void Move_To_Prospects() throws InterruptedException{
		objPS.open_Prospects_data();
		objPS.move_to_Prospects();
	}
	
	@Test(priority = 4)
	public void Download_Prospects_Data() throws InterruptedException{
		objPS.download_Prospects_data();
	}
	
	@Test(priority = 5)
	public void test_contact_us() throws InterruptedException{
		objPS.contact_us();
	}
	
	@AfterClass
	public void closeBrowser ()
	{
		driver.quit();
	}
}