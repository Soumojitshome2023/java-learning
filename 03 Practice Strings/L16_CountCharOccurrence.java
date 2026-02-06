import java.util.Scanner;

public class L16_CountCharOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Count = " + count);
        sc.close();
    }
}
