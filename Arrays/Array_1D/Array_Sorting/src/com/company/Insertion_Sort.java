package com.company;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 78, 23};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // -----------------------------------------------------------------------------------------------------

    /*
     * Insertion Sort:- Pick an element from unsorted array and place it at its
     * corresponding position and shift the elements accordingly
     * Stable Sorting Algorithm.
     * Time Complexity:- O(n^2) worst case.
     */

    // Function to implement selection sort in ascending order.
    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

}
