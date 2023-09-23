package Series;

import java.util.Scanner;

//1/1! + 2/2! +  ... + n/n! = ?
public class Series10 {

	public static void main(String[] args) {
		double fact = 1, sum = 0, i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		double n = sc.nextDouble();
		sc.close();
		
		for(i = 1; i<=n ; i++)
		{
			for(j = 1; j<=i; j++)
			{
				fact = fact * j;
			}
			sum = sum + (i / fact);
			System.out.print((int)i + "/" + (int)i + "!");
			if(i<n)
			{
				System.out.print(" + ");
			}
			fact = 1;
		}
		String str = String.format(" = %.2f", sum);
		System.out.print(str);
	}

}
