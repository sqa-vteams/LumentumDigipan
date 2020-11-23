package objectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import BasePackage.BaseClass;
import Utilities.ExcelUtils;

public class Login {

	public WebDriver driver;
    private By txtEmail = By.xpath("//*[@id=\"LoginId\"]");
	private By txtpassword = By.xpath("//*[@id=\"Password\"]");
	private By btnLogin = By.xpath("/html/body/div[3]/section/div[3]/div[2]/form/div[3]/div[1]/button");
	private By lstopenUserActions = By.xpath("/html/body/div[3]/header/div/div[2]/div[1]/div[2]/div/div[2]/button/svg");
	private By lstsignOutoption = By.xpath("/html/body/div[3]/header/div/div[2]/div[1]/div[2]/div/div[2]/ul/li[5]/a");
	private By txtLoginVerification = By.cssSelector("#pageName");
	

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getSignInPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	

	public void enterUserName(String userName) {

		WebElement emailTxtBox = driver.findElement(txtEmail);
		if (emailTxtBox.isDisplayed()) {
			emailTxtBox.sendKeys(userName);
		}

	}

	public void enterPassWord(String userPass) {
		WebElement passTxtBox = driver.findElement(txtpassword);
		if (passTxtBox.isDisplayed()) {
			passTxtBox.sendKeys(userPass);
		}
	}

	public void clickOnLoginButton() {
		WebElement signInBtn = driver.findElement(btnLogin);
		if (signInBtn.isDisplayed()) {
			signInBtn.click();
		}

	}
	
/*	public void InvalidLoginTC01() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
	    WebElement txtuserNameAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginId\"]")));
	    WebElement txtPasswordAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
	    
		enterUserName("email@doamin.com");
		enterPassWord("invalidPassword");
		clickOnLoginButton();
		
		WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div[3]/div[2]/div[1]/p")));                                                                                                 
		
		String ExpectedURL = "https://digipan.lumentumllc.us/?beta#!signin";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertTrue(validationMessageAppears.isDisplayed());

	}
	
	public void InvalidLoginTC02() throws InterruptedException {


		// driver.navigate().refresh();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
	    WebElement txtuserNameAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginId\"]")));
	    WebElement txtPasswordAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		
		WebElement objtxtEmail = driver.findElement(txtEmail);
		objtxtEmail.clear();
		
		WebElement objtxtPass = driver.findElement(txtpassword);
		objtxtPass.clear();
		
		enterUserName("zeeshan.mazhar@lumentumllc.com");
		enterPassWord("invalidPassword");
		clickOnLoginButton();
		
		WebElement ValidationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div[3]/div[2]/div[1]/p")));
		
		String ExpectedURL = "https://digipan.lumentumllc.us/?beta#!signin";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertTrue(ValidationMessageAppears.isDisplayed());
	}
	
	public void InvalidLoginTC03() throws InterruptedException {
		
		// driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver,30);
	    WebElement txtuserNameAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginId\"]")));
	    WebElement txtPasswordAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		
		WebElement objtxtEmail = driver.findElement(txtEmail);
		objtxtEmail.clear();
		
		WebElement objtxtPass = driver.findElement(txtpassword);
		objtxtPass.clear();
		
		enterUserName("email@doamin.com");
		enterPassWord("Casuality01!");
		clickOnLoginButton();
		
		WebElement ValidationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div[3]/div[2]/div[1]/p")));
		
		String ExpectedURL = "https://digipan.lumentumllc.us/?beta#!signin";
		String ActualURL = driver.getCurrentUrl();
		
		// Assert.assertEquals(ActualURL, ExpectedURL);
		
		Assert.assertTrue(ValidationMessageAppears.isDisplayed());
		Thread.sleep(1000);
	}
	
	public void InvalidLoginTC04() throws InterruptedException {
		
		
		// driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver,30);
	    WebElement txtuserNameAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginId\"]")));
	    WebElement txtPasswordAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		
		WebElement objtxtEmail = driver.findElement(txtEmail);
		objtxtEmail.clear();
		
		WebElement objtxtPass = driver.findElement(txtpassword);
		objtxtPass.clear();
		
		enterUserName("zeeshan.mazhar@lumentumllc.com");
		enterPassWord("invalidPassword");
		clickOnLoginButton();


		WebElement ValidationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div[3]/div[2]/div[1]/p")));
		
		String ExpectedURL = "https://digipan.lumentumllc.us/?beta#!signin";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertTrue(ValidationMessageAppears.isDisplayed());
	}
	
	public void InvalidLoginTC05() throws InterruptedException {

		// driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver,30);
	    WebElement txtuserNameAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginId\"]")));
	    WebElement txtPasswordAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		
		WebElement objtxtEmail = driver.findElement(txtEmail);
		objtxtEmail.clear();
		
		WebElement objtxtPass = driver.findElement(txtpassword);
		objtxtPass.clear();
		
		enterUserName("invalidemail@lumentumllc.com");
		enterPassWord("Casuality01!");
		clickOnLoginButton();
		
		WebElement ValidationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div[3]/div[2]/div[1]/p")));
		
		String ExpectedURL = "https://digipan.lumentumllc.us/?beta#!signin";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertTrue(ValidationMessageAppears.isDisplayed());
	}
	
	public void InvalidLoginTC06() throws InterruptedException {
		
		// driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver,30);
	    WebElement txtuserNameAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginId\"]")));
	    WebElement txtPasswordAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Password\"]")));
		
		WebElement objtxtEmail = driver.findElement(txtEmail);
		objtxtEmail.clear();
		
		WebElement objtxtPass = driver.findElement(txtpassword);
		objtxtPass.clear();
		
		enterUserName("1");
		enterPassWord("1");
		clickOnLoginButton();
		
		WebElement ValidationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div[3]/div[2]/div[1]/p")));
		
		String ExpectedURL = "https://digipan.lumentumllc.us/?beta#!signin";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertTrue(ValidationMessageAppears.isDisplayed());
	} */

	public void validUserLogin(String userName,String Password) throws InterruptedException {
		
		// driver.navigate().refresh();
		//WebElement objtxtEmail = driver.findElement(txtEmail);
		//WebElement objtxtPassword = driver.findElement(txtpassword);
		
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(txtEmail, 30);
		objbaseClass.waitForElementLoad(txtpassword, 30);
		
		driver.findElement(txtEmail).clear();
		driver.findElement(txtpassword).clear();
		//objtxtEmail.clear();
		//objtxtPassword.clear();
		
		enterUserName(userName);
		enterPassWord(Password);
		clickOnLoginButton();
		
		//WebElement objtxtLoginVerification = driver.findElement(txtLoginVerification);
		objbaseClass.waitForElementLoad(txtLoginVerification, 60);
		WebElement obj_Login_Verification = driver.findElement(txtLoginVerification);
		String Verifytext= obj_Login_Verification.getText().trim(); 
		Assert.assertEquals(Verifytext, "Primary Market Summary");
	
	}
}
