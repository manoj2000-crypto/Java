package Patterns;
/* Print this pattern : 
 *   
 *          *****
 *           *   *
 *            *   *
 *             *   *
 *              *****
 * 
 * 
 * */
public class Pattern25 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) 
		{
			for(int j=1; j <= i-1; j++) 
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k<=row; k++) 
			{
				if(i == 1 || i == row || k == 1 || k == row) 
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
