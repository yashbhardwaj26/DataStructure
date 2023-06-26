package Recursion;

public class SumofArray {
	
	

	static int[] test = {1,3,5,7,9,8};
	
	public static void main (String [] args) {
	
	int sum = sumOfDigits(test.length -1);
	System.out.println(sum);
	
	}

	private static  int sumOfDigits(int i) {
		// TODO Auto-generated method stub
		if (i==0)
			return test[0];
		
		return test[i] + sumOfDigits(i-1);
	}
}
