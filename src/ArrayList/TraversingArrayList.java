package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("yash");
		l.add("rupali");
		l.add("Sunil");
		l.add("Poonam");
		
		//first using for loop 
		
		for( int i = 0; i < l.size();i++) {
			
			String letter = l.get(i);
			System.out.println(letter);
		}
		
		// using for each loop 
		
		for(String name: l) {
			
			System.out.println(name);
		}
		
		// Using iterator
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			
			String letter = it.next();
			System.out.println(letter);
			}
		
		// the time complexity for this is O(n) and space complexity is O(1)

	}

}
