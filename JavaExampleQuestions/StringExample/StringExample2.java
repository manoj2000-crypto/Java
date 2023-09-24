package StringExample;
//program to check whether given string is a palindrome or not
public class StringExample2 {

	public static void main(String[] args) {
		
		String str = "Madam in Eden Im Adam!";
		String newStr = (str.toLowerCase()).replaceAll(" ", "");
		String reverse = ""; 
		
		for(int i = (newStr.length()-1) ; i >= 0; i--)
		{
			reverse = reverse + newStr.charAt(i);
		}
		
		for(int j = 0; j<newStr.length();j++) 
		{
			if(newStr.charAt(j) != reverse.charAt(j)) 
			{
				System.out.println("Given string not a palindrome !");
				break;
			}
		}
		
	}

}
