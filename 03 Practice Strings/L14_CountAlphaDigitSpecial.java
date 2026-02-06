
import java.util.Scanner;

public class L14_CountAlphaDigitSpecial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int a = 0, d = 0, s = 0;

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                a++; 
            }else if (Character.isDigit(c)) {
                d++; 
            }else {
                s++;
            }
        }

        System.out.println("Alphabets = " + a);
        System.out.println("Digits = " + d);
        System.out.println("Special = " + s);
        sc.close();
    }
}
