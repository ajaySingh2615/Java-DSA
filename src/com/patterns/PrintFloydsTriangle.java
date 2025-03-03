package com.patterns;

public class PrintFloydsTriangle {
    public static void main(String[] args) {
        int num = 5;
        printFloydsTriangle(num);
    }
    public static void printFloydsTriangle(int num){
        int inc = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(inc);
                inc++;
            }
            System.out.println();
        }
    }
}
