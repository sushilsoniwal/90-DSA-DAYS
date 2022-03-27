package com.company;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {118, 115, 103, 96, 90};
        int target = 96;
        System.out.println(OABS(arr, target));
    }
    // **********************************************************************

    // (1) Increasing Binary Seach => Time Complexity = O(logN).
    static int BinaryInc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    // **********************************************************************

    // (2) Decreasing Binary Seach => Time Complexity = O(logN).
    static int BinaryDec(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    // **********************************************************************

    // (3) Order Agnostic Binary Seach => Time Complexity = O(logN).
    static int OABS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // Array sorted in decreasing order.
            else if (arr[start] > arr[end]) {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Array is in ascending order
            else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    // **********************************************************************
}
