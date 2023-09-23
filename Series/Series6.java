package Series;

import java.util.Scanner;

// 1/1 + 2/2 + 3/3 +...+ n/n = ?
public class Series6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		double n = sc.nextDouble();
		double sum = 0;
		for(double i = 1; i<=n; i++)
		{
			sum = sum + (i/i);
			System.out.print((int)i + "/" + (int)i);
			if(i<n)
				System.out.print(" + ");
		}
		String str = String.format(" = %.2f", sum);
		System.out.print(str);
		
		sc.close();

	}

}
