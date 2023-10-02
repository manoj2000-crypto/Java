package Patterns;
/*Print this pattern :
 * 
 * 			 *****
 *           *  *
 *           * *
 *           **
 *           *
 * */ //Need to compete...
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i = 1; i<= row; i++)
		{
			for(int j=row; j>=i; j--)
			{
				if(i==1 || j==i || j == row)
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
