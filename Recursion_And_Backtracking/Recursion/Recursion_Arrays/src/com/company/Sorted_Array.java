package com.company;

public class Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4, 8, 22, 16, 20};
        int index = 0;
        System.out.println(isSorted(arr, index));
    }
    //---------------------------------------------------------------------------

    // Program to check whether an array is sorted or not.
    static boolean isSorted(int[] arr, int index) {
        int size = arr.length - 1;
        if (index == size) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        }
        return false;
    }
}
