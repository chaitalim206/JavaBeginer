package com.platform.finalKey;

public class PassByVAlue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		System.out.println("before method: " + num1);
		display(num1);
		System.out.println("after method: " + num1);
		
	}

	public static int display(int num) {
		System.out.println("inside display method" + num);
		return num;
	}
}
