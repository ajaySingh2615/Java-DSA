package com.methods;

public class ConvertFromBinaryToDecimal {
    public static void main(String[] args) {
        int num = 101;
        System.out.println(binaryToDecimal(num));
    }
    public static int binaryToDecimal(int num){
        int bin = 0;
        int pow = 0;

        while (num > 0){
            int lastDigit = num % 10;
            bin = (int) (bin + (lastDigit * Math.pow(2, pow)));
            num /= 10;
            pow++;
        }

        return bin;
    }
}
