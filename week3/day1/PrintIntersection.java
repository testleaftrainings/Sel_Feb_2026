package week3.day1;

public class PrintIntersection {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int[] num1= {2,4,6,7};//output:2,4
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if (num[i]==num1[j]) {
					//num[0]=1,num[1]=2
					//num1[0]=2,num1[1]=4,num1[2]=6,mun1[3]=7
					System.out.println(num[i]);
				}
			}
		}

	}

}
