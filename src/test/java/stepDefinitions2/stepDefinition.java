package stepDefinitions2;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefinition {

	@Given("^This is valid login test$")
	public void this_is_valid_login_test() throws Throwable {
	    System.out.println("login");
	}

	@When("^User enters username and password and logs in$")
	public void user_enters_username_and_password_and_logs_in() throws Throwable {
		System.out.println("username and password");
	}
	
	@Given("^This is logout test$")
	public void this_is_logout_test() throws Throwable {
	    System.out.println("logout");
	}

	@Given("^This is search test$")
	public void this_is_search_test() throws Throwable {
	    System.out.println("search");
	}

	@Before
	public void setup()
	{
		System.out.println("Launch Chrome browser");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Close browser");
	}
	
	@Given("^This is advanced search test$")
	public void this_is_advanced_search_test() throws Throwable {
		System.out.println("advanced search");
	}

	@Given("^This is prepaid recharge test$")
	public void this_is_prepaid_recharge_test() throws Throwable {
		System.out.println("prepaid recharge");
	}

	@Given("^This is postpaid recharge test$")
	public void this_is_postpaid_recharge_test() throws Throwable {
		System.out.println("postpaid recharge");
	}
}
