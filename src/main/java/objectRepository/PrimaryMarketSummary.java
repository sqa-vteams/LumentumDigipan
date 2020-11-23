package objectRepository;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.BaseClass;

public class PrimaryMarketSummary {

	public WebDriver driver;
//	private By openPMS = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[4]/a/span");
//	private By clickMovetoProspects = By.xpath("//*[@id=\"action_pms_bulk_move\"]");
//	private By selectSearchCritieria = By.xpath("//*[@id=\"s2id_ddl_saved_filter\"]");
//	private By provideCritieriaName = By.cssSelector("#select2-drop [type]");
//	private By inputbidrate_Apache = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/input");
//	private By inputbidrate_Cochise = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/input");
//	private By inputbidrate_Coconino = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[3]/div[2]/input");
//	private By inputbidrate_Gila = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[4]/div[2]/input");
//	private By inputbidrate_Graham = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[5]/div[2]/input");
//	private By inputbidrate_Greenlee = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[6]/div[2]/input");
//	private By inputbidrate_Maricopa = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[7]/div[2]/input");
//	private By inputbidrate_Mohave = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[8]/div[2]/input");
//	private By inputbidrate_Navajo = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[9]/div[2]/input");
//	private By inputbidrate_Pima = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[10]/div[2]/input");
//	private By inputbidrate_Pinal = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[11]/div[2]/input");
//	private By inputbidrate_Yavapai = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[12]/div[2]/input");
//	private By inputbidrate_Yuma = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[13]/div[2]/input");
//	private By click_MoveCertsbtn = By.xpath("//*[@id=\"btn_prospects_bulk_move\"]");
//	private By select_CalendarDate = By.cssSelector("[title='08\\/23\\/2019'] [href]");
//	private By changed_CalendarDate = By.xpath("//*[@id=\"datepicker\"]/div/table/tbody/tr[5]/td[2]/a");
	private By btndownloadFile = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/div/form/div[3]/a[1]/button");
	private By rbfileFormat = By.cssSelector("#mainContent > div.modal.modal-download-export.fade.in > div.modal-dialog.modal-med > div > div.modal-body.body-download-export > div > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(1) > label");
	private By rbzippedFile = By.cssSelector("#mainContent > div.modal.modal-download-export.fade.in > div.modal-dialog.modal-med > div > div.modal-body.body-download-export > div > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(1) > label");
	private By rbunzippedFile = By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/label");
	private By rbexcelfileFormat = By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label");
	private By btnconfirmDownload = By.xpath("//*[@id=\"btn_pms_modal_export_download\"]");
//	private By close_MovetoProspects = By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[1]/button");
//	private By contactUs_button = By.cssSelector("[class] .pull-right:nth-of-type(4) [type]");
//	private By input_Name = By.xpath("//*[@id=\"contact_name\"]");
//	private By input_Email = By.xpath("//*[@id=\"contact_email\"]");
//	private By input_Message = By.xpath("//*[@id=\"message\"]");
//	private By click_sendEmail = By.xpath("//*[@id=\"contact_us_btn\"]");
	private By txtLoginVerification = By.xpath("//*[@id=\"pageName\"]");
	private By ddauctionYear = By.xpath("/html/body/div[3]/section/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/div/form/div[1]/div/a/span[2]/b");
	private By txtauctionYear = By.xpath("//*[@id=\"s2id_autogen2_search\"]");
	private By dataTableAppears = By.xpath("//*[@id=\"tbl_states_summary\"]/thead/tr/th[2]");
//	private By AuctionData = By.xpath("//*[@id=\"tbl_states_summary\"]/thead/tr/th[2]");
	
	public PrimaryMarketSummary(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	
	public void openprimaryMarket () throws InterruptedException 
	{
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(txtLoginVerification, 30);
		
		WebElement obj_Login_Verification = driver.findElement(txtLoginVerification);
		String Verifytext= obj_Login_Verification.getText().trim(); 
		Assert.assertEquals(Verifytext, "Primary Market Summary");
	}
	
	public void AuctionDataFilters () throws InterruptedException 
	{
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(ddauctionYear, 30);

		WebElement objddauctionYear = driver.findElement(ddauctionYear);
		objddauctionYear.click();
		
		
		objbaseClass.waitForElementLoad(txtauctionYear, 30);
		WebElement inputAuctionYear = driver.findElement(txtauctionYear);
		if (inputAuctionYear.isDisplayed())
			
		{
			Actions action = new Actions(driver); 
			inputAuctionYear.clear();
			inputAuctionYear.sendKeys("2019");
			action.sendKeys(Keys.ENTER).build().perform(); 
		}
		
		objbaseClass.waitForElementLoad(dataTableAppears, 30);
		WebElement objdataTableAppears = driver.findElement(dataTableAppears);
		Assert.assertTrue(objdataTableAppears.isDisplayed());
	}
		
/*	public void movetoProspects () throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver,200);
		WebElement btnmoveToProspectAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"action_pms_bulk_move\"]")));
		
		WebElement objclickMovetoProspects = driver.findElement(clickMovetoProspects);
		if (objclickMovetoProspects.isDisplayed())
		{
			objclickMovetoProspects.click();
		}
		
		String s1 = driver.getWindowHandle();
		driver.switchTo().window(s1);
		
		WebElement ddselectSearchCriteriaAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"s2id_ddl_saved_filter\"]")));
		
		WebElement objselectSearchCritieria = driver.findElement(selectSearchCritieria);
		
		if (objselectSearchCritieria.isDisplayed())
		{
			objselectSearchCritieria.click();
		}
		
		WebElement inputSearchCriteria_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-drop [type]")));
		
		Actions action = new Actions(driver); 
		
		WebElement objprovideCritieriaName = driver.findElement(provideCritieriaName);
		if (objprovideCritieriaName.isDisplayed())
		{
			objprovideCritieriaName.clear();
			objprovideCritieriaName.sendKeys("zm-arg8");
			action.sendKeys(Keys.ENTER).build().perform(); 
			// objprovideCritieriaName.click();
		}
		
		WebElement txtinputbidRateAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/input")));
		
		WebElement objinputbidRate = driver.findElement(inputbidrate_Apache);
		if (objinputbidRate.isDisplayed())
		{
			objinputbidRate.clear();
			objinputbidRate.sendKeys("18.25");
		}
		
		 WebElement Objinputbidrate_Cochise = driver.findElement(inputbidrate_Cochise);
		if (Objinputbidrate_Cochise.isDisplayed())
		{
			Objinputbidrate_Cochise.clear();
			Objinputbidrate_Cochise.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement Objinputbidrate_Coconino = driver.findElement(inputbidrate_Coconino);
		if (Objinputbidrate_Coconino.isDisplayed())
		{
			Objinputbidrate_Coconino.clear();
			Objinputbidrate_Coconino.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement Objinputbidrate_Graham = driver.findElement(inputbidrate_Graham);
		if (Objinputbidrate_Graham.isDisplayed())
		{
			Objinputbidrate_Graham.clear();
			Objinputbidrate_Graham.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement Objinputbidrate_Gila = driver.findElement(inputbidrate_Gila);
		if (Objinputbidrate_Gila.isDisplayed())
		{
			Objinputbidrate_Gila.clear();
			Objinputbidrate_Gila.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement Objinputbidrate_Greenlee = driver.findElement(inputbidrate_Greenlee);
		if (Objinputbidrate_Greenlee.isDisplayed())
		{
			Objinputbidrate_Greenlee.clear();
			Objinputbidrate_Greenlee.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement Objinputbidrate_Maricopa = driver.findElement(inputbidrate_Maricopa);
		if (Objinputbidrate_Maricopa.isDisplayed())
		{
			Objinputbidrate_Maricopa.clear();
			Objinputbidrate_Maricopa.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement Objinputbidrate_Mohave = driver.findElement(inputbidrate_Mohave);
		if (Objinputbidrate_Mohave.isDisplayed())
		{
			Objinputbidrate_Mohave.clear();
			Objinputbidrate_Mohave.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement objinputbidrate_Navajo = driver.findElement(inputbidrate_Navajo);
		if (objinputbidrate_Navajo.isDisplayed())
		{
			objinputbidrate_Navajo.clear();
			objinputbidrate_Navajo.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		
		WebElement objinputbidrate_Pima = driver.findElement(inputbidrate_Pima);
		if (objinputbidrate_Pima.isDisplayed())
		{
			objinputbidrate_Pima.clear();
			objinputbidrate_Pima.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		
		WebElement Objinputbidrate_Pinal = driver.findElement(inputbidrate_Pinal);
		if (Objinputbidrate_Pinal.isDisplayed())
		{
			Objinputbidrate_Pinal.clear();
			Objinputbidrate_Pinal.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		
		WebElement objinputbidrate_Yavapai = driver.findElement(inputbidrate_Yavapai);
		if (objinputbidrate_Yavapai.isDisplayed())
		{
			objinputbidrate_Yavapai.clear();
			objinputbidrate_Yavapai.sendKeys("18.25");
			Thread.sleep(1000);
		}
		
		WebElement objinputbidrate_Yuma = driver.findElement(inputbidrate_Yuma);
		if (objinputbidrate_Yuma.isDisplayed())
		{
			objinputbidrate_Yuma.clear();
			objinputbidrate_Yuma.sendKeys("18.25");
			Thread.sleep(1000);
		} 
		
		
		WebElement btnmoveToCertsAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn_prospects_bulk_move\"]")));
		WebElement objbtnmoveToCerts = driver.findElement(click_MoveCertsbtn);
		if (objbtnmoveToCerts.isDisplayed())
		{
			objbtnmoveToCerts.click();
			WebElement calendarAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"datepicker\"]/div/table/tbody/tr[4]/td[6]/a")));
		}
		
		WebElement btnclosePopupAppears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/div[2]/div[1]/button")));
		WebElement objbtnclosePopupAppears = driver.findElement(close_MovetoProspects);
		if (objbtnclosePopupAppears.isDisplayed())
		{
			objbtnclosePopupAppears.click();
		}

	} */
	
/*	public void ExeccontactUs() throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(driver,350);
		WebElement contactUs_button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .pull-right:nth-of-type(4) [type]")));
		
		WebElement obj_contactUs_button = driver.findElement(contactUs_button);
		if (obj_contactUs_button.isDisplayed())
		{
			obj_contactUs_button.click();
		}
		
		String s1 = driver.getWindowHandle();
		driver.switchTo().window(s1);
		
		WebElement Name_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contact_name\"]")));
		WebElement obj_input_Name = driver.findElement(input_Name);
		if (obj_input_Name.isDisplayed())
		{
			obj_input_Name.click();
			obj_input_Name.clear();
			obj_input_Name.sendKeys("Zeeshan");
		}
		
		WebElement Email_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contact_email\"]")));
		WebElement obj_input_Email = driver.findElement(input_Email);
		if (obj_input_Email.isDisplayed())
		{
			obj_input_Email.click();
			obj_input_Email.clear();
			obj_input_Email.sendKeys("zeeshan.mazhar@lumentumllc.com");
		}
		
		WebElement Message_textField_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
		WebElement obj_input_Message = driver.findElement(input_Message);
		if (obj_input_Message.isDisplayed())
		{
			obj_input_Message.click();
			obj_input_Message.clear();
			obj_input_Message.sendKeys("Test Message");
		}
		
		WebElement sendEmai_button_Appears=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contact_us_btn\"]")));
		WebElement obj_click_sendEmail = driver.findElement(click_sendEmail);
		if (obj_click_sendEmail.isDisplayed())
		{
			obj_click_sendEmail.click();
	
		}
	} */
	
	public void downloadcompressedCSV () throws InterruptedException {
	
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(btndownloadFile, 30);
		
		WebElement objbtndownloadFile = driver.findElement(btndownloadFile);
		if (objbtndownloadFile.isDisplayed())
		{
			objbtndownloadFile.click();
		}
	
		objbaseClass.waitForElementLoad(rbfileFormat, 30);
		objbaseClass.waitForElementLoad(rbzippedFile, 30);
		
		WebElement objrbfileFormat = driver.findElement(rbfileFormat);
		if (objrbfileFormat.isDisplayed())
		{
			objrbfileFormat.click();
		}
		
		WebElement objrbzippedFile = driver.findElement(rbzippedFile);
		if (objrbzippedFile.isDisplayed())
		{
			objrbzippedFile.click();
		}
		
		objbaseClass.waitForElementLoad(btnconfirmDownload, 30);
		WebElement objbtnconfirmDownload = driver.findElement(btnconfirmDownload);
		
		if (objbtnconfirmDownload.isDisplayed())
		{
			objbtnconfirmDownload.click();
			Thread.sleep(7000);
			isFileDownloaded("PrimaryMarketSummary_2019.zip");
		}
	}
	

	
	public void downloadsimpleCSV () throws InterruptedException {
		
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(btndownloadFile, 30);
		
		WebElement objbtndownloadFile = driver.findElement(btndownloadFile);
		if (objbtndownloadFile.isDisplayed())
		{
			objbtndownloadFile.click();
		}
	
		objbaseClass.waitForElementLoad(rbfileFormat, 30);
		objbaseClass.waitForElementLoad(rbzippedFile, 30);
		
		WebElement objrbfileFormat = driver.findElement(rbfileFormat);
		if (objrbfileFormat.isDisplayed())
		{
			objrbfileFormat.click();
		}
		
		WebElement objrbunzippedFile = driver.findElement(rbunzippedFile);
		if (objrbunzippedFile.isDisplayed())
		{
			objrbunzippedFile.click();
		}
		
		objbaseClass.waitForElementLoad(btnconfirmDownload, 30);
		WebElement objbtnconfirmDownload = driver.findElement(btnconfirmDownload);
		
		if (objbtnconfirmDownload.isDisplayed())
		{
			objbtnconfirmDownload.click();
			Thread.sleep(7000);
			isFileDownloaded("PrimaryMarketSummary_2019.csv");
			

		}
	}
	
	public static Boolean isFileDownloaded(String fileName) {
		
        boolean flag = false;
        String dirPath = "C:\\Users\\zeeshan.mazhar\\Downloads"; 
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
            System.out.println("The directory is empty");
            flag = false;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains(fileName)) {
                    System.out.println(fileName + " is present");
                    
                    File file = new File("C:\\Users\\zeeshan.mazhar\\Downloads\\"+fileName); 
                    if(file.delete())
                    System.out.println(fileName+": file deleted");
                    break;
                }
                flag = true;
            }
        }
        return flag;
    }	
	
	public void downloadcompressedExcel () throws InterruptedException {
		
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(btndownloadFile, 30);
		
		WebElement objbtndownloadFile = driver.findElement(btndownloadFile);
		if (objbtndownloadFile.isDisplayed())
		{
			objbtndownloadFile.click();
		}
	
		objbaseClass.waitForElementLoad(rbfileFormat, 30);
		objbaseClass.waitForElementLoad(rbzippedFile, 30);
		
		WebElement objrbexcelfileFormat = driver.findElement(rbexcelfileFormat);
		if (objrbexcelfileFormat.isDisplayed())
		{
			objrbexcelfileFormat.click();
		}
		
		WebElement objrbzippedFile = driver.findElement(rbzippedFile);
		if (objrbzippedFile.isDisplayed())
		{
			objrbzippedFile.click();
		}
		
		objbaseClass.waitForElementLoad(btnconfirmDownload, 30);
		WebElement objbtnconfirmDownload = driver.findElement(btnconfirmDownload);
		
		if (objbtnconfirmDownload.isDisplayed())
		{
			objbtnconfirmDownload.click();
			Thread.sleep(8000);
			isFileDownloaded("PrimaryMarketSummary_2019.zip");

		}
	}
	
	public void downloadsimpleExcel () throws InterruptedException {
		
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(btndownloadFile, 30);
		
		WebElement objbtndownloadFile = driver.findElement(btndownloadFile);
		if (objbtndownloadFile.isDisplayed())
		{
			objbtndownloadFile.click();
		}
	
		objbaseClass.waitForElementLoad(rbfileFormat, 30);
		objbaseClass.waitForElementLoad(rbzippedFile, 30);
		
		WebElement objrbexcelfileFormat = driver.findElement(rbexcelfileFormat);
		if (objrbexcelfileFormat.isDisplayed())
		{
			objrbexcelfileFormat.click();
		}
		
		WebElement objrbunzippedFile = driver.findElement(rbunzippedFile);
		if (objrbunzippedFile.isDisplayed())
		{
			objrbunzippedFile.click();
		}
		
		objbaseClass.waitForElementLoad(btnconfirmDownload, 30);
		WebElement objbtnconfirmDownload = driver.findElement(btnconfirmDownload);
		
		if (objbtnconfirmDownload.isDisplayed())
		{
			objbtnconfirmDownload.click();
			Thread.sleep(8000);
			isFileDownloaded("PrimaryMarketSummary_2019.xlsx");

		}
	}	
}