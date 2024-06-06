package com.codnest.stati;

class Demo{
	static int a=10;
	int c=40;
	static void display1() {
		System.out.println("static display1");
	}
	void dispaly2() {
		System.out.println("static display2");
	}
	static {
		System.out.println("static-block");
	}
	{
		System.out.println("non-static-block");
	}
	{
		System.out.println("Instance block");
	}
}
public class Static {
	public static void main(String[] args) {

		new Demo();
		new Demo();
		new Demo();
		new Demo();
		
	}
}
