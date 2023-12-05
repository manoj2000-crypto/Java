package logicalProgram;

import java.util.Scanner;

public class DuckNumber {
	
	public static boolean checkDuckNumber(String givenNumber) 
	{
		System.out.println("Given Number : " + givenNumber);
		if(givenNumber.charAt(0) == '0') 
		{
			System.out.println("First character : " + givenNumber.charAt(0));
			return false;
		}
		else if(Integer.valueOf(givenNumber) < 0) 
		{
			System.out.println("Integer.valueOf(givenNumber) : " + Integer.valueOf(givenNumber));
			return false;
		}
		return true;
	}
	
	

	public static void main(String[] args) 
	{
		Scanner readNumber = new Scanner(System.in);
		String number = readNumber.next();
		
		if(!checkDuckNumber(number)) 
			System.out.println("Not Duck Number.");
		else
			System.out.println("Duck Number.");
		
		readNumber.close();
	}

}
