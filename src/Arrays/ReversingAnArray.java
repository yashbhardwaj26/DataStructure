package Arrays;

import java.util.Arrays;

public class ReversingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] orig = {
				1,2,3,4,5
		};
		
		for (int i=0;i< orig.length/2;i++) {
			
			int other = orig.length-i-1;
			int temp = orig[i];
			orig[i]= orig[other];
			orig[other]=temp;
			
		}
		System.out.println(Arrays.toString(orig));
	}

}
