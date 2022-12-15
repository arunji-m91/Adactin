package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement verifyLogin;

	
	public WebElement getVerifyLogin() {
		return verifyLogin;
	}

	public void setVerifyLogin(WebElement verifyLogin) {
		this.verifyLogin = verifyLogin;
	}

	public String verificationLoginPage() {
		String attriValue = getAttriValue(getVerifyLogin());
		return attriValue;
	}

}
