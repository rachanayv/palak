package cucumber.online;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class data {
	@Given("^User is testing for  login functionality$")
	public void user_is_testing_for_login_functionality() throws Throwable {
	    System.out.println("Login");
	}

	@Then("^User able to login successfully$")
	public void user_able_to_login_successfully() throws Throwable {
		System.out.println("Login Successful");
	}

	@Given("^user is testing the search functionality$")
	public void user_is_testing_the_search_functionality() throws Throwable {
		System.out.println("Search for a product");
	}

	@Then("^search works successfully$")
	public void search_works_successfully() throws Throwable {
		System.out.println("search is successful");
	}

	@Then("^\"([^\"]*)\" is tester on TestMe App$")
	public void is_tester_on_TestMe_App(String arg1) throws Throwable {
		System.out.println("Lekha is tester on TestMe App");
	}



}
