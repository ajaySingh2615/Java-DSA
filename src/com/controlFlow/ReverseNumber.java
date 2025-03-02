package com.controlFlow;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;

        int reverseNumber = 0;

        while (num > 0){
            int lastDigit = num % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            num /= 10;
        }

        System.out.println("Reverse number " + reverseNumber);
    }
}
