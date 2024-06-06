package com.kodnest.constructor;

class Demo {
	public static void main(String[] args) {
		Student s = new Student(10,"john");
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
class Student
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

