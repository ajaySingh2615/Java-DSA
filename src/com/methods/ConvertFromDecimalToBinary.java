package com.methods;

public class ConvertFromDecimalToBinary {
    public static void main(String[] args) {
        int decimal = 5;
        System.out.println(decimalToBinary(decimal));
    }
    public static int decimalToBinary(int num){
        int dec = 0;
        int pow = 0;

        while (num > 0) {
            int lastDigit = num % 2;
            System.out.println("lastDigit " + lastDigit);
            dec = (int) (dec + lastDigit * Math.pow(10, pow)); 
            System.out.println("dec " + dec);
            num /= 2;
            pow++;
        }

        return dec;
    }

}
