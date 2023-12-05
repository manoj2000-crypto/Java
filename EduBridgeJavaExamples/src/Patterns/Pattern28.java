package Patterns;
/*Print this pattern : 
 * 
 *            *
 *           * *
 *          *   *
 *         *     *
 *          *   *
 *           * *
 *            * 
 * 
 * */
public class Pattern28 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i<= row; i++)
		{
			for(int j = row; j>i; j--) 
			{
				System.out.print(" ");
			}
			
			for(int k=1; k <= (i*2) -1; k++) 
			{
				if(k == (i*2)-1 || k == 1) 
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
			for(int j = row-1; j>=i ; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++)
			{
				if(k == (i*2)-1 || k == 1) 
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
