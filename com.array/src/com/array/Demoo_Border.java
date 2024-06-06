package com.array;

public class Demoo_Border {
	public static void main(String[] args) {
		int[][] a= {{12,14,14},{24,14,82},{49,81,91}};
		
		// rows
		int m = a.length-1;
		//columns
		int n= a[0].length-1;
		int i=0;
		for(int j=0;j<=m;j++) {
			System.out.print(a[i][j]+" ");
		}
		 int j=m;
		 for( i=1;i<=m;i++) {
			System.out.print(a[i][j]+" ");
		}
		if(m>1) {
			 i=m;
			for(j=m-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
		}
		if(n>1) {
			 j=0;
			for( i=m-1;i>=1;i--) {
				System.out.print(a[i][j]);
			}
		}
	}

}
