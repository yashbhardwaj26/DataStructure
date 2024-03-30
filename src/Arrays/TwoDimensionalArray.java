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

}
