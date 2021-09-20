package com.company;

import java.util.Scanner;

public class AsciiChars {
    // ASCII 48 - 57
    public static void printNumbers() {
        // ASCII 48 = "0"
        // 0 1 ... 9 -> 10 values
        int i0 = 48;
        int j = 10;
        // System.out.println("Running printNumbers()\n---\nAvailable numeric inputs:");
        for (int i = i0; i < i0 + j; i++) {
            System.out.printf("%c ", (char) i);
        }
        // System.out.println("\n---\nStopping printNumbers()\n");
    }

    // ASCII 97 - 122
    public static void printLowercase() {
        // ASCII 97 = "a"
        // a b ... z -> 26 values
        int i0 = 97;
        int j = 26;
        // System.out.println("Running printLowercase()\n---\nAvailable lowercase alphabetic inputs:");
        for (int i = i0; i < i0 + j; i++) {
            System.out.printf("%c ", (char) i);
        }
        // System.out.println("\n---\nStopping printLowercase()\n");
    }

    // ASCII 65 - 90
    public static void printUppercase() {
        // ASCII 97 = "a"
        // A B ... Z -> 26 values
        int i0 = 65;
        int j = 26;
        // System.out.println("Running printUppercase()\n---\nAvailable uppercase alphabetic inputs:");
        for (int i = i0; i < i0 + j; i++) {
            System.out.printf("%c ", (char) i);
        }
        // System.out.println("\n---\nStopping printUppercase()\n");
    }

    // ASCII 32 and 45
    public static void printSpecial() {
        System.out.printf("'%c', ", (char) 32);
        System.out.printf("'%c', ", (char) 45);
    }

    public static void printChars() {
        System.out.println("Available inputs: ");

        printNumbers();
        System.out.println();

        printLowercase();
        System.out.println();

        printUppercase();
        System.out.println();

        printSpecial();
        System.out.println("\n(I.e. spaces ' ' and dashes '-' are also allowed." +
                "\n In particular, '-1' can be used.)\n");
    }
}