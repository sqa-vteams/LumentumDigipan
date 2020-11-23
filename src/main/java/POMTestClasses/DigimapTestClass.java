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

public class DigimapTestClass {

	public WebDriver driver;
	private Digimap objDigimap;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objDigimap = new Digimap(driver);
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
	public void test_Digimap_Page_Appear_Correct() {
		String actualTitle = objDigimap.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void openDigimap () throws InterruptedException
	{
		objDigimap.openDigimap();
	}
	
	@Test (priority = 3)
	public void create_new_lists () throws InterruptedException
	{
		objDigimap.create_new_list();
	}
	
	@Test (priority = 4)
	public void rename_new_lists () throws InterruptedException
	{
		objDigimap.rename_list();
	}
	
	@Test (priority = 5)
	public void add_parcels_to_new_lists () throws InterruptedException
	{
		objDigimap.add_parcels_to_list();
	}
	
	@Test (priority = 6)
	public void clear_parcels_to_new_lists () throws InterruptedException
	{
		objDigimap.clear_parcels_from_list();
	}
	
	@Test (priority = 7)
	public void delete_new_lists () throws InterruptedException
	{
		objDigimap.delete_list();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}