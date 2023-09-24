package ArraysPrograms;

import java.util.Scanner;

//Accept array elements from user and calculate sum of even and product of odd elements.
public class ArrayProgram3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size for an array : ");
		int size, sumEven=0, productOdd=1;
		size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " elements : ");
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array elements are : ");
		for(int i = 0; i < size; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < size; i++) 
		{
			if(arr[i] % 2 == 0) 
			{
				sumEven = sumEven + arr[i];
			}
			else 
			{
				productOdd = productOdd * arr[i];
			}
		}
		System.out.print("\nSum of even elements : " + sumEven);
		System.out.print("\nProduct of odd elements : " + productOdd);
		
		sc.close();

	}

}
