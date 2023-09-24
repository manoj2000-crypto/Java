package AllLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int n,sum=0,rem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		while(n>0)
		{
			rem = n%10;
			sum = sum+rem;
			n = n/10;
		}

		System.out.println("Sum of digit is : " + sum);
	}

}
