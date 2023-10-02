package Patterns;
//Print this pattern : 

/*

*_*_*_*_*_*_*_*
*_*_*_*_*_*_*
*_*_*_*_*_*
*_*_*_*_*
*_*_*_*
*_*_*
*_*
*

*/



public class Pattern43 {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=1; i<=row; i++)
        {
            for(int j=1; j<=row-i+1; j++)
            {
                if(j == 1)
                    System.out.print("*");
                else
                    System.out.print("_*");
            }
            System.out.println();
        }

	}

}
