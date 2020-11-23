package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SecondaryMarketResearch {

	public WebDriver driver;
	private By open_SecondaryyMarketResearch = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[7]/a/span");
	private By click_pool_Details = By.xpath("//*[@id=\"tbl_secondary_research_summary\"]/tbody/tr[1]/td[3]/a");
	private By input_parcelNumber = By.xpath("//*[@id=\"ParcelNumbers\"]");
	private By click_get_Certs = By.xpath("//*[@id=\"btn_sm_research_filter_alt\"]");
	private By clear_appliedsearch = By.xpath("//*[@id=\"FilterActionPanel\"]/div[2]/div/button[2]");
	private By open_search_dropdown = By.xpath("//*[@id=\"s2id_ddl_saved_filter\"]/a/span[2]");
	private By inputSearch = By.xpath("//*[@id=\"s2id_autogen7_search\"]");
	private By open_search_Actions = By.xpath("//*[@id=\"saved_filter_actions\"]");
	private By save_new_Search = By.xpath("//*[@id=\"create_saved_filter\"]");
	private By input_new_search_name = By.xpath("//*[@id=\"SavedFilterName\"]");
	private By Save_new_search_Criteria = By.xpath("//*[@id=\"btn_save_search\"]");
	private By click_rename_search_adv = By.xpath("//*[@id=\"rename_saved_filter\"]");
	private By input_new_Adv_search_name = By.xpath("//*[@id=\"SavedFilterReName\"]");
	private By Saved_new_search_name = By.xpath("//*[@id=\"btn_rename_save_search\"]");
	private By click_delte_search_critieria = By.xpath("//*[@id=\"delete_saved_search\"]");
	private By click_data_table_Actions = By.xpath("//*[@id=\"research_actions\"]");
	private By click_update_all_filtered = By.xpath("//*[@id=\"action_update_fixed_tagging\"]");
	private By click_attach_tags = By.xpath("//*[@id=\"mainContent\"]/div[10]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/label");
	private By input_tags = By.xpath("//*[@id=\"tagValueToken-tokenfield\"]");
	private By confirm_update_tags = By.xpath("//*[@id=\"btn_tagging_update\"]");
	private By click_clear_all_filtered = By.xpath("//*[@id=\"action_delete_fixed_tagging\"]");
	private By click_confirm_delete_tags = By.xpath("/html/body/div[6]/div[2]/div/div[3]/button[1]");
	private By load_data_table = By.xpath("//*[@id=\"mainContent\"]/div[1]/div[1]/div/form/div[3]/button[2]");
	
	public SecondaryMarketResearch(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void openSecondaryMarket_Summary () throws InterruptedException 
	{
		WebElement objopen_SecondaryyMarketResearch = driver.findElement(open_SecondaryyMarketResearch);
		if (objopen_SecondaryyMarketResearch.isDisplayed())
		{
			objopen_SecondaryyMarketResearch.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_pool_Details = driver.findElement(click_pool_Details);
		if (objclick_pool_Details.isDisplayed())
		{
			objclick_pool_Details.click();
			Thread.sleep(5000);
		}
	}
	
	public void advance_search () throws InterruptedException
	{
		WebElement objinput_parcelNumber = driver.findElement(input_parcelNumber);
		if (objinput_parcelNumber.isDisplayed())
		{
			objinput_parcelNumber.click();
			objinput_parcelNumber.clear();
			objinput_parcelNumber.sendKeys("16454-217-000");
			Thread.sleep(1000);
		}
		
		WebElement objclick_get_Certs = driver.findElement(click_get_Certs);
		if (objclick_get_Certs.isDisplayed())
		{
			objclick_get_Certs.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_appliedsearch = driver.findElement(clear_appliedsearch);
		if (objclear_appliedsearch.isDisplayed())
		{
			objclear_appliedsearch.click();
			Thread.sleep(5000);
		}
		
		WebElement objopen_search_dropdown = driver.findElement(open_search_dropdown);
		if (objopen_search_dropdown.isDisplayed())
		{
			objopen_search_dropdown.click();
			Thread.sleep(5000);
		}
		
		WebElement objinputSearch = driver.findElement(inputSearch);
		if (objinputSearch.isDisplayed())
		{
			objinputSearch.click();
			objinputSearch.clear();
			objinputSearch.sendKeys("zm-arg8");
			Actions action = new Actions(driver); 
		    action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);
		}
		
		WebElement objclick_get_Certs_1 = driver.findElement(click_get_Certs);
		if (objclick_get_Certs_1.isDisplayed())
		{
			objclick_get_Certs_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_appliedsearch_1 = driver.findElement(clear_appliedsearch);
		if (objclear_appliedsearch_1.isDisplayed())
		{
			objclear_appliedsearch_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objopen_search_dropdown_1 = driver.findElement(open_search_dropdown);
		if (objopen_search_dropdown_1.isDisplayed())
		{
			objopen_search_dropdown_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objinputSearch_1 = driver.findElement(inputSearch);
		if (objinputSearch_1.isDisplayed())
		{
			objinputSearch_1.click();
			objinputSearch_1.clear();
			objinputSearch_1.sendKeys("zm-arg8");
			Actions action = new Actions(driver); 
		    action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);
		}
		
		WebElement objopen_search_Actions = driver.findElement(open_search_Actions);
		if (objopen_search_Actions.isDisplayed())
		{
			objopen_search_Actions.click();
			Thread.sleep(5000);
			
		}
		
		WebElement objsave_new_Search = driver.findElement(save_new_Search);
		if (objsave_new_Search.isDisplayed()) {
			objsave_new_Search.click();
			Thread.sleep(5000);
		}
		
		WebElement objinput_new_search_name = driver.findElement(input_new_search_name);
		if (objinput_new_search_name.isDisplayed()) {
			objinput_new_search_name.click();
			objinput_new_search_name.clear();
			String generatedString_ORG = RandomStringUtils.randomAlphabetic(10);
			objinput_new_search_name.sendKeys(generatedString_ORG);
			Thread.sleep(5000);
		}
		
		WebElement objSave_new_search_Criteria = driver.findElement(Save_new_search_Criteria);
		if (objSave_new_search_Criteria.isDisplayed()) {
			objSave_new_search_Criteria.click();
			Thread.sleep(5000);
		}
		
		WebElement objopen_search_Actions_1 = driver.findElement(open_search_Actions);
		if (objopen_search_Actions_1.isDisplayed())
		{
			objopen_search_Actions_1.click();
			Thread.sleep(5000);
			
		}
		
		WebElement objclick_rename_search_adv = driver.findElement(click_rename_search_adv);
		if (objclick_rename_search_adv.isDisplayed()) {
			objclick_rename_search_adv.click();
			Thread.sleep(6000);
		}
		
		WebElement objinput_new_Adv_search_name = driver.findElement(input_new_Adv_search_name);
		if (objinput_new_Adv_search_name.isDisplayed()) {
			objinput_new_Adv_search_name.click();
			objinput_new_Adv_search_name.clear();
			String generatedString_ORG = RandomStringUtils.randomAlphabetic(10);
			objinput_new_Adv_search_name.sendKeys(generatedString_ORG);
			Thread.sleep(5000);
		}
		
		WebElement objSaved_new_search_name = driver.findElement(Saved_new_search_name);
		if (objSaved_new_search_name.isDisplayed()) {
			objSaved_new_search_name.click();
			Thread.sleep(5000);
		}
		
		WebElement objopen_search_Actions_2 = driver.findElement(open_search_Actions);
		if (objopen_search_Actions_2.isDisplayed())
		{
			objopen_search_Actions_2.click();
			Thread.sleep(5000);
			
		}
		
		WebElement objclick_delte_search_critieria = driver.findElement(click_delte_search_critieria);
		if (objclick_delte_search_critieria.isDisplayed()) {
			objclick_delte_search_critieria.click();
			Thread.sleep(5000);
		}
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		WebElement objload_data_table = driver.findElement(load_data_table);
		if (objload_data_table.isDisplayed()) {
			objload_data_table.click();
			Thread.sleep(5000);
		}
		
	}
	
	public void data_table_actions () throws InterruptedException
	{
		WebElement objclick_data_table_Actions = driver.findElement(click_data_table_Actions);
		if (objclick_data_table_Actions.isDisplayed())
		{
			objclick_data_table_Actions.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_update_all_filtered = driver.findElement(click_update_all_filtered);
		if (objclick_update_all_filtered.isDisplayed())
		{
			objclick_update_all_filtered.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_attach_tags = driver.findElement(click_attach_tags);
		if (objclick_attach_tags.isDisplayed())
		{
			objclick_attach_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objinput_tags = driver.findElement(input_tags);
		if (objinput_tags.isDisplayed())
		{
			objinput_tags.click();
			objinput_tags.clear();
			objinput_tags.sendKeys("Automated Tags");
			Actions action = new Actions(driver); 
		    action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);
		}
		
		WebElement objconfirm_update_tags = driver.findElement(confirm_update_tags);
		if (objconfirm_update_tags.isDisplayed())
		{
			objconfirm_update_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_data_table_Actions_1 = driver.findElement(click_data_table_Actions);
		if (objclick_data_table_Actions_1.isDisplayed())
		{
			objclick_data_table_Actions_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_clear_all_filtered = driver.findElement(click_clear_all_filtered);
		if (objclick_clear_all_filtered.isDisplayed())
		{
			objclick_clear_all_filtered.click();
			Thread.sleep(10000);
		}
		
		WebElement objclick_confirm_delete_tags = driver.findElement(click_confirm_delete_tags);
		if (objclick_confirm_delete_tags.isDisplayed())
		{
			objclick_confirm_delete_tags.click();
			Thread.sleep(5000);
		}
	}
	
}