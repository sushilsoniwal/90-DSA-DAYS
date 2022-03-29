package com.company;

public class StringBuilder_Methods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sushil");

        System.out.println(sb.append("java"));
        System.out.println(sb.insert(2, "cpp"));
        System.out.println(sb.replace(1, 3, "python"));
        System.out.println(sb.delete(1, 4));
        System.out.println(sb.reverse());

    }
}
