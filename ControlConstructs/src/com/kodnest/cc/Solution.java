package com.kodnest.cc;
import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! Please enter the number");
		int n = scan.nextInt();
		if (n>0) {
			System.out.println("Positive number");
		}
		else if (n<0){
			System.out.println("Negative Number");
		}
		else {
			System.out.println("zero");
		}
		System.out.println("end");
	}
}
