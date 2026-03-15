package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class RunLogin extends ProjectSpecificMethod {
	@Test
	public void runLT() {
		System.out.println("testClass:"+driver);
		LoginPage lp=new LoginPage();
		lp.enterUname().enterPwd().clickLogin().clickCrmsfa();
	}

}
