package Arrays;

import java.util.Arrays;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myarray = {1,2,2,3,3,4,5};
		int[] removeDuplicates = removeDuplicates(myarray);
		System.out.println(Arrays.toString(removeDuplicates));

	}

	
	public static int[] removeDuplicates(int [] arr) {
		
		
		int [] arr1 = new int [arr.length]  ;
		
		int index=0;
		
		 for(int i = 0; i<arr.length; i++) {
			 boolean isduplicate= false;
			 for (int j= i+1 ; j<arr.length;j++) {
				 
				 if (arr[j]==arr[i]) {
					 
					 isduplicate= true;
					 break;
					 
					 
				 }
				 
				 
				 
			 }
			 
			 if(!isduplicate) {
				 
				 arr1[index++]= arr[i];
				 
			 }
		 }
		 
		 return Arrays.copyOf(arr1, index);
		 
		 
		
	}
}
