package Recursion;

public class FactorialUsingparameter {
	
	public static void factorial(int i , int multiply) {
		
		if (i <= 1) {
			System.out.println(multiply);
			 return ;
		}
		
		factorial(i-1, multiply*i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		factorial(5,1);

	}

}
