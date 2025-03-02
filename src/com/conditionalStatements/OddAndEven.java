package com.conditionalStatements;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is a even");
        }
    }
}
