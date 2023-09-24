package StringExample;

import java.util.Scanner;

//program to remove given character from the string.
public class StringExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = new String("ManojKalee");
		
		System.out.print(" Enter the character to remove from String : ");
		char str1 = sc.next().charAt(0);
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i) == str1) 
			{
				System.out.print((str.replaceAll(String.valueOf(str.charAt(i)), "")).trim());
				break;
			}
		}
		sc.close();
	}

}
