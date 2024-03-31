package Arrays;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		
		int [] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		
		int[] findTopTwoScores = findTopTwoScores(myArray);
		System.out.println(Arrays.toString(findTopTwoScores));
		// TODO Auto-generated method stub

	}

	
	public static int[] findTopTwoScores(int[] array){
		
		int highest=0;
		int secondhighest= 0 ;
		
		 for (int i = 0; i < array.length; i++) {
			 
			 if (array[i]> highest) {
				 highest = array[i];
				 //System.out.println("the highest in loop is " + highest);
			 }
		 }
		 //System.out.println("the highest number is "+ highest);
		 for (int j=0; j < array.length;j++) {
			 
			 if (array[j]> secondhighest && array[j]<highest) {
				 
				 secondhighest=array[j];
			 }
		 }
		 int[] r = {highest , secondhighest};
		 return r;
	    // TODO
	  }
}
