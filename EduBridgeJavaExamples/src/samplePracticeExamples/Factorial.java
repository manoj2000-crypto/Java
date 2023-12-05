package samplePracticeExamples;

import java.util.Scanner;

public class Factorial {

	private int f = 0;
	
	public int accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		f = sc.nextInt();
		sc.close();
		return f;
	}
	
	private int findFactorial(int factNo) 
	{
		int fact = 1;
		
		for(int i = 1; i <= factNo; i++) 
		{
			fact = (fact * i);
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		System.out.println("Factorial is : "+ fact.findFactorial( fact.accept() ) );
	}

}
