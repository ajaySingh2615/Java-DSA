package com.arrayspartone;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println(binarySearchAlgo(arr, key));
    }

    public static int binarySearchAlgo(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                end = mid - 1; // search in left half
            } else {
                start = mid + 1; // search in right half
            }
        }
        return -1; // element not found
    }
}
