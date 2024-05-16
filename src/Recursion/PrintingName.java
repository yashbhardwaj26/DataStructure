package Recursion;

import java.util.Scanner;

public class PrintingName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printName(1,n);
		
		// TODO Auto-generated method stub

	}
	
public static void printName(int i,int n) {
	
	if(i>n) {
		return;
	}
	
	System.out.println("Yash");
	
	printName(i+1,n);
}

}
