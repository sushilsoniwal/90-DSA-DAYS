package com.company;

// Number of Steps to Reduce Number to Zero => https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class Number_Of_Steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    //---------------------------------------------------------------------------------------

    // By using a helper function.
    static int numberOfSteps(int num) {
        return sol(num, 0);
    }

    private static int sol(int n, int c) {
        if (n == 0) {
            return c;
        }
        if (n % 2 == 0) {
            return sol(n / 2, c += 1);
        }
        return sol(n - 1, c += 1);
    }
}
