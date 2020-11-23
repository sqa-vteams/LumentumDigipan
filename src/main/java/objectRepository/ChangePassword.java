package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ChangePassword {

	public WebDriver driver;
    private By currentPassword = By.id("CurrrentPassword");
    private By newPassword = By.id("NewPassword");
	private By confirmNewPassword = By.id("ConNewPassword"); 
	private By changePasswordBtn = By.id("btn_change_pass");
	private By successMessage = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div");
	private By validationError_currentPassword = By.xpath("//*[@id=\"frm_password_change\"]/div[1]/em");
	private By validationError_newPassword = By.xpath("//*[@id=\"frm_password_change\"]/div[2]/em");
	private By validationError_confirmPassword = By.xpath("//*[@id=\"frm_password_change\"]/div[3]/em");
	private By passwords_notMatching = By.xpath("//*[@id=\"frm_password_change\"]/div[3]/em");
	private By SuccessMessage = By.xpath("/html/body/div[6]/div[2]/div/div[3]/button");
	private By oldPasswordInvalid_Message = By.xpath("/html/body/div[3]/div[2]/div/div[2]/div");
	private By close_success_popup = By.xpath("///button[@innertext='Ok']");
	
	public ChangePassword(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void OpenChangePassword () throws InterruptedException
	{
		driver.get("https://digipan.lumentumllc.us/?beta#!my_profile");
		
	}
	
	public void enter_current_password(String CurrPassword) throws InterruptedException {

		WebElement objcurrentPassword = driver.findElement(currentPassword);
		if (objcurrentPassword.isDisplayed()) {
			objcurrentPassword.sendKeys(CurrPassword);
		}
	}
	
	public void enter_new_password(String new_Password) throws InterruptedException {

		WebElement objnewPassword = driver.findElement(newPassword);
		if (objnewPassword.isDisplayed()) {
			objnewPassword.sendKeys(new_Password);
		}
	}

	public void enter_confirm_new_password(String confirm_new_Password) throws InterruptedException {

		WebElement objconfirmNewPassword = driver.findElement(confirmNewPassword);
		if (objconfirmNewPassword.isDisplayed()) {
			objconfirmNewPassword.sendKeys(confirm_new_Password);
		}
	}

	public void click_on_change_password_button() throws InterruptedException {

		WebElement objchangePasswordBtn = driver.findElement(changePasswordBtn);
		if (objchangePasswordBtn.isDisplayed()) {
			objchangePasswordBtn.click();
		}
	}
	
	public void change_user_password_form() throws InterruptedException
	{
		OpenChangePassword();
		
		WebDriverWait wait=new WebDriverWait(driver,60);
	    WebElement currentPassword_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"CurrrentPassword\"]")));
	    WebElement NewPassword_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"NewPassword\"]")));
	    WebElement ConfirmNewPassword_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ConNewPassword\"]")));
	    WebElement ChangePassword_button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn_change_pass\"]")));
	    
	    
	    enter_current_password("Casuality01!");
		enter_new_password("Casuality01!");
		enter_confirm_new_password("Casuality01!");
		click_on_change_password_button();
		
		String s1 = driver.getWindowHandle();
		driver.switchTo().window(s1);
		
		WebElement Success_Popup_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///button[@innertext='Ok']")));
		
		/* String ActualMessage = driver.findElement(SuccessMessage).getText();
		String ExpectedMessage = "Ok";				
		Assert.assertEquals(ActualMessage, ExpectedMessage); */
		
		/* WebElement obj_close_success_popup = driver.findElement(close_success_popup);
		
		if (obj_close_success_popup.isDisplayed())
		{
			obj_close_success_popup.click();
		}
		
		Assert.assertTrue(obj_close_success_popup.isDisplayed()); */
		
	}

	public void changePassword_InvalidCurrentPassword() throws InterruptedException
	{
		
		driver.navigate().refresh();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
	    WebElement currentPassword_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"CurrrentPassword\"]")));
	    WebElement NewPassword_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"NewPassword\"]")));
	    WebElement ConfirmNewPassword_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ConNewPassword\"]")));
	    WebElement ChangePassword_button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn_change_pass\"]")));
		
		enter_current_password("newPassword2!");
		enter_new_password("newPassword3!");
		enter_confirm_new_password("newPassword3!");
		click_on_change_password_button();
		
		String s2 = driver.getWindowHandle();
		driver.switchTo().window(s2);
		
		WebElement Validation_Message_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div")));
		
		String ActualMessage = driver.findElement(oldPasswordInvalid_Message).getText();
		String ExpectedMessage = "OldPassword is not valid";				
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		
	}
	
	public void changePassword_requiredFieldsValidation_checker() throws InterruptedException
	{
		
		WebElement objcurrentPassword = driver.findElement(currentPassword);
		objcurrentPassword.clear();
		WebElement objnewPassword = driver.findElement(newPassword);
		objnewPassword.clear();
		WebElement objconfirmNewPassword = driver.findElement(confirmNewPassword);
		objconfirmNewPassword.clear();
		click_on_change_password_button();
		Thread.sleep(2000);
		String expcted_ErrMsg_currPassword = "Please enter the current password.";
		WebElement objvalidationError_currentPassword= driver.findElement(validationError_currentPassword);
		String actual_validationError_currentPassword = objvalidationError_currentPassword.getText();
		Assert.assertEquals(actual_validationError_currentPassword, expcted_ErrMsg_currPassword);
		String expcted_ErrMsg_newPassword = "Password should have at least 8 characters (allowed char: ~!@#$%^&*_-+=?), one uppercase letter and one number.";
		WebElement objvalidationError_mewPassword= driver.findElement(validationError_newPassword);
		String actual_validationError_newPassword = objvalidationError_mewPassword.getText();
		Assert.assertEquals(actual_validationError_newPassword, expcted_ErrMsg_newPassword);
		String expcted_ErrMsg_confirmPassword = "Please enter confirm password.";
		WebElement objvalidationError_confirmPassword= driver.findElement(validationError_confirmPassword);
		String actual_validationError_confirmPassword = objvalidationError_confirmPassword.getText();
		Assert.assertEquals(actual_validationError_confirmPassword, expcted_ErrMsg_confirmPassword);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	public void changePassword_newPasswords_notMatching() throws InterruptedException
	{
		enter_current_password("newPassword2!");
		enter_new_password("newPassword3!");
		enter_confirm_new_password("newPassword4!");
		click_on_change_password_button();
		Thread.sleep(2000);
		String expcted_ErrMsg_cconformPassword = "Please enter the same password again.";
		WebElement objvalidationError_confirmPassword = driver.findElement(passwords_notMatching);
		String actualErrMsg_cconformPassword = objvalidationError_confirmPassword.getText();
		Assert.assertEquals(actualErrMsg_cconformPassword, expcted_ErrMsg_cconformPassword);
		WebElement objcurrentPassword = driver.findElement(currentPassword);
		objcurrentPassword.clear();
		WebElement objnewPassword = driver.findElement(newPassword);
		objnewPassword.clear();
		WebElement objconfirmNewPassword = driver.findElement(confirmNewPassword);
		objconfirmNewPassword.clear();
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	public void changePassword_restDefaultPassword() throws InterruptedException
	
	{
		enter_current_password("newPassword1!");
		enter_new_password("Casuality01!");
		enter_confirm_new_password("Casuality01!");
		click_on_change_password_button();
		Thread.sleep(2000);
		String expcted_successMessage = "Your password has been successfully updated.";
		WebElement objsuccessMeg= driver.findElement(successMessage);
		String actual_successMessage = objsuccessMeg.getText();
		Assert.assertEquals(actual_successMessage, expcted_successMessage);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
}