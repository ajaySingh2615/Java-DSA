package com.patterns;

public class PrintZeroOneTriangle {
    public static void main(String[] args) {
        int num = 5;
        printZeroOneTriangle(num);
    }
    public static void printZeroOneTriangle(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if((i + j) % 2 != 0 ){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
