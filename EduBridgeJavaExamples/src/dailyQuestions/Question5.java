package dailyQuestions;

import java.util.Scanner;

// WAP to print this pattern 
/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * */
public class Question5 {
	
	public static void printPattern(int row) 
	{
		for(int numberRow = 1; numberRow <= row; numberRow++) 
		{
			for(int numberCol = 1; numberCol <= numberRow; numberCol++) 
			{
				System.out.print(numberCol + " ");
			}
			System.out.println();
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Enter number of rows : ");
		Question5.printPattern(new Scanner(System.in).nextInt());
		
	}

}
