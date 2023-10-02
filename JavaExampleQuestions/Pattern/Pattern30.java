package Patterns;
/* Print this pattern : 
 * 
 * 	       * * * * *
 *          *     *
 *           *   *
 *            * *
 *             *
 *            * *
 *           *   *
 *          *     *
 *         * * * * *
 * 
 * 
 * */
public class Pattern30 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = row; i >= 1; i--) 
		{
			for(int j = 1; j <= row -i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2 * i -1; k++)
			{
				if(k == 1 || k == 2 * i -1 || i == row) 
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
		
		for(int i = 2; i<=row; i++) 
		{
			for(int j = 1; j <= row - i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k<=2 * i -1; k++)
			{
				if(k == 1 || k == 2*  i -1 || i == row)
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
