import java.util.Scanner;

public class XylemandPhloem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        int temp = n;
        int count = 0;
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = n % 10;

        while (temp > 0) {
            count++;
            if (temp / 10 == 0) {
                firstDigit = temp;
            }
            sum += temp % 10;
            temp /= 10;
        }

        int sumWithoutFirstLast = sum - firstDigit - lastDigit;

        if (count < 3) {
            System.out.println("The number is not xylem or phloem.");
        } else {
            if (firstDigit + lastDigit == sumWithoutFirstLast) {
                System.out.println("The number is xylem.");
            } else {
                System.out.println("The number is phloem.");
            }
        }
    }
}
