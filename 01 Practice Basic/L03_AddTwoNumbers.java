import java.util.Scanner;

public class L03_AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Adding numbers
        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
