package Recursion;

public class Fibonacci {
	
	 static int test1 = 7;
	
	public static void main(String [] args) {
		
		int fib = fibonac(test1);
		
		System.out.println(fib);
		
	}
	
public static int fibonac (int test) {
	
		
		
		if (test==0 || test == 1) {
			
			return test;
		}
		
		
		
		return (fibonac(test-1) + fibonac(test-2));
	}

}
