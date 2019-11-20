package cucumber.online;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;

	public class stepdefination{
		String str;

	@Given("^type hello world$")
	public void input() throws Throwable {
	    str="Hello World";
	}

	@When("^execute the code$")
	public void displaycode() throws Throwable {
	    System.out.println(str);
	}

	@Then("^hello world must be displayed$")
	public void postcondition() throws Throwable {
	    System.out.println("displayed successfully");
	}
	}


