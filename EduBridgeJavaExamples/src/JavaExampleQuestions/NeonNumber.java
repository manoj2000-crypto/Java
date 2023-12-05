package JavaExampleQuestions;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int squareNumber = num * num;

        int sum = 0;
        int temp = squareNumber;

        while (temp != 0) {
            int digit = temp % 10; 
            sum = sum + digit; 
            temp = temp / 10; 
        }

        if (sum == num) {
            System.out.println("It is a Neon Number");
        } else {
            System.out.println("It is not a Neon Number.");
        }
        
        sc.close();
		
	}

}
