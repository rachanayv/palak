package cucumber.online;

import org.openqa.selenium.WebDriver;


	import org.openqa.selenium.By;

	public class Pages {
		WebDriver driver;
		/*By username = By.name("userName");
		By password = By.name("password");
		By loginbutton = By.name("login");*/

		public Pages(WebDriver driver) {
			this.driver = driver;
		}

		public void do_login(String uid, String pass) {
			driver.findElement(By.linkText("SignIn")).click();

			driver.findElement(By.name("userName")).sendKeys(uid);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.name("Login")).click();

		}

		

	}

	