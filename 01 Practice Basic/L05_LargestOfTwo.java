import java.util.Scanner;

public class L05_LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Compare numbers
        if (a > b) {
            System.out.println("Largest is: " + a);
        } else {
            System.out.println("Largest is: " + b);
        }

        sc.close();
    }
}
