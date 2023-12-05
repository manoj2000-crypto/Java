package Patterns;
/*Print this pattern : 
 * 
 * 			*
 *         **
 *        * *
 *       *  *
 *      *****
 *      
 * */
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=row; j>i; j--) 
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				if(k==1 || k==i || i==row)
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
