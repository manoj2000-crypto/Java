package AllLoops;

import java.util.Scanner;

public class DoLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		char ch;
		
		do
		{
			System.out.println("Enter 2 number : ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println("Add : "+c);
			System.out.println("Press Y for continue : ");
			ch = sc.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');

	}

}
