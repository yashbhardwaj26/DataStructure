package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumIncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {3,1,2};
		int sum = 0 ;
		int i =0; int n = a.length;
		List b= new ArrayList();
		
		subsetSum( i ,  n ,  a, sum,b);
		
	}

	private static void subsetSum(int i, int n, int[] a, int sum,List b) {
		// TODO Auto-generated method stub
		
		if(i==n) {
			
			b.add(sum);
			Collections.sort(b);
			System.out.println(b.toString());
			return;
			
		}
		
		subsetSum( i+1 ,  n ,  a, sum+a[i],b);
		subsetSum( i+1 ,  n ,  a, sum,b);
	}

}
