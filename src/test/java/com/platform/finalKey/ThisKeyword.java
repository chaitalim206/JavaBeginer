package com.platform.finalKey;

public class ThisKeyword {
	int num = 10;
	 
	public ThisKeyword(int num) {
		this();
		this.num = num;
	}

	public ThisKeyword() {
		// TODO Auto-generated constructor stub
		System.out.println("Example in this keyword");
	}
	
	public void print() {
		int num = 20;
		System.out.println(" mnumber is :" + num);
		System.out.println("number is: " +this.num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword th = new ThisKeyword();
		th.print();
		
		ThisKeyword th1 = new ThisKeyword(30);
		th1.print();
	
	}

}
