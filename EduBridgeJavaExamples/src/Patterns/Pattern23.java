package Patterns;
/*Print this pattern : 
 * 
 * 				*
 *             **
 *            * *
 *           *  *
 *            * *
 *             **
 *              *
 *            
 *            
 * */
public class Pattern23 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i<=row; i++) 
		{
			//print space in decreasing order
			for(int j = row; j > i; j--) 
			{
				System.out.print(" ");
			}
			
			//print star in increasing order
			for(int k = 1; k<=i; k++) 
			{
				if(k == 1 || k == i) 
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
		
		for(int i = 1; i<=row-1; i++) 
		{
			//print space in increasing order
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			//print star in decreasing order
			for(int k = row-1; k>=i; k--) 
			{
				if(k == row-1 || k == i)
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
