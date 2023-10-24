package stepsforhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {

	WebDriver driver = null;

	@Before(value = "@smoke", order = 1)
	public void browserSetup() {

		System.out.println("  I am inside browserSetup");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Selenium-Cucumber\\src\\main\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@Before(order = 0)
	public void setup2() {
		System.out.println("   I am inside setup2 \n");
	}

	@After(order = 1)
	public void teardown() {
		System.out.println("   I am inside teardown");
	}

	@After(order = 2)
	public void teardown2() {
		System.out.println("  I am inside teardown2 \n");
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println("  I am inside beforeSteps ----");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("  I am inside afterSteps ====");
	}

	@Given("user is on login page in HooksDemoSteps")
	public void user_is_on_login_page_in_hooks_demo_steps() {
	}

	@When("user enters username and password in HooksDemoSteps")
	public void user_enters_username_and_password_in_hooks_demo_steps() {
	}

	@And("clicks on login button in HooksDemoSteps")
	public void clicks_on_login_button_in_hooks_demo_steps() {
	}

	@Then("user is navigated to the home page in HooksDemoSteps")
	public void user_is_navigated_to_the_home_page_in_hooks_demo_steps() {
	}

}
