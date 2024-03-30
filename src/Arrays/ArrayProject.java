package Arrays;

import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days : ");
		int numberOfDays= sc.nextInt();
		int [] temps = new int [numberOfDays];
		int sum= 0;
		 for(int i = 0; i< numberOfDays; i++) {
			 
			 System.out.println("Enter the temp for day " + (i+1) + " ");
			 
			 temps[i]= sc.nextInt();
			 sum+=temps[i];
			 
		 }
		
		 int average = sum/numberOfDays;
		 
		 System.out.println("the average temperature is :" + average);
         int above = 0 ;
		 for(int i = 0; i< temps.length;i++) {
			 
			 if( temps[i]> average) {
				 above++;
			 }
			 
			 
		 }
		 
		 System.out.println("the days having more the average temps are : " + above);
		

	}

}
