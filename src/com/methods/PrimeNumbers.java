package com.methods;

public class PrimeNumbers {
    public static void main(String[] args) {
        isPrimeInRange(20);
        
    }

    public static void isPrimeInRange(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num){
        boolean isPrimeNumber = num != 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

}
