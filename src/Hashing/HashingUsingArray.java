package Hashing;

public class HashingUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,5,12,7,9,5,12};
		
		int [] hash = new int[13];
		
		for (int i = 0; i< a.length;i++) {
			
			hash[a[i]]++;
		}
		
		for (int i : hash) {
			
			System.out.println(i);
		}
		
		
		//this has a limitation as inside main we can only use 10^6 size array and outside main we can use 10^7 size array

	}

}
