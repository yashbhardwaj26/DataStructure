package Patterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 5 ; 
		int space  = 2*(n-1);
		
		for (int i = 1 ; i <=n ; i++) {
	
			//Number
			for (int j = 1 ; j<= i ;j++) {
				
				System.out.print(j);
			}
			
			//Space 
			
			for(int j= 1 ; j<=space;j++) {
				
				System.out.print(" ");
			}
			
			//Number
			 for (int j = i ; j>=1; j--) {
				 
				 System.out.print(j);
			 }
			 
			 System.out.println();
			 space-=2;
		}

	}

}
