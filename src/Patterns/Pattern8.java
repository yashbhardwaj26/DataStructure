package Patterns;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}

			// star
			for (int j = 0; j < 2*n - 2*i - 1; j++) {
				System.out.print("*");
			}

			// space
			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}

			System.out.println();
		}

	}

}
