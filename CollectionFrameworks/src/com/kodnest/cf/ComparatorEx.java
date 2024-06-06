package com.kodnest.cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
	
	String name;
	int pid;
	int pprice;
	
	public Product(String name,int pid,int pprice) {
		this.name=name;
		this.pid=pid;
		this.pprice=pprice;	
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", pid=" + pid + ", pprice=" + pprice + "]";
	}
}

class YearOfMgf implements Comparator<Product>{

	@Override
	public int compare(Product s1, Product s2) {
//		if(s1.yop>s2.yop) {
//			return -1;
//		}
//		if(s1.yop<s2.yop) {
//			return 1;
//		}
//		return 0;
		//2nd way
		return Integer.compare(s2.pprice, s1.pprice);
	
		//asc
		//return Integer.compare(s1.pprice, s2.pprice);
	}
}

public class ComparatorEx {
	public static void main(String[] args) {
		Product p1 = new Product("Pen",123,10);
		Product p2 = new Product("Pencil",321,5);
		Product p3 = new Product("Mobile",43,10000);
		Product p4 = new Product("Laptop",133,60000);
		Product p5 = new Product("Chocolate",5324,100);
		Product p6 = new Product("Biscuit",5059,30);
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		
		Collections.sort(al,new YearOfMgf());
		System.out.println(al);
	}
}
