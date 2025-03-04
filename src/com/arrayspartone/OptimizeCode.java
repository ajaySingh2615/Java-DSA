package com.arrayspartone;

public class OptimizeCode {
    public static void printBruteCodeForce(int[] arr){
        int sum = 0;
        int maximum_sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
              for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
              }
              maximum_sum = Math.max(maximum_sum, sum);
              System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum :" + maximum_sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

        printBruteCodeForce(arr);
    }
}
