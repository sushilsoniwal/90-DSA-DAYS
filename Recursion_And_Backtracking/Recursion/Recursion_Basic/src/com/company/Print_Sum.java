package com.company;

public class Print_Sum {
    public static void main(String[] args) {
        sumOfN(10, 0);
    }
    //----------------------------------------------------------------------------

    // Print sum of n numbers.
    static void sumOfN(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumOfN(n - 1, sum + n);
    }

}
