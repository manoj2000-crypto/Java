package Patterns;

/*Print this pattern : 
 * 
 * 
 *       _*_*_*_*
 *       __*_*_*_ 
 *       _*_*_*_* 
 *       __*_*_*_ 
 *       _*_*_*_*
 *       __*_*_*_
 *       
 *       
*/

public class Pattern38 {

	public static void main(String[] args) {
		
		for(int i=1; i<= 7; i++)
        {
            if(i%2 != 0)
            {
                for(int j=1; j<= 4; j++)
                {
                    System.out.print("_*");
                }
            }
            else
            {
            	System.out.print("_");
            	for(int j=1; j<= 3; j++)
                {
                    System.out.print("_*");
                }
            	System.out.print("_");
            }
            System.out.println("");
        }

	}

}
