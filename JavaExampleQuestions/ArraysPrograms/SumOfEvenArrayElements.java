package ArraysPrograms;
//Accept array elements from user and print only even elements.
import java.util.Scanner;

public class SumOfEvenArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter " + size + " elements : ");
		
		for(int i = 0; i < size; i++) 
		{
			arr[i] = sc.nextInt(); //accepting elements from user.
		}
		
		System.out.print("Array elements are : ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nEven elements from the array : ");
		for(int i = 0; i < size; i++)
		{
			if(arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		
		sc.close();

	}

}
