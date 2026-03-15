package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	
	public LoginPage enterUname() {
		driver.findElement(By.id("username")).sendKeys("democsr2");
		/*
		 * LoginPage lp=new LoginPage(); return lp;
		 */
		return this;
}
	public LoginPage enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
