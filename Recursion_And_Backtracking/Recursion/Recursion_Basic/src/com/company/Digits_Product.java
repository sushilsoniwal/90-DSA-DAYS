package com.company;

public class Digits_Product {
    public static void main(String[] args) {
        System.out.println(digitsProduct(3285));
    }

    // ***** Print The Product Of the Digits Of A Number Via Recursion *****
    static int digitsProduct(int num) {
        if (num == 0) {
            return 1;
        }
        int rem = num % 10;
        return rem * digitsProduct(num / 10);
    }
}
