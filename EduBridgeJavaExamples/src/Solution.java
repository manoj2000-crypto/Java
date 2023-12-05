import java.util.Scanner;
/* Print this series : 
 * 
 * We use the integers a, b, and n to create the following series:
 * 
 * (a + 2^0 * b) , (a + 2^0*b + 2^1*b) ... (a + 2^0*b+2^1*b +...+ 2^n-1*b)
 * You are given q queries in the form of a, b, and n. 
 *    For each query, print the series 
 *      corresponding to the given a, b, and n values 
 *      as a single line of n space-separated integers. 
 * 
 * constraints :
 * 0 <= q <= 500
 * 0 <= a,b <= 50
 * 1 <= n <= 15
 * 
 * */     

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a, b, n, sum;
        
        for(int i = 0; i < q; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            
            sum = a;
            
            for(int j = 0; j<n; j++) 
            {
            	sum = sum + ((int) Math.pow(2,j) * b);
            	System.out.print(sum + " ");
            }
            System.out.println();
        }
        sc.close();

	}

}
