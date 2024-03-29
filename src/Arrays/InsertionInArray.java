package Arrays;

public class InsertionInArray {

	int[] intArr;

	public InsertionInArray(int size) {

		intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.MIN_VALUE;

		}
	}

	public void insertInarray(int index, int value) {
		try {
			if (intArr[index] == Integer.MIN_VALUE) {

				intArr[index] = value;
				System.out.println("Value inserted successfully");

			}

			else {

				System.out.println("Value already present at that index");
			}

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid index to access array");

		}

	}

	public void traversearray() {

		for (int i = 0; i < intArr.length; i++) {

			System.out.print(intArr[i] + " ");
		}
	}

	// Search an element in an Array

	public void searchAnElement(int value) {

		for (int i = 0; i < intArr.length; i++) {

			if (intArr[i] == value) {

				System.out.println("Value fouund at index " + i);

				return;
			}
		}

		System.out.println("Value not present in array");
	}
	
	
	// Delete an element from an array 
	
	
	public void deleteElement(int indexToBeDeleted) {
		
		try {
			
			intArr[indexToBeDeleted]= Integer.MIN_VALUE;
			
			System.out.println("Value deleted successfully");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("The value is not present in array");
		}
	}

}
