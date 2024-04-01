package Arrays;

import java.util.Arrays;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int [] nums = {2,7,11,15};
			 
			 int[] returnIndeices = returnIndeices(18,nums);
			 System.out.println(Arrays.toString(returnIndeices));
	}

	
	public static int[] returnIndeices(int target, int [] nums) {
		 //int [] temp = new int[2];
		
		for (int i = 0; i< nums.length;i++) {
			for (int j = i+1;j<nums.length;j++) {
				
				if (target == nums[i]+ nums[j]) {
					
					return new int [] {i ,j};
			}
		}
		}
		 throw new IllegalArgumentException("No two sum solution found");
	}
	
}
		
		
		
	

