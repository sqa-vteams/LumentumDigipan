package objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaxLiens {

	public WebDriver driver;
	private By openDigisite = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[3]/a/span");
	private By clickNext = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[3]/a");
	private By clickPrevious = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[1]/a");
	private By updateBid = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[2]/div/div[2]/input[1]");
	private By updateoverBid = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[2]/div/div[2]/input[2]");
	private By searchtext = By.xpath("//*[@id=\"CustomSearch\"]");
	private By openCountydrop = By.xpath("//*[@id=\"select2-chosen-581\"]");
	private By updte_County = By.xpath("//*[@id=\"s2id_autogen581_search\"]");
	private By clickDownload = By.xpath("//*[@id=\"export\"]");
	private By select_Excel = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label");
	private By select_Zipfomat = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/label");
	private By confirm_download = By.xpath("//*[@id=\"btn_map_export_download\"]");
	
	public TaxLiens(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void openTaxLiens () throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,350);
		WebElement digisite_link_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[1]/ul[1]/li[10]/a/span")));
		
		WebElement objopenDigisite = driver.findElement(openDigisite);
		if (objopenDigisite.isDisplayed())
		{
			objopenDigisite.click();
		}
		
	}
	
	public void explore_property_details () throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,350);
		WebElement nextProperty_button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[3]/a")));
		
		WebElement objclickNext = driver.findElement(clickNext);
		if (objclickNext.isDisplayed())
		{
			objclickNext.click();				
		}
		
		WebElement previousProperty_button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[1]/a")));
		
		WebElement objclickPrevious = driver.findElement(clickPrevious);
		if (objclickPrevious.isDisplayed())
		{
			objclickPrevious.click();
		}

	}
	
	public void update_Bid_OverBid () throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,350);
		WebElement updateBid_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[2]/div/div[2]/input[1]")));
		WebElement objupdateBid = driver.findElement(updateBid);
		
		if (objupdateBid.isDisplayed())
		{
			//objupdateBid.clear();
			objupdateBid.sendKeys("1");
		    objupdateBid.click();
		}	
		
		WebElement updateoverBid_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[2]/div/div[2]/input[2]")));
		WebElement objupdateoverBid = driver.findElement(updateoverBid);
		if (objupdateoverBid.isDisplayed())
		{
			//objupdateoverBid.clear();
			objupdateoverBid.sendKeys("2");
			objupdateoverBid.click();
		}
		
	}
	
	public void search() throws InterruptedException
	{
		Actions action = new Actions(driver); 
		
		WebDriverWait wait=new WebDriverWait(driver,700);
		WebElement serchDataTable_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"CustomSearch\"]")));
		
		WebElement objsearchtext = driver.findElement(searchtext);
		if (objsearchtext.isDisplayed())
		{
			objsearchtext.clear();
			objsearchtext.sendKeys("237");
			action.sendKeys(Keys.ENTER).build().perform();
			WebElement Pagination_Controls_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/ul/li[2]/a")));

		}
	}
	
	public void chnage_County() throws InterruptedException
	{
		Actions action = new Actions(driver); 
		
		WebDriverWait wait=new WebDriverWait(driver,350);
		WebElement county_dropDown_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-chosen-581\"]")));
		
		WebElement objopenCountydrop = driver.findElement(openCountydrop);
		if (objopenCountydrop.isDisplayed())
		{
			objopenCountydrop.click();
		}
		
		WebElement Change_List=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"s2id_autogen581_search\"]")));
		
		WebElement obj_updte_County= driver.findElement(updte_County);
		if (obj_updte_County.isDisplayed())
		{
			// obj_updte_County.click();
			obj_updte_County.sendKeys("Neptune");
			action.sendKeys(Keys.ENTER).build().perform();
			WebElement updateBid_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div[3]/div/div[2]/nav/ul/li[2]/div/div[2]/input[1]")));
		}
	}
	
	public void download_excel_csv () throws InterruptedException 
	{
		
		WebDriverWait wait=new WebDriverWait(driver,350);
		WebElement serchDataTable_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"export\"]")));
		
		WebElement objclickDownload = driver.findElement(clickDownload);
		if (objclickDownload.isDisplayed())
		{
			objclickDownload.click();
		}
		
		WebElement Excel_radioButton_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label")));
		WebElement objselect_Excel = driver.findElement(select_Excel);
		if (objselect_Excel.isDisplayed())
		{
			objselect_Excel.click();
		}
		
		WebElement zippedFormat_radioButton_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/label")));
		WebElement objselect_Zipfomat = driver.findElement(select_Zipfomat);
		if (objselect_Zipfomat.isDisplayed())
		{
			objselect_Zipfomat.click();
		}
		
		WebElement confrimDownload_Button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn_map_export_download\"]")));
		WebElement objconfirm_download=driver.findElement(confirm_download);
		if (objconfirm_download.isDisplayed())
		{
			objconfirm_download.click();
			
		}
	}
	
}
	