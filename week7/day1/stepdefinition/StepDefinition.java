package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	
	@Given("Launch the browser and Load the URL")
	public void launch_the_browser_and_load_the_url() {
	    driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@When("Enter the username as {string}")
	public void enter_the_username_as_democsr2(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd); 
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	

	@Then("HomePage is displayed")
	public void home_page_is_displayed() {
		String title = driver.getTitle();
		if (title.contains("LeafTaps")) {
			System.out.println("text matched");
		} else {
			System.out.println("text is not matched");
		}
	    
	}
	@When("ErrorMsg is displayed")
	public void error_msg_is_displayed() {
	    String text = driver.findElement(By.id("errorDiv")).getText();
	    if (text.contains("Errors")) {
	    	System.out.println("error msg is verified");
			
		} else {
			System.out.println("error msg is not verified");
		}
	}
}
