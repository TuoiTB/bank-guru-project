package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

public class ManagePageObject extends SideBarPageObject{
	WebDriver driver;
	
	public ManagePageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
}
