package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProspectsSummary {

	public WebDriver driver;
	private By click_prospects_link = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[5]/a/span");
	private By expand_county_data = By.xpath("//*[@id=\"tbl_my_cert_summary\"]/tbody/tr[1]/td[1]");
	private By click_Add_Prospects = By.xpath("//*[@id=\"action-bulk-prospects-by-county\"]");
	private By input_Bid_rate = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/input");
	private By input_Bid_Rate_serach_01 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/input");
	private By input_Bid_Rate_serach_02 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/input");
	private By input_Bid_Rate_serach_03 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/input");
	private By input_Bid_Rate_serach_04 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/input");
	private By input_Bid_Rate_serach_05 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/input");
	private By input_Bid_Rate_serach_06 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/input");
	private By input_Bid_Rate_serach_07 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[6]/div[2]/input");
	private By input_Bid_Rate_serach_08 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[7]/div[2]/input");
	private By input_Bid_Rate_serach_09 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[62]/div[2]/input");
	private By input_Bid_Rate_serach_10 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[63]/div[2]/input");
	private By input_Bid_Rate_serach_11 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[64]/div[2]/input");
	private By input_Bid_Rate_serach_12 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[65]/div[2]/input");
	private By input_Bid_Rate_serach_13 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[66]/div[2]/input");
	private By input_Bid_Rate_serach_14 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[67]/div[2]/input");
	private By input_Bid_Rate_serach_15 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[68]/div[2]/input");
	private By input_Bid_Rate_serach_16 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[69]/div[2]/input");
	private By input_Bid_Rate_serach_17 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[70]/div[2]/input");
	private By input_Bid_Rate_serach_18 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[71]/div[2]/input");
	private By input_Bid_Rate_serach_19 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[72]/div[2]/input");
	private By input_Bid_Rate_serach_20 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[73]/div[2]/input");
	private By input_Bid_Rate_serach_21 = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[2]/div[2]/div[74]/div[2]/input");
	private By click_confirm_Move_Prospects_Btn = By.xpath("//*[@id=\"btn_prospects_summary_bulk_move_by_county\"]");
	private By close_Prospects_popup = By.xpath("//*[@id=\"mainContent\"]/div[4]/div[2]/div[2]/div[1]/button");
	private By click_download_excel = By.xpath("//*[@id=\"btn_export_prospects_summary\"]/button/i");
	private By select_fileFormat = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label");
	private By select_file_Compression = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/label");
	private By download_file = By.xpath("//*[@id=\"btn_pro_summ_modal_export_download\"]");
	private By click_Contact_us_Btn = By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div/form/div[4]/button");
	private By input_Name = By.xpath("//*[@id=\"contact_name\"]");
	private By input_Email = By.xpath("//*[@id=\"contact_email\"]");
	private By input_Message = By.xpath("//*[@id=\"message\"]");
	private By click_Confirm_Contact = By.xpath("//*[@id=\"contact_us_btn\"]");

	
	public ProspectsSummary(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	
	public void openProspects_Summary () throws InterruptedException 
	{
		WebElement objclick_prospects_link = driver.findElement(click_prospects_link);
		if (objclick_prospects_link.isDisplayed())
		{
			objclick_prospects_link.click();
			Thread.sleep(10000);
		}
	}
	
	public void open_Prospects_data() throws InterruptedException
	{
		WebElement objexpand_county_data = driver.findElement(expand_county_data);
		if (objexpand_county_data.isDisplayed())
		{
			objexpand_county_data.click();
			Thread.sleep(5000);
		}
	}
	
	public void move_to_Prospects() throws InterruptedException
	{
		WebElement objclick_Add_Prospects = driver.findElement(click_Add_Prospects);
		if (objclick_Add_Prospects.isDisplayed())
		{
			objclick_Add_Prospects.click();
			Thread.sleep(5000);
		}
		
		WebElement objinput_Bid_rate = driver.findElement(input_Bid_rate);
		if (objinput_Bid_rate.isDisplayed())
		{
			objinput_Bid_rate.click();
			objinput_Bid_rate.clear();
			objinput_Bid_rate.sendKeys("1.35");
		}
		
        WebElement objinput_Bid_Rate_serach_01 = driver.findElement(input_Bid_Rate_serach_01);
        if (objinput_Bid_Rate_serach_01.isDisplayed())
        {
        	objinput_Bid_Rate_serach_01.click();
        	objinput_Bid_Rate_serach_01.clear();
        	objinput_Bid_Rate_serach_01.sendKeys("1.35");
        }
		
        WebElement objinput_Bid_Rate_serach_02 = driver.findElement(input_Bid_Rate_serach_02);
        if (objinput_Bid_Rate_serach_02.isDisplayed())
        {
        	objinput_Bid_Rate_serach_02.click();
        	objinput_Bid_Rate_serach_02.clear();
        	objinput_Bid_Rate_serach_02.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_03 = driver.findElement(input_Bid_Rate_serach_03);
        if (objinput_Bid_Rate_serach_03.isDisplayed())
        {
        	objinput_Bid_Rate_serach_03.click();
        	objinput_Bid_Rate_serach_03.clear();
        	objinput_Bid_Rate_serach_03.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_04 = driver.findElement(input_Bid_Rate_serach_04);
        if (objinput_Bid_Rate_serach_04.isDisplayed())
        {
        	objinput_Bid_Rate_serach_04.click();
        	objinput_Bid_Rate_serach_04.clear();
        	objinput_Bid_Rate_serach_04.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_05 = driver.findElement(input_Bid_Rate_serach_05);
        if (objinput_Bid_Rate_serach_05.isDisplayed())
        {
        	objinput_Bid_Rate_serach_05.click();
        	objinput_Bid_Rate_serach_05.clear();
        	objinput_Bid_Rate_serach_05.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_06 = driver.findElement(input_Bid_Rate_serach_06);
        if (objinput_Bid_Rate_serach_06.isDisplayed())
        {
        	objinput_Bid_Rate_serach_06.click();
        	objinput_Bid_Rate_serach_06.clear();
        	objinput_Bid_Rate_serach_06.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_07 = driver.findElement(input_Bid_Rate_serach_07);
        if (objinput_Bid_Rate_serach_07.isDisplayed())
        {
        	objinput_Bid_Rate_serach_07.click();
        	objinput_Bid_Rate_serach_07.clear();
        	objinput_Bid_Rate_serach_07.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_08 = driver.findElement(input_Bid_Rate_serach_08);
        if (objinput_Bid_Rate_serach_08.isDisplayed())
        {
        	objinput_Bid_Rate_serach_08.click();
        	objinput_Bid_Rate_serach_08.clear();
        	objinput_Bid_Rate_serach_08.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_09 = driver.findElement(input_Bid_Rate_serach_09);
        if (objinput_Bid_Rate_serach_09.isDisplayed())
        {
        	objinput_Bid_Rate_serach_09.click();
        	objinput_Bid_Rate_serach_09.clear();
        	objinput_Bid_Rate_serach_09.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_10 = driver.findElement(input_Bid_Rate_serach_10);
        if (objinput_Bid_Rate_serach_10.isDisplayed())
        {
        	objinput_Bid_Rate_serach_10.click();
        	objinput_Bid_Rate_serach_10.clear();
        	objinput_Bid_Rate_serach_10.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_11 = driver.findElement(input_Bid_Rate_serach_11);
        if (objinput_Bid_Rate_serach_11.isDisplayed())
        {
        	objinput_Bid_Rate_serach_11.click();
        	objinput_Bid_Rate_serach_11.clear();
        	objinput_Bid_Rate_serach_11.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_12 = driver.findElement(input_Bid_Rate_serach_12);
        if (objinput_Bid_Rate_serach_12.isDisplayed())
        {
        	objinput_Bid_Rate_serach_12.click();
        	objinput_Bid_Rate_serach_12.clear();
        	objinput_Bid_Rate_serach_12.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_13 = driver.findElement(input_Bid_Rate_serach_13);
        if (objinput_Bid_Rate_serach_13.isDisplayed())
        {
        	objinput_Bid_Rate_serach_13.click();
        	objinput_Bid_Rate_serach_13.clear();
        	objinput_Bid_Rate_serach_13.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_14 = driver.findElement(input_Bid_Rate_serach_14);
        if (objinput_Bid_Rate_serach_14.isDisplayed())
        {
        	objinput_Bid_Rate_serach_14.click();
        	objinput_Bid_Rate_serach_14.clear();
        	objinput_Bid_Rate_serach_14.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_15 = driver.findElement(input_Bid_Rate_serach_15);
        if (objinput_Bid_Rate_serach_15.isDisplayed())
        {
        	objinput_Bid_Rate_serach_15.click();
        	objinput_Bid_Rate_serach_15.clear();
        	objinput_Bid_Rate_serach_15.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_16 = driver.findElement(input_Bid_Rate_serach_16);
        if (objinput_Bid_Rate_serach_16.isDisplayed())
        {
        	objinput_Bid_Rate_serach_16.click();
        	objinput_Bid_Rate_serach_16.clear();
        	objinput_Bid_Rate_serach_16.sendKeys("1.35");
        }
        
        
        WebElement objinput_Bid_Rate_serach_17 = driver.findElement(input_Bid_Rate_serach_17);
        if (objinput_Bid_Rate_serach_17.isDisplayed())
        {
        	objinput_Bid_Rate_serach_17.click();
        	objinput_Bid_Rate_serach_17.clear();
        	objinput_Bid_Rate_serach_17.sendKeys("1.35");
        }
        
        
        WebElement objinput_Bid_Rate_serach_18 = driver.findElement(input_Bid_Rate_serach_18);
        if (objinput_Bid_Rate_serach_18.isDisplayed())
        {
        	objinput_Bid_Rate_serach_18.click();
        	objinput_Bid_Rate_serach_18.clear();
        	objinput_Bid_Rate_serach_18.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_19 = driver.findElement(input_Bid_Rate_serach_19);
        if (objinput_Bid_Rate_serach_19.isDisplayed())
        {
        	objinput_Bid_Rate_serach_19.click();
        	objinput_Bid_Rate_serach_19.clear();
        	objinput_Bid_Rate_serach_19.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_20 = driver.findElement(input_Bid_Rate_serach_20);
        if (objinput_Bid_Rate_serach_20.isDisplayed())
        {
        	objinput_Bid_Rate_serach_20.click();
        	objinput_Bid_Rate_serach_20.clear();
        	objinput_Bid_Rate_serach_20.sendKeys("1.35");
        }
        
        WebElement objinput_Bid_Rate_serach_21 = driver.findElement(input_Bid_Rate_serach_21);
        if (objinput_Bid_Rate_serach_21.isDisplayed())
        {
        	objinput_Bid_Rate_serach_21.click();
        	objinput_Bid_Rate_serach_21.clear();
        	objinput_Bid_Rate_serach_21.sendKeys("1.35");
        }
        
		WebElement objclick_confirm_Move_Prospects_Btn = driver.findElement(click_confirm_Move_Prospects_Btn);
		if (objclick_confirm_Move_Prospects_Btn.isDisplayed())
		{
			objclick_confirm_Move_Prospects_Btn.click();
			Thread.sleep(20000);
		}
		
		WebElement objclose_Prospects_popup = driver.findElement(close_Prospects_popup);
		if (objclose_Prospects_popup.isDisplayed())
		{
			objclose_Prospects_popup.click();
			Thread.sleep(1000);
		}
		
	}
	
	public void download_Prospects_data () throws InterruptedException
	{
		WebElement objclick_download_excel = driver.findElement(click_download_excel);
		if (objclick_download_excel.isDisplayed())
		{
			objclick_download_excel.click();
			Thread.sleep(2000);
		}
		
		WebElement objselect_fileFormat = driver.findElement(select_fileFormat);
		if (objselect_fileFormat.isDisplayed())
		{
			objselect_fileFormat.click();
			
		}
		
		WebElement objselect_file_Compression= driver.findElement(select_file_Compression);
		if (objselect_file_Compression.isDisplayed())
		{
			objselect_file_Compression.click();
		}
		
		WebElement objdownload_file = driver.findElement(download_file);
		if (objdownload_file.isDisplayed())
		{
			objdownload_file.click();
			Thread.sleep(35000);
		}
	}
	
	public void contact_us () throws InterruptedException
	{
		WebElement objclick_Contact_us_Btn = driver.findElement(click_Contact_us_Btn);
		if (objclick_Contact_us_Btn.isDisplayed())
		{
			objclick_Contact_us_Btn.click();
			Thread.sleep(1000);
		}
		
		WebElement objinput_Name = driver.findElement(input_Name);
		if (objinput_Name.isDisplayed())
		{
			objinput_Name.click();
			objinput_Name.clear();
			objinput_Name.sendKeys("Zeeshan Mazhar");
		}
		
		WebElement objinput_Email = driver.findElement(input_Email);
		if (objinput_Name.isDisplayed())
		{
			objinput_Email.click();
			objinput_Email.clear();
			objinput_Email.sendKeys("zeeshan.mazhar@lumentumllc.com");
		}
		
		WebElement objinput_Message = driver.findElement(input_Message);
		if (objinput_Message.isDisplayed())
		{
			objinput_Message.click();
			objinput_Message.clear();
			objinput_Message.sendKeys("Test");
		}
		
		WebElement objclick_Confirm_Contact = driver.findElement(click_Confirm_Contact);
		if (objclick_Confirm_Contact.isDisplayed())
		{
			objclick_Confirm_Contact.click();
			Thread.sleep(5000);
		}	
	}
}
