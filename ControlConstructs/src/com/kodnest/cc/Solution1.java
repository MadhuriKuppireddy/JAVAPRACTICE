package com.kodnest.cc;
import java.util.Scanner;
 class Solution1 {
	 public static void main(String[] args) {
		int a=10;
		int b=20;
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Enter an operator");
		char ch = scan.next().charAt(0);
		if(ch == '+'){
			System.out.println(a+b);
		}
		else if(ch == '-'){
			System.out.println(a-b);
		}
		else if(ch == '*'){
			System.out.println(a*b);
		}
		else if(ch == '/'){
			System.out.println(a/b);
		}
		else if(ch == '%'){
			System.out.println(a%b);
		}
		else{
			System.out.println("Invalid Operator");
		}
	}
}
