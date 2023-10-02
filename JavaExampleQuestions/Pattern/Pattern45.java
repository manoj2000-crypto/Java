package Patterns;
//Print this pattern :

/*

***********
****   ****
***     ***
**       **
*         *

*/

public class Pattern45 {

	public static void main(String[] args) {

		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				if (i == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int l = rows; l >= i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
