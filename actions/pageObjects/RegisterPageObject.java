package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToButtonRegister() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);

	}

	public String getErrorMessageAtFirstNameTextbox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastNameTextbox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);

	}

	public String getErrorMessageAtEmailTextbox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);

	}
	public String getErrorMessageAtPasswordTextbox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);

	}
	public String getErrorMessageAtConfirmPasswordTextbox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getTextElement(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);

	}

	public void inputToFirstNameTextbox(String firstName) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver,RegisterPageUI.FIRST_NAME_TEXTBOX);
		senkeysToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX,firstName);
		
	}

	public void inputToLastNameTextbox(String lastName) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver,RegisterPageUI.LAST_NAME_TEXTBOX);
		senkeysToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX,lastName);
		
	}

	public void inputToEmailTextbox(String string) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver,RegisterPageUI.EMAIL_TEXTBOX);
		senkeysToElement(driver, RegisterPageUI.EMAIL_TEXTBOX,string);
		
	}

	public void inputToPasswordTextbox(String string) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver,RegisterPageUI.PASSWORD_TEXTBOX);
		senkeysToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX,string);
		
	}

	public void inputToConfirmPasswordTextbox(String string) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver,RegisterPageUI.CONFIRM__PASSWORD_TEXTBOX);
		senkeysToElement(driver, RegisterPageUI.CONFIRM__PASSWORD_TEXTBOX,string);
		
	}

	public String getRegisterSuccessMessage() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getTextElement(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public String getExistingEmailErrorMessage() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.REGISTER_EXISTING_EMAIL_MESSAGE);
		return getTextElement(driver, RegisterPageUI.REGISTER_EXISTING_EMAIL_MESSAGE);
	}

	public String getPasswordLessThan6CharsErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}


}
