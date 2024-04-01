package Arrays;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {1,2,3,4,5,6};
		
	}
	
	public int searchInArray(int [] nums , int value ) {
		int index=0;
		for (int i =0 ; i< nums.length; i++) {
			
			if (nums[i]== value) {
				
				index=i ;
				
			}
			
			
			
		
	}

		return index;
}
}
