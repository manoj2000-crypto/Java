package Series;

import java.util.Scanner;

// Print the given Series :  1 3 5 7 9 ....n
public class Series2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			if(i%2 == 0)
				continue;
			else
				System.out.print(i + " ");
		}
		
		sc.close();

	}

}
