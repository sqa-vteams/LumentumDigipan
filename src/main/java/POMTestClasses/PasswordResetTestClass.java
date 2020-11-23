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

public class PasswordResetTestClass {

	public WebDriver driver;
	private ForgotPassword objForgotPassword;

	@BeforeClass
	public void setUp() {
		driver=BaseClass.initChromeDriver();
		objForgotPassword = new ForgotPassword(driver);
	}

	@Test(priority = 0)
	public void resetPasswordPageAppear() {
		String actualTitle = objForgotPassword.getPageTitle();
		String expectedTitle="Digipan Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

/*	@Test(priority = 1)
    public void exec_invalidEmailChecker_Scenario_1() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_01();

	}
	
	@Test(priority = 2)
	public void exec_invalidEmailChecker_Scenario_2() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_02();

		
	}
    
	@Test(priority = 3)
    public void exec_invalidEmailChecker_Scenario_3() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_03();

		
	}
    
	@Test(priority = 4)
    public void exec_invalidEmailChecker_Scenario_4() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_04();

		
	}
    
	@Test(priority = 5)
	public void exec_invalidEmailChecker_Scenario_5() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_05();

		
	}

	@Test(priority = 6)
    public void exec_invalidEmailChecker_Scenario_6() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_06();

		
	}
    
	@Test(priority = 7)
    public void exec_invalidEmailChecker_Scenario_7() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_07();

		
	}
    
	@Test(priority = 8)
    public void exec_invalidEmailChecker_Scenario_8() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_08();

		
	}
    
	@Test(priority = 9)
    public void exec_invalidEmailChecker_Scenario_9() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_09();

		
	}
    
	@Test(priority = 10)
    public void exec_invalidEmailChecker_Scenario_10() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_10();

		
	}
    
	@Test(priority = 11)
	public void exec_invalidEmailChecker_Scenario_11() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_11();

		
	}
    
	@Test(priority = 12)
	public void exec_invalidEmailChecker_Scenario_12() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_12();

		
	}
    
	@Test(priority = 13)
	public void exec_invalidEmailChecker_Scenario_13() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_13();

		
	}
    
	@Test(priority = 14)
    public void exec_invalidEmailChecker_Scenario_14() throws InterruptedException {

		objForgotPassword.invalidEmailChecker_test_case_14();

		
	}
    
	@Test(priority = 15)
    public void exec_UnresgiteredUserEmailChecker_Scenario_1() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_1();
	
	}
	
	@Test(priority = 16)
    public void exec_UnresgiteredUserEmailChecker_Scenario_2() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_2();
		
	}
    
	@Test(priority = 17)
    public void exec_UnresgiteredUserEmailChecker_Scenario_3() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_3();
		
	}
    
	@Test(priority = 18)
    public void exec_UnresgiteredUserEmailChecker_Scenario_4() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_4();
		
	}
	
	@Test(priority = 19)
	public void exec_UnresgiteredUserEmailChecker_Scenario_5() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_5();
		
	}
	
	@Test(priority = 20)
	public void exec_UnresgiteredUserEmailChecker_Scenario_6() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_6();
		
	}
    
	@Test(priority = 21)
	public void exec_UnresgiteredUserEmailChecker_Scenario_7() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_7();
		
	}
	
	@Test(priority = 22)
	public void exec_UnresgiteredUserEmailChecker_Scenario_8() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_8();
		
	}
	
	@Test(priority = 23)
    public void exec_UnresgiteredUserEmailChecker_Scenario_9() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_9();
		
	}
    
	@Test(priority = 24)
    public void exec_UnresgiteredUserEmailChecker_Scenario_10() throws InterruptedException {

		objForgotPassword.UnresgiteredUserEmailChecker_test_case_10();
		
	} */
	
	@DataProvider(name = "ForgotPassword")

	public Object[][] Items() throws Exception{

	Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\zeeshan.mazhar\\eclipse-workspace\\Lumentum_Artifact\\src\\main\\java\\Utilities\\ForgotPassword.xlsx","Sheet1");

	return testObjArray;

	}
	
	@Test(priority = 1,dataProvider = "ForgotPassword")
    public void execResetPasswordScenario(String userName) throws InterruptedException {

		objForgotPassword.restdigiUserPassword(userName);
	}
	
	@AfterClass
	public void clsoeBrowser() {
		driver.quit();
	}
}
