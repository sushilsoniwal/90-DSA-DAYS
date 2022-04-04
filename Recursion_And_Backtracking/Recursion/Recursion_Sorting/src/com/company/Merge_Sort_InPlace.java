package com.company;

import java.util.Arrays;

public class Merge_Sort_InPlace {
    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 13, 67, 10, 35, 44, 100};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    //----------------------------------------------------------------------------------------

    /* Code For In-Place Merge Sort */
    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
             int mid = start + (end - start) / 2;

             // Left Part.
            mergeSort(arr, start, mid);

            // Right Part.
            mergeSort(arr, mid + 1, end);

            // Merge Both The Parts.
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= end) {
            ans[k++] = arr[j++];
        }

        // Modifying The Original Array.
        for (int p = start; p <= end; p++) {
            arr[p] = ans[p - start];
        }
    }

}
