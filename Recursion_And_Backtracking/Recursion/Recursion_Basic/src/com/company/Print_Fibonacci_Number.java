package com.company;

public class Print_Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println(fibNum(7));
    }
    //--------------------------------------------------------------------

    // Function to get n'th fibonacci number.
    static int fibNum(int n) {
        if (n <= 1) {
            return n;
        }
        return (fibNum(n - 1) + fibNum(n - 2));
    }
}
