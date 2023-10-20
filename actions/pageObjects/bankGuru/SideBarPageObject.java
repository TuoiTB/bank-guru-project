package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.bankGuru.SideBarPageUI;

public class SideBarPageObject extends BasePage{
	WebDriver driver;
	
	public SideBarPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public SideBarPageObject openDynamicSideBarPage(String pageName) {
		waitForElementClickable(driver, SideBarPageUI.DYNAMIC_SIDE_BAR_LINK, pageName);
		clickToElement(driver, SideBarPageUI.DYNAMIC_SIDE_BAR_LINK, pageName);
		switch (pageName) {
		case "New Customer":
			return PageGeneratorManager.getNewCustomerPage(driver);
			
		case "Edit Customer":
			return PageGeneratorManager.getEditCustomerPage(driver);
			
		case "Delete Customer":
			return PageGeneratorManager.getDeleteCustomerPage(driver);
			
		case "Edit Account":
			return PageGeneratorManager.getEditAccountPage(driver);
			
		case "Delete Account":
			return PageGeneratorManager.getDeleteAccountPage(driver);
			
		case "Fund Transfer":
			return PageGeneratorManager.getFundTransferPage(driver);
			
		case "Change Password":
			return PageGeneratorManager.getChangePasswordPage(driver);
			
		case "Mini Statement":
			return PageGeneratorManager.getMiniStatementPage(driver);
			
		case "Customised Statement":
			return PageGeneratorManager.getCustomizedStatementPage(driver);
		
		default:
			new RuntimeException("Side bar page name is incorrect"); 
			return null;
		}
	
	}
}
