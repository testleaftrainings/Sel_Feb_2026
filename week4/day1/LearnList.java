package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/**
		 * List syntax:interface <generictype> list Name=new implementationClass<genericType>();
		 */
		//create a list
		List<String> learners=new ArrayList<String>();
		List<String> Trainer=new ArrayList<String>();
		Trainer.add("Saranya");
		learners.add("suchith");
		learners.add("Mohan");
		learners.add(0, "swathi");
		learners.add(2, "shalini");
		//learners.add(3, "suchith");
		learners.add(3, "vidhya");
		learners.add(3, "jacqualin");
		learners.add(3, "jibran");
		System.out.println(learners);
		//find the size
		int size = learners.size();
		System.out.println(size);
		System.out.println(learners.get(size-1));
		//retrieve the value
		String index3 = learners.get(3);
		System.out.println(index3);
		//remove the item
		String remove = learners.remove(2);
		System.out.println(remove);
		System.out.println(learners);
		boolean remove2 = learners.remove("jibran");
		System.out.println(remove2);
		System.out.println(learners);
		//clear
		/*
		 * learners.clear(); System.out.println(learners);
		 */
		boolean all = Trainer.addAll(learners);
		System.out.println(all);
		System.out.println(Trainer);
		

	}

}
