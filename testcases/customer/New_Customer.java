package customer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;

public class New_Customer extends BaseTest{
	WebDriver driver;
	String userUrl, adminUrl, username, password;
	String postTitle, postBody, postAuthor, postTagName, postCategory, postTitleEdit, postBodyEdit, postCategoryEdit, postTagNameEdit;
	int randomNumber = getNumberRandom();
	
	@Parameters({"browser","userUrl","adminUrl"})
	@BeforeClass
	public void beforeClass(String browserName, String userUrl, String adminUrl) {
		this.userUrl = userUrl;
		this.adminUrl = adminUrl;
		username = "automationfc";
		password = "automationfc";
		driver = getBrowserDriver(browserName, adminUrl);
	}
	
	@Test
	public void Post_01_Create_New_Post() {
		log.info("Post_01 - Step 00: Click to Post link");
		
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		//quitBrowserDriver();
	}
}
