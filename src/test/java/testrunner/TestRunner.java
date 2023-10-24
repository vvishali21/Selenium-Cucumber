package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginDemo.feature", glue = {
		"stepsforpagefactory" }, monochrome = true, plugin = { "pretty", "html:target/HtmlReports/report.html",
				"json:target/JSONReports/report.json", "junit:target/JUnitReports/report.xml",
				"json:target/CucumberReports/cucumber.json" })

public class TestRunner {

}
