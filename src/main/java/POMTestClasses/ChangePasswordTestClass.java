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

public class ChangePasswordTestClass {

	public WebDriver driver;
	private ChangePassword objchangePassword;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objchangePassword = new ChangePassword(driver);
		objLogin = new Login(driver);
	}

	@Test(priority = 0)
	public void test_userRegister_Page_Appear_Correct() {
		String actualTitle = objchangePassword.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@DataProvider(name = "Login")

	public Object[][] Items() throws Exception{

	Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\zeeshan.mazhar\\eclipse-workspace\\Lumentum_Artifact\\src\\main\\java\\Utilities\\Login.xlsx","Sheet1");

	return testObjArray;

	}
	@Test(priority = 1,dataProvider = "Login")
	public void valid_user_login (String userName,String password) throws InterruptedException
	{
		objLogin.validUserLogin(userName,password);
	}

	@Test(priority = 2)
	public void load_changePassword_form () throws InterruptedException
	{
		objchangePassword.change_user_password_form();
	}
	
	/* @Test(priority = 3)
	public void exec_invalid_change_pasword_cases () throws InterruptedException
	{
		objchangePassword.changePassword_InvalidCurrentPassword();
	} */

	@AfterClass
	public void clsoeBrowser() {
		driver.quit();
	}
}
