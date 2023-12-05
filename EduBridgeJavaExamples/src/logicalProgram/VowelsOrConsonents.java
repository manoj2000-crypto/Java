package logicalProgram;

import java.util.Scanner;

public class VowelsOrConsonents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = sc.nextLine();//Accepting input from user.
		
		str = str.toLowerCase(); //converting given string to smaller case.
		
		int vowelCount = 0, spaceCount = 0, consonentCount = 0;
		
		for(int i = 0 ; i<str.length();i++) 
		{
			if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') 
			{
				vowelCount++; //vowel count.
			}
			else if(str.charAt(i) == ' ') 
			{
				spaceCount++; //space count.
			}
			else 
			{
				consonentCount++; //all letters except vowel and space.
			}
		}
		
		System.out.println("Vowel count : " + vowelCount + "\nSpace count : " + spaceCount + "\nConsonent count : " + consonentCount);
		
		sc.close();
		
	}

}
