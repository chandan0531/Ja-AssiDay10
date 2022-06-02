package com.Assi.Q2;

public class ScienceStudent extends Student{
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;


	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		
		this.name = name;
		this.address = address;
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		double totalMarks = 300.0;
		double sum = (double)(phisicsMarks + chemistryMarks + mathsMarks); 
		
		System.out.println("Percentage : " + sum/totalMarks*100);
	}
	
	
	
}
