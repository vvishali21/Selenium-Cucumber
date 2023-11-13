package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

	WebDriver driver = null;

	@Given("login page browser is open")
	public void login_page_browser_is_open() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Selenium-Cucumber2\\src\\main\\resources\\drivers\\chromedriver.exe");

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

		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(3000);

	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);

	}

	@Then("the user is navigated to the home page and then logout")
	public void the_user_is_navigated_to_the_home_page() throws InterruptedException {

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
