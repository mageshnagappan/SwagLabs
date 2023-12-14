package com.swaglab.step;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public static Page page;
	
	@Given("user launch the {string} browser")
	public void user_launch_the_browser(String string) {
		 Playwright playwright = Playwright.create();
	        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	         page = browser.newPage();
	    
	}

	@When("user navigate the url {string}")
	public void user_navigate_the_url(String string) {
		page.navigate("https://www.saucedemo.com/");
	}

	@When("user verify the login is opened successfully")
	public void user_verify_the_login_is_opened_successfully() {
		assertThat(page).hasURL("https://www.saucedemo.com/");
	}

	@When("user enter valid {string} username to login")
	public void user_enter_valid_username_to_login(String string) {
		Locator locator = page.locator("//input[@placeholder='Username']");
		locator.fill("standard_user");
	}

	@When("user enter valid {string} password login")
	public void user_enter_valid_password_login(String string) {
		Locator locator1 = page.locator("//input[@placeholder='Password']");
	    locator1.fill("secret_sauce");
	}

	@Then("the user Clicks On The LoginBtn And it Navigates To The InventoryPage")
	public void the_user_clicks_on_the_login_btn_and_it_navigates_to_the_inventory_page() {
		Locator locator2 = page.locator("//input[@id='login-button']");
		   locator2.click();
	}

	@When("user Add The Product Sauce Labs BackPack")
	public void user_add_the_product_sauce_labs_back_pack() {

page.locator("[data-test=\"add-to-cart-sauce-labs-backpack\"]").click();
	   
	}

	@When("user click the selected product")
	public void user_click_the_selected_product() {
		page.locator("//a[@class='shopping_cart_link']").click();
	   
	}

	@When("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	   
	}

	@Then("user click on the shopping cart button and validate the added product is displayed")
	public void user_click_on_the_shopping_cart_button_and_validate_the_added_product_is_displayed() {
	    
		Locator sauceLabsBackpack = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sauce Labs Backpack"));
        assertThat(sauceLabsBackpack).containsText("Sauce Labs Backpack");
		
	}
	
	
	
	
}
