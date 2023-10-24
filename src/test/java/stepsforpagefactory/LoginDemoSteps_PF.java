package stepsforpagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("login page browser is open")
	public void login_page_browser_is_open() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Selenium-Cucumber\\src\\main\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() {

		driver.navigate().to("https://www.saucedemo.com/");

	}

	@When("^user enters login (.*) and (.*)$")
	public void user_enters_login_username_and_password(String username, String password) throws InterruptedException {

		login = new LoginPage_PF(driver);

		login.enterUsername(username);
		login.enterPassword(password);

		Thread.sleep(3000);

	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {

		login.clickOnLogin();
		Thread.sleep(3000);

	}

	@Then("the user is navigated to the home page and then logout")
	public void the_user_is_navigated_to_the_home_page() throws InterruptedException {
		
		home = new HomePage_PF(driver);

		home.clickGoToLeftSideToLogout();
		Thread.sleep(2000);
		home.checkLogoutIsDisplayed();

		Thread.sleep(3000);
		driver.quit();

	}

}
