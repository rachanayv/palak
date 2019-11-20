package cucumber.online;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datatable {
		@Given("^open the application and and land up in the search page$")
		public void openPage() throws Throwable {
			System.out.println("User is in Search Page !!");
		}

		@When("^type the below products and search for it$")
		public void type_the_below_products_and_search_for_it(DataTable arg1) throws Throwable {
			List<Map<String, String>> list=arg1.asMaps(String.class, String.class);
			for(int i=0;i<list.size();i++)
			{
				System.out.println("Search for "+list.get(i).get("Products"));
			}
		}

		@Then("^ensure that the product details is displayed$")
		public void ensure_that_the_product_details_is_displayed() throws Throwable {
			System.out.println("User is able to view the details");
		}



	}

