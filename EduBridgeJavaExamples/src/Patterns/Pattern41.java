package Patterns;
// Print this pattern : 

/*
 * 		_ _ _ _ * 
 *      _ _ _ ***
 *      _ _ *****
 *      _ *******
 *      *********
 *      *********
 *      *********
 *      *********
 *      *********
 *
 * */

public class Pattern41 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5-i; j >= 1; j--)
			{
				System.out.print("_ ");
			}
			for(int k=i*2-1; k>=1; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<5; i++)
		{
			for(int l=5*2-1; l>=1; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
