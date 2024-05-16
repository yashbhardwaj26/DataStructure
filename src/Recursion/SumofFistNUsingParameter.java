package Recursion;

public class SumofFistNUsingParameter {

	public static void printSum(int i , int sum ) {
		
		if (i <1) {
			System.out.println(sum);
			return ; 
		}
		printSum(i-1, sum+i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSum(5,0);
	}

}
