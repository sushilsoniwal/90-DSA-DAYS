package com.company;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {56, 12, 60, 1, 34, 50};
        int n = arr.length;

        sort(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //----------------------------------------------------------------

    /* RECURSIVE BUBBLE SORT */
    static void sort(int[] arr, int n) {
        // Base Case
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        sort(arr, n - 1);
    }
}
