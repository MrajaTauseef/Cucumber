package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition {
	
	WebDriver driver;
	
	@Given("^Open Chrome and start Application$")
	public void open_Chrome_and_start_Application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_username_and_password(String email, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
	    
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
		driver.quit();
	    
	}

}
