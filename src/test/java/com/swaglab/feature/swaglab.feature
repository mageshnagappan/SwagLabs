Feature: Add item to the cart on SauceDemo

Scenario: User logs in with valid credentials

Given user launch the "chrome" browser
When user navigate the url "https://www.saucedemo.com/"
And user verify the login is opened successfully
And user enter valid "standard_user" username to login
And user enter valid "secret_sauce" password login
Then the user Clicks On The LoginBtn And it Navigates To The InventoryPage

Scenario: Add The Product To The Cart
When user Add The Product Sauce Labs BackPack 
And user click the selected product 
And User clicks on add to cart button 
Then user click on the shopping cart button and validate the added product is displayed 
