package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;

	private By txt_username = By.id("user-name");

	private By txt_password = By.id("password");

	private By btn_login = By.id("login-button");

	private By btn_sideOpen = By.id("react-burger-menu-btn");

	private By btn_logout = By.id("logout_sidebar_link");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		if (!driver.getTitle().equals("Swag Labs")) {

			throw new IllegalStateException("This is not Login Page. The Current page is " + driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}

	public void clickGoToLeftSideToLogout() {

		driver.findElement(btn_sideOpen).click();
	}

	public void checkLogOutIsDisplayed() {

		driver.findElement(btn_logout).click();
	}

	public void loginValidUser(String username, String password) {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

}
