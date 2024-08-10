package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithNoRepeatedValues {
	
	public static void main ( String [] args) {
	 
	 int [] a = {1,2,2};
	 
	 int index = 0 ;
	 int n = a.length;
	 List l = new ArrayList();
	 
	 subset(index,n,a,l);
	 
 }

	private static void subset(int index, int n, int[] a, List l) {
		
	
			
			
		
	  for (int j = index ; j <n;j++) {
		  
		  if(j!= index && a[j]==a[j-1]) continue;
		  l.add(a[j]);
		  subset(j+1,n,a,l);
		  l.remove(l.size()-1);
		
	  }
	  
	  System.out.println(l.toString());
	  
		
		
		
		
	}

}
