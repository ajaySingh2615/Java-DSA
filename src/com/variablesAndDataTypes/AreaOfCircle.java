package com.variablesAndDataTypes;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = scanner.nextInt();
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
