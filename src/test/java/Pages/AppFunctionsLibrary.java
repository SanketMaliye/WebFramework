package Pages;

import org.openqa.selenium.WebDriver;

import Utilities.JavaScriptExecutorUtils;
import Utilities.SeleniumUtils;

public class AppFunctionsLibrary {

	private WebDriver driver;
	JavaScriptExecutorUtils js;

	public AppFunctionsLibrary(WebDriver driver) {
		this.driver = driver;
		this.js = new JavaScriptExecutorUtils(driver);
	}

	public AppFunctionsLibrary clickOnLoginButton() {
		js.clickElement(HomePage.LoginButton);
		return this;
	}

	public AppFunctionsLibrary enterEmail() {
		js.setInputValue(LoginPage.emailTextField, "automationqa@gmail.com");
		return this;
	}

	public AppFunctionsLibrary enterPassword() {
		driver.findElement(LoginPage.passwordTextField).clear();
		driver.findElement(LoginPage.passwordTextField).sendKeys("automationqa");
		return this;
	}

	public AppFunctionsLibrary clickOnContinueButton() {
		js.clickElement(LoginPage.LoginButton);
		return this;
	}

	public AppFunctionsLibrary clickOnContinueButtonAfterEnteringPassword() {
		driver.findElement(LoginPage.LoginButton).click();
		return this;
	}

	public AppFunctionsLibrary clickOnProfileDropdown() {
		js.clickElement(ProfilePage.ProfileDropdown);
		return this;
	}

	public AppFunctionsLibrary clickOnLogoutLink() {
		js.clickElement(ProfilePage.LogoutLink);
		return this;
	}
}
