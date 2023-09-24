package StringExample;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "car";
		String str2 = "dog";
		boolean result;
		if (str1.length() == str2.length()) {
			char[] charArray = str1.toCharArray(); //'c' 'a' 'r'
			char[] charArray2 = str2.toCharArray(); //'d' 'o' 'g'

			Arrays.sort(charArray);// 'a' 'c' 'r'
			Arrays.sort(charArray2);//'d' 'g' 'o'
			
			result = Arrays.equals(charArray, charArray2);

			if (result == true) {
				System.out.println("String is Anagram!");
			} else {
				System.out.println("String is not an Anagram");
			}

		}
		else 
		{
			System.out.println("String is not an Anagram");
		}
	}

}
