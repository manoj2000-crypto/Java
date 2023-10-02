package Patterns;

/* Print this pattern : 
 * 
 *         **(2*)
 *         *
 *         ****(4*)
 *         *
 *         ********(8*)
 *         *
 *         ****************(16*)
 *         
*/

public class Pattern37 {

	public static void main(String[] args) {
		
		int counter = 1;
		int row = 7;
		
        for(int i=1; i<= row; i++)
        {
            if(i%2 != 0)
            {
                for(int j=1; j<= Math.pow(2, counter); j++)
                {
                    System.out.print("* ");
                }
                counter++;
            }
            else
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}