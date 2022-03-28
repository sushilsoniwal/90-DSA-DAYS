package com.company;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 7, 4};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // -------------------------------------------------------------------------------------------------

    /*
     * Bubble Sort:- Swap two adjacent elements if they are in wrong order.
     * Stable Sorting Algorithm (Order before sorting == Order after sorting).
     * Time Complexity => O(n^2) In worst case.
     */

    // Function to implement bubble sort in ascending order.
    static void sort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
