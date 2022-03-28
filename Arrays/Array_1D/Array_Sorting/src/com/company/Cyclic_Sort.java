package com.company;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // -------------------------------------------------------------------------------------------

    /*
     * Cyclic Sort:- Swap the element with their correct position.
     * Not a stable algorithm.
     * Time Complexity:- O(n).
     */

    // Function to implement cyclic sort (0-based indexing).
    static void sort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            i++;
        }
    }


}
