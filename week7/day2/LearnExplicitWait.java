package week7.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		//click
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		//total windows
		Set<String> windowHandles = driver.getWindowHandles();
		int noOfWindows = windowHandles.size();
		System.out.println(noOfWindows);
		//Instantiate WebDrivewait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println(until);

	}

}
