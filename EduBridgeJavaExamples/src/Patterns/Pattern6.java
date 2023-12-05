package Patterns;
/*print this pattern : 
 * 
 * 		*********
 *       *******
 *        *****
 *         ***
 *          *
 * 
 * */
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		
		for(int i=row; i>=1; i--)
		{
			for(int k=1; k<=(i * 2) -1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			for(int j = row; j>=i; j--) 
			{
				System.out.print(" ");
			}
			
		}
		

	}

}
