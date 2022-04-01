package com.company;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(RBS(arr, 0, arr.length - 1, 1));
    }

    // ***** Rotated Binary Search Using Recursion *****
    static int RBS(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[end]) {
                return RBS(arr, start, mid - 1, target);
            }
            return RBS(arr, mid + 1, end, target);
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return RBS(arr, mid + 1, end, target);
            }
            return RBS(arr, start, mid - 1, target);
        }
    }
}
