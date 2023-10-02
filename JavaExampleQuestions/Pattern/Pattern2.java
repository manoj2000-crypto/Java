package Patterns;
/*
 * print this pattern : 
 * 
 * 			*
 * 		   **
 * 		  ***
 *       ****
 * */
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		
		for(int i=1; i<=row; i++) 
		{
			//print spaces in decreasing order
			for(int j=row; j>i; j--) 
			{
				System.out.print(" ");
			}
			
			//print star in increasing order
			for(int k=1; k<=i; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
