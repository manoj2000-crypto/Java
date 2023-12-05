package Patterns;
/*Print this pattern : 
 * 
 * 		*****
 *       *****
 *        *****
 *         *****
 *          *****
 * */
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i = 1; i<=row; i++) 
		{
			for(int j = 1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=row; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
