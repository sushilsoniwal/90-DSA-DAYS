package com.company;

public class Linear_Search {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 4},
                {3, 23, 14, 78},
                {54, 12}
        };
        int target = 78;

        System.out.println(linear(mat, target));
    }
    // -------------------------------------------------------------------------------------------------------------

    static boolean linear(int[][] mat, int target) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
