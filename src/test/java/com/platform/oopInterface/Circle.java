package com.platform.oopInterface;

public class Circle extends Print implements Shape {

	int r = 5;
	double pi = 3.14;
	double ar = 0;
	double cmf = 0;

	public void sides() {
		System.out.println("Circle has no sides");

	}
	
	public double getArea() {
		ar = pi * r * r;
		System.out.println("Area of circle is: " +ar);
		return ar;
	}

		public double getCircumference() {
			cmf = 2 * pi * r;
			System.out.println("Circumference of circle is: " +cmf);
			return cmf;
		}
}
