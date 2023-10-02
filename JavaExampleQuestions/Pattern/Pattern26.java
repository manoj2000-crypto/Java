package Patterns;
/* Print this pattern : 
 * 
 *               *        *
 *               **      **
 *               ***    ***
 *               ****  ****
 *               **********
 *               ****  ****
 *               ***    ***
 *               **      **
 *               *        *
 * 
 * 
 * */
public class Pattern26 {

	public static void main(String[] args) {

		int row = 5;
		
		for(int i = 1 ; i<=row ; i++) 
		{
			for(int j = 1; j<=i; j++) 
			{
				System.out.print("*");
			}
			for(int k = i*2; k<=row*2-1;k++)
			{
				System.out.print(" ");
			}
			for(int m = 1; m<=i; m++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= row-1; i++) 
		{
			for(int j = row -1; j>=i; j--) 
			{
				System.out.print("*");
			}
			for(int k = 1; k<=i*2; k++) 
			{
				System.out.print(" ");
			}
			for(int m = row-1; m>=i; m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
