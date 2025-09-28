package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement SelectRadioBtn;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(id="cancel")
	private WebElement Cancel;
	
	public WebElement getSelectRadioBtn() {
		return SelectRadioBtn;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getCancel() {
		return Cancel;
	}
	

}
