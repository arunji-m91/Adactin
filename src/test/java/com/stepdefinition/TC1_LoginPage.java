package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginPage extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	

	@Given("User is in Sbi Online Portal")
	public void userIsInSbiOnlinePortal() {
	   
	}
	@When("User click the button continue and user switched into the login page")
	public void userClickTheButtonContinueAndUserSwitchedIntoTheLoginPage() {
	    pom.getLoginpage().getTxtContinueLogin().click();
	   
	}
	@Then("User should verify username password login and reset block is visible")
	public void userShouldVerifyUsernamePasswordLoginAndResetBlockIsVisible() {
	  boolean visibilityCheck = pom.getLoginpage().visibilityCheck();
	  Assert.assertTrue(visibilityCheck);
	}

	

	@When("User enter invalid {string} and {string}")
	public void userEnterInvalidAnd(String username, String password) {
		pom.getLoginpage().login(username,password);
	   
	}
	@When("User Click the Login button")
	public void userClickTheLoginButton() {
	  pom.getLoginpage().getBtnLogin().click();
		
	}
	@Then("User should verify the Login is Error message contains {string}")
	public void userShouldVerifyTheLoginIsErrorMessageContains(String expected) {
	    String actual = pom.getLoginpage().getTextFromAlert();
	    boolean contains = actual.contains(expected);
	    Assert.assertTrue(contains);
	    
	}





}
