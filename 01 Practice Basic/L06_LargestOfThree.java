import java.util.Scanner;

public class L06_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Find largest
        if (a >= b && a >= c) {
            System.out.println("Largest is: " + a);
        } else if (b >= c) {
            System.out.println("Largest is: " + b);
        } else {
            System.out.println("Largest is: " + c);
        }

        sc.close();
    }
}
