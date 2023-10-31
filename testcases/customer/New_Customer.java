package customer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.bankGuru.LoginPageObject;
import pageObjects.bankGuru.ManagePageObject;
import pageObjects.bankGuru.NewCustomerPageObject;
import pageObjects.bankGuru.PageGeneratorManager;

public class New_Customer extends BaseTest{
	WebDriver driver;
	String loginUrl, username, password;
	
	@Parameters({"browser","loginUrl"})
	@BeforeClass
	public void beforeClass(String browserName, String loginUrl) {
		this.loginUrl = loginUrl;
		username = "mngr533717";
		password = "bynYpag";
		driver = getBrowserDriver(browserName, loginUrl);
		loginPage = PageGeneratorManager.getLoginPage(driver);
		loginPage.enterToUsername(username);
		loginPage.enterToPassword(password);
		managePage = loginPage.clickToLoginButton();
		newCustomerPage = (NewCustomerPageObject) managePage.openDynamicSideBarPage("New Customer");
		newCustomerPage.clickToAdCloseButton();
		newCustomerPage.sleepInSecond(2);
	}
	
	@Test
	public void NC_01_Verify_Name_Field_Cannot_Be_Empty() {
		log.info("NC_01 - Step 01: Do not enter a value in NAME field");
		newCustomerPage.enterToTextboxByNameField("Customer Name","");
		
		log.info("NC_01 - Step 02: Press TAB and move to next field");
		newCustomerPage.TabKeyBoard(driver);
		
		log.info("NC_01 - Step 03: Verify error message is displayed");
		verifyTrue(newCustomerPage.isBlankErrorMessageDisplayedByNameField("Customer Name"));
	}
	
	@Test
	public void NC_02_Verify_Name_Field_Cannot_Be_Numeric() {
		log.info("NC_02 - Step 01: Enter numeric value in NAME field");
		
	}
	
	@Test
	public void NC_03_Verify_Name_Field_Cannot_Have_Special_Characters() {
		log.info("NC_03 - Step 01: Enter numberic value in NAME field");
		
	}
	
	@Test
	public void NC_04_Verify_Name_Field_Cannot_Have_First_Character_As_Blank_Space() {
		log.info("NC_04 - Step 01: Enter first character as blank space value in NAME field");
		
	}
	
	@Test
	public void NC_05_Verify_Address_Field_Cannot_Be_Empty() {
		log.info("NC_05 - Step 01: Do not enter a value in ADDRESS field");
		
		log.info("NC_05 - Step 02: Press TAB and move to next field");
		
	}
	
	@Test
	public void NC_06_Verify_Address_Field_Cannot_Have_First_Character_As_Blank_Space() {
		log.info("NC_06 - Step 01: Enter first character as blank space value in ADDRESS field");
		
	}
	
	@Test
	public void NC_08_Verify_City_Field_Cannot_Be_Empty() {
		log.info("NC_08 - Step 01: Do not enter a value in CITY field");
		
		log.info("NC_08 - Step 02: Press TAB and move to next field");
		
	}
	
	@Test
	public void NC_09_Verify_City_Field_Cannot_Be_Numeric() {
		log.info("NC_09 - Step 01: Enter numeric value in CITY field");
		
	}
	
	@Test
	public void NC_10_Verify_City_Field_Cannot_Have_Special_Characters() {
		log.info("NC_10 - Step 01: Enter numberic value in CITY field");
		
	}
	
	@Test
	public void NC_11_Verify_City_Field_Cannot_Have_First_Character_As_Blank_Space() {
		log.info("NC_11 - Step 01: Enter first character as blank space value in CITY field");
		
	}
	
	@Test
	public void NC_12_Verify_State_Field_Cannot_Be_Empty() {
		log.info("NC_12 - Step 01: Do not enter a value in State field");
		
		log.info("NC_12 - Step 02: Press TAB and move to next field");
		
	}
	
	@Test
	public void NC_13_Verify_State_Field_Cannot_Be_Numeric() {
		log.info("NC_13 - Step 01: Enter numeric value in State field");
		
	}
	
	@Test
	public void NC_14_Verify_State_Field_Cannot_Have_Special_Characters() {
		log.info("NC_14 - Step 01: Enter special characters in State field");
		
	}
	
	@Test
	public void NC_15_Verify_State_Field_Cannot_Have_First_Character_As_Blank_Space() {
		log.info("NC_15 - Step 01: Enter first character as blank space value in State field");
		
	}
	
	@Test
	public void NC_16_Verify_PIN_Field_Must_Be_Numeric() {
		log.info("NC_16 - Step 01: Enter characters value in PIN field");
		
	}
	
	@Test
	public void NC_17_Verify_PIN_Field_Cannot_Be_Empty() {
		log.info("NC_17 - Step 01: Do not enter a value in PIN field");
		
		log.info("NC_17 - Step 02: Press TAB and move to next field");
		
	}
	
	@Test
	public void NC_18_Verify_PIN_Field_Must_Have_6_digits() {
		log.info("NC_18 - Step 01: Enter more than 6 digit in PIN field");
		
		log.info("NC_18 - Step 02: Enter less than 6 digit in PIN field");
		
	}
	
	@Test
	public void NC_19_Verify_PIN_Field_Cannot_Have_Special_Character() {
		log.info("NC_19 - Step 01: Enter special character in PIN field");
		
	}
	
	@Test
	public void NC_20_Verify_PIN_Field_Cannot_Have_First_Character_As_Blank_Space() {
		log.info("NC_20 - Step 01: Enter first character as blank space value in PIN field");
		
	}
	
	@Test
	public void NC_21_Verify_PIN_Field_Cannot_Have_Blank_Space() {
		log.info("NC_21 - Step 01: Enter blank space value in PIN field");
		
	}
	
	@Test
	public void NC_22_Verify_Telephone_Field_Cannot_Be_Empty() {
		log.info("NC_22 - Step 01: Do not enter a value in PIN field");
		
		log.info("NC_22 - Step 02: Press TAB and move to next field");
		
		
	}
	
	@Test
	public void NC_23_Verify_Telephone_Field_Cannot_Have_First_Character_As_Blank_Space() {
		log.info("NC_23 - Step 01: Enter first character as blank space value in Telephone field");
		
	}
	
	@Test
	public void NC_24_Verify_Telephone_Field_Cannot_Have_Blank_Space() {
		log.info("NC_24 - Step 01: Enter blank space value in Telephone field");
		
	}
	
	@Test
	public void NC_25_Verify_Telephone_Field_Cannot_Have_Special_Character() {
		log.info("NC_25 - Step 01: Enter special character in Telephone field");
		
	}
	
	@Test
	public void NC_26_Verify_Email_Field_Cannot_Be_Empty() {
		log.info("NC_26 - Step 01: Do not enter a value in EMAIL field");
		
		log.info("NC_26 - Step 02: Press TAB and move to next field");
		
		
	}

	@Test
	public void NC_27_Verify_Email_Field_Must_Be_Incorrect_Format() {
		log.info("NC_27 - Step 01: Enter invalid email in EMAIL field");
		
		
	}
	
	@Test
	public void NC_29_Verify_Email_Field_Cannot_Have_Space() {
		log.info("NC_29 - Step 01: Enter blank space in EMAIL field");
		
		
	}
	
	
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		//quitBrowserDriver();
	}
	
	LoginPageObject loginPage;
	ManagePageObject managePage;
	NewCustomerPageObject newCustomerPage;
}
