package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@Test(dataProvider ="FetchData")
	public void createLead(String cName, String fName, String lName) {
		// Driver required
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider(name = "FetchData")
	public String[][] data() {
		String[][] getData = new String[3][4];
		//0,0 ; 0,1 ; 0,2; 0,3
		//1,0; 1,1; 1,2 ; 1,3.
		/*
		 * ComName fName lName a1 a2 a2 b1 b2 b3
		 */
		
		getData[0][0] = "TestLeaf";
		getData[0][1] = "Hari";
		getData[0][2] = "R";
		
		getData[1][0] = "TestLeaf";
		getData[1][1] = "VINOTH";
		getData[1][2] = "KUMAR";
		return getData;
	}
}
