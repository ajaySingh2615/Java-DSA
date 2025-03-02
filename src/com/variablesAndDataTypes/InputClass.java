package com.variablesAndDataTypes;

import java.util.Scanner;

public class InputClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.next();
//        String input = scanner.nextLine();
//        System.out.println(input);

//        int num1 = scanner.nextInt();
//        System.out.println(num1);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum_Result = num1 + num2;
        int product_Result = num1 * num2;
        System.out.println(sum_Result);
        System.out.println(product_Result);
    }
}
