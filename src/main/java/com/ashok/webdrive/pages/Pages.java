package com.ashok.webdrive.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class Pages {
	private final WebDriverProvider driverProvider;
	private Home home;
	private EbaySearchPage ebaysearchpage;

	public Pages(WebDriverProvider driverProvider) {
		this.driverProvider = driverProvider;
	}

	public Home home() {
		if (home == null) {
			home = new Home(driverProvider);
		}
		return home;
	}

	public EbaySearchPage ebaysearchpage() {
		if (ebaysearchpage == null) {
			ebaysearchpage = new EbaySearchPage(driverProvider);
		}
		return ebaysearchpage;

	}

}
