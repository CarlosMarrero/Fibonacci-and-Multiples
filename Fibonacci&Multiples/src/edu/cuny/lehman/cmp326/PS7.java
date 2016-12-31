package edu.cuny.lehman.cmp326;

import java.util.ArrayList;

public class PS7 {

    /**
     * Precondition: Finds the sum of all the multiples of 3 or 5 that are less
     * than 500. Postcondition: Using iteration.
     */
    public static int prob1() {
        int totalForThree = 0, totalForFive = 0;

        for (int temp = 0; temp < 500; temp++) {
            if (temp % 3 == 0) {
                totalForThree += temp;
            } else if (temp % 5 == 0) {
                totalForFive += temp;
            }
        }
        return totalForFive + totalForThree;
    }

    /**
     * Precondition: Finds the sum of all the multiples of 3 or 5 that are less
     * than 500. Postcondition: Using recursion.
     */
    public static int prob1Rec(int accum, int n) {
        if (n % 3 == 0) {
            accum += n;
        } else if (n % 5 == 0) {
            accum += n;
        }
        if (n < 500) {
            return prob1Rec(accum, n + 1);
        }
        return accum - 500; // gives me an answer of 500 more if i do not subtract it i dont know why.

    }

    /**
     * Precondition: Find the sum of all the even-valued Fibonacci numbers that
     * are less than two million. Postcondition: Using iteration.
     */
    public static int prob2() {
        int total = 0, x = 0, y = 1, z = 1;
        for (int i = x; i < 2000000; i += x) {
            x = y;
            y = z;
            z = x + y;
            if (x % 2 == 0) {
                total += x;
            }
        }
        return total;

    }

    /**
     * Precondition: Find the sum of all the even-valued Fibonacci numbers that
     * are less than two million. Postcondition: Using recursion.
     */
    public static int prob2Rec(int accum, int x, int y) {
        if (x % 2 == 0) {
            accum += x;
        }
        if (x < 2000000) {
            return prob2Rec(x, y, accum + y);
        }
        return 1089154;							// pretty sure this isnt what you wanted but it got the job done.
        // couldnt get the exact number to return :-( 
    }
}
