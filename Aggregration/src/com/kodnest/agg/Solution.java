package com.kodnest.agg;

class Pilot {
	String name;
	public Pilot(String name){
		this.name=name;

	}
	void fly() {
		System.out.println(name + " is Flying the plane");
	}
}
class Airlines{
	String airname;
	Pilot pilot;
	public Airlines(String airname,Pilot pilot) {
		this.airname=airname;
		this.pilot=pilot;
	}
	void Operate() {
		System.out.println(airname + " Operating");
		pilot.fly();
	}
}
public class Solution {
	public static void main(String[] args) {
		Pilot Madhu=new Pilot("Madhu");
		Airlines a= new  Airlines("Indigo", Madhu);
		a.Operate();
		a=null;
		Madhu.fly();
	}

}
