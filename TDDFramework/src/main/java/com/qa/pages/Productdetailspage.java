package com.qa.pages;

import com.qa.Menupage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Productdetailspage extends Menupage{

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
	private MobileElement SLBTitle;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]")
	private MobileElement SLBText;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-BACK TO PRODUCTS\"]/android.widget.TextView")
	private MobileElement Backtoproduct;
	
	public String getSLBTitle()
	{
		return getText(SLBTitle);
		
	}
	public String getSLBText()
	{
		return getText(SLBText);
	}
	public Productpage pressbacktoproduct()
	{
		click(Backtoproduct);
		return new Productpage();
	}
}
