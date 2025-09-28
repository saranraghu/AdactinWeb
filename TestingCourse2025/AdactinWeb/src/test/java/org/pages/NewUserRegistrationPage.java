	package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class NewUserRegistrationPage extends BaseClass {
	
	public NewUserRegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New User Register Here')]")
	private WebElement RegistrationPage;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement NewUsername;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement NewPassword;
	
	@FindBy(xpath="//input[@id='re_password']")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement FullName;
	
	@FindBy(id="email_add")
	private WebElement EmailAddress;
	
	@FindBy(id="captcha-form")
	private WebElement CaptchaText;
	
	@FindBy(id="tnc_box")
	private WebElement TermsConditions;
	
	@FindBy(id="Submit")
	private WebElement Register;
	
	@FindBy(id="Reset")
	private WebElement Reset;
	
	
	public WebElement getRegistrationPage() {
		return RegistrationPage;
	}

	public WebElement getNewUsername() {
		return NewUsername;
	}

	public WebElement getNewPassword() {
		return NewPassword;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getFullName() {
		return FullName;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getCaptchaText() {
		return CaptchaText;
	}

	public WebElement getTermsConditions() {
		return TermsConditions;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getReset() {
		return Reset;
	}

}
