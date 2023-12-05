package logicalProgram;

import java.util.Scanner;

public class DiagonalArrayReplaceToZeroLeftToRight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row & column : ");
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] arr1 = new int[row][column];
		
		System.out.println("Enter the elements : ");
		
		for(int i=0; i<row;i++) 
		{
			for(int j=0; j<arr1[i].length; j++) 
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Performing operation. Please wait...");
		
		for(int i=0; i<row;i++) 
		{
			for(int j=0; j<arr1[i].length; j++) 
			{
				if(i == j) 
				{
					arr1[i][j] = 0;
				}
			}
		}
		
		System.out.println("\nAfter Replacement(Left to Right) : ");
		
		for(int i=0; i<arr1.length; i++) 
		{
			for(int j=0; j<arr1[i].length; j++) 
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nAfter Replacement(Right to Left) : ");
		for(int i=( arr1.length - 1 ); i>=0; i--) 
		{
			for(int j=( arr1[i].length - 1 ); j>=0; j--) 
			{
				System.out.print(arr1[j][i] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
