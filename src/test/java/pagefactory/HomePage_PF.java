package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(id = "react-burger-menu-btn")
	WebElement btn_sideBar;

	@FindBy(id = "logout_sidebar_link")
	WebElement btn_logout;

	WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}

	public void clickGoToLeftSideToLogout() {
		btn_sideBar.click();
	}

	public void checkLogoutIsDisplayed() {
		btn_logout.click();
	}

}
