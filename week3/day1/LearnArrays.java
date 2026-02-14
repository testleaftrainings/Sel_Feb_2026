package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/**
		 * Arrays
		 * -collection of items of same datatype
		 * implementations:
		 * 1)ArrayLiterals--->based on data
		 * syn:datatype[] varName={values};
		 * 2)Array Instantiation--->based on size
		 */
		int [] marks= {98,90,65,87,54};//length starts from 1,
		//length of Array
		int length = marks.length;
		System.out.println(length);
		//sorting
		Arrays.sort(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		//maximum value
		System.out.println(marks[length-1]);
		//Array Instantiation
		
	int marks1[]=new int[4];//length-->4,index-->0,1,2,3
	marks1[0]=65;
	marks1[1]=98;
	//marks1[2]=43;

	//marks1[3]=90;
	//marks1[4]=76;
		System.out.println(marks1[3]);
		String learners[]=new String[2];
		learners[0]="Roopika";
		learners[1]="swadha";
		//learners[2]="swathi";
		System.out.println(learners[1]);

	}

}
