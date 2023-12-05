package dailyQuestions;

import java.util.Scanner;

//Room No : 5
//Take the user given string and put each word it into new line.

public class Question2 {
	
	private static void stringSplitAndPrint(String givenString) 
	{
		for(int stringIndex = 0; stringIndex < givenString.length(); stringIndex++) 
		{
			if(givenString.charAt(stringIndex) == ' ')
			{
				System.out.println();
				continue;
			}
			System.out.print(givenString.charAt(stringIndex));
		}
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String userGivenString = sc.nextLine();
		
		Question2.stringSplitAndPrint(userGivenString);
		
		sc.close();
		
	}

}
