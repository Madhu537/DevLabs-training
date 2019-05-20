package com.AssignmentQuestion4;

import java.util.ArrayList;
import java.util.List;

//Write 2 methods with List and set as a return type, call that method in other class and print that values

public class ListAssignment {
			
	public List<Object> TestList(){
		
			List<Object> tst = new ArrayList<>();
		tst.add("Madhu");
		tst.add(1234);
		tst.add('A');
		tst.add("Sneha");
		tst.add("Ankit");
		tst.add("12345");
		tst.add("Sahil");
		
	    
			return tst;
	    						
			}
	public ArrayList<Object> TestList2(){
		
	ArrayList<Object> names = new ArrayList<Object>();
	names.add("1234567");
	names.add("MadhuBabuN");
	names.add('M');
	names.add("Rajesh");
	names.add("Arun");
		return names;
				
	} 

}