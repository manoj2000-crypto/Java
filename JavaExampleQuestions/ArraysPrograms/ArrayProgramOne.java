package ArraysPrograms;
//Entering array elements into array
import java.util.Scanner;

public class ArrayProgramOne {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int i;
		System.out.print("Array elements : ");
		for(i=0; i<a.length; i++)//printing all array elements.
		{
			System.out.print(a[i] + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int size = sc.nextInt();
		int b[] = new int[size];
		
		System.out.println("Enter " +size+ " array element : ");
		
		for(i=0; i<size; i++)
		{
			b[i] = sc.nextInt();
		}

		System.out.println("Array : ");
		
		for(i=0; i<size; i++)
		{
			System.out.print(b[i] + " ");
		}
		sc.close();
	}

}
