package Recursion;

public class ArrayreversalUsingRecursion {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] a = {1,2,3,4,5};
	
	swapArray(0,a.length,a);
	
	for(int x : a) {
		System.out.println(x);
	}
		
	
		
	}

	private static void swapArray(int i, int length, int[] a) {
		// TODO Auto-generated method stub
		
		if (i>= length/2) {
					return ;
			}
		
		int temp = 0 ;
		temp= a[i];
		a[i]= a[length-i-1];
		a[length-i-1]= temp;
		
		swapArray(i+1,length,a);
		}
		
	}


