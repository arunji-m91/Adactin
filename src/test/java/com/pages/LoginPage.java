package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login;
	
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement errorMsg;
	
	

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(WebElement errorMsg) {
		this.errorMsg = errorMsg;
	}

	public void login(String username, String password) {
		sendTo(getUsername(), username);
		sendTo(getPassword(), password);
	}

	public void clickLogin() {
	getLogin().click();
	}
	
	public String errorMsgLogin() {
		String text = getErrorMsg().getText();
		return text;
	}

}
