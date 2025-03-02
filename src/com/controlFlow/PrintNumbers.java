package com.controlFlow;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("number " + i);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to print: ");
        int range = scanner.nextInt();

        for(int i =1; i<=range; i++){
            System.out.println("number " + i);
        }
    }
}
