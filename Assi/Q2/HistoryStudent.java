package com.Assi.Q2;

public class HistoryStudent extends Student {

	int historyMarks;
	int civicsMarks;
	
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getPercentage() {
		
		this.address =address;
		this.name = name;
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		double totalMarks = 200.0;
		double sum = (double)(historyMarks + civicsMarks);
		System.out.println("Percentage : " + sum/totalMarks *100);
		
		
	}
	
	
	
	
}
