package Series;
import java.util.Scanner;

//1 9 25 49 ....n

public class Series5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i =1 ; i<=n; i++)
		{
			if(i%2 != 0)
			{
				System.out.print((i*i) + " ");
			}
		}
		
		sc.close();

	}

}
