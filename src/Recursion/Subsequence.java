package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

	
	public static void subsequence(int index, int n, List l , int [] a) {
		
		if (index == n) {
			System.out.println(l.toString());
			return;
			}
		
		l.add(a[index]);
		subsequence(index+1,n,l,a);
		
		l.remove(l.size()-1);
		
		subsequence(index+1,n,l,a);
		
		
		
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {3,1,2};
		
		List l = new ArrayList();
		
		int n = a.length;
		//System.out.println(n);
		int index = 0;
		
		subsequence(index,n,l,a);
		

	}

}
