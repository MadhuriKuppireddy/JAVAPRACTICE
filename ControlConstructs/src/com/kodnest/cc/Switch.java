package com.kodnest.cc;
import java.util.Scanner;
class Switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter operand -1");
		int a = in.nextInt();
		System.out.println("enter operand -2");
		int b = in.nextInt();
		System.out.println("User! Please enter the operator");
		float ch = in.nextFloat();
		
		String str = "Madhu";
		
		
		
		switch(str) {
		case "a": System.out.println("The Sum is:"+ (a+b));
			break;
		case "b" : System.out.println("The Difference is:"+ (a-b));
			break;
		case "c" : System.out.println("The Product is:"+ (a*b));
			break;
		
		
		default : System.out.println("The Invliad operator");
		
		
		}
}
}
