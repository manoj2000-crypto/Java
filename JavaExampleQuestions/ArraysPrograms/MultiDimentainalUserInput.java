package ArraysPrograms;
import java.util.Scanner;
public class MultiDimentainalUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row number : ");
		int row = sc.nextInt();
		
		System.out.print("Enter column number : ");
		int column = sc.nextInt();
		
		int arr[][] = new int[row][column];
		for(int i = 0;i<row; i++)
		{
			for(int j = 0; j<column; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array Elements entered by user : ");
		
		for(int i = 0;i<row; i++)
		{
			for(int j = 0; j<column; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
