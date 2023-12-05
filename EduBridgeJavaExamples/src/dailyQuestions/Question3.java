package dailyQuestions;
// Unique character in new string.
import java.util.Scanner;

public class Question3 {

	public static void uniqueCharString(String userGivenString) 
	{
		String uniqueCharStr = "";
		uniqueCharStr = uniqueCharStr + userGivenString.charAt(0);
		
		for(int charPoint = 1; charPoint < userGivenString.length(); charPoint++) 
		{
			boolean charFound = false;
			
			for(int uniqueCharPoint = 0; uniqueCharPoint < uniqueCharStr.length(); uniqueCharPoint++) 
			{
				if(uniqueCharStr.charAt(uniqueCharPoint) == userGivenString.charAt(charPoint)) 
				{
					charFound = true;
					break;
				}
			}
			
			if(!charFound) 
			{
				uniqueCharStr = uniqueCharStr + userGivenString.charAt(charPoint);
			}
			
		}
		
		System.out.println("Unique char string : " + uniqueCharStr);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{	
		System.out.print("Enter the string : ");
		Question3.uniqueCharString(new Scanner(System.in).nextLine());	
		
		System.out.println();
	}

}
