package Series;

import java.util.Scanner;
//1-2 + 3-4 + 5-6 ... n = ?
public class Series9 {

	public static void main(String[] args) {
		int sum = 0;
        int even = 2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=n; i++)
        {
            if(i%2 != 0)
            {
                sum = sum + (i - even);
                System.out.print(i + "-" + even);
                if(i < n)
                {
                    System.out.print(" + ");
                }
                even = even + 2;
            }
        }
        System.out.print(" = " + sum);
	}
}
