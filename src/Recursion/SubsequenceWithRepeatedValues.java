package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithRepeatedValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = { 1,2,5,7,4};
		
		List l = new ArrayList();
		
		int i = 0 ; 
		int n = a.length;
		int target=7;
		
		sub(i,n,l,a, target);
		

}

	private static void sub(int i, int n, List l, int[] a, int target) {
		// TODO Auto-generated method stub
		
		if (i ==n) {
			
			if(target==0) {
				System.out.println(l.toString());
				
			}
		return;
		}
		if(a[i]<= target) {
		l.add(a[i]);
		//target-=a[i];
		 
		sub(i,n,l,a, target-a[i]);
		
	
        l.remove(l.size()-1);
		
		
		//target+=a[i];
		}
		sub(i+1,n,l,a, target);
		
		
	}
}