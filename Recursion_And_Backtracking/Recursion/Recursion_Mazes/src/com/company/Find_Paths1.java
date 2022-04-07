package com.company;

/* RETURN ALL PATHS TO REACH THE TARGET, WHILE WE CAN EITHER GO RIGHT AND DOWN. */

import java.util.ArrayList;

public class Find_Paths1 {
    public static void main(String[] args) {
        System.out.println(count_Paths(0, 0));
        print_Paths("", 0, 0);
        System.out.println(get_Paths("", 0, 0));
    }
    //------------------------------------------------------------------

    // Number of paths to reach the target.
    static int count_Paths(int row, int col) {
        // Base Condition:- We have only one way to go.
        if (row == 2 || col == 2) {
            return 1;
        }

        // To Travel Down.
        int down = count_Paths(row + 1, col);

        // To Travel Right.
        int right = count_Paths(row, col + 1);

        return down + right;
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

        // To Travel Right.
        if (col < 2) {
            local.addAll(get_Paths(ans + 'R', row, col + 1));
        }

        return local;
    }
}
