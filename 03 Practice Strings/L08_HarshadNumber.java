/*
========================
Harshad Number
========================

Definition:
-----------
A Harshad Number is a number that is
DIVISIBLE BY THE SUM OF ITS DIGITS.


Example:
--------
Number = 18

Digits:
-------
1, 8

Sum of digits:
--------------
1 + 8 = 9

Check:
------
18 ÷ 9 = 2 (completely divisible)

So,
18 is a HARSHAD NUMBER


Another Example:
----------------
21 → 2 + 1 = 3
21 ÷ 3 = 7
*/


import java.util.Scanner;

public class L08_HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), sum = 0, temp = num;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(num % sum == 0 ? "Harshad Number" : "Not Harshad");
        sc.close();
    }
}
