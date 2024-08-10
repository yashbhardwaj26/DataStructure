package Recursion;

public class CountOfSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {1,3,5,7,2};
		int i =0;
		int n = a.length;
		int s= 0 ;
		int countSubsequence = countSubsequence(i,n,s,a);
		System.out.println(countSubsequence);
	}

	private static int countSubsequence(int i, int n, int s, int[] a) {
		// TODO Auto-generated method stub
		
		if (i==n) {
			if(s==9) {
				return 1;
			}
			else return 0 ;
		}
		
		
		s+=a[i];
		
		int l = countSubsequence(i+1,n,s,a);
		s-=a[i];
		
		int r = countSubsequence(i+1,n,s,a);
		
		return l+r;
		
	}

}
