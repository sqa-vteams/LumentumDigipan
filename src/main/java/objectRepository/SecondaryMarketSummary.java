package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SecondaryMarketSummary {

	public WebDriver driver;
	private By open_SecondaryyMarketSummary = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[7]/a/span");
	private By open_Pool_tags = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/button");
	private By select_tags = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[3]/a/label/input");
	private By FaceAvg_Min = By.xpath("//*[@id=\"FaceAvgMin\"]");
	private By FaceAvg_Max = By.xpath("//*[@id=\"FaceAvgMax\"]");
	private By RedemtiveTTL_Min = By.xpath("//*[@id=\"RedemtiveTTLMin\"]");
	private By RedemtiveTTL_Max = By.xpath("//*[@id=\"RedemtiveTTLMax\"]");
	private By get_pools = By.xpath("//*[@id=\"btn_sms_research_filter_alt\"]");
	private By clear_applied_Search = By.xpath("//*[@id=\"FilterActionPanel\"]/div[2]/div/button[2]");
	private By select_custom_tags_1 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[4]/a/label/input");
	private By select_custom_tags_2 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[5]/a/label/input");
	private By select_custom_tags_3 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[6]/a/label/input");
	private By select_custom_tags_4 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[7]/a/label/input");
	private By select_custom_tags_5 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[8]/a/label/input");
	private By select_custom_tags_6 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[9]/a/label/input");
	private By select_custom_tags_7 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[10]/a/label/input");
	private By select_custom_tags_8 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[11]/a/label/input");
	private By select_custom_tags_9 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[12]/a/label/input");
	private By select_custom_tags_10 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[13]/a/label/input");
	private By select_custom_tags_11 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[14]/a/label/input");
	private By select_custom_tags_12 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[15]/a/label/input");
	private By select_custom_tags_13 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[16]/a/label/input");
	private By select_custom_tags_14 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[17]/a/label/input");
	private By select_custom_tags_15 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[18]/a/label/input");
	private By select_custom_tags_16 = By.xpath("//*[@id=\"sms_filters_form\"]/div/div[2]/div[4]/article[1]/div[1]/div/div/ul/li[19]/a/label/input");
	private By open_pool_listing = By.xpath("//*[@id=\"s2id_select_pool_sms\"]/a/span[2]/b");
	private By input_pool = By.xpath("//*[@id=\"s2id_autogen99_search\"]");
	private By click_tags_Sign = By.xpath("//*[@id=\"tbl_secondary_research_summary\"]/tbody/tr[1]/td[16]/a/span/span");
	private By input_tags = By.xpath("//*[@id=\"tagValueToken2-tokenfield\"]");
	private By confirm_tags_update = By.xpath("//*[@id=\"btn_tagging_update_single\"]");
	private By click_populated_tags = By.xpath("//*[@id=\"tbl_secondary_research_summary\"]/tbody/tr[1]/td[16]/a/span/span");
	private By clear_tags = By.xpath("//*[@id=\"mainContent\"]/div[11]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/a");
	private By click_download_pool = By.xpath("//*[@id=\"btn_export_sms_research_filtered\"]/i");
	private By select_file_format = By.xpath("//*[@id=\"mainContent\"]/div[5]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label");
	private By select_file_Compression = By.xpath("//*[@id=\"mainContent\"]/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/label");
	private By confirm_download_pool = By.xpath("//*[@id=\"btn_sms_modal_export_download\"]");
	private By click_contact_us = By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div[2]/div/div/div[2]/button");
	private By input_name = By.xpath("//*[@id=\"contact_name\"]");
	private By input_email = By.xpath("//*[@id=\"contact_email\"]");
	private By input_message = By.xpath("//*[@id=\"message\"]");
	private By click_submit = By.xpath("//*[@id=\"contact_us_btn\"]");
	
	public SecondaryMarketSummary(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	
	public void openSecondaryMarket_Summary () throws InterruptedException 
	{
		WebElement objopen_SecondaryyMarketSummary = driver.findElement(open_SecondaryyMarketSummary);
		if (objopen_SecondaryyMarketSummary.isDisplayed())
		{
			objopen_SecondaryyMarketSummary.click();
			Thread.sleep(10000);
		}
	}
	
	public void advance_search () throws InterruptedException
	{
		WebElement objopen_Pool_tags = driver.findElement(open_Pool_tags);
		if (objopen_Pool_tags.isDisplayed())
		{
			objopen_Pool_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objselect_tags = driver.findElement(select_tags);
		if (objselect_tags.isDisplayed())
		{
			objselect_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objclose_Pool_tags = driver.findElement(open_Pool_tags);
		if (objclose_Pool_tags.isDisplayed())
		{
			objclose_Pool_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objFaceAvg_Min = driver.findElement(FaceAvg_Min);
		if (objFaceAvg_Min.isDisplayed())
		{
			objFaceAvg_Min.click();
			objFaceAvg_Min.clear();
			objFaceAvg_Min.sendKeys("202");
		}
		
		WebElement objFaceAvg_Max = driver.findElement(FaceAvg_Max);
		if (objFaceAvg_Max.isDisplayed())
		{
			objFaceAvg_Max.click();
			objFaceAvg_Max.clear();
			objFaceAvg_Max.sendKeys("3529");
		}
		
		WebElement objRedemtiveTTL_Min = driver.findElement(RedemtiveTTL_Min);
		if (objRedemtiveTTL_Min.isDisplayed())
		{
			objRedemtiveTTL_Min.click();
			objRedemtiveTTL_Min.clear();
			objRedemtiveTTL_Min.sendKeys("14715");
		}
		
		WebElement objRedemtiveTTL_Max = driver.findElement(RedemtiveTTL_Max);
		if (objRedemtiveTTL_Max.isDisplayed())
		{
			objRedemtiveTTL_Max.click();
			objRedemtiveTTL_Max.clear();
			objRedemtiveTTL_Max.sendKeys("11670832");
		}
		
		WebElement objget_pools = driver.findElement(get_pools);
		if (objget_pools.isDisplayed())
		{
			objget_pools.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_applied_Search = driver.findElement(clear_applied_Search);
		if (objclear_applied_Search.isDisplayed())
		{
			objclear_applied_Search.click();
			Thread.sleep(5000);
		}
		
		WebElement objopen_Pool_tags_1 = driver.findElement(open_Pool_tags);
		if (objopen_Pool_tags_1.isDisplayed())
		{
			objopen_Pool_tags_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objselect_custom_tags_1 = driver.findElement(select_custom_tags_1);
		if (objselect_custom_tags_1.isDisplayed())
		{
			objselect_custom_tags_1.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_2 = driver.findElement(select_custom_tags_2);
		if (objselect_custom_tags_2.isDisplayed())
		{
			objselect_custom_tags_2.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_3 = driver.findElement(select_custom_tags_3);
		if (objselect_custom_tags_3.isDisplayed())
		{
			objselect_custom_tags_3.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_4 = driver.findElement(select_custom_tags_4);
		if (objselect_custom_tags_4.isDisplayed())
		{
			objselect_custom_tags_4.click();
			Thread.sleep(1000);
			
		}
		
		
		WebElement objselect_custom_tags_5 = driver.findElement(select_custom_tags_4);
		if (objselect_custom_tags_5.isDisplayed())
		{
			objselect_custom_tags_5.click();
			Thread.sleep(1000);
		}
		
		WebElement objselect_custom_tags_6 = driver.findElement(select_custom_tags_6);
		if (objselect_custom_tags_6.isDisplayed())
		{
			objselect_custom_tags_6.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_7 = driver.findElement(select_custom_tags_7);
		if (objselect_custom_tags_7.isDisplayed())
		{
			objselect_custom_tags_7.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_8 = driver.findElement(select_custom_tags_8);
		if (objselect_custom_tags_8.isDisplayed())
		{
			objselect_custom_tags_8.click();
			Thread.sleep(1000);
		}
		
		WebElement objselect_custom_tags_9 = driver.findElement(select_custom_tags_9);
		if (objselect_custom_tags_9.isDisplayed())
		{
			objselect_custom_tags_9.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_10 = driver.findElement(select_custom_tags_10);
		if (objselect_custom_tags_10.isDisplayed())
		{
			objselect_custom_tags_10.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_11 = driver.findElement(select_custom_tags_11);
		if (objselect_custom_tags_11.isDisplayed())
		{
			objselect_custom_tags_11.click();
			Thread.sleep(1000);
		}
		
		WebElement objselect_custom_tags_12 = driver.findElement(select_custom_tags_12);
		if (objselect_custom_tags_12.isDisplayed())
		{
			objselect_custom_tags_12.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_13 = driver.findElement(select_custom_tags_13);
		if (objselect_custom_tags_13.isDisplayed())
		{
			objselect_custom_tags_13.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_14 = driver.findElement(select_custom_tags_14);
		if (objselect_custom_tags_14.isDisplayed())
		{
			objselect_custom_tags_14.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_15 = driver.findElement(select_custom_tags_15);
		if (objselect_custom_tags_15.isDisplayed())
		{
			objselect_custom_tags_15.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objselect_custom_tags_16 = driver.findElement(select_custom_tags_16);
		if (objselect_custom_tags_16.isDisplayed())
		{
			objselect_custom_tags_16.click();
			Thread.sleep(1000);
			
		}
		
		WebElement objclose_Pool_tags_1 = driver.findElement(open_Pool_tags);
		if (objclose_Pool_tags_1.isDisplayed())
		{
			objclose_Pool_tags_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objFaceAvg_Min_1 = driver.findElement(FaceAvg_Min);
		if (objFaceAvg_Min_1.isDisplayed())
		{
			objFaceAvg_Min_1.click();
			objFaceAvg_Min_1.clear();
			objFaceAvg_Min_1.sendKeys("202");
			Thread.sleep(1000);
		}
		
		WebElement objFaceAvg_Max_1 = driver.findElement(FaceAvg_Max);
		if (objFaceAvg_Max_1.isDisplayed())
		{
			objFaceAvg_Max_1.click();
			objFaceAvg_Max_1.clear();
			objFaceAvg_Max_1.sendKeys("3529");
			Thread.sleep(1000);
		}
		
		WebElement objRedemtiveTTL_Min_1 = driver.findElement(RedemtiveTTL_Min);
		if (objRedemtiveTTL_Min_1.isDisplayed())
		{
			objRedemtiveTTL_Min_1.click();
			objRedemtiveTTL_Min_1.clear();
			objRedemtiveTTL_Min_1.sendKeys("14715");
			Thread.sleep(1000);
		}
		
		WebElement objRedemtiveTTL_Max_1 = driver.findElement(RedemtiveTTL_Max);
		if (objRedemtiveTTL_Max_1.isDisplayed())
		{
			objRedemtiveTTL_Max_1.click();
			objRedemtiveTTL_Max_1.clear();
			objRedemtiveTTL_Max_1.sendKeys("11670832");
			Thread.sleep(1000);
		}
		
		WebElement objget_pools_1 = driver.findElement(get_pools);
		if (objget_pools_1.isDisplayed())
		{
			objget_pools_1.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_applied_Search_1 = driver.findElement(clear_applied_Search);
		if (objclear_applied_Search_1.isDisplayed())
		{
			objclear_applied_Search_1.click();
			Thread.sleep(5000);
		}
		
	}
	
	public void update_tags () throws InterruptedException
	{
		WebElement objclick_tags_Sign = driver.findElement(click_tags_Sign);
		if (objclick_tags_Sign.isDisplayed())
		{
			objclick_tags_Sign.click();
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
		    Thread.sleep(1000);
		}
		
		WebElement objconfirm_tags_update = driver.findElement(confirm_tags_update);
		if (objconfirm_tags_update.isDisplayed())
		{
			objconfirm_tags_update.click();
			Thread.sleep(5000);
		}
		
		WebElement objclick_populated_tags = driver.findElement(click_populated_tags);
		if (objclick_populated_tags.isDisplayed())
		{
			objclick_populated_tags.click();
			Thread.sleep(5000);
		}
		
		WebElement objclear_tags = driver.findElement(clear_tags);
		if (objclear_tags.isDisplayed())
		{
			objclear_tags.click();
			Actions action = new Actions(driver); 
		    action.sendKeys(Keys.TAB).build().perform();
		    Thread.sleep(1000);
		}
		
		WebElement objconfirm_tags_update_1 = driver.findElement(confirm_tags_update);
		if (objconfirm_tags_update_1.isDisplayed())
		{
			objconfirm_tags_update_1.click();
		    Thread.sleep(5000);
		}
	}
	
	public void download_pool () throws InterruptedException
	{
		WebElement objclick_download_pool = driver.findElement(click_download_pool);
		if (objclick_download_pool.isDisplayed())
		{
			objclick_download_pool.click();
		    Thread.sleep(5000);
		}
		
		WebElement objselect_file_format = driver.findElement(select_file_format);
		if (objselect_file_format.isDisplayed())
		{
			objselect_file_format.click();
		    Thread.sleep(1000);
		}
		
		WebElement objselect_file_Compression = driver.findElement(select_file_Compression);
		if (objselect_file_Compression.isDisplayed())
		{
			objselect_file_Compression.click();
		    Thread.sleep(1000);
		}
		
		WebElement objconfirm_download_pool = driver.findElement(confirm_download_pool);
		if (objconfirm_download_pool.isDisplayed())
		{
			objconfirm_download_pool.click();
		    Thread.sleep(5000);
		}
		
	}
	
	public void contact_us () throws InterruptedException
	{
		
		WebElement objclick_contact_us = driver.findElement(click_contact_us);
		if (objclick_contact_us.isDisplayed())
		{
			objclick_contact_us.click();
		    Thread.sleep(5000);
		}
		
		WebElement objinput_name = driver.findElement(input_name);
		if (objinput_name.isDisplayed())
		{
			objinput_name.click();
			objinput_name.clear();
			objinput_name.sendKeys("Zeeshan Mazhar");
		}
		
		WebElement objinput_email = driver.findElement(input_email);
		if (objinput_email.isDisplayed())
		{
			objinput_email.click();
			objinput_email.clear();
			objinput_email.sendKeys("zeeshan.feb89@gmail.com");
		}
		
		WebElement objinput_message = driver.findElement(input_message);
		if (objinput_message.isDisplayed())
		{
			objinput_message.click();
			objinput_message.clear();
			objinput_message.sendKeys("In general, when we talk about the Agile method, it implies an iterative and incremental method of management. It focuses on helping teams in an evolving landscape and maintaining a focus on the rapid delivery of business value. The methodologies used in Agile project management (Scrum, XP, Kanban, and others) all follow the Agile Manifesto that is based on continuous improvement, flexibility, input of the team, and the delivery of results with high quality. I won’t go over this in details but if you are interested, you can read more about the agile principles & agile outsourcing of software development.");
			Thread.sleep(1000);
		}
		
		WebElement objclick_submit = driver.findElement(click_submit);
		if (objclick_submit.isDisplayed())
		{
			objclick_submit.click();
			 Thread.sleep(5000);
		}
	}
	
}