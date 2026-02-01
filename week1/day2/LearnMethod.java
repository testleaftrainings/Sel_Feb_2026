package week1.day2;

public class LearnMethod {
	
	public void enterUserName() {
			System.out.println("valid username is entered");
	}
	public void passWord() {
		System.out.println("valid password is entered");
}
	public void clickLogin() {
		System.out.println("logged in successfully for the valid credentials");
}
	public static void main(String[] args) {
		
		//syntax:classNAME obj=new ClassName();
		LearnMethod lm=new LearnMethod();
		lm.enterUserName();
		lm.passWord();
		lm.clickLogin();
		
	}

}
