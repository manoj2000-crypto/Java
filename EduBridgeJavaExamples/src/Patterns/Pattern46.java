package Patterns;

import java.util.Scanner;
//Print this pattern : 

/*

given n=3 for example:
 	**1
 	*23
	456

or given n=4
 	***1
 	**23
 	*456
	78910

*/


public class Pattern46 {

	public static void main(String[] args) {

		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);
		// Get the number of rows from the user
		System.out.print("Enter the row number : ");
		int rows = scanner.nextInt();
		int temp = 1;
		System.out.println("Printing the pattern : ");
		for (int i = 1; i <= rows; i++) {

			for (int j = rows; j > i; j--) {
				System.out.print("* ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(temp + " ");
				temp++;
			}

			System.out.println();
		}
		scanner.close();
	}

}
