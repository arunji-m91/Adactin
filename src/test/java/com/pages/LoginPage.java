package com.pages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "(//a[text()='CONTINUE TO LOGIN'])[1]")
	private WebElement txtContinueLogin;

	@FindBy(xpath= "//input[@id='username']")
	private WebElement txtUsername;
	
	@FindBy(xpath= "//input[@id='label2']")
	private WebElement txtPassword;
	
	
	@FindBy(xpath= "//input[@id='Button2']")
	private WebElement btnLogin;
	
	
	@FindBy(xpath= "//input[@id='reset_btn']")
	private WebElement btnReset;


	public WebElement getTxtContinueLogin() {
		return txtContinueLogin;
	}


	public void setTxtContinueLogin(WebElement txtContinueLogin) {
		this.txtContinueLogin = txtContinueLogin;
	}


	public WebElement getTxtUsername() {
		return txtUsername;
	}


	public void setTxtUsername(WebElement txtUsername) {
		this.txtUsername = txtUsername;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}


	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}


	public WebElement getBtnReset() {
		return btnReset;
	}


	public void setBtnReset(WebElement btnReset) {
		this.btnReset = btnReset;
	}
	
	
	public boolean visibilityCheck(){
		boolean check=false;
		boolean username = getTxtUsername().isDisplayed();
		boolean password = getTxtPassword().isDisplayed();
		boolean login = getBtnLogin().isDisplayed();
		boolean reset = getBtnReset().isDisplayed();
		if(username ==true && password == true && login==true && reset==true) {
			check =true;
		}
		return check;
	}
	
	
	public void login(String username,String password){
		sendTo(getTxtUsername(),username);
		sendTo(getTxtPassword(),password);
	}
	
	public String getTextFromAlert(){
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}
	
	
}
