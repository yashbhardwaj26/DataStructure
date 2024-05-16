package Recursion;

import java.util.Scanner;

public class PrintN1 {
	
	public static void printNumbers(int i , int n) {
		if (i<1) {
			return ;
		}
		
		System.out.println(i);
		
		printNumbers(i-1,n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumbers(n,n);
		
		

	}

}
