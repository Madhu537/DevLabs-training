package com.AssignmentQuestion4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Create an object of class ListExample");
		ListAssignment list = new ListAssignment();
		
		System.out.println("Create List to fetch the values from TestList2 method");
		List<Object> lst = list.TestList();
		System.out.println("Traverse through the list and print");
		for(Object a: lst)
			System.out.println(a);
		
		System.out.println("Create List to fetch the values from TestList2 method");
		ArrayList<Object> alst =list.TestList2();
		System.out.println("Traverse through the Array List using Iterator and print");
	      Iterator<Object> iter = alst.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
		
		
	}

}
