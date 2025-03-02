package com.controlFlow;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check prime number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
