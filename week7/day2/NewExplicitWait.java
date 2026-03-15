package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		//instantiate webdriver wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement firstWE = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[1]")));
		firstWE.click();
		WebElement visiblity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		boolean displayed = visiblity.isDisplayed();
		System.out.println(displayed);
	}

}
