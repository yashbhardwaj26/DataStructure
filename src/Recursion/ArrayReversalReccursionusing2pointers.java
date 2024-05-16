package Recursion;

public class ArrayReversalReccursionusing2pointers {
	
	
	public static void swap (int l , int r , int [] a) {
		
		if(l>= r) {
			return ;
		}
		int temp =0 ; 
		temp = a[l];
		a[l]= a[r];
		a[r]= temp ; 
		
		swap(l+1,r-1,a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {1,3,5,7,9};
		
		int l = 0 ; 
		int r = a.length-1;
		swap (l,r,a);
		
		for (int x : a) {
			System.out.println(x);
		}

	}

}
