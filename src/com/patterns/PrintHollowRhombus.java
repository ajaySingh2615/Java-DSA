package com.patterns;

public class PrintHollowRhombus {
    public static void main(String[] args) {
        int num = 5;
        printHollowRhombus(num);
    }

    public static void printHollowRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
