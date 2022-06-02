package com.Assi.Q1;

import java.util.Scanner;
public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>=1000)
		{
			return new TajHotel();
		}
		if(amount>200 && amount<1000)
		{
			return new RoadSideHotel();
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the amount");
		int x = scn.nextInt();
		
		Hotel h = d.provideFood(x);
		
		
		if(h !=null )
		{
			h.chickenBiryani();
			h.masalaDosa();
			
			if(h instanceof TajHotel )
			{
				TajHotel taj = (TajHotel)h;
				taj.welcomeDrink();
			}
		}
		else
		{
			System.out.println("Please Enter valid amount");
		}
	}
}
