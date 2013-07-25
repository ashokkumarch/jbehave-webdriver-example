package com.ashok.webdrive.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ashok.webdrive.pages.Pages;

public class WebSteps {
	private final Pages pages;

	public WebSteps(Pages pages) {
		this.pages = pages;
	}

	@Given("user is launching the ebay landing page")
	public void userIsLaunchingEbay() {
		pages.home().open();
	}

	@When("user saw the home page")
	public void sawTheHomePage() {
		pages.ebaysearchpage().ebaySearchPageIsShown();
	}

	@Then("user should see search button")
	public void userShouldSeeSearchButton() {
		Assert.assertEquals(pages.ebaysearchpage().searchButtonShouldPresent(),
				"Search");
	}
}
