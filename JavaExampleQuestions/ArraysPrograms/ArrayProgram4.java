package ArraysPrograms;

import java.util.Scanner;

//Accept array elements from user and display frequency of +ve, -ve and zeroes.
public class ArrayProgram4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int positive = 0, negative = 0, zeros = 0;
		
		System.out.print("Enter the size for an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " elements : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array elements : ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nFrequency of +ve , -ve and zeros : ");
		for(int i = 0; i < size; i++)
		{
			if(arr[i] > 0)
				positive++;
			else if(arr[i] < 0)
				negative++;
			else
				zeros++;
		}
		System.out.print("\nPositive no : " + positive + "\nNegative no : " + negative + "\nZeros : " + zeros);
		sc.close();

	}

}
