package com.kodnest.fina;

class A{ 
	final void display() {
		System.out.println("Hello");
	}
}

class B extends A{
	void display() {
		System.out.println("Hello");
	}
}

public class Solution {
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
