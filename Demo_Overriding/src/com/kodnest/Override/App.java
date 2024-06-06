package com.kodnest.Override;

public class App {
	public static void main(String[] args) {
		//pass by value
		int num=10;
		System.out.println("Original Number= "+num);
		modify(num);
		System.out.println("Number after executing modify()="+num);
	}

	 static void modify(int numCopy) {
		System.out.println("Original Number copy="+numCopy);
		numCopy=100;
		System.out.println("NImber copy after modifications="+numCopy);
	}
	

}
