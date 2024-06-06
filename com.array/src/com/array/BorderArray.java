package com.array;
import java.util.Scanner;
public class BorderArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int n=scan.nextInt();
		//int m=scan.nextInt();
		int a[][]= new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
					a[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if((i==j))
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
