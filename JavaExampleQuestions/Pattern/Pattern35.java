package Patterns;
/*Print this pattern : 
 * 
 * 			***
 *         *   *
 *         *   *
 *         *   *
 *          ***
 *         *   *
 *         *   *
 *         *   *
 *          ***
 * 
 * */
public class Pattern35 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row * 2-1; i++) 
		{
			if(i == 1 || i == row || i == row * 2-1) 
			{
				for(int j = 1; j<=row; j++) 
				{
					if(j == 1 || j == row ) 
					{
						System.out.print(" ");
					}
					else 
					{
						System.out.print("*");
					}
				}
			}
			else 
			{
				for(int k = 1; k<=row; k++) 
				{
					if(k == 1 || k == row ) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
