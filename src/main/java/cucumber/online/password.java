package cucumber.online;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class password {
	@Given("^User must be in login page$")
	public void user_must_be_in_login_page() throws Throwable {
	    System.out.println("User must be in login page");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		System.out.println("login using "+arg1+"and"+arg2);
	}

	@When("^performs login$")
	public void performs_login() throws Throwable {
		System.out.println("click on the login button");
	    
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		System.out.println("User is in home page");
		System.out.println("********");
	}



}
