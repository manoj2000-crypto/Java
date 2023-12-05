package Patterns;
/*Print this Pattern :
 *  
 *          *
 * 			**
 *          * *
 *          *  *
 *          *   *
 *          *  *
 *          * *
 *          **
 *          *
 * 
 * */
public class Pattern22 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++)
		{
			for(int j = 1; j <= i; j++) 
			{
				if(j == 1 || j == i) 
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
		
		for(int i = 1; i<=row-1; i++) 
		{
			//print star in decreasing order
			for(int j = row-1; j>=i; j--) 
			{
				if(j == row-1 || j == i || i == row) 
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
