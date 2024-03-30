package Arrays;

public class Execrice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sumDiagonalElements = sumDiagonalElements(arr);
		System.out.println(sumDiagonalElements);

	
}
	
	public static int sumDiagonalElements(int[][] array) {
		 
		int sum =0 ;
		int j = 0;
		for (int i = 0; i<array.length;i++) {
			
			sum+= array[i][j+1];
			
			
		}
		
		return sum;
		 
    }
}