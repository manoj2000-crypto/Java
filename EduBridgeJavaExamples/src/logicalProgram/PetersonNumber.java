package logicalProgram;

import java.util.Scanner;

public class PetersonNumber {
	
	public static int numberFactorial(int number) 
	{
		if(number <= 0)
			return 0;
		else if(number == 1)
			return 1;
		else
			return number * numberFactorial(number - 1);
	}
	
	public static boolean petersonNumber(int peterNumber) 
	{
		int originalNumber = peterNumber;
		int eachNumberSum = 0;
		int remainder = 1;
		
		while(peterNumber > 0)
		{
			remainder = (peterNumber % 10);
			eachNumberSum += numberFactorial(remainder);
			peterNumber /= 10;
		}
		
		if(originalNumber == eachNumberSum) 
		{
			return true;
		}
		
		return false;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		System.out.print("Enter Peterson number to check : ");
		
		if( petersonNumber( new Scanner(System.in).nextInt() ) ) 
		{
			System.out.println("Given number is Peterson number");
		}
		else 
		{
			System.out.println("Given number is not a Peterson number");
		}
	}

}
