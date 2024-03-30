package Arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		InsertionInArray intArray = new InsertionInArray(5);
		
		TwoDimensionalArray array2 = new TwoDimensionalArray(3, 2);
		
		array2.insertInArray(0, 0, 10);
		array2.insertInArray(1, 1, 30);
		System.out.println(Arrays.deepToString(array2.arr));
		
		//intArray.insertInarray(1, 10);
		//intArray.insertInarray(2, 20);
		//intArray.insertInarray(1, 10);
		//intArray.insertInarray(6,60);
		// TODO Auto-generated method stub
		
		// traverse an array 
		
		//intArray.traversearray();
		
		//intArray.searchAnElement(40);
		
		//intArray.deleteElement(2);

		
//		int arr1[][] = {{1,2},{3,5},{1,3}};
//		
//		System.out.println(arr1[0].length);
		
		
	}
}
