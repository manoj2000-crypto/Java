package Series;
//1*2 + 2*3 + 3*4 + ... 15*16 = ?

import java.util.Scanner;

public class Series8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=n; i++)
		{
			sum = sum + (i*(i+1));
			System.out.print(i + "*" + (i+1));
			if(i<n)
				System.out.print(" + ");
		}
		System.out.print(" = " + sum);
		sc.close();

	}

}
