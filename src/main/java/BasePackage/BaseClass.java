package BasePackage;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	private static WebDriver driver;
	static String driverPath="D://chromedriver.exe";
	//static String driverPath="D:\\geckodriver.exe";
	static String baseUrl = "https://digipan.lumentumllc.us/#!signin";

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		//System.setProperty("webdriver.firefox.marionette", driverPath);
		//if (driver == null) {
			System.out.println("Launching Chrome Browser...");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(baseUrl);
			
      //  }
	       return driver;
	}
	
	public void waitForElementLoad(By elementPath, int waitTime)
	
	{
		try 
		{
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			        .withTimeout(Duration.ofSeconds(waitTime))
			        .pollingEvery(Duration.ofSeconds(5))
			        .ignoring(NoSuchElementException.class);

			    WebElement foo = wait.until(
			        new Function<WebDriver, WebElement>() {
			            public WebElement apply(WebDriver driver) {
			            	
			                return driver.findElement(elementPath);
			            }
			        }
			    );
			    
			    if(foo==null) {
			    	System.out.println("Requested Element was not found");
			    	
			    }else {
			    	System.out.println("Requested Element was found");
			    }
		}
		
		catch (Exception e) {
			System.out.println("Requested Element was not found");
		}
	} 
	
	@BeforeClass
	public void initializeBaseSetup() {
		try {
			initChromeDriver();
		} catch (Exception e) {
			System.out.println("Error......." + e.getStackTrace());
		}
	}

}
