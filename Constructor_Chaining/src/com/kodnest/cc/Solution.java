package com.kodnest.cc;
class A {
	//0-parameter
	public A() {
		super();
		System.out.println("1");
	}
	//1-parameter
	public A(int a) {
		super();
		System.out.println("2");
	}
}
 class B extends A {
	//0-parameters
		public B() {
			super();
			System.out.println("3");	
	}
}
public class Solution {
	public static void main(String[] args) {
		B b=new B();
		
	}

}
