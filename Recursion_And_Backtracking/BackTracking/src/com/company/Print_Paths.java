package com.company;

/* PATH THAT WE CAN FOLLOW TO REACH THE TARGET, WE CAN MOVE UP-DOWN-RIGHT-LEFT. */

import java.util.Arrays;

public class Print_Paths {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
        int[][] path = new int[maze.length][maze[0].length];
        printPaths("", maze, 0, 0, path, 1);
    }
    //---------------------------------------------------------------------------

    // Print The Path To Follow.
    static void printPaths(String ans, boolean[][] maze, int row, int col, int[][] path, int steps) {
        // Base Case
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = steps;
            for (int[] i : path) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println(ans);
            System.out.println();      // Adding a line break.
            return;
        }

        // Check that we can go or can't go in a cell.
        if (!maze[row][col]) {
            return;
        }

        // Consider this cell in my path.
        maze[row][col] = false;
        path[row][col] = steps;

        // For Travel Down.
        if (row < maze.length - 1) {
            printPaths(ans + 'D', maze, row + 1, col, path, steps + 1);
        }

        // For Travel Right.
        if (col < maze[0].length - 1) {
            printPaths(ans + 'R', maze, row, col + 1, path, steps + 1);
        }

        // For Travel Up.
        if (row > 0) {
            printPaths(ans + 'U', maze, row - 1, col, path, steps + 1);
        }

        // For Travel Left.
        if (col > 0) {
            printPaths(ans + 'L', maze, row, col - 1, path, steps + 1);
        }

        // Now we have to remove the changes.
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
