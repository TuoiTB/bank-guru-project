package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

public class NewCustomerPageObject extends SideBarPageObject{
	WebDriver driver;
	
	public NewCustomerPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
}
