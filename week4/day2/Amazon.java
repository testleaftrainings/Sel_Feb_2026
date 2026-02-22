import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//searchfield
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//create a list
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement each : prices) {
			String text = each.getText();
			String replaceAll = text.replace(",", "");
			if (!replaceAll.isEmpty()) {
				int mobiles = Integer.parseInt(replaceAll);
				list.add(mobiles);
			}
			
		}
		Collections.sort(list);
		System.out.println(list);

	}

}
