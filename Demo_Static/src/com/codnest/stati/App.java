package com.codnest.stati;

public class App {
	public App() {
		System.out.println("5");
	}
	static void dispaly1() {
		System.out.println("1");
	}
	{
		System.out.println("3");
	}
	public App(int a) {
		System.out.println("5");
	}
	{
		System.out.println("4");
	}
	void dispaly2() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		new App();
		System.out.println("1");
		new App(45).dispaly2();
		new App().dispaly1();
	}
	

}
