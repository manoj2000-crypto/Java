package Patterns;

/* Print this pattern : 
 * 				
 * 	
 * 				* * * * *
 *              * *   * *
 *              *       *
 *              * *   * * 
 *              * * * * *
 * 
 * */

public class Pattern40 {

	public static void main(String[] args) {
		
		int rows = 10;
        int space = rows / 2;
        
        //Upper Half
        
        for(int i= 1; i<=rows; i++)
        {
            // Five Spaces
            for(int m=1; m<=5; m++)
            {
                System.out.print(" ");
            }
            //Left Triangle
            for(int j=rows; j>=i; j--)
            {
                System.out.print("* ");
            }
            
            // Space in the middle
            if(i!=1)
            {
                for(int l=1; l<=space; l++)
                {
                    System.out.print(" ");
                }
                space = space + 4;
            }
            
            //Right Triangle
            if(i==1)
            {
                for(int k=rows-1; k>=i; k--)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int k=rows; k>=i; k--)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        //Lower Half
        
        space = space - 4;
        for(int i= 2; i<=rows; i++)
        {
            // Five Spaces
            for(int m=1; m<=5; m++)
            {
                System.out.print(" ");
            }
            
            //Left Triangle
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            
            // Space in the middle
            space = space - 4;
            for(int l=space; l>=1; l--)
            {
                System.out.print(" ");
            }

            //Right Triangle
            if(i==rows)
            {
                for(int k=1; k<=i-1; k++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int k=1; k<=i; k++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

	}

} 
