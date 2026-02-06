/*
========================
Armstrong Number
========================

Definition:
-----------
An Armstrong Number is a number whose
SUM OF EACH DIGIT RAISED TO THE POWER
OF TOTAL NUMBER OF DIGITS
is equal to the original number.


Example 1:
----------
Number = 153

Total digits = 3

Digits:
-------
1, 5, 3

Calculation:
------------
1³ = 1
5³ = 125
3³ = 27

Sum:
----
1 + 125 + 27 = 153

Since,
Sum = Original number

So,
153 is an ARMSTRONG NUMBER


Example 2:
----------
Number = 370

Digits:
-------
3³ + 7³ + 0³
= 27 + 343 + 0
= 370

So,
370 is also an Armstrong Number


Key Points:
-----------
1. Count number of digits first
2. Raise each digit to that power
3. Add all results
4. If sum equals the number → Armstrong Number
*/


import java.util.Scanner;

public class L31_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}
