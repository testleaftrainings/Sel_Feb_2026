package commonintegration;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		//add the library-Commons-io
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//take a screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//locate my page
		File destination=new File("./snaps/homepage.png");
		//connect source and destination
		FileUtils.copyFile(source, destination);
		//particular textfield
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		File source1 = searchField.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snaps/searchField.png");
		FileUtils.copyFile(source1, destination1);

	}

}
