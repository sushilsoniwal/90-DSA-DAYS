package com.company;

public class Print_Num1 {
    public static void main(String[] args) {
        printNum(10);
    }
    //--------------------------------------------------------------------------------------

    // Function to print numbers from 1-n.
    static void printNum(int n) {
        if (n == 0) { // Base Condition.
            return;
        }
        printNum(n - 1); // Recursive Call.
        System.out.print(n + " ");
    }
}
