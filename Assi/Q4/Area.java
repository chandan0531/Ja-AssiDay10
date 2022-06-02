package com.Assi.Q4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		
		int rectangleArea= length*breadth;
		return rectangleArea;
	}

	@Override
	public int squareArea(int side) {
		int squareArea= side*side;
		return squareArea;
	}

	@Override
	public int circleArea(int radius) {
		double circleArea= (int)(3.14 * radius*radius);
		System.out.println(circleArea);
		return (int)circleArea;
	}

}
