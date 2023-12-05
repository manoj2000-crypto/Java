package Patterns;

/*Print this pattern : 
 * 
 * 
 *		*####### 
 *      ######** 
 *      ***#####
 *      ####****
 *      ****####
 *      #####***
 *      **######
 *      #######*
 *      
 *      
*/

public class Pattern39 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 1; i <= rows / 2; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i % 2 == 0) {
					if (j <= (rows - i)) {
						System.out.print("#");
					} else {
						System.out.print("*");
					}
				} else {
					if (j <= i) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}
				}
			}
			System.out.println();
		}
		for (int i = rows / 2; i >= 1; i--) {
			for (int j = 1; j <= rows; j++) {
				if (i % 2 == 0) {
					if (j <= i) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}
				} else {
					if (j <= (rows - i)) {
						System.out.print("#");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

	}

}
