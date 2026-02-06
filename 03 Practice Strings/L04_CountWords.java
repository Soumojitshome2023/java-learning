
import java.util.Scanner;

public class L04_CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split(" ");

        System.out.println("Words = " + words.length);
        sc.close();
    }
}
