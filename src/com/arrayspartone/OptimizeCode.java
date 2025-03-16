package com.arrayspartone;

public class OptimizeCode {
    public static void kadanes(int[] numbers){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int number : numbers) {
            cs = cs + number;
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our maximum sum : " + ms);
    }

    public static void printBruteCodeForce(int[] arr) {
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

    public static void printMaxSubArraySum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        // calculate prefix arr
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
//        int[] arr = { 1, -2, 6, -1, 3 };
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        // printBruteCodeForce(arr);
//        printMaxSubArraySum(arr);
        kadanes(arr);
    }
}
