package com.kodnest.cc;
import java.util.Scanner;
class StudentMarks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("User! Enter marks");
		int m = in.nextInt();
		
		// if else if ladder
		if(m >= 90) {
			System.out.println("A");
		}
		else if(m >= 75 && m <= 90) {
			System.out.println("B");
		}
		else if(m >= 60 && m <= 75) {
			System.out.println("C");
		}
		else if(m >= 35 && m <= 60) {
			System.out.println("D");
		}
		else if(m > 0 && m <= 35) {
			System.out.println("F");
		}
		else  {
			System.out.println("Invlid Grade");
		}
	}
}
