package com.kodnest.cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		ArrayList al = readArrayList();
		displayArrayListReverseOrder(al);
		displaySecondLargestElement(al);
		removeDuplicateElement(al);
		reverseArrayList(al);
	}

	private static void reverseArrayList(ArrayList al) {
//		Collections.reverse(al);
//		System.out.println("Reverse1 -"+al);
		
		ArrayList reverseal = new ArrayList();
		for(int i=al.size()-1;i>=0;i--) {
			reverseal.add(al.get(i));
		}
		System.out.println("reverse2 -"+reverseal);
	}

	private static void removeDuplicateElement(ArrayList al) {
//	HashSet hashSet = new HashSet<ArrayList>(al);
//	System.out.println(hashSet +"approach-1");	
	
	HashSet hashSet1 = new HashSet();
	for(Object obj:al) {
		hashSet1.addAll(al);
	}
	System.out.println(hashSet1 +"approach-2");
	}

	private static void displaySecondLargestElement(ArrayList al) {
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.get(al.size()-2));
		
	}

	private static void displayArrayListReverseOrder(ArrayList al) {
		for(int i=al.size()-1;i>=0;i--){
			System.out.println(al.get(i)+" ");
		}
		
	}

	private static ArrayList readArrayList() {
		ArrayList al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(25);
		al.add(10);
		al.add(42);
		return al;
		
		
	}
}
