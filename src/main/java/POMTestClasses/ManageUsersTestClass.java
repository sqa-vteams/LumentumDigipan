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

public class ManageUsersTestClass {

	public WebDriver driver;
	private ManageUsers obj_ManageUsers;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		obj_ManageUsers = new ManageUsers(driver);
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
	public void test_ManageUsers_Page_Appear_Correct() {
		String actualTitle = obj_ManageUsers.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 2)
	public void open_Manage_Users() throws InterruptedException {
		obj_ManageUsers.open_ManageUsers();
	} 
	
	@Test(priority = 3)
	public void edit_Manage_Users() throws InterruptedException {
		obj_ManageUsers.edit_user();
	} 
	
	@Test(priority = 4)
	public void edit_Access_Controls() throws InterruptedException {
		obj_ManageUsers.edit_access_ontrol_info();
		obj_ManageUsers.edit_access_control_01();
		obj_ManageUsers.edit_access_control_02();
		obj_ManageUsers.edit_access_control_03();
		obj_ManageUsers.edit_access_control_04();
	} 
	
	
	/*@Test(priority = 4)
	public void add_Manage_Users() throws InterruptedException {
		obj_ManageUsers.add_newUser();
	} */
	
	@AfterClass
	public void clsoeBrowser() {
		driver.quit();
	}
	
}