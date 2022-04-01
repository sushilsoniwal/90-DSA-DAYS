package com.company;

public class Count_Zeros {
    public static void main(String[] args) {
        System.out.println(countZeros(508930020));
    }
    //--------------------------------------------------------------------

    // ***** Count the number of zeros => By using a helper function *****
    static int countZeros(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
