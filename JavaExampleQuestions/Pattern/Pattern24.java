package Patterns;
/* Print this pattern :
 * 
 * 				*****
 *             *   *
 *            *   *
 *           *   *
 *          *****
 * 
 * 
 * */
public class Pattern24 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i<=row; i++) 
		{
			for(int j = row; j >= i; j--) 
			{
				System.out.print(" ");
			}
			
			// Print star in decreasing order
			for(int k =1; k<=row; k++)
			{
				if(i == 1 || i == row || k == 1 || k == row)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
