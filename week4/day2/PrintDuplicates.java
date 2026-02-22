package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		String s="saranya";//a--->duplicate
		char[] charArray = s.toCharArray();
		
		Set<Character> unique=new TreeSet<Character>();
		
		Set<Character> duplicates=new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique.add(charArray[i]);//s,a,r,n,y
			if (!b) {
				duplicates.add(charArray[i]);
			}
		}
		System.out.println(unique);
		System.out.println(duplicates);
	}

}
