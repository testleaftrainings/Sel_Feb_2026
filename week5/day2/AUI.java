package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUI {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//instantiate the ACtions class
		Actions act=new Actions(driver);
		//locate element
		WebElement mouseHover = driver.findElement(By.xpath("//span[text()='Prime']"));
		act.moveToElement(mouseHover).perform();
		//scroll down
		WebElement scrollDown = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		act.scrollToElement(scrollDown).perform();
		//click
		WebElement cli = driver.findElement(By.xpath("//h5[contains(text(),'Amazon Business')]"));
		act.click(cli).perform();
		//rightclick
		act.moveByOffset(10, 50).contextClick().perform();
	}

}
