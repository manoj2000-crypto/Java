package ArraysPrograms;

import java.util.Scanner;

//Accept array elements from user and display highest and lowest element.
public class ArrayProgram7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		int highest = arr[0], lowest = arr[0];
		for(int i = 0 ; i < size; i++)
		{
			if(arr[i] > highest)
				highest = arr[i];
			if(arr[i] < lowest)
				lowest = arr[i];
		}
		
		System.out.print("\nHighest element : " + highest + "\nLowest element : " + lowest);
		
		sc.close();

	}

}
