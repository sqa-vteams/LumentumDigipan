package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.BaseClass;

public class PrimaryMarketResearch {

	public WebDriver driver;
	public static String savedfilterName = null;
	
	private By expandCounties = By.xpath("//*[@id=\"tbl_states_summary\"]/tbody/tr[2]/td[1]");
	private By linkclickcounty = By.partialLinkText("Baldwin");
	private By txtparcelscount = By.xpath("//*[@id=\"tbl_primary_research_info\"]");
	private By ddViewed = By.xpath("//*[@id=\"select2-chosen-9\"]");
	private By ddProspects = By.xpath("//*[@id=\"select2-chosen-10\"]");
	private By ddTags = By.xpath("//*[@id=\"frm_research_filter\"]/div/div[2]/div[5]/article[1]/div[3]/div/div/button");
	private By txtminFVtoAV = By.xpath("//*[@id=\"FVtoAVMin\"]");
	private By txtmaxFVtoAV = By.xpath("//*[@id=\"FVtoAVMax\"]");
	private By txtminRolluptoAV = By.xpath("//*[@id=\"RolluptoAVMin\"]");
	private By txtmaxRolluptoAV = By.xpath("//*[@id=\"RolluptoAVMax\"]");
	private By ddlienStatus = By.xpath("//*[@id=\"frm_research_filter\"]/div/div[2]/div[5]/article[3]/div[2]/div/div/button");
	private By txtmindelinquentYear = By.xpath("//*[@id=\"TaxYearMin\"]");
	private By txtmaxdelinquentYear = By.xpath("//*[@id=\"TaxYearMax\"]");
	private By txtminfaceValue = By.xpath("//*[@id=\"FaceAmountMin\"]");
	private By txtmaxfaceValue = By.xpath("//*[@id=\"FaceAmountMax\"]");
	private By ddbacktaxes = By.xpath("//*[@id=\"select2-chosen-11\"]");
	private By txtminopentaxes = By.xpath("//*[@id=\"OpenedBackTaxMin\"]");
	private By txtmaxopentaxes = By.xpath("//*[@id=\"OpenedBackTaxMax\"]");
	private By txtminclosedtaxes = By.xpath("//*[@id=\"ClosedBackTaxMin\"]");
	private By txtmaxclosedtaxes = By.xpath("//*[@id=\"ClosedBackTaxMax\"]");
	private By txtmintaxcloseRate = By.xpath("//*[@id=\"TaxCloseROMin\"]");
	private By txtmaxtaxcloseRate = By.xpath("//*[@id=\"TaxCloseROMax\"]");
	private By txtminrollUp = By.xpath("//*[@id=\"RollupTotalMin\"]");
	private By txtmaxrollUp = By.xpath("//*[@id=\"RollupTotalMax\"]");
	private By ddactivetaxDeed = By.xpath("//*[@id=\"select2-chosen-12\"]");
	private By ddtaxdeedHistory = By.xpath("//*[@id=\"select2-chosen-13\"]");
	private By ddcertHolder = By.xpath("//*[@id=\"select2-chosen-14\"]");
	private By txtminmarketValue = By.xpath("//*[@id=\"MktValueMin\"]");
	private By txtmaxmarketValue = By.xpath("//*[@id=\"MktValueMax\"]");
	private By txtminassessedValue = By.xpath("//*[@id=\"AssessedValueMin\"]");
	private By txtmaxassessedValue = By.xpath("//*[@id=\"AssessedValueMax\"]");
	private By txtminlandValue = By.xpath("//*[@id=\"LandValueMin\"]");
	private By txtmaxlandValue = By.xpath("//*[@id=\"LandValueMax\"]");
	private By txtminstructureValue = By.xpath("//*[@id=\"StructureValueMin\"]");
	private By txtmaxstructureValue = By.xpath("//*[@id=\"StructureValueMax\"]");
	private By txtminlandAcres = By.xpath("//*[@id=\"AcresMin\"]");
	private By txtmaxlandAcres = By.xpath("//*[@id=\"AcresMax\"]");
	private By txtminsquareFootage = By.xpath("//*[@id=\"StructureSfMin\"]");
	private By txtmaxsquareFootage = By.xpath("//*[@id=\"StructureSfMax\"]");
	private By txtminyearBuilt = By.xpath("//*[@id=\"YearBuiltMin\"]");
	private By txtmaxyearBuilt = By.xpath("//*[@id=\"YearBuiltMax\"]");
	private By ddmultiSale = By.xpath("//*[@id=\"select2-chosen-15\"]");
	private By ddownerType = By.xpath("//*[@id=\"frm_research_filter\"]/div/div[2]/div[5]/article[4]/div[12]/div/div/button");
	private By ddstateOwner = By.xpath("//*[@id=\"select2-chosen-16\"]");
	private By ddisHomestead = By.xpath("//*[@id=\"select2-chosen-17\"]");
	private By ddinaCDD = By.xpath("//*[@id=\"select2-chosen-18\"]");
	private By ddinBankruptcy = By.xpath("//*[@id=\"select2-chosen-19\"]");
	private By ddsuperiorLien = By.xpath("//*[@id=\"select2-chosen-20\"]");
	private By txtminlienCount = By.xpath("//*[@id=\"LienCountMin\"]");
	private By txtmaxlienCount = By.xpath("//*[@id=\"LienCountMax\"]");
	private By ddlienPendens = By.xpath("//*[@id=\"select2-chosen-21\"]");
	private By searchViewed = By.xpath("//*[@id=\"s2id_autogen9_search\"]");
	private By searchProspects = By.xpath("//*[@id=\"s2id_autogen10_search\"]");
	private By searchbacktaxes = By.xpath("//*[@id=\"s2id_autogen11_search\"]");
	private By searchactivetaxDeed = By.xpath("//*[@id=\"s2id_autogen12_search\"]");
	private By searchtaxdeedHistory = By.xpath("//*[@id=\"s2id_autogen13_search\"]");
	private By searchcertHolder = By.xpath("//*[@id=\"s2id_autogen14_search\"]");
	private By searchmultiSale = By.xpath("//*[@id=\"s2id_autogen15_search\"]");
	private By searchStateOwner = By.xpath("//*[@id=\"s2id_autogen16_search\"]");
	private By searchisHomestead = By.xpath("//*[@id=\"s2id_autogen17_search\"]");
	private By searchCDD = By.xpath("//*[@id=\"s2id_autogen18_search\"]");
	private By searchBankruptcy = By.xpath("//*[@id=\"s2id_autogen19_search\"]");
	private By searchsuperiorLien = By.xpath("//*[@id=\"s2id_autogen20_search\"]");
	private By searchLienPendens = By.xpath("//*[@id=\"s2id_autogen21_search\"]");
	private By btnclickActions = By.xpath("//*[@id=\"saved_filter_actions\"]");
	private By btnsaveSearch = By.xpath("//*[@id=\"create_saved_filter\"]");
	private By txtfilterName = By.xpath("//*[@id=\"SavedFilterName\"]");
	private By btnsaveFilter = By.xpath("//*[@id=\"btn_save_search\"]");
	private By msgsavefilterSuccess = By.xpath("//*[@id=\"primary_research_box\"]/h4[1]");
	private By btnclearappliedFlter = By.xpath("//*[@id=\"btn_filter_clear\"]");
	private By msgparcelscountText = By.xpath("//*[@id=\"tbl_primary_research_info\"]");
	private By ddsavedfilterListing = By.xpath("//*[@id=\"select2-chosen-8\"]");
	private By txtsearchsavedFilter = By.xpath("//*[@id=\"s2id_autogen8_search\"]");
	private By btngetCerts = By.xpath("//*[@id=\"btn_research_filter_alt\"]");
	private By msgparcelscountertext = By.xpath("//*[@id=\"tbl_primary_research_info\"]");
	
	public PrimaryMarketResearch(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	
	public void openprimaryMarketResearch () throws InterruptedException 
	{
		
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(expandCounties, 30);
		
		WebElement objexpandCounties = driver.findElement(expandCounties);
		if (objexpandCounties.isDisplayed())
		{
			objexpandCounties.click();
			
		}
			
		objbaseClass.waitForElementLoad(linkclickcounty, 30);
		Thread.sleep(1000);
		
		WebElement objclickcountyLink = driver.findElement(linkclickcounty);
		if (objclickcountyLink.isDisplayed())
		{
			objclickcountyLink.click();
			
		}
		
		objbaseClass.waitForElementLoad(txtparcelscount, 30);
		
		String ExpectedURL = "https://digipan.lumentumllc.us/#!primary_market_research/2020/AL/Baldwin";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualURL, ExpectedURL);

	}
	
	public void saveFilter () throws InterruptedException
	
	{
		BaseClass objbaseClass = new BaseClass();
		
		objbaseClass.waitForElementLoad(ddViewed, 30);
		objbaseClass.waitForElementLoad(ddProspects, 30);
		objbaseClass.waitForElementLoad(ddTags, 30);
		objbaseClass.waitForElementLoad(txtminFVtoAV, 30);
		objbaseClass.waitForElementLoad(txtmaxFVtoAV, 30);
		objbaseClass.waitForElementLoad(txtminRolluptoAV, 30);
		objbaseClass.waitForElementLoad(txtmaxRolluptoAV, 30);
		objbaseClass.waitForElementLoad(ddlienStatus, 30);
		objbaseClass.waitForElementLoad(txtmindelinquentYear, 30);
		objbaseClass.waitForElementLoad(txtmaxdelinquentYear, 30);
		objbaseClass.waitForElementLoad(txtminfaceValue, 30);
		objbaseClass.waitForElementLoad(txtmaxfaceValue, 30);
		objbaseClass.waitForElementLoad(txtminopentaxes, 30);
		objbaseClass.waitForElementLoad(txtmaxopentaxes, 30);
		objbaseClass.waitForElementLoad(txtminclosedtaxes, 30);
		objbaseClass.waitForElementLoad(txtmaxclosedtaxes, 30);
		objbaseClass.waitForElementLoad(txtmintaxcloseRate, 30);
		objbaseClass.waitForElementLoad(txtmaxtaxcloseRate, 30);
		objbaseClass.waitForElementLoad(txtminrollUp, 30);
		objbaseClass.waitForElementLoad(txtmaxrollUp, 30);
		objbaseClass.waitForElementLoad(ddactivetaxDeed, 30);
		objbaseClass.waitForElementLoad(ddtaxdeedHistory, 30);
		objbaseClass.waitForElementLoad(ddcertHolder, 30);
		objbaseClass.waitForElementLoad(txtminmarketValue, 30);
		objbaseClass.waitForElementLoad(txtmaxmarketValue, 30);
		objbaseClass.waitForElementLoad(txtminassessedValue, 30);
		objbaseClass.waitForElementLoad(txtmaxassessedValue, 30);
		objbaseClass.waitForElementLoad(txtminlandValue, 30);
		objbaseClass.waitForElementLoad(txtmaxlandValue, 30);
		objbaseClass.waitForElementLoad(txtminstructureValue, 30);
		objbaseClass.waitForElementLoad(txtmaxstructureValue, 30);
		objbaseClass.waitForElementLoad(txtminlandAcres, 30);
		objbaseClass.waitForElementLoad(txtmaxlandAcres, 30);
		objbaseClass.waitForElementLoad(txtminsquareFootage, 30);
		objbaseClass.waitForElementLoad(txtmaxsquareFootage, 30);
		objbaseClass.waitForElementLoad(txtminyearBuilt, 30);
		objbaseClass.waitForElementLoad(txtmaxyearBuilt, 30);
		objbaseClass.waitForElementLoad(ddmultiSale, 30);
		objbaseClass.waitForElementLoad(ddownerType, 30);
		objbaseClass.waitForElementLoad(ddstateOwner, 30);
		objbaseClass.waitForElementLoad(ddisHomestead, 30);
		objbaseClass.waitForElementLoad(ddinaCDD, 30);
		objbaseClass.waitForElementLoad(ddinBankruptcy, 30);
		objbaseClass.waitForElementLoad(ddsuperiorLien, 30);
		objbaseClass.waitForElementLoad(txtminlienCount, 30);
		objbaseClass.waitForElementLoad(txtmaxlienCount, 30);
		objbaseClass.waitForElementLoad(ddlienPendens, 30);

		WebElement objddViewed = driver.findElement(ddViewed);
		if (objddViewed.isDisplayed())
		{
			objddViewed.click();
			objbaseClass.waitForElementLoad(searchViewed, 30);
			WebElement objsearchViewed = driver.findElement(searchViewed);
			if (objsearchViewed.isDisplayed()) {
				
				objsearchViewed.clear();
				objsearchViewed.sendKeys("No");
				objsearchViewed.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddProspects = driver.findElement(ddProspects);
		if (objddProspects.isDisplayed())
		{
			objddProspects.click();
			objbaseClass.waitForElementLoad(searchProspects, 30);
			WebElement objsearchProspects = driver.findElement(searchProspects);
			if (objsearchProspects.isDisplayed()) {
				objsearchProspects.clear();
				objsearchProspects.sendKeys("No");
				objsearchProspects.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objtxtminFVtoAV = driver.findElement(txtminFVtoAV);
		if (objtxtminFVtoAV.isDisplayed())
		{
			objtxtminFVtoAV.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminFVtoAV.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxFVtoAV = driver.findElement(txtmaxFVtoAV);
		if (objtxtmaxFVtoAV.isDisplayed())
		{
			objtxtmaxFVtoAV.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxFVtoAV.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminRolluptoAV = driver.findElement(txtminRolluptoAV);
		if (objtxtminRolluptoAV.isDisplayed())
		{
			objtxtminRolluptoAV.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminRolluptoAV.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxRolluptoAV = driver.findElement(txtmaxRolluptoAV);
		if (objtxtmaxRolluptoAV.isDisplayed())
		{
			objtxtmaxRolluptoAV.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxRolluptoAV.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmindelinquentYear = driver.findElement(txtmindelinquentYear);
		if (objtxtmindelinquentYear.isDisplayed())
		{
			objtxtmindelinquentYear.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(4);
			objtxtmindelinquentYear.sendKeys(randomnumericInput);
			objtxtmindelinquentYear.click();
		}
		
		WebElement objtxtmaxdelinquentYear = driver.findElement(txtmaxdelinquentYear);
		if (objtxtmaxdelinquentYear.isDisplayed())
		{
			objtxtmaxdelinquentYear.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(4);
			objtxtmaxdelinquentYear.sendKeys(randomnumericInput);
			objtxtmaxdelinquentYear.click();
		}
		
		WebElement objtxtminfaceValue = driver.findElement(txtminfaceValue);
		if (objtxtminfaceValue.isDisplayed())
		{
			objtxtminfaceValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminfaceValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxfaceValue = driver.findElement(txtmaxfaceValue);
		if (objtxtmaxfaceValue.isDisplayed())
		{
			objtxtmaxfaceValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxfaceValue.sendKeys(randomnumericInput);
		}
		
		WebElement objddbackTaxes = driver.findElement(ddbacktaxes);
		if (objddbackTaxes.isDisplayed())
		{
			objddbackTaxes.click();
			objbaseClass.waitForElementLoad(searchbacktaxes, 30);
			WebElement objsearchbackTaxes = driver.findElement(searchbacktaxes);
			if (objsearchbackTaxes.isDisplayed()) {
				
				objsearchbackTaxes.clear();
				objsearchbackTaxes.sendKeys("No");
				objsearchbackTaxes.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objtxtminopenTaxes = driver.findElement(txtminopentaxes);
		if (objtxtminopenTaxes.isDisplayed())
		{
			objtxtminopenTaxes.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminopenTaxes.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxopenTaxes = driver.findElement(txtmaxopentaxes);
		if (objtxtmaxopenTaxes.isDisplayed())
		{
			objtxtmaxopenTaxes.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(3);
			objtxtmaxopenTaxes.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminclosedTaxes = driver.findElement(txtminclosedtaxes);
		if (objtxtminclosedTaxes.isDisplayed())
		{
			objtxtminclosedTaxes.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminclosedTaxes.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxclosedTaxes = driver.findElement(txtmaxclosedtaxes);
		if (objtxtmaxclosedTaxes.isDisplayed())
		{
			objtxtmaxclosedTaxes.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(3);
			objtxtmaxclosedTaxes.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmintaxcloseRate = driver.findElement(txtmintaxcloseRate);
		if (objtxtmintaxcloseRate.isDisplayed())
		{
			objtxtmintaxcloseRate.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtmintaxcloseRate.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxtaxcloseRate = driver.findElement(txtmaxtaxcloseRate);
		if (objtxtmaxtaxcloseRate.isDisplayed())
		{
			objtxtmaxtaxcloseRate.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(3);
			objtxtmaxtaxcloseRate.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminrollUp = driver.findElement(txtminrollUp);
		if (objtxtminrollUp.isDisplayed())
		{
			objtxtminrollUp.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminrollUp.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxrollUp = driver.findElement(txtmaxrollUp);
		if (objtxtmaxrollUp.isDisplayed())
		{
			objtxtmaxrollUp.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(3);
			objtxtmaxrollUp.sendKeys(randomnumericInput);
		}
		
		WebElement objddactivetaxDeed = driver.findElement(ddactivetaxDeed);
		if (objddactivetaxDeed.isDisplayed())
		{
			objddactivetaxDeed.click();
			objbaseClass.waitForElementLoad(searchactivetaxDeed, 30);
			WebElement objsearchactivetaxDeed = driver.findElement(searchactivetaxDeed);
			if (objsearchactivetaxDeed.isDisplayed()) {
				
				objsearchactivetaxDeed.clear();
				objsearchactivetaxDeed.sendKeys("No");
				objsearchactivetaxDeed.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddtaxdeedHistory = driver.findElement(ddtaxdeedHistory);
		if (objddtaxdeedHistory.isDisplayed())
		{
			objddtaxdeedHistory.click();
			objbaseClass.waitForElementLoad(searchtaxdeedHistory, 30);
			WebElement objsearchtaxdeedHistory = driver.findElement(searchtaxdeedHistory);
			if (objsearchtaxdeedHistory.isDisplayed()) {
				
				objsearchtaxdeedHistory.clear();
				objsearchtaxdeedHistory.sendKeys("No");
				objsearchtaxdeedHistory.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddcertHolder = driver.findElement(ddcertHolder);
		if (objddcertHolder.isDisplayed())
		{
			objddcertHolder.click();
			objbaseClass.waitForElementLoad(searchcertHolder, 30);
			WebElement objsearchcertHolder = driver.findElement(searchcertHolder);
			if (objsearchcertHolder.isDisplayed()) {
				
				objsearchcertHolder.clear();
				objsearchcertHolder.sendKeys("Unknown");
				objsearchcertHolder.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objtxtminmarketValue = driver.findElement(txtminmarketValue);
		if (objtxtminmarketValue.isDisplayed())
		{
			objtxtminmarketValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminmarketValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxmarketValue = driver.findElement(txtmaxmarketValue);
		if (objtxtmaxmarketValue.isDisplayed())
		{
			objtxtmaxmarketValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxmarketValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminassessedValue = driver.findElement(txtminassessedValue);
		if (objtxtminassessedValue.isDisplayed())
		{
			objtxtminassessedValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminassessedValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxassessedValue = driver.findElement(txtmaxassessedValue);
		if (objtxtmaxassessedValue.isDisplayed())
		{
			objtxtmaxassessedValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxassessedValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminlandValue = driver.findElement(txtminlandValue);
		if (objtxtminlandValue.isDisplayed())
		{
			objtxtminlandValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminlandValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxlandValue = driver.findElement(txtmaxlandValue);
		if (objtxtmaxlandValue.isDisplayed())
		{
			objtxtmaxlandValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxlandValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminstructureValue = driver.findElement(txtminstructureValue);
		if (objtxtminstructureValue.isDisplayed())
		{
			objtxtminstructureValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminstructureValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxstructureValue = driver.findElement(txtmaxstructureValue);
		if (objtxtmaxstructureValue.isDisplayed())
		{
			objtxtmaxstructureValue.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxstructureValue.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminlandAcres = driver.findElement(txtminlandAcres);
		if (objtxtminlandAcres.isDisplayed())
		{
			objtxtminlandAcres.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminlandAcres.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxlandAcres = driver.findElement(txtmaxlandAcres);
		if (objtxtmaxlandAcres.isDisplayed())
		{
			objtxtmaxlandAcres.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxlandAcres.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminsqaureFootage = driver.findElement(txtminsquareFootage);
		if (objtxtminsqaureFootage.isDisplayed())
		{
			objtxtminsqaureFootage.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminsqaureFootage.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxsqaureFootage = driver.findElement(txtmaxsquareFootage);
		if (objtxtmaxsqaureFootage.isDisplayed())
		{
			objtxtmaxsqaureFootage.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxsqaureFootage.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtminyearBuilt = driver.findElement(txtminyearBuilt);
		if (objtxtminyearBuilt.isDisplayed())
		{
			objtxtminyearBuilt.clear();
			// String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtminyearBuilt.sendKeys("1900");
		}
		
		WebElement objtxtmaxyearBuilt = driver.findElement(txtmaxyearBuilt);
		if (objtxtmaxyearBuilt.isDisplayed())
		{
			objtxtmaxyearBuilt.clear();
			// String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxyearBuilt.sendKeys("2020");
		}
		
		WebElement objddmultiSale = driver.findElement(ddmultiSale);
		if (objddmultiSale.isDisplayed())
		{
			objddmultiSale.click();
			objbaseClass.waitForElementLoad(searchmultiSale, 30);
			WebElement objsearchmultiSale = driver.findElement(searchmultiSale);
			if (objsearchmultiSale.isDisplayed()) {
				
				objsearchmultiSale.clear();
				objsearchmultiSale.sendKeys("No");
				objsearchmultiSale.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddstateOwner = driver.findElement(ddstateOwner);
		if (objddstateOwner.isDisplayed())
		{
			objddstateOwner.click();
			objbaseClass.waitForElementLoad(searchStateOwner, 30);
			WebElement objsearchStateOwner = driver.findElement(searchStateOwner);
			if (objsearchStateOwner.isDisplayed()) {
				
				objsearchStateOwner.clear();
				objsearchStateOwner.sendKeys("No");
				objsearchStateOwner.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddisHomestead = driver.findElement(ddisHomestead);
		if (objddisHomestead.isDisplayed())
		{
			objddisHomestead.click();
			objbaseClass.waitForElementLoad(searchisHomestead, 30);
			WebElement objsearchisHomestead = driver.findElement(searchisHomestead);
			if (objsearchisHomestead.isDisplayed()) {
				
				objsearchisHomestead.clear();
				objsearchisHomestead.sendKeys("No");
				objsearchisHomestead.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddinaCDD = driver.findElement(ddinaCDD);
		if (objddinaCDD.isDisplayed())
		{
			objddinaCDD.click();
			objbaseClass.waitForElementLoad(searchCDD, 30);
			WebElement objsearchCDD = driver.findElement(searchCDD);
			if (objsearchCDD.isDisplayed()) {
				
				objsearchCDD.clear();
				objsearchCDD.sendKeys("No");
				objsearchCDD.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objddinBankruptcy = driver.findElement(ddinBankruptcy);
		if (objddinBankruptcy.isDisplayed())
		{
			objddinBankruptcy.click();
			objbaseClass.waitForElementLoad(searchBankruptcy, 30);
			WebElement objsearchBankruptcy = driver.findElement(searchBankruptcy);
			if (objsearchBankruptcy.isDisplayed()) {
				
				objsearchBankruptcy.clear();
				objsearchBankruptcy.sendKeys("No");
				objsearchBankruptcy.sendKeys(Keys.RETURN);
			}
		}
	
		WebElement objddsuperiorLien = driver.findElement(ddsuperiorLien);
		if (objddsuperiorLien.isDisplayed())
		{
			objddsuperiorLien.click();
			objbaseClass.waitForElementLoad(searchBankruptcy, 30);
			WebElement objsearchsuperiorLien = driver.findElement(searchsuperiorLien);
			if (objsearchsuperiorLien.isDisplayed()) {
				
				objsearchsuperiorLien.clear();
				objsearchsuperiorLien.sendKeys("No");
				objsearchsuperiorLien.sendKeys(Keys.RETURN);
			}
		}
		
		WebElement objtxtminlienCount = driver.findElement(txtminlienCount);
		if (objtxtminlienCount.isDisplayed())
		{
			objtxtminlienCount.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(1);
			objtxtminlienCount.sendKeys(randomnumericInput);
		}
		
		WebElement objtxtmaxlienCount = driver.findElement(txtmaxlienCount);
		if (objtxtmaxlienCount.isDisplayed())
		{
			objtxtmaxlienCount.clear();
			String randomnumericInput  = RandomStringUtils.randomNumeric(5);
			objtxtmaxlienCount.sendKeys(randomnumericInput);
		}
		
		WebElement objddlienPendens = driver.findElement(ddlienPendens);
		if (objddlienPendens.isDisplayed())
		{
			objddlienPendens.click();
			objbaseClass.waitForElementLoad(searchLienPendens, 30);
			WebElement objsearchLienPendens = driver.findElement(searchLienPendens);
			if (objsearchLienPendens.isDisplayed()) {
				
				objsearchLienPendens.clear();
				objsearchLienPendens.sendKeys("No");
				objsearchLienPendens.sendKeys(Keys.RETURN);
			}
		}
		
		objbaseClass.waitForElementLoad(btnclickActions, 30);
		WebElement objbtnclickActions = driver.findElement(btnclickActions);
		if (objbtnclickActions.isDisplayed())
		{
			objbtnclickActions.click();
		}
		
		objbaseClass.waitForElementLoad(btnsaveSearch, 30);
		WebElement objbtnsaveSearch = driver.findElement(btnsaveSearch);
		if (objbtnsaveSearch.isDisplayed())
		{
			objbtnsaveSearch.click();
			Thread.sleep(6000);
		}

		objbaseClass.waitForElementLoad(txtfilterName, 30);
		WebElement objtxtfilterName = driver.findElement(txtfilterName);
		if (objtxtfilterName.isDisplayed())
		{
			objtxtfilterName.clear();
			String randomnumericInput  = RandomStringUtils.randomAlphabetic(5);
			objtxtfilterName.sendKeys(randomnumericInput);
			savedfilterName = randomnumericInput;
			
		}
		
		objbaseClass.waitForElementLoad(btnsaveFilter, 30);
		WebElement objbtnbtnsaveFilter = driver.findElement(btnsaveFilter);
		if (objbtnbtnsaveFilter.isDisplayed())
		{
			objbtnbtnsaveFilter.click();
			Thread.sleep(8000);
		}
		
		objbaseClass.waitForElementLoad(msgsavefilterSuccess, 30);
		WebElement objmsgsavefilterSuccess = driver.findElement(msgsavefilterSuccess);
	    Assert.assertTrue(objmsgsavefilterSuccess.isDisplayed());
	}
	
	public void clearappliedFilter () throws InterruptedException
	
	{
		
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(btnclearappliedFlter, 30);
		
		WebElement objbtnclearappliedFlter = driver.findElement(btnclearappliedFlter);
		if (objbtnclearappliedFlter.isDisplayed())
		{
			objbtnclearappliedFlter.click();
			
		}
		Thread.sleep(7000);
		objbaseClass.waitForElementLoad(msgparcelscountText, 30);
		
	}
	
	public void applysavedFilter () throws InterruptedException
	
	{
		BaseClass objbaseClass = new BaseClass();
		objbaseClass.waitForElementLoad(ddsavedfilterListing, 30);
		
		WebElement objddsavedfilterListing = driver.findElement(ddsavedfilterListing);
		if (objddsavedfilterListing.isDisplayed())
		{
			objddsavedfilterListing.click();
			objbaseClass.waitForElementLoad(txtsearchsavedFilter, 30);
			WebElement objtxtsearchsavedFilter = driver.findElement(txtsearchsavedFilter);
			if (objtxtsearchsavedFilter.isDisplayed()) {
				
				objtxtsearchsavedFilter.clear();
				objtxtsearchsavedFilter.sendKeys(savedfilterName);
				objtxtsearchsavedFilter.sendKeys(Keys.RETURN);
			}
			
		}
		
		objbaseClass.waitForElementLoad(btngetCerts, 30);
		
		WebElement objbtngetCerts = driver.findElement(btngetCerts);
		if (objbtngetCerts.isDisplayed())
		{
			objbtngetCerts.click();
			Thread.sleep(7000);
		}
		
		objbaseClass.waitForElementLoad(msgparcelscountertext, 30);
		
		WebElement objmsgparcelscountertext = driver.findElement(msgparcelscountertext);
		Assert.assertTrue(objmsgparcelscountertext.isDisplayed());
		
		
	}
		
}