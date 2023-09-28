
public class BorderSumArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{2,3,4,5},{5,6,7,8},{1,1,1,1}};
		int[][] arr2 = new int[4][4];
		int[][] arr3 = new int[4][4];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length ; j++)
			{	
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length ; j++)
			{	
				if(i == 0 || i == 3) 
				{
					arr2[i][j] = arr[i][j];
				}
			}
		}
		
		for(int m = 0; m<arr.length; m++)
		{
			for(int n = 0; n<arr.length ; n++)
			{	
				if(m == 0 || m== 3) 
				{
					arr3[m][n] = arr[m][n];
				}
			}
		}
		
		for(int p = 0; p<arr.length; p++)
		{
			for(int q = 0; q<arr.length ; q++)
			{	
				sum = sum + arr2[p][q];
			}
		}
		
		for(int p = 0; p<arr.length; p++)
		{
			for(int q = 0; q<arr.length ; q++)
			{	
				sum = sum + arr3[p][q];
			}
		}
		
		System.out.println("Sum is : " + sum);
		
	}

}
