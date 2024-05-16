package Recursion;

public class PallindromeString {
 
	public static boolean checkPallindrome(int l , int r , String x) {
		
		if(l>=r) {
			return true;
		}
		if(x.charAt(l)==x.charAt(r)) {
			checkPallindrome(l+1,r-1,x);
			return true;
			
			
		}
		else {
			return false;
		}
		
		
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String x = "aba";
		int l = 0 ; 
		int r = x.length()-1;
		
		boolean checkPallindrome = checkPallindrome(l,r,x);
		System.out.println(checkPallindrome);
	}
	

}
