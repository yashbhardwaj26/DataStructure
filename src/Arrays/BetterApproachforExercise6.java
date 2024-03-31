package Arrays;

public class BetterApproachforExercise6 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,2};
		// TODO Auto-generated method stub

	}
	
	public static int newlength(int [] nums ) {
		
		
		if (nums.length==0) {
			return 0;
		}
		
		int i =0 ;
		
		for (int j =1  ;i< nums.length; i++) {
			
			if(nums[j]!= nums[i]) {
				
				i++;
				nums[i]= nums[j];
			}
		}
		
		return i;
	}
	

}
