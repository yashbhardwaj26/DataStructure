package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		int [] a = { 3,1,2,4,7,5,8,6,5};
		
		int low = 0 ;
		int high = a.length-1;
		
		
		merge(low,high,a);
		
		
		

}

	private static void merge(int low, int high, int[] a ) {
		// TODO Auto-generated method stub
		
		
		if(low==high) {
			return;
			
		}
     
	int mid = (low+high)/2;
//	System.out.println("low is"+ low);
//	System.out.println("high is"+ high);
//	System.out.println("mid is "+ mid);
	merge(low,mid,a);
	merge(mid+1,high,a);
	
	arrayMerge(low,mid,high,a);
		
		
	}

	private static void arrayMerge(int low, int mid, int high, int [] a) {
		// TODO Auto-generated method stub
		
		int left = low ;
		int right = mid+1;
		List l = new ArrayList();
//		System.out.println("inside array merge low is  "+ low);
//		System.out.println("inside array merge mid is  "+ mid);
//		System.out.println("inside array merge high is  "+ high);
	
		
		
		
		while(left<=mid && right <= high) {
			//System.out.println("inside while  a[l] is " + a[left] + " and a[r] is " + a[right]);
			if (a[left]<=a[right]) {
				//System.out.println("inside is a[l] is " + a[left] + " and a[r] is " + a[right]);
				l.add(a[left]);
				left++;
				//System.out.println("List content in left side are "+ l.toString());
				
				
			}
			else {
				l.add(a[right]);
				right++;
				//System.out.println("List content in right side are "+ l.toString());
				
			}
		}
		
		while(left<=mid) {
			l.add(a[left]);
			left++;
			
		}
		
		while (right<= high) {
			l.add(a[right]);
			right++;
			
		}
		
		//System.out.println("the list rn is " + l.toString());
		
		for(int j =low ;j<=high;j++){
			
		      a[j] = (int) l.get(j-low);
		    }
		//System.out.println(l.toString());
		System.out.println(l.toString());
	}
	
}
