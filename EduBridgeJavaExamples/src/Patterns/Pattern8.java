package Patterns;
/*Print this pattern :
 * 
 * 		*
 *      **
 *      ***
 *      ****
 *      ***
 *      **
 *      *
 * 
 * */
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		
		for(int i=1; i<=row; i++) 
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=row-1; i++) 
		{
			// Print star in decreasing order 
			for(int j=row-1; j>=i; j--) 
			{
				System.out.print("*");
			}
			
			// Print space in increasing order
			for(int k =1; k<i; k++) 
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
