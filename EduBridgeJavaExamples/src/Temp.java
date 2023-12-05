/*
 * Hour glass sum from 2D array. Hour glass (row - 2)*(col - 2) 
 * If row = 6, col = 6 , then there are (4*4) = 16 Hour glass,
 *  from 16 hour glass , Which is maximum sum , print that one.
 * 
 * */
import java.util.Scanner;

public class Temp
{
	static void maxSumHourGlass(int[][] arr)
	{
		int maxSum = 0;
		
		for(int i = 0; i<(arr.length - 2); i++)
		{
			for(int j=0; j<(arr[i].length - 2); j++)
			{
				int sum = (arr[i][j] + arr[i][j+1] + arr[i][j+1]) + (arr[i+1][j+1]) + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);

				maxSum = Math.max(maxSum, sum);
			}
		}

		System.out.println("Maximum sum is : " + maxSum);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row number : ");
		int row = sc.nextInt();

		System.out.print("Enter the column number : ");
		int col = sc.nextInt();

		if(row < 3 && col < 3)
		{
			System.out.print("Cannot perform operation.");
			System.exit(0);
		}

		int[][] arr = new int[row][col];
		System.out.println("Enter array elements : ");

		for(int i = 0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Inserted array elements : ");

		for(int i = 0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		Temp.maxSumHourGlass(arr);
		sc.close();
	}
}



// Program for unique character store in string with O(1) time complexity;
//
//public class Temp {
//	
//	public static void uniqueCharString(String userGivenString) 
//	{
//	    boolean[] charSet = new boolean[256];
//	    String uniqueCharStr = "";
//
//	    for(int charPoint = 0; charPoint < userGivenString.length(); charPoint++) 
//	    {
//	        int charVal = userGivenString.charAt(charPoint);
//
//	        if(!charSet[charVal]) 
//	        {
//	            charSet[charVal] = true;
//	            uniqueCharStr = uniqueCharStr + userGivenString.charAt(charPoint);
//	        }
//	    }
//
//	    System.out.println("Unique char string : " + uniqueCharStr);
//	}
//
//	public static void main(String[] args) {
//		
//		Temp.uniqueCharString("ManojKAleaasd");
//		
//	}
//
//}
