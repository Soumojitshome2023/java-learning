
import java.util.Scanner;

public class L42_GCDUsingRecursion {

    // Recursive method to find GCD
    static int gcd(int a, int b) {
        // Base condition: if second number becomes 0
        if (b == 0) {
            return a;
        }
        // Recursive call
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calling recursive GCD function
        int result = gcd(a, b);

        // Printing result
        System.out.println("GCD = " + result);

        sc.close();
    }
}
