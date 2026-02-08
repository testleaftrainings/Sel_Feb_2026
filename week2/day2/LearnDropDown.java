package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	/**
	 * step1:identify the DD is present inside the <Select>
	 * Step2:if it is present inside a <select>,locate the element and store it in a local variable.
	 * Step3:instantiate the Select Class.
	 * 1)select by index
	 * 2)select by visibletext
	 * 3)select by value
	 * step4:with the object created make use of one helper method from select class
	 * No such element exception:
	 *  1)when the locator goes wrong
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//implcit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the title of page
		String title = driver.getTitle();
		System.out.println(title);
		//enter the uName
		driver.findElement(By.id("username")).sendKeys("democsr2");
		//enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//click createLead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//enter lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
		//Locate the SourceDD
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate the select select class
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		//industryDD
		WebElement indDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(indDD);
		sel1.selectByValue("IND_HEALTH_CARE");
		

	}

}
