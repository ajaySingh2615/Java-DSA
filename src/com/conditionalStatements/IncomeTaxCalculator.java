package com.conditionalStatements;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalIncome = 0;
        System.out.println("Enter your income to find tax: ");
        int income = scanner.nextInt();

        if (income < 500000) {
            totalIncome += income;
        } else if (income >= 500000 && income < 1000000) {
            totalIncome += (int) (income * 0.20);
        } else {
            totalIncome += (int) (income * 0.30);
        }

        System.out.println("Your tax is = " + totalIncome);
    }
}
