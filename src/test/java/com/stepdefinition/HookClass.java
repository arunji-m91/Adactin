package com.stepdefinition;



import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {
		@Before
		public void launchBrowser() {
			getDriver("chrome");
			giveUrl("https://retail.onlinesbi.sbi/retail/login.htm");
			maximize();
			impliWait();
		}
		@After
		public void quitBrowser() {
			quitWindow();
		}
		
	}


