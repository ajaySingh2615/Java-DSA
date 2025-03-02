package com.methods;

public class FindFactorial {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
