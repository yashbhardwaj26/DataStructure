package Recursion;

import java.util.ArrayList;
import java.util.List;

public class OnlyOnePairinSubsequenceWithParticularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List l = new ArrayList();
		int []a = { 1,2,3,4,5,6,7};
		
		int i = 0 ; 
		int n = a.length;
		int s = 0 ;
		
		
		onlyPair(i,n,l,s,a);
	}

	private static boolean onlyPair(int i, int n, List l, int s, int[] a) {
		// TODO Auto-generated method stub
		
		if (i ==n) {
			if(s==5) {
				System.out.println(l.toString());
				return true;
			}
			else return false ;
			
		}
		
		l.add(a[i]);
		s+=a[i];
		if(onlyPair(i+1,n,l,s,a)==true) return true;
		
		l.remove(l.size()-1);
		s-=a[i];
		if(onlyPair(i+1,n,l,s,a)==true) return true;
		
		return false;
			
	}

}
