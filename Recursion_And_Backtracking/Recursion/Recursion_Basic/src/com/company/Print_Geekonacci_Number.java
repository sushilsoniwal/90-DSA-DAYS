package com.company;

// Geek-onacci Number => https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/?page=1&query=page1#

import java.util.Scanner;

public class Print_Geekonacci_Number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while (T-- >0) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int N = in.nextInt();
            System.out.println(geekNum(A, B, C, N));
        }
    }
    //-----------------------------------------------------------------------------------

    // Function to print GeekoNacci number.
    static int geekNum(int A, int B, int C, int N) {
        int D = A + B + C;
        N = N - 1;
        if ((N - 3) == 0) {
            return D;
        }
        return geekNum(B, C, D, N);
    }

}
