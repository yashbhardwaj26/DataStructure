package Arrays;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6};
		
		

}
	
	
	public boolean isUnique(int[] intArray) {
		
		boolean isUnique= true;
		for (int i =0;i<intArray.length;i++) {
			
			for (int j=i+1; j< intArray.length;j++) {
				
				if (intArray[i]==intArray[j]) {
					 isUnique= false;
					
				}
			}
		}
		
		return isUnique;
	}
	
}

	