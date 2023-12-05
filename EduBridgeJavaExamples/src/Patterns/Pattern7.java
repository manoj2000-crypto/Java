package Patterns;
// Diamond Star Pattern
/* Print this pattern :
 * 
 * 
 * 			*
 * 		   ***
 *        *****
 *       *******
 *        *****
 *         ***
 *          *
 * 
 * */
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		
		for(int i=1; i<=row; i++) 
		{
			// Print space in decreasing order
			for(int j=row; j>=i; j--) 
			{
				System.out.print(" ");
			}
			
			// Print star in increasing order
			for(int k=1; k<=(i * 2) -1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=row-1; i>=1; i--)
		{
			// Print space in increasing order
			for(int j=row; j>=i; j--) 
			{
				System.out.print(" ");
			}
			
			// Print star in decreasing order
			for(int k = 1; k<=(i * 2) -1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
