package ty.java;

public class XVZ {
	public static void main(String[] args) {
		int[] a= {5,6,87,2,4,6,2,7,8,3,9};
		BubbleSort.sort(a);
//		for(int k:a) {
//			System.out.print(k+" ");
//		}
		int x=87;
		int low=0,high=a.length-1,mid;
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
