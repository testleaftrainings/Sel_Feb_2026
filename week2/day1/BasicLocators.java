package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/**
		 * steps to interact with the web element:
		 * -locate the element(from the dom) using the findElement()
		 * -Sendkeys(pass any input)
		 * -click an element-->use click()
		 */
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
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
		

	}

}
