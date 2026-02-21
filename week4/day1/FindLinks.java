package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//locate the tag
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//size
		int size = allLinks.size();
		System.out.println(size);
		//retreive the particular link
		WebElement name = allLinks.get(4);
		String text = name.getText();
		System.out.println(text);
		//iteration
		List<String> list=new ArrayList<String>();
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			//System.out.println(text2 );
			list.add(text2);
		}
		System.out.println(list);

	}

}
