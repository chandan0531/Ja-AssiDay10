package com.Assi.Q3;

public class IntrFinalClass implements IntrF {

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("come from Intr1");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("come from Intr2");
	}

	@Override
	public void fun3() {
		// TODO Auto-generated method stub
		System.out.println("come from IntrF");
	}
	
	public static void main(String[] args) {
		
		IntrF intrf = new IntrFinalClass();
		intrf.fun1();
		intrf.fun2();
		intrf.fun3();	
	}

}
