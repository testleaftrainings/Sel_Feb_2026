package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Arithmetic Operators
		System.out.println(4/2);//-->quotient
		System.out.println(11%2);//remainder
		//Assignment OPerators
		int a=5,b=4;
		a+=5;//a=a+5-->a=5+5=10
		System.out.println(a);
		b-=2;//b=b-2-->4-2=2
		System.out.println(b);//2
		b*=4;//b=b*4--->2*4=8
		System.out.println(b);
		//Comparison Operators
		System.out.println(5==5);
		//Logical Operators
		System.out.println((5==5)&&(5>0));//T-->1*1--->1--->TRUE
		System.out.println((7<7)&&(0>1));//0*0-->0-->false
		System.out.println((5<3)||(2==2));//0+1--->1-->true
		System.out.println((5==5)&&(5>0)||(2==2));//1*1--->1+1--->1(true)
		//Unary operators
		int x=1;
		System.out.println(++x);//2
		System.out.println(x++);//2
		System.out.println(x);//3
		System.out.println("postDecrement:"+x--);//3
		System.out.println(x);//2
		System.out.println(--x);
	}

}
