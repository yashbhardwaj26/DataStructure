package Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n = 7;
		
		//no of rows 
		for (int i=1; i< n ;i++) {
			
			//space
			for (int j = 1 ; j< n-i;j++) {
				System.out.print(" ");
			}
			
			//star
			
			for(int j = 1 ; j< 2*i;j++) {
				
				System.out.print("*");
				
			}
			
			//space 
			for (int j = 1 ; j< n-i;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
