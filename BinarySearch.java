package ty.java;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,9,8,5};
		Arrays.sort(a);
		int low=0,high=a.length-1,mid;
		int x=9;
		while(low<=high) {
			mid=(high+low)/2;
			if(a[mid]==x) {
				System.out.println(mid);
				break;
			}
			else if(x<a[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
	}

}
