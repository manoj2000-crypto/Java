package ArraysPrograms;
//Accept array elements from user and calculate avg of even and odd separately on the screen.
import java.util.Scanner;

public class ArrayProgram6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double evenCnt = 0, oddCnt = 0;
		System.out.print("Enter size for an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " elements : ");
		for(int i = 0 ; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array elements : ");
		for(int i = 0 ; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		//System.out.print("\n\n : ");
		double totalEven = 0, totalOdd = 0; 
		double avgEven = 0, avgOdd = 0;
		for(int i = 0 ; i < size; i++)
		{
			if(arr[i] % 2 == 0) 
			{
				evenCnt++;
				totalEven = totalEven + arr[i];
			}
			else
			{
				oddCnt++;
				totalOdd = totalOdd + arr[i];
			}
		}
		avgEven = (totalEven / evenCnt);
		avgOdd  = (totalOdd / oddCnt);
		System.out.print("\nAverage of Even  : " + avgEven);
		System.out.print("\nAvarage of Odd   : " + avgOdd);

		sc.close();
	}

}
