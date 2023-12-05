package logicalProgram;

//import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row & column : ");
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] arr1 = new int[row][column];
		int[][] arr2 = new int[row][column];
		
		
		System.out.println("Enter the elements of arr1 : ");
		
		for(int i=0; i<row;i++) 
		{
			for(int j=0; j<arr1[i].length; j++) 
			{
				arr1[i][j] = sc.nextInt();
			}
//			System.out.println();
		}
		
//		System.out.println("Printing Array 1 :");
//		for(int i=0; i<arr1.length;i++) 
//		{
//			for(int j=0; j<arr1[i].length; j++) 
//			{
//				System.out.print(arr1[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("Enter the elements of arr2 : ");
		
		for(int i=0; i<row;i++) 
		{
			for(int j=0; j<arr2[i].length; j++) 
			{
				arr2[i][j] = sc.nextInt();
			}
//			System.out.println();
		}
		
		System.out.println("Sum of two arrays : ");
		
		if(arr1.length == arr2.length)
		{
			for(int i=0; i<arr1.length;i++) 
			{
				for(int j=0; j<arr1[i].length; j++) 
				{
					System.out.print( ( arr1[i][j] + arr2[i][j] ) + " ");
				}
				System.out.println();
			}
		}
		
		sc.close();
		
	}

}