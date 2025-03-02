package com.controlFlow;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int sum = 0;

        for (int i=1; i<=range; i++){
            sum += i;
        }

        System.out.println("The sum of " + range + " numbers : " + sum);
    }
}
