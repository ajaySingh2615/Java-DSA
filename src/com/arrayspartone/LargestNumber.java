package com.arrayspartone;

public class LargestNumber {
    public static int findLargestNumber(int[] arr){
        int maximum = Integer.MIN_VALUE;

        for (int i : arr) {
            if(i > maximum){
                maximum = i;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5};

        System.out.println(findLargestNumber(arr));
    }
}
