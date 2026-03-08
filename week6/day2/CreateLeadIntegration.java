package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class CreateLeadIntegration extends BaseClass{
	@Test(dataProvider="fetchData")
	public void runCL(String cName,String fName,String lName) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
		
		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return ReadExcelIntegration.readExcel();
		
	}
}






