package com.methods;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter a: ");
        int b = scanner.nextInt();

        System.out.println(findProduct(a, b));
    }
    public static int findProduct(int a, int b){
        return a * b;
    }
}
