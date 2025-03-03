package com.patterns;

public class InvertedHalfPyramidWithNumber {
    public static void main(String[] args) {
        int num = 5;
        invertedHalfPyramidWithNumber(num);
    }
    public static void invertedHalfPyramidWithNumber(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
