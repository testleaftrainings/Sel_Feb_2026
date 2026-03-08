package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

// Step 4: Inherit the properties of ProjectSpecificMethod / precondition & postCondition
public class DeleteLead extends ProjectSpecificMethod{

	// Step 1: Change the main method to normal method

	// Step 2: Declate the @Test Annotation
	@Test // - Ctrl+shift+O - importing
	public void deleteLead() throws InterruptedException {

		// Step 3: Remove the common line of logics
		
		// Step 5: inherit

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}
}
