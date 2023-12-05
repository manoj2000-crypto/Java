package dailyQuestions;

import java.util.Scanner;

// WAP for factors of number and count the number of factors.
public class Question4 {
	
	public static String findFactors(int number) 
	{
		int countFactors = 2;
		
		String numberFactors = "1 ";
		
		for(int counterNumber = 2; counterNumber<=(number/2); counterNumber++)
		{
			if(number % counterNumber == 0)
			{
				countFactors++;
				numberFactors += counterNumber + " ";
			}
		}
		numberFactors += number;
		System.out.println("No of Factors are : " + countFactors);
		return numberFactors; 
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Enter number to find factors : ");
		System.out.print("Factors : " + Question4.findFactors(new Scanner(System.in).nextInt()));
		
	}

}
