package com.array;

import java.util.Scanner;

public class Sum_Of_N_Matrix {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter no of Rows:");
		int n=scan.nextInt();
		System.out.println("Enter no of cols:");
		int m= scan.nextInt();
		int a[][] = new int [n][m];
		int b[][] = new int [n][m];
		int sum[][] = new int [n][m];
		
		//Read Matrix-1
		System.out.println("Enter the elemrnts of Matrix-1");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		//Read Matrix-2
			System.out.println("Enter the elemrnts of Matrix-2");
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[i].length;j++) {
					b[i][j]=scan.nextInt();
				}
			}
			//Finding sum	
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					sum[i][j] = a[i][j] + b[i][j];
				}
			}
			//Display sum	
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.println(sum[i][j]+" ");
				}
			}
			System.out.println();
	 }

}
