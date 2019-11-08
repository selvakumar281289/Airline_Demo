package org.test;

import java.util.HashSet;
import java.util.Set;

public class LiveProject {
	public static void main(String[] args) {
		Set<Integer> l =new HashSet<Integer>();
		l.add(101);
		l.add(102);
		l.add(102);
		l.add(103);
		for (Integer itr:l) 
			System.out.println(itr);

		System.out.println("This is your empPhone");
		System.out.println("Based on EmployeeChild");
	}

}
