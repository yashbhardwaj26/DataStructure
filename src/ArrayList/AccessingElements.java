package ArrayList;

import java.util.ArrayList;

public class AccessingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Number> l = new ArrayList<Number>();
		l.add(1);
		l.add(2);
		l.add(3);
		// the time and space complexity for this is O(1)
		System.out.println(l.get(2));
		
	}

}
