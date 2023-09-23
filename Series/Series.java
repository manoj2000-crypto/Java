package Series;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		double n = sc.nextInt();
		System.out.println();
		
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			sum = sum + (1/i);
			System.out.print("1/" + (int)i);
			if(i<n)
				System.out.print(" + ");
		}
		String str = String.format(" = %.2f", sum);
		System.out.print(str);

		sc.close();
	}

}
