package Patterns;
// Print this pattern : 

/*

*
#*
*#*
#*#*
*#*#*

*/

public class Pattern44 {

	public static void main(String[] args) {

		int temp;
		for (int i = 1; i <= 5; i++) {
			temp = i;
			for (int j = 1; j <= i; j++) {
				if (temp % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("# ");
				}
				temp++;
			}
			System.out.println();
		}

	}

}
