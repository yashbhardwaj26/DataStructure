package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithoutDatastructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3};
		
		List l = new ArrayList();
		
		
		permutations(0,a,l);
		

	}

	private static void permutations(int index, int[] a, List l) {
		// TODO Auto-generated method stub
		
		
		if (index==a.length) {
			
			for(int i = 0 ;i< a.length;i++) {
				
				l.add(a[i]);
			}
			
			System.out.println(l.toString());
			
		}
		for (int i = index ; i< a.length;i++) {
			
			swap(i, index,a);
			permutations(index+1,a,l);
			swap(i,index,a);
			
			
			
		}
		
	}

	private static void swap(int i, int index, int[] a) {
		// TODO Auto-generated method stub
		
		int temp = 0 ;
		temp = a[index];
		a[index]= a[i];
		a[i]= temp;
		
	}

}
