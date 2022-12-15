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
	LoginPage loginpage;
	SearchHotelPage searchHotelPage;
	PageObjectManager pom = new PageObjectManager();

	@Given("User is in Adactin Hotel Login Page")
	public void userIsInAdactinHotelLoginPage() {
//		getDriver("chrome");
//		giveUrl("http://adactinhotelapp.com/");
//		impliWait();

	}

	@When("User enter valid {string} and {string}")
	public void userEnterValidAnd(String username, String password) {
		pom.getLoginpage().login(username, password);
	}

	@When("User Click the Login button")
	public void userClickTheLoginButton() {
		pom.getLoginpage().clickLogin();
	}

	@Then("User should verify the Login Success message contains {string}")
	public void userShouldVerifyTheLoginSuccessMessageContains(String username) {
		searchHotelPage = pom.getSearchHotelPage();
		String verificationLoginPage = searchHotelPage.verificationLoginPage();
		boolean contains = verificationLoginPage.contains(username);
		Assert.assertTrue(contains);
	}
	
	@Then("User should verify the Login is Error message contains {string}")
	public void userShouldVerifyTheLoginIsErrorMessageContains(String string) {
	    String errorMsgLogin = pom.getLoginpage().errorMsgLogin();
	    boolean contains = errorMsgLogin.contains(string);
	    Assert.assertTrue(contains);
	}




}
