package Patterns;
/*Print this pattern :
 * 
 * 			* * *
 *           * *
 *          * * *
 *           * *
 *          * * *
 * 
 * */
public class Pattern36 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i<=row; i++) 
		{
			if(i%2 != 0) 
			{
				for(int j = 1; j <= row/2+1; j++) 
				{
					System.out.print("* ");
				}
			}
			else 
			{
				for(int j = 1; j <= row/2; j++) 
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}

	}

}
