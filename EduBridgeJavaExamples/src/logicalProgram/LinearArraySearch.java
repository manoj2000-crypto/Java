package logicalProgram;

import java.util.Scanner;

public class LinearArraySearch {

	public static void main(String[] args) {
		
		Scanner readNumber = new Scanner(System.in);
		int num = readNumber.nextInt();
		
		int[] numberArray = {1,2,3,4,5,6,7,8,9,0,99};
		
		boolean flagFound = false;
		
		for(int foundNumber : numberArray) 
		{
			if(foundNumber == num) 
			{
				System.out.print("Number is found in the array.");
				flagFound = true;
				break;
			}
		}
		if(!flagFound)
			System.out.println("Given number is not present is the array.");
		
		readNumber.close();
	}

}
