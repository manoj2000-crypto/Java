package Patterns;
/*Print this pattern : 
 * 
 * 			*
 *         * *
 *        *   *
 *       *     *
 *        *   *
 *         * *
 *          *
 * 
 * */
public class Pattern21 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) 
		{
			//print space in decreasing order.
			for(int j = row; j>i; j--)
			{
				System.out.print(" ");
			}
			
			// print star in increasing order.
			for(int k=1; k<= (i * 2) -1; k++)
			{
				if(k == 1 || k == (i * 2) - 1) 
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
		
		for(int i = row-1; i>=1; i--) 
		{
			//print space in increasing order
			for(int j = row-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			//print star in decreasing order
			for(int k = 1; k<=(i*2)-1; k++)
			{
				if(k == 1 || k == (i * 2) -1)
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
