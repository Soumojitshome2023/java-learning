/*
========================
Perfect Number
========================

Definition:
-----------
A Perfect Number is a number whose
SUM OF PROPER DIVISORS
(excluding the number itself)
is equal to the number.

Proper divisors:
----------------
Divisors of a number except the number itself.


Example:
--------
Number = 6

Divisors of 6:
--------------
1, 2, 3, 6

Proper divisors (excluding 6):
------------------------------
1, 2, 3

Sum of proper divisors:
----------------------
1 + 2 + 3 = 6

Since,
Sum of proper divisors = Number

So,
6 is a PERFECT NUMBER


More Examples:
--------------
28 → 1 + 2 + 4 + 7 + 14 = 28
496 → 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496


Key Point:
----------
If sum of all divisors (except itself)
equals the number, then it is a Perfect Number.
*/


import java.util.Scanner;

public class L35_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");

        sc.close();
    }
}
