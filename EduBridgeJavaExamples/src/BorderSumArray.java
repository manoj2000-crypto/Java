import java.util.Scanner;

public class BorderSumArray {
	
	public void borderSum() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many row do you want : ");
		int row = sc.nextInt();
		System.out.print("How many column do you want : ");
		int col = sc.nextInt();
		
		//int[][] arr = {{1,2,3,4},{2,3,4,5},{5,6,7,8},{1,1,1,1}};
		
		int[][] arr = new int[row][col];
		int sum = 0;
		
		System.out.print("Enter the elements [ " + row + " ] by [ " + col + " ] :");
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length ; j++)
			{	
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nElements are given below : ");
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length ; j++)
			{	
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nPrinting row as column : ");
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length ; j++)
			{	
				System.out.print(arr[j][i] + " ");
				if(i == 0 || i == 3) 
				{
					sum = sum + arr[i][j];
					sum = sum + arr[j][i];
				}
			}
			System.out.println();
		}
		
		System.out.println("\nSum is : " + sum);
		sc.close();
	}

	public static void main(String[] args) {
		
		BorderSumArray bsa = new BorderSumArray();
		bsa.borderSum();
		
	}

}
