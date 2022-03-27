package com.company;

public class Binary_Search {
    public static void main(String[] args) {

        // Completely Sorted Matrix.

        /*
         * int[][] mat1 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
         * int target = 30;
         * System.out.println(search1(mat1, target));
         */

        // Row wise and Col wise sorted matrix.
        int[][] mat2 = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 } };
        int target = 53;
        System.out.println(search2(mat2, target));

    }
    // --------------------------------------------------------------------------------------------------

    // Search a 2D Matrix => https://leetcode.com/problems/search-a-2d-matrix/
    // Time Complexity => O(log(m*n)).
    static boolean search1(int[][] mat1, int target) {
        int m = mat1.length; // Number Of Rows
        int n = mat1[0].length; // Number Of Columns

        // Taking two imaginary indexes.
        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // [mid/col_num][mid%col_num] = Actual Indexes.

            if (mat1[mid / n][mid % n] == target) {
                return true;
            } else if (mat1[mid / n][mid % n] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    // --------------------------------------------------------------------------------------------------

    // Search a 2D Matrix II => https://leetcode.com/problems/search-a-2d-matrix-ii/
    // Time Complexity => O(m+n).
    static boolean search2(int[][] mat2, int target) {
        int m = mat2.length; // Number Of Rows
        int n = mat2[0].length; // Number Of Columns

        int row_idx = 0;
        int col_idx = n - 1;

        while (row_idx < m && col_idx >= 0) {
            int num = mat2[row_idx][col_idx];

            if (num == target) {
                return true;
            } else if (num > target) {
                col_idx--;
            } else {
                row_idx++;
            }
        }
        return false;
    }
    // --------------------------------------------------------------------------------------------------
}
