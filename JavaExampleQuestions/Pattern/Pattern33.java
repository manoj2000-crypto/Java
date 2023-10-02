package Patterns;
/*Print this pattern : 
 * 
 * 			*   *
 *           * *
 *            *
 *           * *
 *          *   *
 *              
 * 
 * 
 * */
public class Pattern33 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i<=(row * 2 -1); i++) 
		{
			for(int j = 1; j<=row; j++) 
			{
				if(j == i || j == row - i+1) 
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
