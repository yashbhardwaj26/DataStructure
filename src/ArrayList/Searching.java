package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l = new ArrayList<String> (Arrays.asList("A","B","C","D","E"));
		
		for(String a: l) {
			
			if(a.equals("E")) {
				
				System.out.println("Element found in arrayList");
			}
		}
		
		int index = l.indexOf("E");
		if(index != -1) {
			
			System.out.println("Element found in ArrayList");
		}
		
	}

}
