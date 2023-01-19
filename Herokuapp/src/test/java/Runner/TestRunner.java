package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/"},
		glue = {"stepDefinitions"},
				plugin = { 
						"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm", 
						"html:target/JUNITHtmlReports/report.html",
						"junit:target/JUNITReports/reports.xml" },
		dryRun = false
	)
public class TestRunner {
	
}
