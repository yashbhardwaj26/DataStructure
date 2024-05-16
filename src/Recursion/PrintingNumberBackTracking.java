package Recursion;

public class PrintingNumberBackTracking {
	
	public static void printNumber(int i , int n) {
		
		if(i<1) {
			
			return ;
		}
		
		printNumber(i-1,n);
		
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		printNumber(5,5);

	}

}
