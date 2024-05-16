package Recursion;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printNumber(1,7);
	}

	public static void printNumber(int i , int n ) {
		
		if (i> n) {
			return ;
		}
		
		System.out.println(i);
		
		printNumber(i+1,n);
	}
}
