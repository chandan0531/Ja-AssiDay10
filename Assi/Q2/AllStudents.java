package com.Assi.Q2;

public class AllStudents {
	
	public static void main(String[] args) {
		
		HistoryStudent hs = new HistoryStudent("chan", "haz");
		hs.civicsMarks = 80;
		hs.historyMarks = 70;
		hs.getPercentage();
		
		System.out.println("===========");
		
		ScienceStudent ss = new ScienceStudent("Deep" , "jha");
		ss.mathsMarks = 98;
		ss.phisicsMarks =87;
		ss.chemistryMarks = 78;
		ss.getPercentage();
		
	}
}
