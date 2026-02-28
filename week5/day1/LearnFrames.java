package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	/**
	 * No such element exception:
	 * 1)when locator is goes wrong
	 * 2)when wait statements are not given
	 * 3)when element is present insude a frame
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//switch to frame
		driver.switchTo().frame(0);//index starts from 0
		//click
		driver.findElement(By.id("Click")).click();

	}

}
