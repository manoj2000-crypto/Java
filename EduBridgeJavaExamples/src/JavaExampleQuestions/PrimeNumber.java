package JavaExampleQuestions;

import java.util.Scanner;

public class PrimeNumber {

	private static boolean prime(int n) 
	{	
		if(n <= 1)
			return false;
		
		for(int i = 2; i<n; i++) 
		{
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check prime or not : ");
		int n = sc.nextInt();
		
		if(PrimeNumber.prime(n))
			System.out.println("Number is prime number.");
		else
			System.out.println("Number is not a prime Number.");
		
		sc.close();
	}

}
