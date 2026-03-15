package week7.day2;

public class LearnConstructors {
	/**
	 * Constructors:
	 * -used to initialize the state of objects
	 * -should be created as like class name and it doesnot have the return type.
	 * types:
	 * 1)default--->a constructor with zero arguments
	 * 2)parameterized--->with multiple arguments
	 * constructor overloading:having more than one constructor inside the same class with different parameters.
	 * this:
	 * -refers to current class object
	 * -it resolves the ambiguity between the local and instant variables.
	 * Can you call one constructor from another constructor?Yes--->this keyword
	 * constructor chaining:to avoid the duplication of codes.
	 * 
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructors() {
		//this(89, "aswathi", true);
		//empId=27;
		System.out.println("default constructor");
		
	}
	public LearnConstructors(int empId,String empName,boolean empStatus) {
		this();
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
		System.out.println("parameterized constructor");
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		  LearnConstructors lc1=new LearnConstructors(87, "saran", false);
		  System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 
		
		/*
		 * LearnConstructors lc=new LearnConstructors();
		 * System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 */
		
	}
}
