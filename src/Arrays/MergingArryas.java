package Arrays;

import java.util.Arrays;

public class MergingArryas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = { 1,2,3,4,5};
		int [] b= {7,8,9};
		
		int length = a.length + b.length;
		
		int [] merged = new int [length];
		
		int pos =0 ;
		
		for ( int x : a) {
			
			merged[pos] = x;
			pos++;
			
		}
		
		for (int y :b) {
			
			merged[pos]= y;
			pos ++;
		}
		
		System.out.println(Arrays.toString(merged));

	}

}
