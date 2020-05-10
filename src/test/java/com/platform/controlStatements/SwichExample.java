package com.platform.controlStatements;

import java.util.Scanner;

public class SwichExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Today is Monday");
			break;

		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thirsday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		}

	}

}
