package ArrayList;

import java.util.ArrayList;

public class InsertionInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Number> l = new ArrayList<Number>();
		// this has time and space complexity as amortized O(1)
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		
		//Now when we use add (index, value) the space complexity remains amortized 1 but time 
		//complexity becomes O(n)
		l.add(1,4);
		System.out.println(l);
	}

}
