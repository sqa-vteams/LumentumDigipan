package objectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ManageUsers {

	public WebDriver driver;
	private By click_addUser_btn = By.xpath("//*[@id=\"addUserBtn\"]");
	private By input_FirstName = By.xpath("//*[@id=\"FirstName\"]");
	private By input_LastName = By.xpath("//*[@id=\"LastName\"]");
	private By input_emailAddress = By.xpath("//*[@id=\"LoginId\"]");
	private By select_UserRole = By.xpath("//*[@id=\"UserRoleID\"]");
	private By input_password = By.xpath("//*[@id=\"NewPassword\"]");
	private By click_addUser = By.xpath("//*[@id=\"AddUserSubmitButton\"]/span");
	private By close_confirmaton = By.xpath("/html/body/div[7]/div[2]/div/div[1]/button");
	private By edit_firstname = By.xpath("//*[@id=\"corporateUsersTable\"]/tbody/tr[33]/td[1]/input");
	private By edit_lastName = By.xpath("//*[@id=\"corporateUsersTable\"]/tbody/tr[33]/td[2]/input");
	private By edit_email = By.xpath("//*[@id=\"corporateUsersTable\"]/tbody/tr[33]/td[3]/input");
	private By open_userRole = By.xpath("//*[@id=\"s2id_autogen282\"]/a/span[2]/b");
	private By input_userRole = By.xpath("//*[@id=\"s2id_autogen283_search\"]");
	private By edit_access_info = By.xpath("//*[@id=\"corporateUsersTable\"]/tbody/tr[33]/td[5]/div/a/i");
	private By permissionControl_01 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[2]/td[2]/select");
	private By permissionControl_02 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[3]/td[2]/select");
	private By permissionControl_03 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[4]/td[2]/select");
	private By permissionControl_04 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[5]/td[2]/select");
	private By permissionControl_05 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[6]/td[2]/select");
	private By permissionControl_06 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[7]/td[2]/select");
	private By permissionControl_07 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[8]/td[2]/select");
	private By permissionControl_08 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[9]/td[2]/select");
	private By permissionControl_09 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[10]/td[2]/select");
	private By permissionControl_10 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[11]/td[2]/select");
	private By permissionControl_11 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[12]/td[2]/select");
	private By permissionControl_12 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[13]/td[2]/select");
	private By permissionControl_13 = By.xpath("//*[@id=\"userPermissionsWrapper\"]/table/tbody/tr[14]/td[2]/select");
	private By update_accessControl_info = By.xpath("//*[@id=\"UserPermissionsUpdateBtn\"]");
	
	
	
	
	public ManageUsers(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void open_ManageUsers () throws InterruptedException
	{
		driver.get("https://digipan.lumentumllc.us/?beta#!manage_users");
		Thread.sleep(5000);
	}
	
	public void add_newUser () throws InterruptedException
	{
		WebElement objclick_addUser_btn = driver.findElement(click_addUser_btn);
		if (objclick_addUser_btn.isDisplayed())
		{
			objclick_addUser_btn.click();
			Thread.sleep(5000);
		}
		
		WebElement objinput_FirstName = driver.findElement(input_FirstName);
		if (objinput_FirstName.isDisplayed())
		{
			objinput_FirstName.click();
			objinput_FirstName.clear();
			objinput_FirstName.sendKeys("Zeeshan");
		}
		
		WebElement objinput_LastName = driver.findElement(input_LastName);
		if (objinput_LastName.isDisplayed())
		{
			objinput_LastName.click();
			objinput_LastName.clear();
			objinput_LastName.sendKeys("Mazhar");
		}
		
		WebElement objinput_emailAddress = driver.findElement(input_emailAddress);
		if (objinput_emailAddress.isDisplayed())
		{
			objinput_emailAddress.click();
			objinput_emailAddress.clear();
			objinput_emailAddress.sendKeys("zeeshan.mazhar@mailinator.com.pk");
		}
		
		WebElement objselect_UserRole = driver.findElement(select_UserRole);
		if (objselect_UserRole.isDisplayed())
		{
			Select userRole_list = new Select (objselect_UserRole);
			userRole_list.selectByValue("2");
		}
		
		WebElement objinput_password = driver.findElement(input_password);
		if (objinput_password.isDisplayed())
		{
			objinput_password.click();
			objinput_password.clear();
			objinput_password.sendKeys("Casuality01!");
		}
		
		WebElement objclick_addUser = driver.findElement(click_addUser);
		if (objclick_addUser.isDisplayed())
		{
			objclick_addUser.click();
			Thread.sleep(10000);
		}
		
		WebElement objclose_confirmaton = driver.findElement(close_confirmaton);
		if (objclose_confirmaton.isDisplayed())
		{
			objclose_confirmaton.click();
			Thread.sleep(1000);
		}
	}
	
	public void edit_user () throws InterruptedException
	{
		WebElement objedit_firstname = driver.findElement(edit_firstname);
		if (objedit_firstname.isDisplayed())
		{
			objedit_firstname.click();
			objedit_firstname.clear();
			String generatedString_ORG = RandomStringUtils.randomAlphabetic(5);
			objedit_firstname.sendKeys(generatedString_ORG);
			Thread.sleep(1000);
			Actions action = new Actions(driver); 
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
			objedit_firstname.click();
			objedit_firstname.clear();
			objedit_firstname.sendKeys("Muhammad Zeeshan");
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
		}
		
		WebElement objedit_lastName = driver.findElement(edit_lastName);
		if (objedit_lastName.isDisplayed())
		{
			objedit_lastName.click();
			objedit_lastName.clear();
			String generatedString_ORG = RandomStringUtils.randomAlphabetic(5);
			objedit_lastName.sendKeys(generatedString_ORG);
			Thread.sleep(1000);
			Actions action = new Actions(driver); 
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
			objedit_lastName.click();
			objedit_lastName.clear();
			objedit_lastName.sendKeys("Mazhar");
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
		}
		
		WebElement objedit_email = driver.findElement(edit_email);
		if (objedit_email.isDisplayed())
		{
			objedit_email.click();
			objedit_email.clear();
			String generatedString_ORG = RandomStringUtils.randomAlphabetic(5);
			objedit_email.sendKeys(generatedString_ORG+"@gmail.com");
			Thread.sleep(1000);
			Actions action = new Actions(driver); 
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
			objedit_email.click();
			objedit_email.clear();
			objedit_email.sendKeys("zeeshan.feb89@gmail.com");
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(1000);
		}
		
	}
	
	public void edit_access_ontrol_info () throws InterruptedException
	{
		WebElement objedit_access_info = driver.findElement(edit_access_info);
		if (objedit_access_info.isDisplayed())
		{
			objedit_access_info.click();
			Thread.sleep(5000);
		}
		
		WebElement objpermissionControl_01 = driver.findElement(permissionControl_01);
		if (objpermissionControl_01.isDisplayed())		
		{
			Select objpermissionControl_001 = new Select (objpermissionControl_01);
			objpermissionControl_001.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_02 = driver.findElement(permissionControl_02);
		if (objpermissionControl_02.isDisplayed())		
		{
			Select objpermissionControl_002 = new Select (objpermissionControl_02);
			objpermissionControl_002.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_03 = driver.findElement(permissionControl_03);
		if (objpermissionControl_03.isDisplayed())		
		{
			Select objpermissionControl_003 = new Select (objpermissionControl_03);
			objpermissionControl_003.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_04 = driver.findElement(permissionControl_04);
		if (objpermissionControl_04.isDisplayed())		
		{
			Select objpermissionControl_004 = new Select (objpermissionControl_04);
			objpermissionControl_004.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_05 = driver.findElement(permissionControl_05);
		if (objpermissionControl_05.isDisplayed())		
		{
			Select objpermissionControl_005 = new Select (objpermissionControl_05);
			objpermissionControl_005.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_06 = driver.findElement(permissionControl_06);
		if (objpermissionControl_06.isDisplayed())		
		{
			Select objpermissionControl_006 = new Select (objpermissionControl_06);
			objpermissionControl_006.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_07 = driver.findElement(permissionControl_07);
		if (objpermissionControl_07.isDisplayed())		
		{
			Select objpermissionControl_007 = new Select (objpermissionControl_07);
			objpermissionControl_007.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_08 = driver.findElement(permissionControl_08);
		if (objpermissionControl_08.isDisplayed())		
		{
			Select objpermissionControl_008 = new Select (objpermissionControl_08);
			objpermissionControl_008.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_09 = driver.findElement(permissionControl_09);
		if (objpermissionControl_09.isDisplayed())		
		{
			Select objpermissionControl_009 = new Select (objpermissionControl_09);
			objpermissionControl_009.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_10 = driver.findElement(permissionControl_10);
		if (objpermissionControl_10.isDisplayed())		
		{
			Select objpermissionControl_010 = new Select (objpermissionControl_10);
			objpermissionControl_010.selectByValue("0");
			Thread.sleep(1000);
		}

		WebElement objpermissionControl_11 = driver.findElement(permissionControl_11);
		if (objpermissionControl_11.isDisplayed())		
		{
			Select objpermissionControl_011 = new Select (objpermissionControl_11);
			objpermissionControl_011.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_12 = driver.findElement(permissionControl_12);
		if (objpermissionControl_12.isDisplayed())		
		{
			Select objpermissionControl_012 = new Select (objpermissionControl_12);
			objpermissionControl_012.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_13 = driver.findElement(permissionControl_13);
		if (objpermissionControl_13.isDisplayed())		
		{
			Select objpermissionControl_013 = new Select (objpermissionControl_13);
			objpermissionControl_013.selectByValue("0");
			Thread.sleep(1000);
		}
		
		WebElement objupdate_accessControl_info = driver.findElement(update_accessControl_info);
		if (objupdate_accessControl_info.isDisplayed())
		{
			objupdate_accessControl_info.click();
			Thread.sleep(5000);
		}
	}
	
	public void edit_access_control_01() throws InterruptedException
	{
		WebElement objedit_access_info = driver.findElement(edit_access_info);
		if (objedit_access_info.isDisplayed())
		{
			objedit_access_info.click();
			Thread.sleep(5000);
		}
		
		WebElement objpermissionControl_01 = driver.findElement(permissionControl_01);
		if (objpermissionControl_01.isDisplayed())		
		{
			Select objpermissionControl_001 = new Select (objpermissionControl_01);
			objpermissionControl_001.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_02 = driver.findElement(permissionControl_02);
		if (objpermissionControl_02.isDisplayed())		
		{
			Select objpermissionControl_002 = new Select (objpermissionControl_02);
			objpermissionControl_002.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_03 = driver.findElement(permissionControl_03);
		if (objpermissionControl_03.isDisplayed())		
		{
			Select objpermissionControl_003 = new Select (objpermissionControl_03);
			objpermissionControl_003.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_04 = driver.findElement(permissionControl_04);
		if (objpermissionControl_04.isDisplayed())		
		{
			Select objpermissionControl_004 = new Select (objpermissionControl_04);
			objpermissionControl_004.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_05 = driver.findElement(permissionControl_05);
		if (objpermissionControl_05.isDisplayed())		
		{
			Select objpermissionControl_005 = new Select (objpermissionControl_05);
			objpermissionControl_005.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_06 = driver.findElement(permissionControl_06);
		if (objpermissionControl_06.isDisplayed())		
		{
			Select objpermissionControl_006 = new Select (objpermissionControl_06);
			objpermissionControl_006.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_07 = driver.findElement(permissionControl_07);
		if (objpermissionControl_07.isDisplayed())		
		{
			Select objpermissionControl_007 = new Select (objpermissionControl_07);
			objpermissionControl_007.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_08 = driver.findElement(permissionControl_08);
		if (objpermissionControl_08.isDisplayed())		
		{
			Select objpermissionControl_008 = new Select (objpermissionControl_08);
			objpermissionControl_008.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_09 = driver.findElement(permissionControl_09);
		if (objpermissionControl_09.isDisplayed())		
		{
			Select objpermissionControl_009 = new Select (objpermissionControl_09);
			objpermissionControl_009.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_10 = driver.findElement(permissionControl_10);
		if (objpermissionControl_10.isDisplayed())		
		{
			Select objpermissionControl_010 = new Select (objpermissionControl_10);
			objpermissionControl_010.selectByValue("1");
			Thread.sleep(1000);
		}

		WebElement objpermissionControl_11 = driver.findElement(permissionControl_11);
		if (objpermissionControl_11.isDisplayed())		
		{
			Select objpermissionControl_011 = new Select (objpermissionControl_11);
			objpermissionControl_011.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_12 = driver.findElement(permissionControl_12);
		if (objpermissionControl_12.isDisplayed())		
		{
			Select objpermissionControl_012 = new Select (objpermissionControl_12);
			objpermissionControl_012.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_13 = driver.findElement(permissionControl_13);
		if (objpermissionControl_13.isDisplayed())		
		{
			Select objpermissionControl_013 = new Select (objpermissionControl_13);
			objpermissionControl_013.selectByValue("1");
			Thread.sleep(1000);
		}
		
		WebElement objupdate_accessControl_info = driver.findElement(update_accessControl_info);
		if (objupdate_accessControl_info.isDisplayed())
		{
			objupdate_accessControl_info.click();
			Thread.sleep(5000);
		}
	
	}
	
	public void edit_access_control_02() throws InterruptedException
	{
		WebElement objedit_access_info = driver.findElement(edit_access_info);
		if (objedit_access_info.isDisplayed())
		{
			objedit_access_info.click();
			Thread.sleep(5000);
		}
		
		WebElement objpermissionControl_01 = driver.findElement(permissionControl_01);
		if (objpermissionControl_01.isDisplayed())		
		{
			Select objpermissionControl_001 = new Select (objpermissionControl_01);
			objpermissionControl_001.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_02 = driver.findElement(permissionControl_02);
		if (objpermissionControl_02.isDisplayed())		
		{
			Select objpermissionControl_002 = new Select (objpermissionControl_02);
			objpermissionControl_002.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_03 = driver.findElement(permissionControl_03);
		if (objpermissionControl_03.isDisplayed())		
		{
			Select objpermissionControl_003 = new Select (objpermissionControl_03);
			objpermissionControl_003.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_04 = driver.findElement(permissionControl_04);
		if (objpermissionControl_04.isDisplayed())		
		{
			Select objpermissionControl_004 = new Select (objpermissionControl_04);
			objpermissionControl_004.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_05 = driver.findElement(permissionControl_05);
		if (objpermissionControl_05.isDisplayed())		
		{
			Select objpermissionControl_005 = new Select (objpermissionControl_05);
			objpermissionControl_005.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_06 = driver.findElement(permissionControl_06);
		if (objpermissionControl_06.isDisplayed())		
		{
			Select objpermissionControl_006 = new Select (objpermissionControl_06);
			objpermissionControl_006.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_07 = driver.findElement(permissionControl_07);
		if (objpermissionControl_07.isDisplayed())		
		{
			Select objpermissionControl_007 = new Select (objpermissionControl_07);
			objpermissionControl_007.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_08 = driver.findElement(permissionControl_08);
		if (objpermissionControl_08.isDisplayed())		
		{
			Select objpermissionControl_008 = new Select (objpermissionControl_08);
			objpermissionControl_008.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_09 = driver.findElement(permissionControl_09);
		if (objpermissionControl_09.isDisplayed())		
		{
			Select objpermissionControl_009 = new Select (objpermissionControl_09);
			objpermissionControl_009.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_10 = driver.findElement(permissionControl_10);
		if (objpermissionControl_10.isDisplayed())		
		{
			Select objpermissionControl_010 = new Select (objpermissionControl_10);
			objpermissionControl_010.selectByValue("2");
			Thread.sleep(1000);
		}

		WebElement objpermissionControl_11 = driver.findElement(permissionControl_11);
		if (objpermissionControl_11.isDisplayed())		
		{
			Select objpermissionControl_011 = new Select (objpermissionControl_11);
			objpermissionControl_011.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_12 = driver.findElement(permissionControl_12);
		if (objpermissionControl_12.isDisplayed())		
		{
			Select objpermissionControl_012 = new Select (objpermissionControl_12);
			objpermissionControl_012.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_13 = driver.findElement(permissionControl_13);
		if (objpermissionControl_13.isDisplayed())		
		{
			Select objpermissionControl_013 = new Select (objpermissionControl_13);
			objpermissionControl_013.selectByValue("2");
			Thread.sleep(1000);
		}
		
		WebElement objupdate_accessControl_info = driver.findElement(update_accessControl_info);
		if (objupdate_accessControl_info.isDisplayed())
		{
			objupdate_accessControl_info.click();
			Thread.sleep(5000);
		}
	
	}
	
	public void edit_access_control_03() throws InterruptedException
	{
		WebElement objedit_access_info = driver.findElement(edit_access_info);
		if (objedit_access_info.isDisplayed())
		{
			objedit_access_info.click();
			Thread.sleep(5000);
		}
		
		WebElement objpermissionControl_01 = driver.findElement(permissionControl_01);
		if (objpermissionControl_01.isDisplayed())		
		{
			Select objpermissionControl_001 = new Select (objpermissionControl_01);
			objpermissionControl_001.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_02 = driver.findElement(permissionControl_02);
		if (objpermissionControl_02.isDisplayed())		
		{
			Select objpermissionControl_002 = new Select (objpermissionControl_02);
			objpermissionControl_002.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_03 = driver.findElement(permissionControl_03);
		if (objpermissionControl_03.isDisplayed())		
		{
			Select objpermissionControl_003 = new Select (objpermissionControl_03);
			objpermissionControl_003.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_04 = driver.findElement(permissionControl_04);
		if (objpermissionControl_04.isDisplayed())		
		{
			Select objpermissionControl_004 = new Select (objpermissionControl_04);
			objpermissionControl_004.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_05 = driver.findElement(permissionControl_05);
		if (objpermissionControl_05.isDisplayed())		
		{
			Select objpermissionControl_005 = new Select (objpermissionControl_05);
			objpermissionControl_005.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_06 = driver.findElement(permissionControl_06);
		if (objpermissionControl_06.isDisplayed())		
		{
			Select objpermissionControl_006 = new Select (objpermissionControl_06);
			objpermissionControl_006.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_07 = driver.findElement(permissionControl_07);
		if (objpermissionControl_07.isDisplayed())		
		{
			Select objpermissionControl_007 = new Select (objpermissionControl_07);
			objpermissionControl_007.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_08 = driver.findElement(permissionControl_08);
		if (objpermissionControl_08.isDisplayed())		
		{
			Select objpermissionControl_008 = new Select (objpermissionControl_08);
			objpermissionControl_008.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_09 = driver.findElement(permissionControl_09);
		if (objpermissionControl_09.isDisplayed())		
		{
			Select objpermissionControl_009 = new Select (objpermissionControl_09);
			objpermissionControl_009.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_10 = driver.findElement(permissionControl_10);
		if (objpermissionControl_10.isDisplayed())		
		{
			Select objpermissionControl_010 = new Select (objpermissionControl_10);
			objpermissionControl_010.selectByValue("3");
			Thread.sleep(1000);
		}

		WebElement objpermissionControl_11 = driver.findElement(permissionControl_11);
		if (objpermissionControl_11.isDisplayed())		
		{
			Select objpermissionControl_011 = new Select (objpermissionControl_11);
			objpermissionControl_011.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_12 = driver.findElement(permissionControl_12);
		if (objpermissionControl_12.isDisplayed())		
		{
			Select objpermissionControl_012 = new Select (objpermissionControl_12);
			objpermissionControl_012.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_13 = driver.findElement(permissionControl_13);
		if (objpermissionControl_13.isDisplayed())		
		{
			Select objpermissionControl_013 = new Select (objpermissionControl_13);
			objpermissionControl_013.selectByValue("3");
			Thread.sleep(1000);
		}
		
		WebElement objupdate_accessControl_info = driver.findElement(update_accessControl_info);
		if (objupdate_accessControl_info.isDisplayed())
		{
			objupdate_accessControl_info.click();
			Thread.sleep(5000);
		}
	
	}
	
	public void edit_access_control_04() throws InterruptedException
	{
		WebElement objedit_access_info = driver.findElement(edit_access_info);
		if (objedit_access_info.isDisplayed())
		{
			objedit_access_info.click();
			Thread.sleep(5000);
		}
		
		WebElement objpermissionControl_01 = driver.findElement(permissionControl_01);
		if (objpermissionControl_01.isDisplayed())		
		{
			Select objpermissionControl_001 = new Select (objpermissionControl_01);
			objpermissionControl_001.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_02 = driver.findElement(permissionControl_02);
		if (objpermissionControl_02.isDisplayed())		
		{
			Select objpermissionControl_002 = new Select (objpermissionControl_02);
			objpermissionControl_002.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_03 = driver.findElement(permissionControl_03);
		if (objpermissionControl_03.isDisplayed())		
		{
			Select objpermissionControl_003 = new Select (objpermissionControl_03);
			objpermissionControl_003.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_04 = driver.findElement(permissionControl_04);
		if (objpermissionControl_04.isDisplayed())		
		{
			Select objpermissionControl_004 = new Select (objpermissionControl_04);
			objpermissionControl_004.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_05 = driver.findElement(permissionControl_05);
		if (objpermissionControl_05.isDisplayed())		
		{
			Select objpermissionControl_005 = new Select (objpermissionControl_05);
			objpermissionControl_005.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_06 = driver.findElement(permissionControl_06);
		if (objpermissionControl_06.isDisplayed())		
		{
			Select objpermissionControl_006 = new Select (objpermissionControl_06);
			objpermissionControl_006.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_07 = driver.findElement(permissionControl_07);
		if (objpermissionControl_07.isDisplayed())		
		{
			Select objpermissionControl_007 = new Select (objpermissionControl_07);
			objpermissionControl_007.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_08 = driver.findElement(permissionControl_08);
		if (objpermissionControl_08.isDisplayed())		
		{
			Select objpermissionControl_008 = new Select (objpermissionControl_08);
			objpermissionControl_008.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_09 = driver.findElement(permissionControl_09);
		if (objpermissionControl_09.isDisplayed())		
		{
			Select objpermissionControl_009 = new Select (objpermissionControl_09);
			objpermissionControl_009.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_10 = driver.findElement(permissionControl_10);
		if (objpermissionControl_10.isDisplayed())		
		{
			Select objpermissionControl_010 = new Select (objpermissionControl_10);
			objpermissionControl_010.selectByValue("4");
			Thread.sleep(1000);
		}

		WebElement objpermissionControl_11 = driver.findElement(permissionControl_11);
		if (objpermissionControl_11.isDisplayed())		
		{
			Select objpermissionControl_011 = new Select (objpermissionControl_11);
			objpermissionControl_011.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_12 = driver.findElement(permissionControl_12);
		if (objpermissionControl_12.isDisplayed())		
		{
			Select objpermissionControl_012 = new Select (objpermissionControl_12);
			objpermissionControl_012.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objpermissionControl_13 = driver.findElement(permissionControl_13);
		if (objpermissionControl_13.isDisplayed())		
		{
			Select objpermissionControl_013 = new Select (objpermissionControl_13);
			objpermissionControl_013.selectByValue("4");
			Thread.sleep(1000);
		}
		
		WebElement objupdate_accessControl_info = driver.findElement(update_accessControl_info);
		if (objupdate_accessControl_info.isDisplayed())
		{
			objupdate_accessControl_info.click();
			Thread.sleep(5000);
		}
	
	}
}