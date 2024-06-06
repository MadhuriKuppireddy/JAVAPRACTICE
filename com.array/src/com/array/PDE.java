package com.array;

public class PDE {
	public static void main(String[] args) {
		int[][] a= {{12,14,14},{24,14,82},{49,81,91}};

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(i+j==2) {
					System.out.println(a[i][j]+" ");
				}
				else if (i==j){
					System.out.println(a[i][j]+" ");
				}
			}
		}
	}
}
