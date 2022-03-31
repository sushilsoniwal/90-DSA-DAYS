package com.company;

public class Print_Num2 {
    public static void main(String[] args) {
        printNum(10);
    }
    //--------------------------------------------------------------------------------------

    // Function to print numbers from n-1.
    static void printNum(int n) {
        if (n == 0) { // Base Condition.
            return;
        }
        System.out.print(n + " ");
        printNum(n - 1); // Recursive Call.
    }
}
