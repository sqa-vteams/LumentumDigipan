package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProspectsResearch_Step2 {

	public WebDriver driver;
	private By click_Prospects_link = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[5]/a/span");
    private By expand_County_info = By.xpath("//*[@id=\"tbl_my_cert_summary\"]/tbody/tr[1]/td[1]");
    private By click_County_link = By.xpath("//*[@id=\"tbl_counties_summary_72\"]/tbody/tr[1]/td[1]/a");
    private By click_Actions = By.xpath("//*[@id=\"research_actions\"]");
	private By clear_all_tags = By.xpath("//*[@id=\"action_delete_fixed_tagging\"]");
	private By all_tags_delete_Conformation = By.xpath("/html/body/div[6]/div[2]/div/div[3]/button[1]");

                                          
	public ProspectsResearch_Step2(WebDriver driver) {
		this.driver = driver;
	}
	
	public void remove_all_tags () throws InterruptedException 
	{
		WebElement objclick_Prospects_link = driver.findElement(click_Prospects_link);
		if (objclick_Prospects_link.isDisplayed())
		{
			objclick_Prospects_link.click();
			Thread.sleep(10000);
		}
		
		WebElement objexpand_County_info = driver.findElement(expand_County_info);
		if (objexpand_County_info.isDisplayed())
		{
			objexpand_County_info.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_County_link = driver.findElement(click_County_link);
		if (objclick_County_link.isDisplayed())
		{
			objclick_County_link.click();
			Thread.sleep(10000);
		}
		
		WebElement objclick_Actions = driver.findElement(click_Actions);
		if (objclick_Actions.isDisplayed())
		{
			objclick_Actions.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_all_tags = driver.findElement(clear_all_tags);
		if (objclear_all_tags.isDisplayed())
		{
			objclear_all_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objall_tags_delete_Conformation = driver.findElement(all_tags_delete_Conformation);
		if (objall_tags_delete_Conformation.isDisplayed())
		{
			objall_tags_delete_Conformation.click();
			Thread.sleep(5000);
		}
	}	
}