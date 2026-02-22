package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
	/**
	 * 1)NO alert present exception
	 * 2)un handled alert exception
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//simpleAlert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//handle the alerts
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		//prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Testleaf");
		alert.accept();
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		//sweet alerts(inspectable)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
	}

}
