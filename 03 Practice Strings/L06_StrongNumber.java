/*
========================
Strong Number
========================

Definition:
-----------
A Strong Number is a number whose
SUM OF FACTORIALS OF ITS DIGITS
is equal to the original number.


Example:
--------
Number = 145

Digits:
-------
1, 4, 5

Factorials:
-----------
1! = 1
4! = 24
5! = 120

Sum:
----
1 + 24 + 120 = 145

Since,
Sum = Original number

So,
145 is a STRONG NUMBER
 */

import java.util.Scanner;

public class L06_StrongNumber {

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (temp != 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }

        System.out.println(sum == num ? "Strong Number" : "Not Strong");
        sc.close();
    }
}
