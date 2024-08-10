package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,Integer> m = new HashMap <>();
		
		int [] a = {12,56,9,1,4,7,56,7};
		
		for (int i = 0 ; i < a.length;i++) {
			
			Integer c =  m.get(a[i]);
			
			if(m.get(a[i])==null) {
				
				m.put(a[i], 1);
				
			}
			
			else {
				
				m.put(a[i], ++c);
			}
			
		}
		
		System.out.println(m);
		
		
		
	}

}
