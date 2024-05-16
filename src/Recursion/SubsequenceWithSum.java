package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		
		int [] a = { 1,2,3,4,5};
		
		int i = 0 ; 
		int n = a.length;
		int sum = 0 ;
		
		subsequenceWithSum(i,n,l,a, sum);

	}

	private static void subsequenceWithSum(int i, int n, List l, int[] a, int sum) {
		// TODO Auto-generated method stub
		
		if (i==n) {
			
			if(sum ==7) {
				
				System.out.println(l.toString());
				
			}
		return;
		}
		
		l.add(a[i]);
		sum+= a[i];
		subsequenceWithSum(i+1,n,l,a, sum);
		l.remove(l.size()-1);
		sum-=a[i];
		subsequenceWithSum(i+1,n,l,a, sum);
		
	}

}
