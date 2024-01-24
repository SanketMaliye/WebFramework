package Pages;

import org.openqa.selenium.By;

public class LoginPage {

	public static By emailTextField = By.cssSelector("input#username");
	
	public static By passwordTextField = By.id("password");
	
	public static By ContinueButton = By.cssSelector("[name=\"action\"]");
	
	public static By ContinueButtonAfterPassword = By.cssSelector("[data-action-button-primary=\"true\"]");

	 
}
