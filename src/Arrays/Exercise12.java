package Arrays;

import java.util.Arrays;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr1 [] = {1,2,3,4,5};
		int arr2[] = {5,3,6,1,4};
		boolean checkPermutation = checkPermutation(arr1,arr2);
		
		System.out.println(checkPermutation);
}
	
	public static boolean checkPermutation(int arr1[], int arr2[]) {
		
		if (arr1.length!=arr2.length) {
			return false;
		}
		 
		int sum1 =0;
		int sum2=0;
		int mul1=0;
		int mul2=0;
		
		for (int i =0;i<arr1.length;i++) {
			
			sum1+=arr1[i];
			sum2+=arr2[i];
			mul1*=arr1[i];
			mul2*=arr2[i];
			
		}
		
		if (sum1==sum2&&mul1==mul2) {
			return true;
		}
		
		return false;
	}
	
}