package Patterns;
/*Print this pattern :
 * 
 * 			*****
 *         *****
 *        *****
 *       *****
 *      *****
 * */
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j = row-1; j>=i; j--) 
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
