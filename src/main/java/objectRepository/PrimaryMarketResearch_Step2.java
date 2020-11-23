package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrimaryMarketResearch_Step2 {

	public WebDriver driver;
    private By clear_all_tags = By.xpath("//*[@id=\"action_delete_fixed_tagging\"]");
    private By confirm_Final_Btn = By.xpath("/html/body/div[6]/div[2]/div/div[3]/button[1]");
    private By click_Actions_button = By.xpath("//*[@id=\"research_actions\"]");
    private By expandCounties = By.xpath("//*[@id=\"tbl_states_summary\"]/tbody/tr[1]/td[1]");
    private By click_County_Name = By.linkText("Apache");
                                          
	public PrimaryMarketResearch_Step2(WebDriver driver) {
		this.driver = driver;
	}
	
	public void remove_all_tags () throws InterruptedException 
	{
		
		WebElement objexpandCounties = driver.findElement(expandCounties);
		if (objexpandCounties.isDisplayed())
		{
			objexpandCounties.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_County_Name = driver.findElement(click_County_Name);
		if (objclick_County_Name.isDisplayed())
		{
			objclick_County_Name.click();
			Thread.sleep(5000);
		}
		
		
		WebElement objclick_Actions_button = driver.findElement(click_Actions_button);
		if (objclick_Actions_button.isDisplayed())
		{
			objclick_Actions_button.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_all_tags = driver.findElement(clear_all_tags);
		if (objclear_all_tags.isDisplayed())
		{
			objclear_all_tags.click();
			Thread.sleep(5000);
		}
		
	
		WebElement objconfirm_Final_Btn = driver.findElement(confirm_Final_Btn);
		if (objconfirm_Final_Btn.isDisplayed())
		{
			objconfirm_Final_Btn.click();
			Thread.sleep(5000);
		}
	}
	
	
		
}