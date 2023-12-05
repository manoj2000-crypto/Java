package Patterns;
/*Print this pattern : 
 * 
 * 			*********
 *           *     *
 *            *   *
 *             * *
 *              *
 * 
 * */
public class Pattern20 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = row; i>=1; i--) 
		{
			//print star in decreasing order
			for(int j =1;j<=(i * 2) -1; j++)
			{
				if(j == 1 || j ==(i * 2) -1 || i == row) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			//print space in decreasing order
			for(int k = row; k>=i; k--)
			{
				System.out.print(" ");
			}
		}
		
	}

}
