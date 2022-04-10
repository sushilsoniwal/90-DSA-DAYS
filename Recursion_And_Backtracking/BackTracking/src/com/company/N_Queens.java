package com.company;

// N-Queens :-  https://leetcode.com/problems/n-queens/

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    //-----------------------------------------------------------------------------------

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<>(); // Result String.

        char[][] board = new char[n][n];

        // Initialise board with a single dot.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Function Call.
        nQueens(0, board, res);
        return res;
    }

    private static void nQueens(int col, char[][] board, List<List<String>> res) {
        // Base Condition:- when we are at the last col.
        if (col == board.length) {
            List<String> ans = new ArrayList<>();
            for (char[] ch : board) {
                String s = new String(ch);
                ans.add(s);
            }
            res.add(ans);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place The Queen.
                nQueens(col + 1, board, res); // Recursive Call.
                board[row][col] = '.'; // BackTrack
            }
        }
    }

    // Function to check whether an index is safe or not.
    private static boolean isSafe(char[][] board, int row, int col) {
        int origRow = row;
        int origCol = col;

        // To Check Upper-Left-Diagonal.
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        row = origRow;
        col = origCol;

        // To Check Left.
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        row = origRow;
        col = origCol;

        // To Check Down-Left_Diagonal.
        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q')
                return false;

            --col;
            ++row;
        }

        return true;
    }
}
