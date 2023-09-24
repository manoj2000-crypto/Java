package AllLoops;

import java.util.Scanner;

public class ReverseOfDigit {

	public static void main(String[] args) {
		
		int n,rem=0,sum=0;
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(n>0)
		{
			rem = n%10;
			sum = rem+(sum*10);
			n = n/10;
		}
		
		System.out.println("Number is : " + sum);

		sc.close();
	}

}
