package pageObjects.bankGuru;

import org.openqa.selenium.WebDriver;

public class MiniStatementPageObject extends SideBarPageObject{
	WebDriver driver;
	
	public MiniStatementPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
}
