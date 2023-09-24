package ArraysPrograms;

import java.util.Scanner;

//Accept array elements from user and display frequency of even and odd elements.
public class ArrayProgram5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int evenCnt = 0, oddCnt = 0;
		System.out.print("Enter size for an array elements : ");
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
		
		System.out.print("\n\nFrequency for even and odd : ");
		for(int i = 0 ; i < size; i++)
		{
			if(arr[i] % 2 == 0)
				evenCnt++;
			else
				oddCnt++;
		}
		System.out.print("\nEven Count : " + evenCnt++);
		System.out.print("\nOdd Count : " + oddCnt++);
		sc.close();

	}

}
