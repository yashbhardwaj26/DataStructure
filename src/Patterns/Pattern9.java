package Patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5 ;// where the symmetry changes 
		
		for (int i =1 ; i < 2*n- 1; i ++ ) {
			
			int stars = i ; 
			 if (i >n ) {
				 stars = 2*n-i;
			 }
			
			
			for (int j = 1 ; j < stars ; j++ ) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
				
		

	}

}
