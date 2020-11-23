package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Digimap {

	public WebDriver driver;
	private By openDigimap = By.xpath("//*[@id=\"mainwrapper\"]/div[1]/ul[1]/li[2]/a/span");
	private By clickActions = By.xpath("//*[@id=\"sandboxActionButton\"]/button");
	private By clickCreateNewList = By.id("CreateNewParcelList");
	private By enterListName = By.id("ParcelListName");
	private By createListBtn = By.xpath("//*[@id=\"NewParcelListModal\"]/div[2]/div/div[3]/button[2]");
	private By selectRenameList = By.xpath("//*[@id=\"RenameParcelList\"]");
	private By updateListBtn = By.xpath("//*[@id=\"RenameParcelListModal\"]/div[2]/div/div[3]/button[2]");
	private By selectDeleteList = By.xpath("//*[@id=\"DeleteParcelList\"]");
	private By openBuildLayerstab = By.xpath("//*[@id=\"SidebarMainTabs\"]/li[1]/a");
	private By openParcelNumbertab = By.xpath("//*[@id=\"headingTwo\"]/h4/a");
	private By ParcelNumbertxt = By.xpath("//*[@id=\"searchByParcelInput\"]");
	private By submitParcelNumberBtn = By.xpath("//*[@id=\"searchByParcelButtonModal\"]");
	private By enterLayerNametxt = By.xpath("//*[@id=\"LayerNameLabel\"]");
	private By confirmSubmission = By.xpath("//*[@id=\"searchByParcelButton\"]");
	private By selectClearParcels = By.xpath("//*[@id=\"ClearParcelList\"]");
	private By checkallParcels = By.xpath("//*[@id=\"select-all\"]");
	private By clickOptions = By.xpath("//*[@id=\"actionBttn\"]");
	private By renameLayer = By.xpath("//*[@id=\"ReNameSelectedParcels\"]");
	private By addParcelsbyAddress = By.xpath("//*[@id=\"headingOne\"]/h4/a");
	private By parcelAddresstxt = By.xpath("//*[@id=\"searchByAddressInput\"]");
	private By addbyAddressBtn = By.xpath("//*[@id=\"searchByAddressButtonModal\"]");
	private By addLayerNametxt = By.xpath("//*[@id=\"LayerNameLabel\"]");
	private By confirmAddressbtn = By.xpath("//*[@id=\"searchByAddressButton\"]");
	private By clicksavedSearch = By.xpath("//*[@id=\"headingThree\"]/h4/a");
	private By openCountylist = By.xpath("//*[@id=\"select2-chosen-19\"]");
	private By enterCountyName = By.xpath("//*[@id=\"s2id_autogen19_search\"]");
	private By selectSavedSearch = By.xpath("//*[@id=\"select2-chosen-20\"]");
	private By inputSearchName = By.xpath("//*[@id=\"s2id_autogen20_search\"]");
	private By addParcelsbySearch = By.xpath("//*[@id=\"CriteriaListBttnModal\"]");
	private By enterLayername = By.xpath("//*[@id=\"LayerNameLabel\"]");
	private By confirmAddParcels = By.xpath("//*[@id=\"CriteriaListBttn\"]");
	
	public Digimap(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void openDigimap () throws InterruptedException
	{
		WebElement objopenDigimap = driver.findElement(openDigimap);
		if (objopenDigimap.isDisplayed())
		{
			objopenDigimap.click();
			Thread.sleep(5000);
		}
	}
	
	public void create_new_list () throws InterruptedException
	{
		WebElement objclickActions = driver.findElement(clickActions);
		if (objclickActions.isDisplayed())
		{
			objclickActions.click();
			Thread.sleep(5000);
		}
		
		WebElement objclickCreateNewList = driver.findElement(clickCreateNewList);
		if (objclickCreateNewList.isDisplayed())
		{
			objclickCreateNewList.click();
			Thread.sleep(5000);
		}
		
		WebElement objenterListName = driver.findElement(enterListName);
		if (objenterListName.isDisplayed())
		{
			objenterListName.sendKeys("Add - Automation: FL, ALUCHUA");
			Thread.sleep(5000);
		}
		
		WebElement objcreateListBtn = driver.findElement(createListBtn);
		if (objcreateListBtn.isDisplayed())
		{
			objcreateListBtn.click();
			Thread.sleep(5000);
		}
	}
	
	public void rename_list() throws InterruptedException
	{
		WebElement objclickActions = driver.findElement(clickActions);
		if (objclickActions.isDisplayed())
		{
			objclickActions.click();
			Thread.sleep(5000);
		}
		
		WebElement objselectRenameList = driver.findElement(selectRenameList);
		if (objselectRenameList.isDisplayed())
		{
			objselectRenameList.click();
			Thread.sleep(5000);
		}
		
		WebElement objenterListName = driver.findElement(enterListName);
		if (objenterListName.isDisplayed())
		{
			objenterListName.clear();
			objenterListName.sendKeys("Update - Automation: FL, ALUCHUA");
			Thread.sleep(5000);
		}
		
		WebElement objupdateListBtn = driver.findElement(updateListBtn);
		if (objupdateListBtn.isDisplayed())
		{
			objupdateListBtn.click();
			Thread.sleep(5000);
		}
	}
	
	public void add_parcels_to_list () throws InterruptedException
	{
		WebElement objopenBuildLayerstab = driver.findElement(openBuildLayerstab);
		if (objopenBuildLayerstab.isDisplayed())
		{
			objopenBuildLayerstab.click();
			Thread.sleep(5000);
		}
		
		WebElement objaddParcelsbyAddress = driver.findElement(addParcelsbyAddress);
		if (objaddParcelsbyAddress.isDisplayed())
		{
			objaddParcelsbyAddress.click();
			Thread.sleep(5000);
		}
		
		WebElement objparcelAddresstxt = driver.findElement(parcelAddresstxt);
		if (objparcelAddresstxt.isDisplayed())
		{
			objparcelAddresstxt.clear();
			objparcelAddresstxt.sendKeys("426 Nw 4th Gainesville Fl 32601");
			Thread.sleep(5000);
		}
		
		WebElement objaddbyAddressBtn = driver.findElement(addbyAddressBtn);
		if (objaddbyAddressBtn.isDisplayed())
		{
			objaddbyAddressBtn.click();
			Thread.sleep(5000);
		}
		
		WebElement objaddLayerNametxt = driver.findElement(addLayerNametxt);
		if (objaddLayerNametxt.isDisplayed())
		{
			objaddLayerNametxt.clear();
			objaddLayerNametxt.sendKeys("Layer 01");
			Thread.sleep(5000);
		}
		
		WebElement objconfirmAddressbtn = driver.findElement(confirmAddressbtn);
		if (objconfirmAddressbtn.isDisplayed())
		{
			objconfirmAddressbtn.click();
			Thread.sleep(5000);
		}
		
		
		/*WebElement objcloseAddresspopup = driver.findElement(closeAddresspopup);
		if (objcloseAddresspopup.isDisplayed())
		{
			objcloseAddresspopup.click();
			Thread.sleep(5000); 
		} */
		
		WebElement objopenBuildLayerstabs = driver.findElement(openBuildLayerstab);
		if (objopenBuildLayerstabs.isDisplayed())
		{
			objopenBuildLayerstabs.click();
			Thread.sleep(5000);
		}
		
		WebElement objopenParcelNumbertab = driver.findElement(openParcelNumbertab);
		if (objopenParcelNumbertab.isDisplayed())
		{
			objopenParcelNumbertab.click();
			Thread.sleep(5000);
		}
		
		WebElement objParcelNumbertxt = driver.findElement(ParcelNumbertxt);
		if (objParcelNumbertxt.isDisplayed())
		{
			objParcelNumbertxt.clear();
			objParcelNumbertxt.sendKeys("14510-000-000");
			Thread.sleep(5000);
		}
		
		WebElement objsubmitParcelNumberBtn = driver.findElement(submitParcelNumberBtn);
		if (objsubmitParcelNumberBtn.isDisplayed())
		{
			objsubmitParcelNumberBtn.click();
			Thread.sleep(5000);
		}
		
		WebElement objenterLayerNametxt = driver.findElement(enterLayerNametxt);
		if (objenterLayerNametxt.isDisplayed())
		{
			objenterLayerNametxt.clear();
			objenterLayerNametxt.sendKeys("Layer 02");
			Thread.sleep(5000);
		}
		
		WebElement objconfirmSubmission = driver.findElement(confirmSubmission);
		if (objconfirmSubmission.isDisplayed())
		{
			objconfirmSubmission.click();
			Thread.sleep(5000);
		}
		
		WebElement objectBuildLayerstabs = driver.findElement(openBuildLayerstab);
		if (objectBuildLayerstabs.isDisplayed())
		{
			objectBuildLayerstabs.click();
			Thread.sleep(5000);
		}
		
		WebElement objclicksavedSearch = driver.findElement(clicksavedSearch);
		if (objclicksavedSearch.isDisplayed())
		{
			objclicksavedSearch.click();
			Thread.sleep(5000);
		}
		
		WebElement objopenCountylist = driver.findElement(openCountylist);
		if (objopenCountylist.isDisplayed())
		{
			objopenCountylist.click();
			Thread.sleep(5000);
		}
		
		WebElement objenterCountyName= driver.findElement(enterCountyName);
		if (objenterCountyName.isDisplayed())
		{
			objenterCountyName.clear();
			objenterCountyName.sendKeys("Apache");
			objenterCountyName.click();
			Thread.sleep(5000);
		}
		
		WebElement objselectSavedSearch = driver.findElement(selectSavedSearch);
		if (objselectSavedSearch.isDisplayed())
		{
			objselectSavedSearch.click();
			Thread.sleep(5000);
		}
		
		WebElement objinputSearchName = driver.findElement(inputSearchName);
		if (objinputSearchName.isDisplayed())
		{
			objinputSearchName.clear();
			objinputSearchName.sendKeys("ZM-Arg08");
			objinputSearchName.click();
			Thread.sleep(5000);
		}
		
		WebElement objaddParcelsbySearch = driver.findElement(addParcelsbySearch);
		if (objaddParcelsbySearch.isDisplayed())
		{
			objaddParcelsbySearch.click();
			Thread.sleep(5000);
		}
		
		WebElement objenterLayername = driver.findElement(enterLayername);
		if (objenterLayername.isDisplayed())
		{
			objenterLayername.clear();
			objenterLayername.sendKeys("Layer 03");
			Thread.sleep(5000);
		}
		
		WebElement objconfirmAddParcels = driver.findElement(confirmAddParcels);
		if (objconfirmAddParcels.isDisplayed())
		{
			objconfirmAddParcels.click();
			Thread.sleep(5000);
			
		}
		
	}
	
	public void rename_layer () throws InterruptedException
	{
		WebElement objcheckallParcels = driver.findElement(checkallParcels);
		if (objcheckallParcels.isDisplayed())
		{
			objcheckallParcels.click();
			Thread.sleep(5000);
		}
		
		WebElement objclickOptions = driver.findElement(clickOptions);
		if (objclickOptions.isDisplayed())
		{
			objclickOptions.click();
			Thread.sleep(5000);
		}
		
		WebElement objrenameLayer = driver.findElement(renameLayer);
		if (objrenameLayer.isDisplayed())
		{
			objrenameLayer.click();
			Thread.sleep(5000);
		}
		driver.switchTo().alert().sendKeys("Layer 04");
		driver.switchTo().alert().accept();
	}
	
	public void clear_parcels_from_list () throws InterruptedException
	{
		WebElement objclickActions = driver.findElement(clickActions);
		if (objclickActions.isDisplayed())
		{
			objclickActions.click();
			Thread.sleep(5000);
		}
		
		WebElement objselectClearParcels = driver.findElement(selectClearParcels);
		if (objselectClearParcels.isDisplayed())
		{
			objselectClearParcels.click();
			Thread.sleep(5000);
		}
		 driver.switchTo().alert().accept();
		 Thread.sleep(5000);
	}
	
	public void delete_list() throws InterruptedException
	{
		WebElement objclickActions = driver.findElement(clickActions);
		if (objclickActions.isDisplayed())
		{
			objclickActions.click();
			Thread.sleep(5000);
		}
		WebElement objselectDeleteList = driver.findElement(selectDeleteList);
		if (objselectDeleteList.isDisplayed())
		{
			objselectDeleteList.click();
			Thread.sleep(5000);
		}
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	
}