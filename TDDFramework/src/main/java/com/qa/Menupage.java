package com.qa;

import com.qa.pages.Settingspage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Menupage extends BaseTest {
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
	private MobileElement settingbtn;
	
	public Settingspage pressSettingbtn(){
		
		click(settingbtn);
		return new Settingspage();
		
	}
	

}
