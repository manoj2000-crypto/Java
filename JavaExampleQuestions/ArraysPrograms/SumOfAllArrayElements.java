package ArraysPrograms;
//Accept array elements from user and calculate sum of all array elements.
import java.util.Scanner;

public class SumOfAllArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size for the array : ");
		int size = sc.nextInt();
		int sum = 0;
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " elements : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array elements are : ");
		for(int i = 0; i < size; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nSum of all array elements : ");
		for(int i = 0; i<size; i++)
		{
			sum = sum + arr[i];
		}
		System.out.print(sum);
		sc.close();

	}

}
