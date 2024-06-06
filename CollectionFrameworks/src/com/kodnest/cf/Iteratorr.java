//package com.kodnest.cf;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.TreeSet;
//
//
//class Student extends Object{
//	int rollno;
//	String name;
//	int yop;
//	public Student(int rollno,String name,int yop) {
//		this.rollno=rollno;
//		this.name=name;
//		this.yop=yop;
//		
//	}
//	@Override
//	public String toString() {
//		return "Student [rollno=" + rollno + ", name=" + name + ", yop=" + yop + "]";
//	}
//	
//	
////	public String toString(){
////		return rollno+"_"+name+"_"+yop;
////		
////	}
//}
//
//
//public class Iteratorr {
//	public static void main(String[] args) {
//		
//		Student student1 = new Student(1,"John",2023);
//		Student student2 = new Student(2,"Jack",2021);
//		Student student3 = new Student(3,"Ria",2020);
//		Student student4 = new Student(4,"Ryan",2019);
//		Student student5 = new Student(5,"Arav",2024);
//		ArrayList al = new ArrayList();
//		al.add(student1);
//		al.add(student2);
//		al.add(student3);
//		al.add(student4);
//		al.add(student5);
//		
//		System.out.println("before sorting");
//		System.out.println(al);
//		System.out.println("After sorting");
//		//using bubble sort
//		Collections.sort(al);
//		System.out.println(al);
//		
//		
//		
//		
//		//6-3-2024
////		ArrayList arrayList = new ArrayList();
////		arrayList.add(student1);
////		arrayList.add(student2);
////		arrayList.add(student3);
////		System.out.println(arrayList);
//		
//		
//		
////		ArrayList al = new ArrayList();
////		al.add("asv");
////		al.add("gfd");
////		al.add("madhu");
////		al.add("abc");
////		al.add("madhuri");
////		
////		System.out.println("ArrayList");
////		System.out.println(al);
////		
////		Collections.sort(al);
////		System.out.println(al);
////		
////		TreeSet treeset = new TreeSet();
////	 	treeset.addAll(al);
////	 	
////	 	System.out.println("TreeSet");
////	 	System.out.println(treeset);
//	}
//
//}
