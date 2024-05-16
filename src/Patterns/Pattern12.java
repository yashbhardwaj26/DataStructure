package Patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 5 ;
		int k = 1;
		for (int i = 1; i<=n ; i++) {
			
			for (int j = 1 ; j<= i ;j++) {
				
				System.out.print(k + " ");
				k=k+1;
			}
			
			
			System.out.println();
		}
	}

}
