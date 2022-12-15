package com.stepdefinition;



import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {
		@Before
		public void launchBrowser() {
			getDriver("chrome");
			giveUrl("http://adactinhotelapp.com/");
			impliWait();
		}
		@After
		public void quitBrowser() {
			quitWindow();
		}
		
	}


