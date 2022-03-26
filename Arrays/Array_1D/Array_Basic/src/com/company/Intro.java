package com.company;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = in.nextInt();

        // Array Declaration
        int[] arr = new int[n];

        System.out.print("Enter the elements of your array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        System.out.printf("Your array of size %d is:- ", n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
