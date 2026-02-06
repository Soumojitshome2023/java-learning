import java.util.Scanner;

public class L41_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Store original values
        int x = a;
        int y = b;

        // Finding HCF using Euclidean Algorithm
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        // 'a' now contains the HCF
        System.out.println("HCF of " + x + " and " + y + " = " + a);

        sc.close();
    }
}
