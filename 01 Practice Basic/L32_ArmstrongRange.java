
public class L32_ArmstrongRange {

    public static void main(String[] args) {

        for (int num = 1; num <= 500; num++) {
            int temp = num, sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
