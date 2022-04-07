package com.company;

public class Path_Obstacles {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, false, true}, {true, true, true}};
        print_Paths("", maze, 0, 0);

    }
    //------------------------------------------------------------------

    // Print the exact paths to reach the target.
    static void print_Paths(String ans, boolean[][] maze, int row, int col) {
        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            System.out.println(ans);
            return;
        }

        // Obstacle Case.
        if (!maze[row][col]) {
            return;
        }

        // To Travel Down.
        if (row < 2) {
            print_Paths(ans + 'D', maze, row + 1, col);
        }

        // To Travel Right.
        if (col < 2) {
            print_Paths(ans + 'R', maze, row, col + 1);
        }
    }
}
