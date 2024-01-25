package Runner;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
			features = "src//test//resources//Features", 
			glue = { "StepDefinitions" , "Hooks"}, 
			plugin = {
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
 						"pretty", "html:target/cucumber-reports/report.html",
 						"json:target/cucumber-reports/report.json" 
					 }, 
			monochrome = true)

@Listeners(ExtentITestListenerClassAdapter.class)
public class TestRunner extends AbstractTestNGCucumberTests {

}
