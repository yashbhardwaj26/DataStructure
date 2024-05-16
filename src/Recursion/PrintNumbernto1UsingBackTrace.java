package Recursion;

public class PrintNumbernto1UsingBackTrace {

	public static void printNumbers(int i , int n ) {
		
		if (i > n) {
			return ;
		}
		printNumbers(i+1,n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers(1,5);
	}

}
