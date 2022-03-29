package com.company;

public class StringBuffer_Methods {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("sushil");

        System.out.println(sbf.append("java"));
        System.out.println(sbf.insert(2, "cpp"));
        System.out.println(sbf.replace(1, 3, "python"));
        System.out.println(sbf.delete(1, 4));
        System.out.println(sbf.reverse());
    }
}
