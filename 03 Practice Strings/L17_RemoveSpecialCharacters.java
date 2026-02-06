import java.util.Scanner;

public class L17_RemoveSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));
        sc.close();
    }
}
