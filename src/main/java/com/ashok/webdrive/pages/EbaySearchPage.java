package com.ashok.webdrive.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class EbaySearchPage extends AbstractPage {

	public EbaySearchPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void ebaySearchPageIsShown() {
		found("My eBay");
	}

	public String searchButtonShouldPresent() {
		return findElement(
				By.xpath("//input[@id='gh-btn' and @value='Search']"))
				.getAttribute("value");
	}

}
