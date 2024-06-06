package com.kodnest.cf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class sol {
	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
	//infinite loop
		//		   for(int i=0;i<al.size();i++) {
		//			   System.out.println(al.get(i)+" ");
		//			   al.add(100);
		//		   }
	//ConcurrentModificationException
//		for(Object obj:al) {
//			System.out.println(obj+" ");
//			al.add(100);
//		}
		//ConcurrentModificationException
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
			al.add(100);
		}
	}

}

