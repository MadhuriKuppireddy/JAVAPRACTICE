package com.kodnest.cf;

import java.util.ArrayList;

public class Reverse {
	public static void main(String[] args) {
	ArrayList al = new ArrayList();	
	al.add(10);
	al.add(20);
	al.add(30);
	for(int i=al.size()-1;i>=0;i--) {
		System.out.println(al.get(i));
	}
	
	}

}
