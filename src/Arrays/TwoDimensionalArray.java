package Arrays;

public class TwoDimensionalArray {

	int arr[][];

	public TwoDimensionalArray(int row, int column) {

		this.arr = new int[row][column];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = Integer.MIN_VALUE;
			}
		}

	}

	public void insertInArray(int rowIndex, int columnIndex, int value) {

		try {

			if (arr[rowIndex][columnIndex] == Integer.MIN_VALUE) {

				arr[rowIndex][columnIndex] = value;

			} else {
				System.out.println("This index is already occupied");
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Index provided is out of bound");
		}

	}

	public void accessElement(int row, int column) {

		System.out.println("Accesing row " + row + "and accessing column " + column);

		try {

			int value = arr[row][column];
			System.out.println("The value at given index is  " + value);

		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Index provided is out of bound");
		}
	}

	public void traverseElements() {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void searchElement(int value) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == value) {
					System.out.println(" the value is present at " + i + "row and " + j + "column");
					return;
				}

			}
		}

		System.out.println("the value is not found in arrya");

	}

	public void deleteElements(int row, int column) {

		try {

			System.out.println("Value deleted successfully " + arr[row][column]);
			arr[row][column] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" the given index is not found ");
		}
	}

}
