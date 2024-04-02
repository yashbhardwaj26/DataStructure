package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DeletingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String > l = new ArrayList<String>(Arrays.asList("A", "B", "C","D","E"));
		
		l.remove(2);
		l.remove("E");
		System.out.println(l);
		
	}

}
