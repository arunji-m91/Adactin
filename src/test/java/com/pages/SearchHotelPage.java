package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

//Login verification
	@FindBy(id = "username_show")
	private WebElement verifyLogin;

//Search Hotel Mandatory 
	@FindBy(id = "location")
	private WebElement drpLocation;

	@FindBy(id = "room_nos")
	private WebElement drpNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement drpDateCheckIn;

	@FindBy(id = "datepick_out")
	private WebElement drpDateCheckOut;

	@FindBy(id = "adult_room")
	private WebElement drpAdultPerRoom;

	// search Button
	@FindBy(id = "Submit")
	private WebElement btnSearch;

	// searchPageverification
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement verifySearchPage;

	// Login verification
	public WebElement getVerifyLogin() {
		return verifyLogin;
	}

	public void setVerifyLogin(WebElement verifyLogin) {
		this.verifyLogin = verifyLogin;
	}
	// Search Hotel Mandatory

	public WebElement getDrpLocation() {
		return drpLocation;
	}

	public void setDrpLocation(WebElement drpLocation) {
		this.drpLocation = drpLocation;
	}

	public WebElement getDrpNoOfRooms() {
		return drpNoOfRooms;
	}

	public void setDrpNoOfRooms(WebElement drpNoOfRooms) {
		this.drpNoOfRooms = drpNoOfRooms;
	}

	public WebElement getDrpDateCheckIn() {
		return drpDateCheckIn;
	}

	public void setDrpDateCheckIn(WebElement drpDateCheckIn) {
		this.drpDateCheckIn = drpDateCheckIn;
	}

	public WebElement getDrpDateCheckOut() {
		return drpDateCheckOut;
	}

	public void setDrpDateCheckOut(WebElement drpDateCheckOut) {
		this.drpDateCheckOut = drpDateCheckOut;
	}

	public WebElement getDrpAdultPerRoom() {
		return drpAdultPerRoom;
	}

	public void setDrpAdultPerRoom(WebElement drpAdultPerRoom) {
		this.drpAdultPerRoom = drpAdultPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

	// searchPageverification
	public WebElement getVerifySearchPage() {
		return verifySearchPage;
	}

	public void setVerifySearchPage(WebElement verifySearchPage) {
		this.verifySearchPage = verifySearchPage;
	}

	// methods
	public String verificationLoginPage() {
		String attriValue = getAttriValue(getVerifyLogin());
		return attriValue;
	}

	public void SearchHotelMandantory(String Location, String numberOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {
		selByVisibleText(getDrpLocation(), Location);
		selByVisibleText(getDrpNoOfRooms(), numberOfRooms);
		sendTo(getDrpDateCheckIn(), checkInDate);
		sendTo(getDrpDateCheckOut(), checkOutDate);
		selByVisibleText(getDrpAdultPerRoom(), adultsPerRoom);
	}

	public void clickSearch() {
		getBtnSearch().click();
	}

	public String verifySearchPage() {
		String text = getVerifySearchPage().getText();
		return text;

	}

}
