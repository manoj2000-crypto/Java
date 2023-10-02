package Patterns;
/*Print this pattern : 
 * 
 * 			*****
 *           *  *
 *            * *
 *             **
 *              * 
 *              
 * */
public class Pattern18 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i =1;i<=row; i++)
		{
			//print space in increasing order.
			for(int j =1; j<i; j++) 
			{
				System.out.print(" ");
			}
			
			//print star in decreasing order.
			for(int k=row; k>=i; k--) 
			{
				if(i == 1 || k == i || k == row) 
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
