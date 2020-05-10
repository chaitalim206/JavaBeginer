package com.platform.controlStatements;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
			System.out.println("Excellent!"); 
			break;
		case 'B' :
			System.out.println("Well done");
			break;
			case 'C' :
				System.out.println("good");
				break;
			case 'D' :
				System.out.println("You passed");
			case 'F' :
				System.out.println("Better try again");
				break;
			default :
				System.out.println("Invalid grade");
		}

	}
}
