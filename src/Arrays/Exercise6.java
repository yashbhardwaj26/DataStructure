package Arrays;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,1,2};

	}
	
	
	public static int removeDuplicates(int [] arr1) {
		
		int length = arr1.length;
		int newlenght = 0;
		
		for (int i = 0; i< arr1.length;i++) {
			
			for (int j= i+1; j< arr1.length;j++) {
				
				if (arr1[j]==arr1[i]) {
					newlenght ++;
				}
			}
		}
		
		return length-newlenght;
	}

}
