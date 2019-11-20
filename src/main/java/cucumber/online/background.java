package cucumber.online;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class background {
	
	int a,b,s,p;
	@Given("^user must enter input values$")
	public void input() throws Throwable {
	    a=20;
	    b=30;
	}

	@Then("^assign values to variables a &b$")
	public void assign_values_to_variables_a_b() throws Throwable {
		System.out.println(a+" "+b);
	    
	}

	@When("^add two input$")
	public void add_two_input() throws Throwable {
		s=a+b;
	    
	}

	@Then("^display the sum$")
	public void sum() throws Throwable {
		System.out.println("Sum is"+s);
	    
	}

	@When("^multiply two input$")
	public void multiply() throws Throwable {
		p=a*b;
	    
	}

	@Then("^display the product$")
	public void product() throws Throwable {
		System.out.println("Product is"+p);
	    
	}



}
