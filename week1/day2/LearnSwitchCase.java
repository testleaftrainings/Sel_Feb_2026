package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="Firefox";
		
		//shortcut for switchcase-->type switch and do ctrl+space
		switch (browser) {
		case "Chrome":
			System.out.println("Launch ChromeBrowser");
			break;
			
		case "Edge":
			System.out.println("Launch EdgeBrowser");
			break;
		case "Safari":
			System.out.println("Launch SafariBrowser");
			break;
			default:
				System.out.println("open IE");
		}
		
	}

}
