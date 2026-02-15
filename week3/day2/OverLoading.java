package week3.day2;

public class OverLoading {

	public static void main(String[] args) {
		System.out.println("Task Completed");
		OverLoading.main(30);
		OverLoading.main("Saranya");

	}
	public static void main(int a) {
		System.out.println(a);

	}
	public static void main(String s) {
		System.out.println(s);

	}

}
