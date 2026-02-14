package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/**
		 * Strings:
		 * -NonPrimitive datatype,immutable class,sequence of characters
		 * -implementation:
		 * 1)String literals
		 * 2)String instantiation
		 * 
		 */
		//String Literals
		//syn:datatype var.Name="values";
		String name="testleaf";
		String name1="TestLeaf";//length starts from1
		//String Instantiation
		//syn:String obj=new String("values");
		String str=new String("Testleaf always ahead");
		String str1=new String("Testleaf Always Ahead");
		
		//count number of characters
		int length = name1.length();
		System.out.println(length);
		//equals--->content of the string but it is case sensitive
		boolean equals = str.equals(str1);
		System.out.println(equals);
		//==--->checks for the memory address
		if (str==str1) {
			System.out.println("text matched");
		} else {
			System.out.println("text is not matched");
		}
		
		//equal ignoreCase--->checks for the content and ignore the case
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase);
		//contains--->checks for the content but is case sensitive
		boolean contains = str.contains(str1);
		System.out.println(contains);
		
		//toCharArray
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		//charAt
		System.out.println(name.charAt(4));//index starts from 0
		
		//replace
		String s="Testleaf@321";//T,E,S,T,L,E,A,F,@,3,2,1
		String replace = s.replace("Test", "@").replace("2", "");
		System.out.println(replace);
		//repalce All
		String replaceAll = s.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		String replaceAll2 = s.replaceAll("[^A-z]","");
		System.out.println(replaceAll2);
		//string to integer
		String sT="123";
		System.out.println(sT+10);
		int stringToInteger= Integer.parseInt(sT);
		System.out.println(stringToInteger+10);
		//integer to String
		int i=12;
		String intToString = Integer.toString(i);
		System.out.println(intToString+10);
		//split
		String sT1="Hello World";//h-->0,llo world--->1
		String[] split = sT1.split("e");
		System.out.println(split[1]);
		String[] split2 = sT1.split("l");//he-->0,1--"",2-->o wor,3-->d
		System.out.println(split2[2]);
		String[] split3 = sT1.split("o");//0---Hello,1-->world
		System.out.println(split3[1]);
		//substring
		String month="February";
		String substring = month.substring(2);
		System.out.println(substring);
		String substring2 = month.substring(2, 5);//endindexS=expectedindex+1
		System.out.println(substring2);
		
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
	}

}
