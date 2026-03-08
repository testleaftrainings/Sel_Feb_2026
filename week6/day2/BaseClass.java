package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass  {
	
	public RemoteWebDriver driver;
	@Parameters({"Browser","url","username","password"})
	@BeforeMethod
	public void preCondns(String Browser,String url,String uName,String pwd ) {
		//driver=new ChromeDriver();
		if (Browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		} else if(Browser.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postCondns() {
		driver.close();
	}

}
