package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.BaseClass;


public class ForgotPassword {

	public WebDriver driver;
    private By txtemail = By.xpath("//*[@id=\"recovery_email\"]");
	private By btnsubmitForm = By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button");
    // private By msgemailFormat = By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em");
    // private By msgunresgisteredEmail = By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p");
	private By linkgoToPasswordReset = By.linkText("Forgot your password? Click here"); 
	private By btnbackToLogin= By.xpath("/html/body/div[3]/section[2]/div/div[2]/div/a");
	
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void OpenForgotPassword () throws InterruptedException
	{
		WebElement ClickgoToPasswordReset = driver.findElement(linkgoToPasswordReset);
		if (ClickgoToPasswordReset.isDisplayed()) {
			ClickgoToPasswordReset.click();
		}
	}

	public void enterEmail(String Email) {

		WebElement emailTxtBox = driver.findElement(txtemail);
		if (emailTxtBox.isDisplayed()) {
			emailTxtBox.sendKeys(Email);
		}
	}
	
	public void submitResetPasswordForm() {

		WebElement submitResetPasswordFormclick = driver.findElement(btnsubmitForm);
		if (submitResetPasswordFormclick.isDisplayed()) {
			submitResetPasswordFormclick.click();
		}
	}

/*	public void invalidEmailCheckTC01() throws InterruptedException {
		
		OpenForgotPassword ();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
	    WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
	    WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
	    
	    WebElement objtxtemail=driver.findElement(txtemail);
	    objtxtemail.clear();
		enterEmail("plainaddress");
		submitResetPasswordForm();
			
		WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
	    
		String expectedMessage = "Please enter a valid email address.";
		String actualMessagetext = driver.findElement(msgemailFormat).getText();
		
		Assert.assertEquals(expectedMessage, actualMessagetext);
	}
	
     public void invalidEmailCheckTC02() throws InterruptedException {
		
    	// driver.navigate().refresh();
 		WebDriverWait wait=new WebDriverWait(driver,20);
 		
 		WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
	    WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
 		
	    WebElement objtxtemail=driver.findElement(txtemail);
	    objtxtemail.clear();
    	enterEmail("#@%^%#$@#$@#.com");
		submitResetPasswordForm();
		
		WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
		
		String expectedMessage = "Please enter a valid email address.";
		String actualMessagetext = driver.findElement(msgemailFormat).getText();
		
		Assert.assertEquals(expectedMessage, actualMessagetext);
		// Thread.sleep(1000);
	}

     public void invalidEmailCheckTC03() throws InterruptedException {
	
    	// driver.navigate().refresh();
  		WebDriverWait wait=new WebDriverWait(driver,20);
  		
  		WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
  		WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
 	    
  		WebElement objtxtemail=driver.findElement(txtemail);
  		objtxtemail.clear();
    	enterEmail("@domain.com");
		submitResetPasswordForm();
		
		WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
		
	    String expectedMessage = "Please enter a valid email address.";
	    String actualMessagetext = driver.findElement(msgemailFormat).getText();
	    
	    Assert.assertEquals(expectedMessage, actualMessagetext);
	    // Thread.sleep(1000);
	}

     public void invalidEmailCheckTC04() throws InterruptedException {
	
    	// driver.navigate().refresh();
   		WebDriverWait wait=new WebDriverWait(driver,20);
   		
   		WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
   		WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
  	    
   		WebElement objtxtemail=driver.findElement(txtemail);
   		objtxtemail.clear();
        enterEmail("Joe Smith <email@domain.com>");
	    submitResetPasswordForm();
	   
	   WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
	   
       String expectedMessage = "Please enter a valid email address.";
       String actualMessagetext = driver.findElement(msgemailFormat).getText();
       
       Assert.assertEquals(expectedMessage, actualMessagetext);
       // Thread.sleep(1000);
	}
     
     public void invalidEmailCheckTC05() throws InterruptedException {
    	
        // driver.navigate().refresh();
        WebDriverWait wait=new WebDriverWait(driver,20);
    	 	
        WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
        WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
   	    
        WebElement objtxtemail=driver.findElement(txtemail);
        objtxtemail.clear();
        enterEmail("email.domain.com");
  	    submitResetPasswordForm();
  	   
  	    WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
  	   
        String expectedMessage = "Please enter a valid email address.";
        String actualMessagetext = driver.findElement(msgemailFormat).getText();
       
        Assert.assertEquals(expectedMessage, actualMessagetext);
        // Thread.sleep(1000);
  	}
     
     public void invalidEmailCheckTC06() throws InterruptedException {
 		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void invalidEmailCheckTC07() throws InterruptedException {
  		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail(".email@domain.com");
    	 submitResetPasswordForm();

    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void invalidEmailCheckTC08() throws InterruptedException {
   		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email.@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);

     }
     
     public void invalidEmailCheckTC09() throws InterruptedException {
    		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email..email@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void invalidEmailCheckTC10() throws InterruptedException {
 		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain.com (Joe Smith)");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void invalidEmailCheckTC11() throws InterruptedException {
  		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void invalidEmailCheckTC12() throws InterruptedException {
   		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@-domain.com");
    	 submitResetPasswordForm();

    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void invalidEmailCheckTC13() throws InterruptedException {
    		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@111.222.333.44444");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
		
     public void invalidEmailCheckTC14() throws InterruptedException {
 		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain..com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[2]/div/div/em")));
    	 
         String expectedMessage = "Please enter a valid email address.";
         String actualMessagetext = driver.findElement(msgemailFormat).getText();

         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC1() throws InterruptedException {
  		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
    	 WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
    	 WebElement objtxtemail=driver.findElement(txtemail);
    	 objtxtemail.clear();
    	 enterEmail("email@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC2() throws InterruptedException {
   		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("firstname.lastname@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC3() throws InterruptedException {
    		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@subdomain.domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC4() throws InterruptedException {
 		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("firstname+lastname@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC5() throws InterruptedException {
  		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("1234567890@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC6() throws InterruptedException {
   		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain-one.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC7() throws InterruptedException {
    		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("_______@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC8() throws InterruptedException {
 		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain.name");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC9() throws InterruptedException {
  		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("email@domain.co.jp");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }
     
     public void unresgiteredUserEmailTC10() throws InterruptedException {
   		
    	 // driver.navigate().refresh();
         WebDriverWait wait=new WebDriverWait(driver,20);
     	 	
         WebElement txtrecoveryEmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recovery_email\"]")));
         WebElement btnSubmit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[3]/div/div/button")));
    	 
         WebElement objtxtemail=driver.findElement(txtemail);
         objtxtemail.clear();
    	 enterEmail("firstname-lastname@domain.com");
    	 submitResetPasswordForm();
    	 
    	 WebElement validationMessageAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section[1]/div[3]/div[2]/form/div[1]/p")));
    	 
         String expectedMessage = "The email address you provided is not found.";
         String actualMessagetext = driver.findElement(msgunresgisteredEmail).getText();
         
         Assert.assertEquals(expectedMessage, actualMessagetext);
         // Thread.sleep(1000);
     }     */
     
     public void restdigiUserPassword(String userName) throws InterruptedException {
    		
    	 OpenForgotPassword ();
    	 BaseClass objbaseClass = new BaseClass();
    	 objbaseClass.waitForElementLoad(txtemail, 30);
    	 objbaseClass.waitForElementLoad(btnsubmitForm, 30);
    	 
         driver.findElement(txtemail).clear();
    	 enterEmail(userName);
    	 submitResetPasswordForm();
    	 
    	 Thread.sleep(3000);
    	 objbaseClass.waitForElementLoad(btnbackToLogin, 60);
    	 WebElement objbtnBacktoLogin = driver.findElement(btnbackToLogin);
    	 Assert.assertTrue(objbtnBacktoLogin.isDisplayed());
     }  
}
