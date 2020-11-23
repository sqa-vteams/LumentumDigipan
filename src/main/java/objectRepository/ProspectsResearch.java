package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProspectsResearch {

	public WebDriver driver;
	private By click_Prospects_link = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[5]/a/span");
    private By expand_County_info = By.xpath("//*[@id=\"tbl_my_cert_summary\"]/tbody/tr[1]/td[1]");
    private By click_County_link = By.xpath("//*[@id=\"tbl_counties_summary_72\"]/tbody/tr[1]/td[1]/a");
    private By expand_search_dropdown = By.xpath ("//*[@id=\"s2id_ddl_saved_filter\"]/a/span[2]");
    private By input_search_name = By.xpath("//*[@id=\"s2id_autogen5_search\"]");
	private By click_get_certs = By.xpath("//*[@id=\"btn_prospects_filter\"]");
	private By clear_applied_search = By.xpath("//*[@id=\"btn_filter_clear\"]");
	private By input_Parcel_Number = By.xpath("//*[@id=\"ParcelNumbers\"]");
	private By input_adv_number = By.xpath("//*[@id=\"AdvertisementNumbers\"]");
	private By click_Actions = By.xpath("//*[@id=\"research_actions\"]");
	private By update_all_bid = By.xpath("//*[@id=\"action_update_bid_fixed\"]");
	private By input_rate_bid = By.xpath("//*[@id=\"bidRateValue\"]");
	private By cofirm_Bid_Rate_Btn = By.xpath("//*[@id=\"btn_update_bid_rate\"]");
	private By confirm_ok = By.xpath("/html/body/div[5]/div[2]/div/div[3]/button[1]");
	private By click_add_ByCounty = By.xpath("//*[@id=\"action_bulk_move_prospects_by_county\"]");
	private By input_County_01 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[62]/div[2]/input");
	private By input_County_02 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[63]/div[2]/input");
	private By input_County_03 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[64]/div[2]/input");
	private By input_County_04 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[65]/div[2]/input");
	private By input_County_05 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[66]/div[2]/input");
	private By input_County_06 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[67]/div[2]/input");
	private By input_County_07 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[68]/div[2]/input");
	private By input_County_08 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[69]/div[2]/input");
	private By input_County_09 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[70]/div[2]/input");
	private By input_County_10 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[71]/div[2]/input");
	private By input_County_11 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[72]/div[2]/input");
	private By input_County_12 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[73]/div[2]/input");
	private By input_County_13 = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[2]/div[2]/div[74]/div[2]/input");
	private By add_certs = By.xpath("//*[@id=\"btn_prospects_bulk_move_by_county\"]");
	private By close_pop_up = By.xpath("//*[@id=\"mainContent\"]/div[9]/div[2]/div[2]/div[1]/button");
	private By click_updateAlltags = By.xpath("//*[@id=\"action_update_fixed_tagging\"]");
	private By attach_tags = By.xpath("//*[@id=\"mainContent\"]/div[15]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/label");
	private By input_tags = By.xpath("//*[@id=\"tagValueToken-tokenfield\"]");
	private By confirm_tags = By.xpath("//*[@id=\"btn_tagging_update\"]");
	private By open_Search_Actions = By.xpath("//*[@id=\"saved_filter_actions\"]");
	private By save_new_Search = By.xpath("//*[@id=\"create_saved_filter\"]");
	private By input_new_search_name = By.xpath("//*[@id=\"SavedFilterName\"]");
	private By Save_new_search_Criteria = By.xpath("//*[@id=\"btn_save_search\"]");
	private By click_rename_search_adv = By.xpath("//*[@id=\"rename_saved_filter\"]");
	private By input_new_Adv_search_name = By.xpath("//*[@id=\"SavedFilterReName\"]");
	private By Saved_new_search_name = By.xpath("//*[@id=\"btn_rename_save_search\"]");
	private By click_delte_search_critieria = By.xpath("//*[@id=\"delete_saved_search\"]");
	private By clear_all_tags = By.xpath("//*[@id=\"action_delete_fixed_tagging\"]");
	private By all_tags_delete_Conformation = By.xpath("/html/body/div[6]/div[2]/div/div[3]/button[1]");
	
	public ProspectsResearch(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void openPR () throws InterruptedException 
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
			Thread.sleep(1000);
		}
		
		WebElement objclick_County_link = driver.findElement(click_County_link);
		if (objclick_County_link.isDisplayed())
		{
			objclick_County_link.click();
			Thread.sleep(10000);
		}
	}
	
	public void advance_search() throws InterruptedException
	{
		/* WebElement objopenSearch = driver.findElement(expand_search_dropdown);
		if (objopenSearch.isDisplayed()) {
			objopenSearch.click();
			Thread.sleep(10000);
		}
		
		WebElement objinput_search_name = driver.findElement(input_search_name);
		if (objinput_search_name.isDisplayed())
		{
			objinput_search_name.clear();
			objinput_search_name.sendKeys("zm-arg8");
		    Actions action = new Actions(driver); 
		    action.sendKeys(Keys.ENTER).build().perform();
		    Thread.sleep(5000);
		} 
		
		WebElement objget_certs = driver.findElement(click_get_certs);
		if (objget_certs.isDisplayed())
		{
			objget_certs.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_Search = driver.findElement(clear_applied_search);
		if (objclear_Search.isDisplayed())
		{
			objclear_Search.click();
			Thread.sleep(5000);
		} */
		
		WebElement objinput_ParcelNumber = driver.findElement(input_Parcel_Number);
		if (objinput_ParcelNumber.isDisplayed())
		{
			objinput_ParcelNumber.clear();
			objinput_ParcelNumber.sendKeys("20607037");
		}
		
		WebElement objinput_AdvNo = driver.findElement(input_adv_number);
		if (objinput_AdvNo.isDisplayed())
		{
			objinput_AdvNo.clear();
			objinput_AdvNo.sendKeys("1");
		}
		
		WebElement objget_certs_1 = driver.findElement(click_get_certs);
		if (objget_certs_1.isDisplayed())
		{
			objget_certs_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_Search_1 = driver.findElement(clear_applied_search);
		if (objclear_Search_1.isDisplayed())
		{
			objclear_Search_1.click();
			Thread.sleep(5000);
		}
		
		/* WebElement objopenadv_Search = driver.findElement(expand_search_dropdown);
		if (objopenadv_Search.isDisplayed()) {
			objopenadv_Search.click();
			Thread.sleep(5000);
		}
		
		WebElement objinput_advSearch = driver.findElement(input_search_name);
		if (objinput_advSearch.isDisplayed())
		{
			objinput_advSearch.clear();
			objinput_advSearch.sendKeys("zm-arg8");
		    Actions action = new Actions(driver); 
		    action.sendKeys(Keys.ENTER).build().perform();
		    Thread.sleep(5000);
		} 
		
		WebElement objopen_Search_Actions = driver.findElement(open_Search_Actions);
		if (objopen_Search_Actions.isDisplayed()) {
			objopen_Search_Actions.click();
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
		
		WebElement objrename_Search = driver.findElement(open_Search_Actions);
		if (objrename_Search.isDisplayed()) {
			objrename_Search.click();
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
		
		WebElement objopen_Search_Actions_1 = driver.findElement(open_Search_Actions);
		if (objopen_Search_Actions_1.isDisplayed()) {
			objopen_Search_Actions_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_delte_search_critieria = driver.findElement(click_delte_search_critieria);
		if (objclick_delte_search_critieria.isDisplayed()) {
			objclick_delte_search_critieria.click();
			Thread.sleep(5000);
		}
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000); */
	} 
	
	public void static_actions () throws InterruptedException
	{
		WebElement objclick_Actions = driver.findElement(click_Actions);
		if (objclick_Actions.isDisplayed())
		{
			objclick_Actions.click();
			Thread.sleep(10000);
		}
		
		/* WebElement objupdate_all_bid = driver.findElement(update_all_bid);
		if (objupdate_all_bid.isDisplayed())
		{
			objupdate_all_bid.click();
			Thread.sleep(5000);
		}
		
		WebElement objinput_rate_bid = driver.findElement(input_rate_bid);
		if (objinput_rate_bid.isDisplayed())
		{
			objinput_rate_bid.click();
			objinput_rate_bid.clear();
			objinput_rate_bid.sendKeys("11.56");
		}
		
		WebElement objcofirm_Bid_Rate_Btn = driver.findElement(cofirm_Bid_Rate_Btn);
		if (objcofirm_Bid_Rate_Btn.isDisplayed())
		{
			objcofirm_Bid_Rate_Btn.click();
			Thread.sleep(15000);	
		}
		
		WebElement objconfirm_ok = driver.findElement(confirm_ok);
		if (objconfirm_ok.isDisplayed())
		{
			objconfirm_ok.click();
			Thread.sleep(5000);	
		} */
		
		WebElement objclick_add_ByCounty = driver.findElement(click_add_ByCounty);
		if (objclick_add_ByCounty.isDisplayed())
		{
			objclick_add_ByCounty.click();
			Thread.sleep(5000);	
		}
		
        WebElement objinput_County_01 = driver.findElement(input_County_01);
        if (objinput_County_01.isDisplayed())
        {
        	objinput_County_01.click();
        	objinput_County_01.clear();
        	objinput_County_01.sendKeys("1.35");
        }
		
        WebElement objinput_County_02 = driver.findElement(input_County_02);
        if (objinput_County_02.isDisplayed())
        {
        	objinput_County_02.click();
        	objinput_County_02.clear();
        	objinput_County_02.sendKeys("1.35");
        }
		
        WebElement objinput_County_03 = driver.findElement(input_County_03);
        if (objinput_County_03.isDisplayed())
        {
        	objinput_County_03.click();
        	objinput_County_03.clear();
        	objinput_County_03.sendKeys("1.35");
        }
        
        WebElement objinput_County_04 = driver.findElement(input_County_04);
        if (objinput_County_04.isDisplayed())
        {
        	objinput_County_04.click();
        	objinput_County_04.clear();
        	objinput_County_04.sendKeys("1.35");
        }
        
        WebElement objinput_County_05 = driver.findElement(input_County_05);
        if (objinput_County_05.isDisplayed())
        {
        	objinput_County_05.click();
        	objinput_County_05.clear();
        	objinput_County_05.sendKeys("1.35");
        }
        
        WebElement objinput_County_06 = driver.findElement(input_County_06);
        if (objinput_County_06.isDisplayed())
        {
        	objinput_County_06.click();
        	objinput_County_06.clear();
        	objinput_County_06.sendKeys("1.35");
        }
        
        WebElement objinput_County_07 = driver.findElement(input_County_07);
        if (objinput_County_07.isDisplayed())
        {
        	objinput_County_07.click();
        	objinput_County_07.clear();
        	objinput_County_07.sendKeys("1.35");
        }
		
        WebElement objinput_County_08 = driver.findElement(input_County_08);
        if (objinput_County_08.isDisplayed())
        {
        	objinput_County_08.click();
        	objinput_County_08.clear();
        	objinput_County_08.sendKeys("1.35");
        }
		
        WebElement objinput_County_09 = driver.findElement(input_County_09);
        if (objinput_County_09.isDisplayed())
        {
        	objinput_County_09.click();
        	objinput_County_09.clear();
        	objinput_County_09.sendKeys("1.35");
        }
		
        WebElement objinput_County_10 = driver.findElement(input_County_10);
        if (objinput_County_10.isDisplayed())
        {
        	objinput_County_10.click();
        	objinput_County_10.clear();
        	objinput_County_10.sendKeys("1.35");
        }
        
        WebElement objinput_County_11 = driver.findElement(input_County_11);
        if (objinput_County_11.isDisplayed())
        {
        	objinput_County_11.click();
        	objinput_County_11.clear();
        	objinput_County_11.sendKeys("1.35");
        }
        
        WebElement objinput_County_12 = driver.findElement(input_County_12);
        if (objinput_County_12.isDisplayed())
        {
        	objinput_County_12.click();
        	objinput_County_12.clear();
        	objinput_County_12.sendKeys("1.35");
        }
        
        WebElement objinput_County_13 = driver.findElement(input_County_13);
        if (objinput_County_13.isDisplayed())
        {
        	objinput_County_13.click();
        	objinput_County_13.clear();
        	objinput_County_13.sendKeys("1.35");
        }
        
        WebElement objadd_certs = driver.findElement(add_certs);
        if (objadd_certs.isDisplayed())
        {
        	objadd_certs.click();
        	Thread.sleep(10000);
        }
        
        WebElement objclose_pop_up = driver.findElement(close_pop_up);
        if (objclose_pop_up.isDisplayed())
        {
        	objclose_pop_up.click();
        	Thread.sleep(1000);
        }
        
		WebElement objclick_Actions_1 = driver.findElement(click_Actions);
		if (objclick_Actions_1.isDisplayed())
		{
			objclick_Actions_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_updateAlltags = driver.findElement(click_updateAlltags);
		if (objclick_updateAlltags.isDisplayed())
		{
			objclick_updateAlltags.click();
			Thread.sleep(5000);
		}
		
		WebElement objattach_tags = driver.findElement(attach_tags);
		if (objattach_tags.isDisplayed())
		{
			objattach_tags.click();
			Thread.sleep(1000);
		}
		
		WebElement objinput_tags = driver.findElement(input_tags);
		if (objattach_tags.isDisplayed())
		{
			objinput_tags.click();
			objinput_tags.clear();
			objinput_tags.sendKeys("Automated Tags");
			Actions action = new Actions(driver); 
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
		}
		
		WebElement objconfirm_tags = driver.findElement(confirm_tags);
		if (objconfirm_tags.isDisplayed())
		{
			objconfirm_tags.click();
			Thread.sleep(5000);
		}  
		
		WebElement objclick_Actions1 = driver.findElement(click_Actions);
		if (objclick_Actions1.isDisplayed())
		{
			objclick_Actions1.click();
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