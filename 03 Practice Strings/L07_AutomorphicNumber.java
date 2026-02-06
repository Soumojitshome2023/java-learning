/*
========================
Automorphic Number
========================

Definition:
-----------
An Automorphic Number is a number whose
SQUARE ENDS WITH THE SAME DIGITS
as the original number.


Example:
--------
Number = 25

Square:
-------
25² = 625

Last digits of 625 = 25

Since,
Square ends with the number itself

So,
25 is an AUTOMORPHIC NUMBER


Another Example:
----------------
6² = 36 → ends with 6
 */

import java.util.Scanner;

public class L07_AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = num * num;

        System.out.println(String.valueOf(square).endsWith(String.valueOf(num))
                ? "Automorphic" : "Not Automorphic");

        sc.close();
    }
}
