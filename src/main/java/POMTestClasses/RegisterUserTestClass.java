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

public class RegisterUserTestClass {

	public WebDriver driver;
	private Signup objSignup;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objSignup = new Signup(driver);
	}

	@Test(priority = 0)
	public void openuserRegisteration() {
		String actualTitle = objSignup.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

/*	@Test(priority = 1)
    public void exec_invalidEmailCheck_Scenario_1() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_01();

		
	} 
	 
	@Test(priority = 2) 
	public void exec_invalidEmailCheck_Scenario_2() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_02();

			
	} 
	
	@Test(priority = 3)
	public void exec_invalidEmailCheck_Scenario_3() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_03();

			
	} 
	
	@Test(priority = 4)
	public void exec_invalidEmailCheck_Scenario_4() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_04();

			
	} 

	@Test(priority = 5)
	public void exec_invalidEmailCheck_Scenario_5() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_05();

			
	} 
	
	@Test(priority = 6)
	public void exec_invalidEmailCheck_Scenario_6() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_06();

			
	} 
	
	@Test(priority = 7)
	public void exec_invalidEmailCheck_Scenario_7() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_07();

			
	} 
	
	@Test(priority = 8)
	public void exec_invalidEmailCheck_Scenario_8() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_08();

			
	} 

	@Test(priority = 9)
	public void exec_invalidEmailCheck_Scenario_9() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_09();

			
	} 

	@Test(priority = 10)
	public void exec_invalidEmailCheck_Scenario_10() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_10();

			
	} 
	
	@Test(priority = 11)
	public void exec_invalidEmailCheck_Scenario_11() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_11();

			
	}
	
	@Test(priority = 12)
	public void exec_invalidEmailCheck_Scenario_12() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_12();

			
	} 
	
	@Test(priority = 13)
	public void exec_invalidEmailCheck_Scenario_13() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_13();

			
	}
	
	@Test(priority = 14)
	public void exec_invalidEmailCheck_Scenario_14() throws InterruptedException {

		objSignup.invalidEmailChecker_test_case_14();

			
	} 
	
	@Test(priority = 15)
    public void exec_RegisteredEmailChecker() throws InterruptedException {

		objSignup.RegisteredEmailChecker_test_case_01();
	
	} */
	
	@DataProvider(name = "registerUser")

	public Object[][] Items() throws Exception{

	Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\zeeshan.mazhar\\eclipse-workspace\\Lumentum_Artifact\\src\\main\\java\\Utilities\\SignUp.xlsx","Sheet1");

	return testObjArray;

	}
	
	@Test(priority = 1,dataProvider = "registerUser")
    public void newUsersSignup(String firstName, String lastName, String userEmail, String phone) throws InterruptedException {

		objSignup.newUserSignup(firstName,lastName,userEmail, phone);
	}
	
	@AfterClass
	public void clsoeBrowser() {
		driver.quit();
	}
}
