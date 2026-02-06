import java.util.Scanner;

public class L02_PrintUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user name as input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Printing the name
        System.out.println("Your name is: " + name);

        sc.close();
    }
}
