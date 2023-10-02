package Patterns;
/*
 * Print this pattern : 
 * 
 * 			****
 *          ***
 *          **
 *          *
 *          **
 *          ***
 *          ****
 * */
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i = row; i>=1; i--)
		{
			for(int j = i; j>= 1; j--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 2; i<=row; i++) 
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
