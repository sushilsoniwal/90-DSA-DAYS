package com.company;

public class Reverse_Number {
    public static void main(String[] args) {
        reverse1(-3285);
        System.out.println(reverse2(-3285));
    }
    //------------------------------------------------------------------------------------------------------------------

    // ***** Reverse A Number By Creating An Outside Variable *****
    static int ans = 0; // Created Outside Variable.

    static void reverse1(int num) {
        if (num == 0) {
            System.out.println(ans);
            return;
        }
        int rem = num % 10;
        ans = (ans * 10) + rem;
        reverse1(num / 10);
    }
    //------------------------------------------------------------------------------------------------------------------

    // ***** Reverse A Number By Creating A Helper Function *****
    static int reverse2(int num) {
        return sol(num, 0);
    }

    private static int sol(int num, int ans) {
        if (num == 0) {
            return ans;
        }
        int rem = num % 10;
        return sol(num / 10, (ans * 10) + rem);
    }

}
