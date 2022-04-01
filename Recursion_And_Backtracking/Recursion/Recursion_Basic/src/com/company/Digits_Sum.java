package com.company;

public class Digits_Sum {

    public static void main(String[] args) {
        System.out.println(digitsSum(-3285));
    }
    //--------------------------------------------------------------------------

    // ***** Print The Sum Of the Digits Of A Number Via Recursion *****
    static int digitsSum(int num) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        return rem + digitsSum(num / 10);
    }
}
