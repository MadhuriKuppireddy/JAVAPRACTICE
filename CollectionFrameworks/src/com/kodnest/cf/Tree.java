package com.kodnest.cf;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

class Stu{
	int age;
	String name;
	public Stu(int age,
	String name) {
		super();
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
public class Tree {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		Stu s1=new Stu(20,"John");
		Stu s2=new Stu(10,"Jack");
		Stu s3=new Stu(15,"Ria");
		tm.put(10, s2);
		tm.put(2, s1);
		tm.put(33, s3);
		//System.out.println(tm);
		Set keySet = tm.keySet();
		//System.out.println(keySet);
		Collection values = tm.values();
		System.out.println(values);
	}

}
