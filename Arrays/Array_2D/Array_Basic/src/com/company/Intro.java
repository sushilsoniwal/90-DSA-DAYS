package com.company;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
        intro1();
//        intro2();
    }
    // ****************************************************************************

    // Method-01 => To Input-Output a 2-D matrix.
    static void intro1() {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of your matrix");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = in.nextInt();
            }
        }

        System.out.println("Your matrix is:- ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        in.close();
    }
    // ****************************************************************************

    // Method-02 => To Input-Output a 2-D matrix.
    static void intro2() {
        int[][] mat = {
                {1, 2, 3},
                {4},
                {5, 6, 7, 8, 9, 0}
        };

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
    // ****************************************************************************
}
