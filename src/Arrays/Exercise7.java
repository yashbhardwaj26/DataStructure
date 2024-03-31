package Arrays;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] prices = {7, 1, 5, 3, 6, 4};
		 int maxProfit = maxProfit(prices);
		 System.out.println(maxProfit);

	}
	
	public static int maxProfit(int [] myArr) {
		
		int maxprofit = 0 ;
		int highest=0;
		//int profir=0;
		for (int i = 0 ; i< myArr.length; i++) {
			
			for (int j = i+1;  j< myArr.length; j++) {
				
				highest = myArr[j]- myArr[i];
				if (highest>maxprofit) {
					
					maxprofit = highest;
					
				}
			}
		}
		if(maxprofit==0) {
			return 0;
		}
		else{
			return maxprofit;
		}
	}
	

}
