package com.company;

public class Power_Of_X {

    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
    //--------------------------------------------------------------------------

    // ***** Print The Power Of X => (x^n) *****
    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return (x * power(x, n - 1));
    }
}
