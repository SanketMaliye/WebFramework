package StepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Configuration.AppManager;
import Pages.Ui_FunctionLibrary;

public class StepDefinitions extends AppManager {

	Ui_FunctionLibrary uifunctionlibrary;

	public StepDefinitions() {
		super.setUp();
		uifunctionlibrary = new Ui_FunctionLibrary(driver);
		System.out.println("setUp() completed successfully.");
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {

	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		uifunctionlibrary.clickOnLoginButton();
	}

	@When("the user enters their email")
	public void the_user_enters_their_email() {
		uifunctionlibrary.enterEmail();
	}

	@When("the user clicks on the continue button")
	public void the_user_clicks_on_the_continue_button() {
		uifunctionlibrary.clickOnContinueButton();
	}

	@When("the user enters their password")
	public void the_user_enters_their_password() {
		uifunctionlibrary.enterPassword();
	}

	@When("the user clicks on the continue button after entering the password")
	public void the_user_clicks_on_the_continue_button_after_entering_the_password() {
		uifunctionlibrary.clickOnContinueButtonAfterEnteringPassword();
	}

	@When("the user clicks on the profile dropdown")
	public void the_user_clicks_on_the_profile_dropdown() {
		uifunctionlibrary.clickOnProfileDropdown();
	}

	@When("the user clicks on the logout link")
	public void the_user_clicks_on_the_logout_link() {
		uifunctionlibrary.clickOnLogoutLink();
	}

	@Then("the user should be successfully logged out")
	public void the_user_should_be_successfully_logged_out() {
		tearDown();
	}

	@AfterStep
	public void addScreenShot(Scenario scenario) {
	    if (scenario.isFailed()) {
	        // Check if the driver supports taking screenshots
	        if (driver instanceof TakesScreenshot) {
	            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

	            // Check if getBddType() returns null
	            if (scenario.getName() != null) {
	                String scenarioName = scenario.getName();
	                byte[] screenshot = screenshotDriver.getScreenshotAs(OutputType.BYTES);
	                scenario.attach(screenshot, "image/png", scenarioName);
	            } else {
	                System.out.println("Scenario name is null. Cannot attach screenshot.");
	            }
	        } else {
	            System.out.println("Driver does not support taking screenshots");
	        }
	    }
	}
}
