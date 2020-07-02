package com.qa.pages;

import com.qa.BaseTest;
import com.qa.Menupage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Productpage extends Menupage {

	@AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/preceding-sibling::android.view.ViewGroup/android.widget.TextView")
	private MobileElement ProductTitle;
//	@AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/android.widget.TextView")
//	private MobileElement ProductTitle;
	
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
	private MobileElement SLBTitle;
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Price\"])[1]")
	private MobileElement SLBPrice;
	
	public String getTitle()
	{
		return getAttribute(ProductTitle, "text");
	}
	public String getSLBTitle()
	{
		return getText(SLBTitle);
	}
	public String getSLBPrice()
	{
		return getText(SLBPrice);
	}
	public Productdetailspage pressSLBTitle()
	{
		click(SLBTitle);
		return new Productdetailspage();
	}
	
	
}
