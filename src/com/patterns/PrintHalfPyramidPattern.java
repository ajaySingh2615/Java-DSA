package com.patterns;

public class PrintHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            int counter = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(counter++ + " ");

            }
            System.out.println();
        }
    }
}
