package com.company;

public class Print_Fibonacci_Series {
    public static void main(String[] args) {
        fibSeq(7, 0, 1);
    }

    static void fibSeq(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        fibSeq(n - 1, b, a + b);
    }
}
