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

			System.out.print(intArr[i]+ " ");
		}
	}

}
