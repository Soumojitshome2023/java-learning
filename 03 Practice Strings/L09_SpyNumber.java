/*
========================
Spy Number
========================

Definition:
-----------
A Spy Number is a number whose
SUM OF DIGITS
is equal to the
PRODUCT OF DIGITS.


Example:
--------
Number = 1124

Digits:
-------
1, 1, 2, 4

Sum of digits:
--------------
1 + 1 + 2 + 4 = 8

Product of digits:
------------------
1 × 1 × 2 × 4 = 8

Since,
Sum = Product

So,
1124 is a SPY NUMBER
*/


import java.util.Scanner;

public class L09_SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0, prod = 1;

        while (num != 0) {
            int d = num % 10;
            sum += d;
            prod *= d;
            num /= 10;
        }

        System.out.println(sum == prod ? "Spy Number" : "Not Spy");
        sc.close();
    }
}
