package com.company;

/* RETURN ALL PATHS TO REACH THE TARGET, WHILE WE CAN EITHER GO RIGHT,DOWN AND DIAGONALLY. */

import java.util.ArrayList;

public class Find_Paths2 {
    public static void main(String[] args) {
        System.out.println(countPaths(0, 0));
        print_Paths("", 0, 0);
        System.out.println(get_Paths("", 0, 0));
    }
    //------------------------------------------------------------------

    // Number of paths to reach the target.
    static int countPaths(int row, int col) {
        // Base Condition:- We have only one way to go.
        if (row == 2 || col == 2) {
            return 1;
        }

        // To Travel Down.
        int Down = countPaths(row + 1, col);

        // To Travel Diagonally.
        int Diagonal = countPaths(row + 1, col + 1);

        // To Travel Right.
        int Right = countPaths(row, col + 1);

        return Down + Diagonal + Right;
    }
    //------------------------------------------------------------------

    // Print the exact paths to reach the target.
    static void print_Paths(String ans, int row, int col) {
        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            System.out.println(ans);
            return;
        }

        // To Travel Down.
        if (row < 2) {
            print_Paths(ans + 'D', row + 1, col);
        }

        // To Travel Diagonally.
        if (row < 2 && col < 2) {
            print_Paths(ans + 'd', row + 1, col + 1);
        }

        // To Travel Right.
        if (col < 2) {
            print_Paths(ans + 'R', row, col + 1);
        }
    }
    //------------------------------------------------------------------

    // Return the exact paths to reach the target in an ArrayList.
    static ArrayList<String> get_Paths(String ans, int row, int col) {
        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> local = new ArrayList<>(); // Contain answer for this function call only.

        // To Travel Down.
        if (row < 2) {
            local.addAll(get_Paths(ans + 'D', row + 1, col));
        }

        // To Travel Diagonally.
        if (row < 2 && col < 2) {
            local.addAll(get_Paths(ans + 'd', row + 1, col + 1));
        }

        // To Travel Right.
        if (col < 2) {
            local.addAll(get_Paths(ans + 'R', row, col + 1));
        }

        return local;
    }

}
