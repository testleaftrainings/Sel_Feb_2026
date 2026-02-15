package week3.day2;

public class LearnOverLoading {
	/**
	 * Polymorphism:single action performed in different ways
	 * two types:
	 * 1)static/method overloading/compile time/early Binding
	 *   -having same method Name but passing different input parameters
	 * 
	 */
	
	public void add() {
		int a=5;
		int b=7;
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		
		System.out.println(a+b);
	}
	public void add(int a,int c,int b,float d) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LearnOverLoading l=new LearnOverLoading();
		l.add(2, 5, 6);
	}

}
