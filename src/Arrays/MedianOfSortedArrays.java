package Arrays;

public class MedianOfSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = {10,20,30,40,50};
		int [] brr1= {5,15,25,27,28,55,65,75,85};
		int m = arr1.length;
		int n = brr1.length;
		int begin1 = 0; 
		int end1 = n;
		
		while (begin1<= end1) {
			
			int num1 = (begin1+end1)/2;
			
			int num2 = (m+n+1)/2 - num1;
			
			int min1 = (num1==n)? Integer.MAX_VALUE : arr1[num1];
			
			int max1 = (num1==0)? Integer.MIN_VALUE: arr1[num1-1];
			
			int min2 = (num2==m)?Integer.MAX_VALUE : brr1[num2];
			
			int max2 = (num2==0)? Integer.MIN_VALUE : brr1[num2-1];
			
			if((max2<=min1)&& (max1<=min2)){
				
				if((n+m)%2==0) {
					
					 double double1=  ((Double.max(max1, max2)+ Double.min(min1, min2))/2);
					 System.out.println(double1);
				}
				
				else {
					
					double double2=  ((Double.max(max1, max2)));
					System.out.println(double2);
				}
			}
			else if(max1> min2) {
				end1= num1-1;
			}
			else {
				
				begin1= num1+1;
			}
			
			
			begin1++;
			
			
				
		}
		
		

}
}
