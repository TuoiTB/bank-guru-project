package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

public class CustomizedStatementPageObject extends SideBarPageObject{
	WebDriver driver;
	
	public CustomizedStatementPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
}
