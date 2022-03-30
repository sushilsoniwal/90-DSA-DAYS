package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 10;
        int i = 2;
        Get_Bit(num, i);
        System.out.println(Set_Bit(num, i));
        System.out.println(Clear_Bit(num, i));
        System.out.println(Update_To_0(num, i));
        System.out.println(Update_To_1(num, i));
    }
    //-------------------------------------------------------------------------------------------

    // Get Bit => Gives the bit present at a given position.
    static void Get_Bit(int num, int i) {
        int mask = 1 << i;
        if ((num & mask) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }
    }
    //-------------------------------------------------------------------------------------------

    // Set Bit => Set the bit of a given position from 0 to 1.
    static int Set_Bit(int num, int i) {
        int mask = 1 << i;
        return (num | mask);
    }
    //-------------------------------------------------------------------------------------------

    // Clear Bit => Clear the bit of a given position from 1 to 0.
    static int Clear_Bit(int num, int i) {
        int mask = 1 << i;
        int cmask = ~(mask);
        return (num & cmask);
    }
    //-------------------------------------------------------------------------------------------

    // Update Bit To 0 => Update the bit of a given position from 1 to 0.
    static int Update_To_0(int num, int i) {
        int mask = i << i;
        return (num | mask);
    }
    //-------------------------------------------------------------------------------------------

    // Update Bit To 1 => Update the bit of a given position from 0 to 1.
    static int Update_To_1(int num, int i) {
        int mask = i << i;
        int cmask = ~(mask);
        return (num & cmask);
    }
}
