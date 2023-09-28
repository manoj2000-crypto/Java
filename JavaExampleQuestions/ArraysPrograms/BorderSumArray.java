
public class BorderSumArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{2,3,4,5},{5,6,7,8},{1,1,1,1}};
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length ; j++)
			{	
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
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
		
		System.out.println("Sum is : " + sum);
		
	}

}
