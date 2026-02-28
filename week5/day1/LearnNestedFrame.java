package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	/**
	 * No such frame exception
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//outerframe
		WebElement nestFrame = driver.findElement(By.xpath("//h5[contains( text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(nestFrame);
		//innerframe
		//driver.switchTo().frame("frame2");
		driver.switchTo().frame(0);
		//WebElement
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();//comes out of all the frames to main page
		driver.switchTo().parentFrame();//switch to the immediate parent frame
	}

}
