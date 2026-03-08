package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	// preCondition(); - Executes before each @Test
	// postCondition(); - Executes after each @Test
	ChromeDriver driver;

	// Para-Step2:passing the key
	@Parameters({ "urls", "userName", "passWord" })

	@BeforeMethod
	public void preCondition(String url, String uName, String pWord) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}// Local -variable,object & Global - variable, object

	@AfterMethod
	public void postCondition() {
		// Driver needed
		driver.close();
	}

}
