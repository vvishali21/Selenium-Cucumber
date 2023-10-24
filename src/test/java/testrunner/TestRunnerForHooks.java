package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/hooksfeatures/HooksDemo.feature", glue = {
		"stepsforhooks" }, monochrome = true, plugin = { "pretty",
				"html:target/HtmlReports/report.html" }, tags = "@smoke")

public class TestRunnerForHooks {

}
