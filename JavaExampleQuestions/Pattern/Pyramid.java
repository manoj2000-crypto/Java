package Patterns;
/* Print this pattern : 
 * 
 * 		*
 *     ***
 *    *****
 *   *******
 *  *********
 *  
 * */


public class Pyramid {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		
		for(int i=1; i<=row; i++) 
		{
			//print space in decreasing order
			for(int j=row; j>i; j--)
			{
				System.out.print(" ");
			}
			
			//print space in increasing order
			for(int k=1; k<=(i * 2) -1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
