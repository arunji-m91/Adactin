package com.pageobjectmanager;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;

public class PageObjectManager {
	LoginPage loginpage;
	SearchHotelPage searchHotelPage;

	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new LoginPage() : loginpage;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}
}
