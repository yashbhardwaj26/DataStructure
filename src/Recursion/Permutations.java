package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a  = { 1,2,3} ;
		
		boolean [] temp = new boolean [a.length];
		
		List l = new ArrayList();
		
		permutations(a , temp,l );
		
		
		
	}

	private static void permutations(int[] a, boolean[] temp, List l) {
		// TODO Auto-generated method stub
		
		if (l.size()==a.length) {
			
			System.out.println(l.toString());
			return;
		}
		
		for (int i = 0 ; i< a.length;i++) {
			
			if(! temp[i]) {
				
				temp[i] = true ;
				l.add(a[i]);
				permutations(a , temp,l );
				l.remove(l.size()-1);
				temp[i]= false;
			}
			
		}
	}

}
