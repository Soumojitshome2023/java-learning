/*
========================
GCD / HCF (Same Meaning)
========================

GCD = Greatest Common Divisor
HCF = Highest Common Factor

Example:
---------
Find GCD of 24 and 36

Step 1:
-------
24 = 2 × 2 × 2 × 3
36 = 2 × 2 × 3 × 3

Common factors:
---------------
2 × 2 × 3 = 12

So,
GCD / HCF = 12


Euclidean Method (Used in Programming):
---------------------------------------

Rule:
GCD(a, b) = GCD(b, a % b)

Steps:
------
a = 36, b = 24
36 % 24 = 12

a = 24, b = 12
24 % 12 = 0   ← stop here

When remainder becomes 0,
the value of 'a' is the GCD.

Answer:
-------
GCD = 12
*/


import java.util.Scanner;

public class L33_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);

        sc.close();
    }
}
