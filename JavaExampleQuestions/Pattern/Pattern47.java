package Patterns;

import java.util.Scanner;

// print this pattern : 

/*
 * 			**************
 *          *            *
 *          *            *
 *          * given word *
 *          *            *
 *          *            *
 *          **************
 * 
 * 
 * */


public class Pattern47 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency

		printStarPattern(word);

	}

	public static void printStarPattern(String word) {
		int wordLength = word.length();
		int totalWidth = 11 + wordLength * 2; // Width of each line in the pattern

		// Print the top line of stars
		printStars(totalWidth);

		// Print the pattern based on the word
		for (int i = 0; i < 5; i++) {
			System.out.print('*');
			if (i == 2) {
				// Print the word centered in the pattern
				int spacesBefore = (totalWidth - 2 - wordLength) / 2;
				int spacesAfter = totalWidth - 2 - wordLength - spacesBefore;
				printSpaces(spacesBefore);
				System.out.print(word);
				printSpaces(spacesAfter);
			} else {
				printSpaces(totalWidth - 2);
			}
			System.out.println('*');
		}

		// Print the bottom line of stars
		printStars(totalWidth);
	}

	public static void printStars(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print('*');
		}
		System.out.println();
	}

	public static void printSpaces(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(' ');
		}
	}

}
