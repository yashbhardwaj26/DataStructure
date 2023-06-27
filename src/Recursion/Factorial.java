package Recursion;

public class Factorial {
	
	static int test = 5;
	
	 
	 

	public static void main(String[] args) {
		
		int answer = factorial(test);
		System.out.println(answer);
		// TODO Auto-generated method stub

	}

	private static int factorial(int test2) {
		if(test2 ==1) {
		return 1;}
		else {
			return test2 * factorial(test2-1);
		}
		
		// TODO Auto-generated method stub
		
	}

}
