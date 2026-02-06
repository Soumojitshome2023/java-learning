
import java.util.Scanner;

public class L13_CountCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Characters = " + str.length());
        sc.close();
    }
}
