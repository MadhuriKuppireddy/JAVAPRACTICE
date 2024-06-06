package binary;
import java.util.*;
public class Binary_Solution {
	public static void main(String[] args) {
		int res = binarySearch();
		
		if(res == -1) {
			System.out.println("Target not found");
		}
		else {
			System.out.println("Target found at "+res);
		}
	}
	static int binarySearch() {
		System.out.println("Binary Search");
		Scanner scan = new Scanner (System.in);
		System.out.println("User! Please enter the size of an Array");
		int size = scan.nextInt();
		int a[]  = new int[size];
		System.out.println("User! Please enter Array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("User !Please enter the target element"+" to be searched");
		int target =scan.nextInt();	
		int low=0;
		int high = a.length-1;
		int mid = (low+high)/2;

		while(low<=high) {
			mid=(low+high)/2;
			
			if(target == a[mid]) {
				System.out.println("Element "+a[mid]+" Found at the index of 5"+mid);
				return mid;
			}
			else if(target > a[mid]) {
				low = mid+1;
			}
			else if (target < a[mid]){
				high=mid-1;
			}
		}
		return -1;
	}

}
