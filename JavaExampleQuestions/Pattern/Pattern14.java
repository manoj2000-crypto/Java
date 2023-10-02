package Patterns;
/*Print this pattern : 
 * 
 * 		*****
 *       ***
 *        *
 *       ***
 *      *****
 *       
 * 
 * */
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i =1; i<=row; i++)
		{
			for(int j = 1; j < i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int k = i; k<=row; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = row-1; i>=1; i--) 
		{
			for(int j = 1; j<i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int k = i; k<= row; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
