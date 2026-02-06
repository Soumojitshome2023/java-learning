/*
========================
LCM (Least Common Multiple)
========================

LCM = smallest number that is divisible by both numbers

Example:
---------
Find LCM of 12 and 18


Method 1: Listing multiples (basic understanding)
-------------------------------------------------
Multiples of 12: 12, 24, 36, 48, ...
Multiples of 18: 18, 36, 54, ...

First common multiple = 36

So,
LCM = 36


Method 2: Formula method (USED IN PROGRAMMING)
----------------------------------------------

Important formula:
LCM(a, b) = (a × b) / GCD(a, b)


Steps:
------
a = 12
b = 18

Step 1: Find GCD of 12 and 18
GCD = 6

Step 2: Apply formula
LCM = (12 × 18) / 6
LCM = 216 / 6
LCM = 36


Key Points:
-----------
1. Always find GCD first
2. Then use the formula
3. LCM and GCD are connected

Final Answer:
-------------
LCM = 36
 */

import java.util.Scanner;

public class L34_LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm = (a * b) / gcd(a, b);

        System.out.println("LCM = " + lcm);

        sc.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
