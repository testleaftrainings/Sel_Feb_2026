package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//address of parent window(current)
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);//C0DA7D4A81A64ABA8B7917527D2B1B87,3BB799B684DF8095C9E5B75FB1627BE1
		System.out.println(driver.getTitle());
		//navigate to child window
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> childWindow = driver.getWindowHandles();
		//conver set into list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//switch to child window
		driver.switchTo().window(listWindow.get(1));
		//retreive the address of child window
		String chWindowADD = driver.getWindowHandle();
		System.out.println(chWindowADD);
		System.out.println(driver.getTitle());
		
		driver.close();
		//driver.switchTo().window(listWindow.get(1));//no such window exception
		driver.switchTo().window(listWindow.get(0));
		System.out.println(driver.getTitle());
		

	}

}
