package com.codewithmosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // Explicit casting
        String a = "1";
        int b = Integer.parseInt(a) + 2;  // convert string to int
        System.out.println(b);

    }
}