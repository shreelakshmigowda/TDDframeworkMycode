package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Settingspage extends BaseTest {

	@AndroidFindBy(accessibility="test-LOGOUT")
	private MobileElement logout;
	
	public Loginpage pressloginbtn(){
		
		click(logout);
		return new Loginpage();
	}

}
