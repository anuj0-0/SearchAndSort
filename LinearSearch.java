package ty.java;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a= {1,2,7,42,63,27,3,8,9,2};
		int x=7;
		for(int i=0;i<a.length-1;i++) {
			if(x==a[i]) {
				System.out.println(i);
			}
		}
	}

}
