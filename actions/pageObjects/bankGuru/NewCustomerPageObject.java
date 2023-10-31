package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

import pageUI.bankGuru.NewCustomerPageUI;

public class NewCustomerPageObject extends SideBarPageObject{
	WebDriver driver;
	
	public NewCustomerPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void clickToAdCloseButton() {
		switchToFrame(driver, NewCustomerPageUI.AD_IFRAME);
		waitForElementClickable(driver, NewCustomerPageUI.AD_CLOSE_BUTTON);
		clickToElement(driver,  NewCustomerPageUI.AD_CLOSE_BUTTON);
	}
	
	public void enterToTextboxByNameField(String nameField, String valueToSend) {
		waitForElementVisible(driver, NewCustomerPageUI.DYNAMIC_TEXTBOX_BY_TEXT, nameField);
		sendkeyToElement(driver, NewCustomerPageUI.DYNAMIC_TEXTBOX_BY_TEXT, nameField, valueToSend);
	}
	
	public void enterToTextboxNameField(String valueToSend) {
		waitForElementVisible(driver, NewCustomerPageUI.TEXTBOX_NAME_FIELD);
		sendkeyToElement(driver, NewCustomerPageUI.TEXTBOX_NAME_FIELD, valueToSend);
	}
	
	public boolean isBlankErrorMessageDisplayedByNameField(String nameField) {
		waitForElementVisible(driver, NewCustomerPageUI.DYNAMIC_MESSAGE, nameField);
		return isElementDisplayed(driver, NewCustomerPageUI.DYNAMIC_MESSAGE, nameField);
	}
	
	
}
