package Recursion;

public class FactorialUsingFunction {

	public static int factorial(int i ) {
		
		if (i ==1 ) {
			return 1;
		}
		 return i * factorial(i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial = factorial(3);
		System.out.println(factorial);

	}

}
