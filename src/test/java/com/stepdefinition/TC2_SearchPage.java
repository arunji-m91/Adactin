package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchPage extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@When("User should enter {string},{string},{string},{string} and {string}")
	public void userShouldEnterAnd(String Location, String numberOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {
		pom.getSearchHotelPage().SearchHotelMandantory(Location, numberOfRooms, checkInDate, checkOutDate,
				adultsPerRoom);

	}

	@When("User should click Search Button")
	public void userShouldClickSearchButton() {
		pom.getSearchHotelPage().clickSearch();

	}

	@Then("User should verify SearchHotel Success message {string}")
	public void userShouldVerifySearchHotelSuccessMessage(String string) {
		String verifySearchPage = pom.getSearchHotelPage().verifySearchPage();
		Assert.assertEquals("verify search page mandatory fields",string,verifySearchPage);
	}

}
