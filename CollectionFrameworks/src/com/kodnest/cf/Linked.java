package com.kodnest.cf;

import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		
//		System.out.println(ll.peek());
//		System.out.println(ll.peekFirst());
//		System.out.println(ll.peekLast());
//		
//		System.out.println(ll.poll());	
//		System.out.println(ll.pollFirst());
//		System.out.println(ll.pollLast());
//		System.out.println(ll);
		System.out.println("Using for loop");
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("Using While loop");
		int i=0;
		while(i<=ll.size()-1) {
			System.out.println(ll.get(i));
			i++;
		}
		System.out.println("Using do-while loop");
		int j=0;
		do {
			System.out.println(ll.get(j));
			j++;
		} while (j<=ll.size()-1);
		
		
	}

}
