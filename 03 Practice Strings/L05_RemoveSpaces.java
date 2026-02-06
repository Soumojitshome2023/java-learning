import java.util.Scanner;

public class L05_RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str.replace(" ", ""));
        sc.close();
    }
}
