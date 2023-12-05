package Patterns;
/* print this pattern : 
 * 
 * 		****
 * 		 ***
 * 	      **
 *         *
 * */
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i =1; i<=row; i++) 
		{
			//print space in increasing order
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			
			//print star in decreasing order
			for(int k=row; k>=i; k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
