package com.platform.finalKey;

public class ConstructorDemo {
	int x ;
	public ConstructorDemo() {
		super();
		this.x = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo t = new ConstructorDemo();
		ConstructorDemo t1 = new ConstructorDemo();
		System.out.println(t.x +" "+ t1.x);
	}


	

}
