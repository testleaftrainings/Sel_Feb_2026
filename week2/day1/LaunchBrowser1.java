package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser1 {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver
		
		  System.setProperty("Webdriver.edge.driver",
		  "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		  WebDriver driver1=new EdgeDriver();
		 
		//FirefoxDriver driver2=new FirefoxDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//get the title of page
		String title = driver.getTitle();
		System.out.println(title);
	}

}
