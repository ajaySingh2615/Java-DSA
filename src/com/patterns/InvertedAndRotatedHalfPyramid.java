package com.patterns;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        int num = 4;
        invertedAndRotatedHalfPyramid(num);
    }

    public static void invertedAndRotatedHalfPyramid(int num){
        for (int i = 1; i <= num; i++) {

            // for spaces
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");               
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
