package DataAbstraction;

import java.util.Scanner;

public class Compare {

    private static Bank getBankInstance(String bankType) {
        if (bankType.equalsIgnoreCase("SBI")) {
            return new SBI();
        } else if (bankType.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else {
            throw new IllegalArgumentException("Invalid bank type.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter time in years: ");
        float time = sc.nextFloat();

        sc.close();

        Bank sbi = getBankInstance("SBI");
        sbi.principal = principal;
        sbi.time = time;
        sbi.calculateSimpleInterest();
        sbi.display();

        Bank hdfc = getBankInstance("HDFC");
        hdfc.principal = principal;
        hdfc.time = time;
        hdfc.calculateSimpleInterest();
        hdfc.display();
    }
}
