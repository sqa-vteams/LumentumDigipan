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


public class LoginTestClass {

	public WebDriver driver;
	private Login objLogin;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objLogin = new Login(driver);
	}

	@Test(priority = 0)
	public void testLoginPageAppear() {
		String actualTitle = objLogin.getSignInPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

/*	@Test(priority = 1)

	public void execinvalidLoginPageScenario1() throws InterruptedException {

		objLogin.InvalidLoginTC01();

	}

	@Test(priority = 2)

	public void execinvalidLoginPageScenario2() throws InterruptedException {

		objLogin.InvalidLoginTC02();

	}
	
	@Test(priority = 3)

	public void execinvalidLoginPageScenario3() throws InterruptedException {

		objLogin.InvalidLoginTC03();

	}
	
	@Test(priority = 4)

	public void execinvalidLoginPageScenario4() throws InterruptedException {

		objLogin.InvalidLoginTC04();

	}

	@Test(priority = 5)

	public void execinvalidLoginPageScenario5() throws InterruptedException {

		objLogin.InvalidLoginTC05();

	}
	
	@Test(priority = 6)

	public void execinvalidLoginPageScenario6() throws InterruptedException {

		objLogin.InvalidLoginTC06();

	} */
	
	@DataProvider(name = "Login")

	public Object[][] Items() throws Exception{

	Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\zeeshan.mazhar\\eclipse-workspace\\Lumentum_Artifact\\src\\main\\java\\Utilities\\Login.xlsx","Sheet1");

	return testObjArray;

	}
	
	@Test(priority = 1,dataProvider = "Login")
	public void execloginDigipan(String userName,String password) throws InterruptedException {

		objLogin.validUserLogin(userName,password);
	}

	@AfterClass
	public void clsoeBrowser() {
		driver.quit();
	}
}
