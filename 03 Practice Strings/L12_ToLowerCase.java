
import java.util.Scanner;

public class L12_ToLowerCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = "";
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32); 
            }else {
                result += c;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
