package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.BaseClass;

public class Signup {

	public WebDriver driver;
	private By btnopenSignup = By.xpath("/html/body/div[3]/section/div[3]/div[3]/a");
	private By txtfirstName = By.xpath("//*[@id=\"txt_firstname\"]");
	private By txtlastName = By.xpath("//*[@id=\"txt_lastname\"]");
	private By txtemail = By.xpath("//*[@id=\"LoginId\"]");
	private By txtphoneNumber = By.xpath("//*[@id=\"txt_phone\"]");
	private By btnsignUp = By.xpath("//button[@id='btn_signup_submit']");
	private By confirmationEmail = By.xpath("/html/body/div[3]/section/div/div[2]/h4");
	// private By btnBacktoLogin = By.xpath("//*[@id=\"back_to_login\"]");
	// private By emailFormatCheck = By.xpath("//*[@id=\"form_signup\"]/div[2]/div[1]/div/em");
	// private By resgisteredEmailCheck = By.xpath("/html/body/div[4]/section/div[3]/div[2]/p[3]");
	// private By btnBacktoLogin = By.xpath("//*[@id="back_to_login"]");
	// private By emailValidationtext = By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em");

	public Signup(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void openRegistrationscreen() throws InterruptedException {
		WebElement objopenSignupfrm = driver.findElement(btnopenSignup);
		if (objopenSignupfrm.isDisplayed()) {
			objopenSignupfrm.click();
		}
	}

	public void enterfirstName(String Fname) {

		WebElement objfNametextBox = driver.findElement(txtfirstName);
		if (objfNametextBox.isDisplayed()) {
			objfNametextBox.sendKeys(Fname);
		}
	}

	public void enterlastName(String Lname) {

		WebElement objlnametextBox = driver.findElement(txtlastName);
		if (objlnametextBox.isDisplayed()) {
			objlnametextBox.sendKeys(Lname);
		}
	}

	public void enteruserEmail(String userEmail) {

		WebElement objemailtextBox = driver.findElement(txtemail);
		if (objemailtextBox.isDisplayed()) {
			objemailtextBox.sendKeys(userEmail);
		}
	}

	public void enteruserPhone(String userPhone) {

		WebElement objphonetextBox = driver.findElement(txtphoneNumber);
		if (objphonetextBox.isDisplayed()) {
			objphonetextBox.sendKeys(userPhone);
		}
	}

	public void submitRegistrationForm() {

		WebElement objsignupBtn = driver.findElement(btnsignUp);
		if (objsignupBtn.isDisplayed()) {
			objsignupBtn.click();
		}
	}

	/*
	 * public void invalidEmailChecker_test_case_01() throws InterruptedException {
	 * 
	 * openRegistrationscreen();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("plainaddress"); enter_user_phone("(772) 539-4639");
	 * click_on_signup();
	 * 
	 * WebElement object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_02() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("#@%^%#$@#$@#.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_03() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("@domain.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_04() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("@Joe Smith <email@domain.com>");
	 * enter_user_phone("7725394639"); click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_05() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email.domain.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_06() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email@domain@domain.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_07() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email(".email@domain.com"); enter_user_phone("7725394639");
	 * 
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_firstname\"]")));
	 * WebElement object_lastName_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"txt_lastname\"]")));
	 * WebElement
	 * object_Email_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"LoginId\"]"))); WebElement
	 * object_Phone_Appear=wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("//*[@id=\"txt_phone\"]"))); WebElement
	 * object_CreateAccount_Appear=wait.until(ExpectedConditions.
	 * visibilityOfElementLocated(By.xpath("//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_08() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email.@domain.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_09() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email..email@domain.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_10() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email@domain.com (Joe Smith)");
	 * enter_user_phone("7725394639"); click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_11() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email@domain"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_12() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email@-domain.com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_13() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email@111.222.333.44444"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void invalidEmailChecker_test_case_14() throws InterruptedException {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("David"); enter_last_name("Rodriguez");
	 * enter_user_email("email@domain..com"); enter_user_phone("7725394639");
	 * click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(
	 * By.xpath("/html/body/div[4]/section/div[3]/div[2]/form/div[2]/div[1]/div/em")
	 * ));
	 * 
	 * String expectedMessage = "Please enter a valid email address."; String
	 * actualMessagetext = driver.findElement(emailFormatChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 * public void RegisteredEmailChecker_test_case_01() throws InterruptedException
	 * {
	 * 
	 * WebElement obj_First_Name = driver.findElement(fNametextBox); WebElement
	 * obj_Last_Name = driver.findElement(lnametextBox); WebElement obj_Email =
	 * driver.findElement(emailtextBox); WebElement obj_phone =
	 * driver.findElement(phonetextBox);
	 * 
	 * obj_First_Name.clear(); obj_Last_Name.clear(); obj_Email.clear();
	 * obj_phone.clear();
	 * 
	 * enter_first_name("Muhammad Zeeshan"); enter_last_name("Mazhar");
	 * enter_user_email("zeeshan.mazhar@lumentumllc.com");
	 * enter_user_phone("(7725394639"); click_on_signup();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 20); WebElement
	 * object_emailValidationtext = wait.until(ExpectedConditions
	 * .visibilityOfElementLocated(By.xpath(
	 * "/html/body/div[4]/section/div[3]/div[2]/p[3]")));
	 * 
	 * String expectedMessage =
	 * "The email address you provided is already registered. Please try again with a different email address or try logging in."
	 * ; String actualMessagetext =
	 * driver.findElement(resgisteredEmailChecker).getText();
	 * Assert.assertEquals(expectedMessage, actualMessagetext);
	 * 
	 * driver.navigate().refresh();
	 * 
	 * WebElement object_firstName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_firstname\"]"))); WebElement object_lastName_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_lastname\"]"))); WebElement object_Email_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"LoginId\"]"))); WebElement object_Phone_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"txt_phone\"]"))); WebElement object_CreateAccount_Appear = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//*[@id=\"btn_signup_submit\"]")));
	 * 
	 * }
	 * 
	 */
	public void newUserSignup(String firstName, String lastName, String userEmail, String phone) throws InterruptedException {
		
		openRegistrationscreen();
			
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(txtfirstName, 30);
		objbaseClass.waitForElementLoad(txtlastName, 30);
		objbaseClass.waitForElementLoad(txtemail, 30);
		objbaseClass.waitForElementLoad(txtphoneNumber, 30);
		objbaseClass.waitForElementLoad(btnsignUp, 30);
		 
		/* String sysgenEmail = RandomStringUtils.randomAlphabetic(10);
		String sysgenfName = RandomStringUtils.randomAlphabetic(10);
		String sysgenlName = RandomStringUtils.randomAlphabetic(10);
		String sysgenPhone = RandomStringUtils.randomNumeric(10); */
		
		driver.findElement(txtfirstName).clear();
		driver.findElement(txtlastName).clear();
		driver.findElement(txtemail).clear();
		driver.findElement(txtphoneNumber).clear();
		
		enterfirstName(firstName);
		enterlastName(lastName);
		enteruserEmail(userEmail);
		enteruserPhone(phone);
		
		driver.findElement(btnsignUp).click();
		Thread.sleep(3000);
		objbaseClass.waitForElementLoad(confirmationEmail, 100);
		WebElement obj_Login_Verification = driver.findElement(confirmationEmail);
		String Verifytext= obj_Login_Verification.getText().trim(); 
		Assert.assertEquals(Verifytext, "Confirmation Email Sent");

	}

	private void click_on_signup() {
		// TODO Auto-generated method stub
		
	}

}