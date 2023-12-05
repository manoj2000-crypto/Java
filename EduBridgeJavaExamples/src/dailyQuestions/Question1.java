package dailyQuestions;

//Room no : 5
//Find the count of vowels and consonents and space .

import java.util.Scanner;

public class Question1 {

	public static void stringManupulation(String str) 
	{
		int vowelCnt = 0;
		int spaceCnt = 0;
		
		str = str.toLowerCase();
		
		for(int charStr = 0; charStr < str.length(); charStr++) 
		{
			if(str.charAt(charStr) == 'a' || str.charAt(charStr) == 'e' || str.charAt(charStr) == 'i' || str.charAt(charStr) == 'o' || str.charAt(charStr) == 'u') 
			{
				vowelCnt++;
			}
			else if(str.charAt(charStr) == ' ')
			{
				spaceCnt++;
			}
		}
		
		System.out.println("Vowel Count : " + vowelCnt);
		System.out.println("Space count : " + spaceCnt);
		System.out.println("Consonent count : " + (str.length() - (vowelCnt + spaceCnt) ) );
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String userStr = sc.nextLine();
		
		Question1.stringManupulation(userStr);
		
		sc.close();
		
	}

}
