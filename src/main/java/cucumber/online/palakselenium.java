package cucumber.online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class palakselenium {
	WebDriver driver;
	@Given("^User has launched tesetme app in the browser$")
	public void user_has_launched_tesetme_app_in_the_browser() throws Throwable {
	    driver=UtilityClass.openBrowser("chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User enters \"([^\"]*)\" & \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2) throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@When("^click on the  login button$")
	public void click_on_the_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
		}

	@Then("^User must be logged in successfully$")
	public void user_must_be_logged_in_successfully() throws Throwable {

		Assert.assertEquals("Home", driver.getTitle());
	}


}
