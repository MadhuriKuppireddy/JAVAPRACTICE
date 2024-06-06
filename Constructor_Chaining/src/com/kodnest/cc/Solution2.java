package com.kodnest.cc;

class A{
	int a=10;
	public A() {
		System.out.println("2");
	}
	public A(int a) {
		System.out.println("3");
	}
}
class B extends A{
	int b=20;
	public B() {
		System.out.println("0");
	}
	public B(int b) {
		System.out.println("1");
	}
}

public class Solution2 {
	public static void main(String[] args) {
		B b = new B(10);
	}

}
