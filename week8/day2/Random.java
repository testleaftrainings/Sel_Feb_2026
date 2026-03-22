package week8.day1;

public class Random {

	public static void main(String[] args) {
		System.out.println(Math.random());//0.1669432985015885,0.27027729711992043
		int ranNum=(int)(Math.random() *999999 +999999);
		System.out.println(ranNum);//1031044,1031044
	}

}
