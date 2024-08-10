package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithUniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {1,1,2,2,2};
		int target = 4; 
		//Arrays.sort(a); - > mandatory step for this question
		
		int index = 0 ;
		
		List l = new ArrayList();
		subsequenceWithUniquepair(index, target, a,l);
		
		
	}

	private static void subsequenceWithUniquepair(int index, int target, int[] a, List l) {
		// TODO Auto-generated method stub
		
		if (target==0) {
			System.out.println(l.toString());
			return;
		}
		
		for (int i = index ; i < a.length;i++) {
			
			if(i > index && a[i]== a[i-1]) continue;
			if(a[i]> target) break ;
			
			l.add(a[i]);
			subsequenceWithUniquepair(i+1, target-a[i], a,l);
			l.remove(l.size()-1);
			
		}
		
	}

}
