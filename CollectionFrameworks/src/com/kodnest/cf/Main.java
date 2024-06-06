package com.kodnest.cf;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Normal order");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Reverse order");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		System.out.println();
//using while loop
		
		 int i=0;
		while(i<=al.size()-1) {
			System.out.println(al.get(i));
			i++;
		}
		System.out.println();
		//using do-while
		int j=0;
		do {
			System.out.println(al.get(j));
			j++;
		} while (j<=al.size()-1);
		

	}
}

