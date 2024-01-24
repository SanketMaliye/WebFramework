package Pages;

import org.openqa.selenium.WebDriver;

public class Ui_FunctionLibrary {

	 private WebDriver driver;

	    public Ui_FunctionLibrary(WebDriver driver) {
	        this.driver = driver;
	    }

	public Ui_FunctionLibrary clickOnLoginButton() {
		driver.findElement(HomePage.LoginButton).click();
		return this;
	}

	public Ui_FunctionLibrary enterEmail() {
		driver.findElement(LoginPage.emailTextField).clear();
		driver.findElement(LoginPage.emailTextField).sendKeys("smaliye54@gmail.com");
		return this;
	}

	public Ui_FunctionLibrary enterPassword() {
		driver.findElement(LoginPage.passwordTextField).clear();
		driver.findElement(LoginPage.passwordTextField).sendKeys("Sanket12345678");
		return this;
	}
	
	public Ui_FunctionLibrary clickOnContinueButton() {
		driver.findElement(LoginPage.ContinueButton).click();
		return this;
	}
	
	public Ui_FunctionLibrary clickOnContinueButtonAfterEnteringPassword() {
		driver.findElement(LoginPage.ContinueButtonAfterPassword).click();
		return this;
	}
	
	public Ui_FunctionLibrary clickOnProfileDropdown() {
		driver.findElement(ProfilePage.ProfileDropdown).click();
		return this;
	}
	
	public Ui_FunctionLibrary clickOnLogoutLink() {
		driver.findElement(ProfilePage.LogoutLink).click();
		return this;
	}
}
