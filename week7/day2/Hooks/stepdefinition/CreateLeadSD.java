package stepdefinition;

import org.openqa.selenium.By;

import hooks.HooksImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSD extends BaseClass {
	
	@When("Click on crmsfa button")
	public void click_on_crmsfa_button() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	}

	@When("Click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on CreateLeads link")
	public void click_on_create_leads_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Enter the Company name as (.*)$")
	public void enter_the_company_name_as_testleaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@When("Enter firstname as (.*)$")
	public void enter_firstname_as_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@When("Enter LastName as (.*)$")
	public void enter_last_name_as_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("click on CreateLead Button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("ViewLeads page is displayed")
	public void view_leads_page_is_displayed() {
	   String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	   if (text.contains("Saranya")) {
		System.out.println("view page is displayed");
	} else {
		System.out.println("view page is not displayed");
	}
	}

}
