package Arrays;

import java.util.Arrays;

public class Execcise1 {
	
	

	public static void main (String [] args) {
		
		int [] ar = {1,2,3,4,5};
		int[] middle = middle(ar);
		System.out.println(Arrays.toString(middle));
	}
	
	
	public static int[] middle(int [] array){
	     
	     int[] temp = new int[(array.length-2)];
	     for(int i = 0; i <temp.length; i++){
	         
	        temp[i]= array[i+1];
	        
	     }
	     
	     return temp;
	 }

}
