package Arrays;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {10,60,30,40,50};
		
		String maxproduct = maxproduct(nums);
		System.out.println(maxproduct);

	}
	
	public static String maxproduct(int[] nums ) {
		
		int maxproduct = 0 ;
		int firstnumber=0; 
		int secondnumber=0;
		
		for (int i =0; i< nums.length;i++) {
			
			for (int j=i+1;j< nums.length;j++) {
				
				if (maxproduct< nums[i]* nums[j]) {
					
					maxproduct = nums[i]*nums[j];
					firstnumber= nums[i];
					secondnumber= nums[j];
				}
			}
		}
		
		return ("the max of product is of "+  firstnumber +"*" + secondnumber);
	}

}
