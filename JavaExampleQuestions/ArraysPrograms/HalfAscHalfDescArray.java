package ArraysPrograms;
/*
 * First half of the array should be in ascending order and after half should be in descending order.
 * */
public class HalfAscHalfDescArray {
	public static void main(String[] args) {
		
		int arr[] = {55,3,25,6,7,44,1,-1,0,222};
		int i,j;
		int temp=0,temp2=0;
		
		int halfArray = (arr.length/2); //Ans is : 5
		int fullArray = arr.length;
		
		for(i = 0; i < (halfArray - 1); i++) // 0-4 means 5 elements.
		{
			for(j = i+1; j<halfArray; j++)
			{
				if(arr[i] > arr[j])//Ascending sorting half elements.
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(i = halfArray; i < fullArray - 1; i++)
		{
			for(j = i+1; j < fullArray; j++)
			{
				if(arr[i] < arr[j])//Descending sorting remaining half array elements.
				{
					temp2 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp2;
				}
			}
		}
		System.out.print("Array elements : ");
		for(i = 0; i < fullArray; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
