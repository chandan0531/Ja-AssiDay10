package com.Assi.Q4;

public class Mian {
	
	public static void main(String[] args) {
		
		Shape area = new Area ();
		int ac  = area.circleArea(5);
//		System.out.println(ac);
		
		int ar = area.rectangleArea(10, 10);
		System.out.println(ar);
		
		int as = area.squareArea(20);
		System.out.println(as);
	}
}
