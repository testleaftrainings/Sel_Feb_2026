package week3.day2;

public class LearnOverRiding extends LearnOverLoading{
	
	public void add() {
		int a=10;
		int b=10;
		System.out.println(a+b);
		super.add();
	}
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LearnOverRiding lo=new LearnOverRiding();
		lo.add();
	}

}
