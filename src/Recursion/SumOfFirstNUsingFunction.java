package Recursion;

public class SumOfFirstNUsingFunction {
	
	public static int sumNumbers(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+ sumNumbers(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumNumbers = sumNumbers(5);
		System.out.println(sumNumbers);

	}

}
