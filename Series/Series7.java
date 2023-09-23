package Series;
//1 4 9 16 25 ....n
import java.util.Scanner;
public class Series7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++)
		{
			System.out.print(i*i + " ");
		}
		sc.close();

	}

}
