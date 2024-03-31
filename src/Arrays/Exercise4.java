package Arrays;

import java.util.Arrays;

public class Exercise4 {
	
public static void main(String[] args) {
		
		int [] myArray = {1,2,3,4,6,7};
		int missingNumber = missingNumber(myArray);
		System.out.println(missingNumber);
		
		

	}

public static int missingNumber(int [] arr) {
	
	int n = arr.length +1;
	 int sum = n*(n+1)/2;
	 //System.out.println(sum);
	 int sum2= 0; 
	 for (int i =0;i<arr.length;i++) {
		 
		 sum2+=arr[i];
		 
	 }
	 
	 //System.out.println(sum2);
	 int missing = sum-sum2;
	 return missing;
}

}
