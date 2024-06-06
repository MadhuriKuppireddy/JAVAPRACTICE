//package com.kodnest.cf;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Student implements Comparable<Student>{
//	int rollno;
//	String name;
//	int yop;
//	
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
//	@Override
//	public int compareTo(Student other) {
//	//ascending order
//		return this.yop-other.yop;
//	//descending order
//		//return other.yop-this.yop;
//	}
//}
//public class collectionframeworkUsingInterface {
//	public static void main(String[] args) {
//		Student student1 = new Student(1,"John",2023);
//		Student student2 = new Student(2,"Jack",2021);
//		Student student3 = new Student(3,"Ria",2020);
////		Student student4 = new Student(4,"Ryan",2019);
////		Student student5 = new Student(5,"Arav",2024);
//		ArrayList al = new ArrayList();
//		al.add(student1);
//		al.add(student2);
//		al.add(student3);
////		al.add(student4);
////		al.add(student5);
//		//System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
//	}
//}
//
