
import java.util.Scanner;

public class L10_StringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }

        System.out.println("Length = " + count);
        sc.close();
    }
}
