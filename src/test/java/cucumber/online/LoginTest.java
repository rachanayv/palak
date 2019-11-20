package cucumber.online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginTest {
	WebDriver driver;
	@Given("^User must be on the login page$")
	public void user_must_be_on_the_login_page() throws Throwable {
		driver = UtilityClass.openBrowser("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User enters the valid credentials$")
	public void user_enters_the_valid_credentials() throws Throwable {
		Pages page = new Pages(driver);
		page.do_login("lalitha", "password123");
	}
	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Home")));
		Assert.assertEquals(driver.getTitle(), "Home ");
		System.out.println("Logged in Successfully !!");
		driver.close();
	    
	}

	}

