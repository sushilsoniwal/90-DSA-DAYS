package com.company;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 8, 1};
        Sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // ---------------------------------------------------------------------------------------------------

    /*
     * Selection Sort:- Select the minimum element from an unsorted array and place
     * it at the beginning.
     * Not a stable sorting algorithm.
     * Time Complexity => O(n^2) In worst case.
     */

    static void Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
