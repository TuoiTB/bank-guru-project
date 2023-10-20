package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

public class DeleteAccountPageObject extends SideBarPageObject{
	WebDriver driver;
	
	public DeleteAccountPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
}
