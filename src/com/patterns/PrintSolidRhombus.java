package com.patterns;

public class PrintSolidRhombus {
    public static void main(String[] args) {
        int num = 5;

        printSolidRhombus(num);
    }

    public static void printSolidRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            // starts
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
