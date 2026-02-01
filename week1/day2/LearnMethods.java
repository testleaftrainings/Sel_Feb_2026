package week1.day2;

public class LearnMethods {
	
	/**
	 * Method signature:
	 * syntax: ACCESSModifier returntype methodName(input parameters)
	 */
	public void addNumbers(int a,int b,float c){
		System.out.println(a+b);
		
	}
	
	private int noOfBicycles(){
		return 2;
	}
	
	String bicycleData(String brandName,String colour){
		
		return brandName+" "+colour;
	}
	
	public static void main(String[] args) {
		LearnMethods lm1=new LearnMethods();
		lm1.addNumbers(5, 3, 5.5f);
		int numberOfBicycles = lm1.noOfBicycles();//ctrl,2+enterL
		System.out.println(numberOfBicycles);
		System.out.println(lm1.bicycleData("Honda", "White"));
	}
	
	
}
