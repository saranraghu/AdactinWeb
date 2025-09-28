package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class BookAHotel extends BaseClass {
	
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement BillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryDate1;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNumber;
	
	@FindBy(id="book_now")
	private WebElement BookNow;
	
	@FindBy(id="cancel")
	private WebElement Cancel;
	
	
	public WebElement getFirstName() {
		return FirstName;
	}	
	
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}
	public WebElement getCreditCardType() {
		return CreditCardType;
	}
	public WebElement getExpiryDate() {
		return ExpiryDate;
	}
	public WebElement getExpiryDate1() {
		return ExpiryDate1;
	}
	public WebElement getCVVNumber() {
		return CVVNumber;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	public WebElement getCancel() {
		return Cancel;
	}

}
