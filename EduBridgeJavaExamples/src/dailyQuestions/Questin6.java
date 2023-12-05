package dailyQuestions;

import java.util.Scanner;

//WAP to print this pattern
/*
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * */
public class Questin6 {
	
	public static void printInvertPattern(int row)
	{
		for(int numberRow = row; numberRow>=1; numberRow--) 
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
		
		System.out.print("Enter row number : ");
		Questin6.printInvertPattern(new Scanner(System.in).nextInt());
		
	}

}
