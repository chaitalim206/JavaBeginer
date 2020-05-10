package com.platform.controlStatements;

import java.util.Random;
import java.util.Scanner;

public class UseForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many numbers you want to generate: ");
		int num = sc.nextInt();
		Random obj = new Random();
		for (int i = 1; i <= num; i++) {
			 int randomNumber = obj.nextInt(100);
			System.out.println(+randomNumber);
		}

	}

}
