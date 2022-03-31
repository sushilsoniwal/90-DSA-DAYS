package com.company;

public class Print_Factorial {

    public static void main(String[] args) {
        System.out.println(facto(5));
    }
    //------------------------------------------------------------------

    // Function to print factorial of a given number.
    static int facto(int n) {
        if (n <= 1) {
            return n;
        }
        return (n * facto(n - 1));
    }
}
